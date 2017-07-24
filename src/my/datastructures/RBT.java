package my.datastructures;
public class RBT 
{
    String output="";
    Node root;
    void LeftRotate(Node x)
    {
        Node y = x.right;
        x.right = y.left;
        if (x.right != null)
            x.right.parent = x;
        y.parent = x.parent;
        if (x.parent == null)
           root = y;
        else if (x == x.parent.left)
            x.parent.left = y;
        else    x.parent.right = y;
        y.left = x;
        x.parent = y;   
    }
    public void rightRotate(Node y)
    {
        Node x = y.left;
        y.left = x.right;
        if (x.right != null)
            x.right.parent = y;
        x.parent = y.parent;
        if (x.parent == null)
            (root) = x;
        else if (y == y.parent.left)
            y.parent.left = x;
        else y.parent.right = x;
        x.right = y;
        y.parent = x;
    } 
    public void insertFixUp(Node z)
    {
        while (z != root && z.parent.color == 'R')
        {
            Node y;
            if (z.parent == z.parent.parent.left)
                y = z.parent.parent.right;
            else
                y = z.parent.parent.left;
            if (y.color == 'R')
            {
                y.color = 'B';
                z.parent.color = 'B';
                z.parent.parent.color = 'R';
                z = z.parent.parent;
            }
            else                   

            {
                if (z.parent == z.parent.parent.left && z == z.parent.left)
                {
                    char ch = z.parent.color ;
                    z.parent.color = z.parent.parent.color;
                    z.parent.parent.color = ch;
                    rightRotate(z.parent.parent);
                }
                if (z.parent == z.parent.parent.left && z == z.parent.right)
                {
                    char ch = z.color ;
                    z.color = z.parent.parent.color;
                    z.parent.parent.color = ch;
                    LeftRotate(z.parent);
                    rightRotate(z.parent.parent);
                }
                if (z.parent == z.parent.parent.right &&
                    z == z.parent.right)
                {
                    char ch = z.parent.color ;
                    z.parent.color = z.parent.parent.color;
                    z.parent.parent.color = ch;
                    LeftRotate(z.parent.parent);
                }
                if (z.parent == z.parent.parent.right &&
                    z == z.parent.left)
                {
                    char ch = z.color ;
                    z.color = z.parent.parent.color;
                    z.parent.parent.color = ch;
                    rightRotate(z.parent);
                    LeftRotate(z.parent.parent);
                }
            }
        }
        (root).color = 'B';
    }
    void Insert(int data)
    {
        Node z = new Node();
        z.data = data;
        z.left = z.right = z.parent = null;
        if (root == null)
        {
            z.color = 'B';
            (root) = z;
        }
        else
        {
            Node y = null;
            Node x = (root);
            while (x != null)
            {
                y = x;
                if (z.data < x.data)
                    x = x.left;
                else
                    x = x.right;
            }
            z.parent = y;
            if (z.data > y.data)
                y.right = z;
            else
                y.left = z;
            z.color = 'R';
            insertFixUp(z);
        }
    } 
      String preOrder(Node temp)
    {
        if(temp != null)
        {
            output=output+temp.getData()+" ";
            preOrder(temp.getLeft());
            preOrder(temp.getRight());
        }
        return output;
    }
    String postOrder(Node temp)
    {
        if(temp != null)
        {
            postOrder(temp.getLeft());
            postOrder(temp.getRight());
            output=output+temp.getData()+" ";
        }
        return output;
    }
  
 String inOrder(Node temp)
    {
        if(temp != null)
        {
            inOrder(temp.getLeft());
            output=output+temp.getData()+" ";
            inOrder(temp.getRight());
        }
        return output;
    }
}