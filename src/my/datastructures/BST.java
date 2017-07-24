package my.datastructures;
public class BST
{
    String output="";
    Node root;
    BST()
    {
        root = null;
    }
    void Insert(int x)
    {
       Node newNode = new Node(x);
       if(root == null)
        {
           root = newNode;
        }
       else
        {
            Node curr = root;
            Node parent;
            while(true)
            {
                parent = curr;
                if(newNode.getData() > curr.getData())
                {
                    curr = curr.getRight();
                    if(curr == null)
                    {
                        newNode.setParent(parent);
                        parent.setRight(newNode);
                        return;
                    }
                }
                else
                {
                    curr = curr.getLeft();
                    if(curr == null)
                    {
                        newNode.setParent(parent);
                        parent.setLeft(newNode);
                        return;
                    }
                }
            }
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