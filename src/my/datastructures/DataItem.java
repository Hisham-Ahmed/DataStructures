package my.datastructures;
import javax.swing.JOptionPane;

public class DataItem
{
    public long dData;
    String a = "";
    public DataItem(long dd)    
      { dData = dd; }
    public String displayItem()
    {
        System.out.print("/"+dData);
        a = "|"+a+String.valueOf(dData);
        return a;
    }
}
class Tree234
{    
    String out1="";
    Node root = new Node();          
    int find(long key)
    {
        Node curNode = root;
        int childNumber;
        while(true)
        {
            if(( childNumber=curNode.findItem(key) ) != -1)
                return childNumber;              
            else if( curNode.isLeaf() )
                return -1;                    
            else                              
                curNode = getNextChild(curNode, key);
        }  
    }
    void Insert(long dValue)
    {
        Node curNode = root;
        DataItem tempItem = new DataItem(dValue);
        while(true)
        {
            if( curNode.isFull() )             
            {
                split(curNode);                 
                curNode = curNode.getParent();  
                curNode = getNextChild(curNode, dValue);
            } 
            else if( curNode.isLeaf() )          
            break;                          
            else
                curNode = getNextChild(curNode, dValue);
        }  
    curNode.insertItem(tempItem);      
    }
    void split(Node thisNode)    
    {
        DataItem itemB;
        DataItem itemC;
        Node parent, child2, child3;
        int itemIndex;

        itemC = thisNode.removeItem();    
        itemB = thisNode.removeItem();  
        child2 = thisNode.disconnectChild(2); 
        child3 = thisNode.disconnectChild(3); 

        Node newRight = new Node();       
        if(thisNode==root)                
        {
            root = new Node();                
            parent = root;                   
            root.connectChild(0, thisNode);   
        }
        else                             
            parent = thisNode.getParent();    
            itemIndex = parent.insertItem(itemB); 
            int n = parent.getNumItems();         
        for(int j=n-1; j>itemIndex; j--)         
        {                                      
            Node temp = parent.disconnectChild(j); 
            parent.connectChild(j+1, temp);        
        }
        parent.connectChild(itemIndex+1, newRight);

        newRight.insertItem(itemC);       
        newRight.connectChild(0, child2); 
        newRight.connectChild(1, child3); 
    } 
    Node getNextChild(Node theNode, long theValue)
    {
        int j;
        int numItems = theNode.getNumItems();
        for(j=0; j<numItems; j++)          
        {                               
            if( theValue < theNode.getItem(j).dData )
                return theNode.getChild(j);  
        }  
        return theNode.getChild(j);        
    }
    void displayTree()
    {
        recDisplayTree(root, 0, 0);
    }
    void recDisplayTree(Node thisNode, int level, int childNumber)
    {      
        out1 = out1 + "\nLevel: "+level+" Child: "+childNumber+"   "+thisNode.displayNode();
        JOptionPane.showMessageDialog(null,"\n                   "+"*2-3 Tree\n"+out1);
        
        int numItems = thisNode.getNumItems();
        for(int j=0; j<numItems+1; j++)
        {
            Node nextNode = thisNode.getChild(j);
            if(nextNode != null)
                recDisplayTree(nextNode, level+1, j);
            else
                return;
        }
    }
}