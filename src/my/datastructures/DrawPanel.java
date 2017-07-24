package my.datastructures;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
public class DrawPanel extends JPanel 
{
    private Node tree;
    private int gridwidth;
    private int gridheight;
    private Map<Node, Point> coordinates = new HashMap<Node, Point>();
    public DrawPanel(Node tree, int gridwidth, int gridheight) 
    {
        this.tree = tree;
        this.gridwidth = gridwidth;
        this.gridheight = gridheight;
    }
    public void setTree(Node root) 
    {
        tree = root;
        repaint();
    }
    public void paintComponent(final Graphics g) 
    {
        super.paintComponent(g);
        if (tree == null) 
        {
            return;
        }
        tree.traverseInorder(new Node.Visitor() 
        {
            private int x = gridwidth;
            public void visit(Node node) 
            {
                coordinates.put(node, new Point(x, gridheight * (depth(node)+1)));
                x += gridwidth;
            }
        });
        tree.traversePostorder(new Node.Visitor() 
        {
            public void visit(Node node) 
            {
                String data = String.valueOf(node.getData());
                Point center = (Point)coordinates.get(node);
                if (node.getParent() != null) 
                {
                    Point parentPoint = (Point)coordinates.get(node.getParent());
                    g.setColor(Color.blue);
                    g.drawLine(center.x, center.y, parentPoint.x, parentPoint.y);
                }
                FontMetrics fm = g.getFontMetrics();
                Rectangle r = fm.getStringBounds(data, g).getBounds();
                r.setLocation(center.x - r.width/2, center.y - r.height/2);
                char c = node.color;
                Color color = getNodeColor(c);
                Color textColor =(color.getRed() + color.getBlue() + color.getGreen() < 382)? Color.white: Color.black;
                String p = "*BINNARY TREE*";
                g.drawString(p, 275, 20);
                g.setColor(color);
                g.fillRect(r.x - 4 , r.y - 4, r.width + 8, r.height + 8);
                g.setColor(textColor);
                g.drawString(data, r.x, r.y + r.height);
            }
        });
    }
    Color getNodeColor(Node node) 
    {
        try 
        {
            Field field = node.getClass().getDeclaredField("color");
            return (Color)field.get(node);
        } catch (Exception e) {
            return Color.yellow;
        }
    }
    Color getNodeColor(char c) 
    {
        if(c=='R')
       return Color.red;
        else if(c=='B')
            return Color.black;
        else
            return Color.yellow;
    }
    
    private int depth(Node node) 
    {
        return (node.getParent() == null) ? 0 : 1 + depth(node.getParent());
    }
}