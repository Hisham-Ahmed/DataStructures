package my.datastructures;
public class AVL 
{
    Node root, left, right;
    int balance;
    String output ="";
    int getLeftHeight() 
    { 
        if(left != null) 
        {
            return left.getHeight();
        }        
        return 0;  
    }    
    int getRightHeight() 
    { 
        if(right != null) 
        {
            return right.getHeight();
        }     
        return 0;  
    }   
    void updateBalanceFactor(Node newNode) 
    {   
        newNode.balance = height(newNode.right) - height(newNode.left);
    }   
    int height(Node temp) 
    {
        if(temp == null) 
        {
            return -1;
        }
        if(temp.left==null && temp.right==null) 
        {
            return 0;
        } 
        else if(temp.left==null) 
        {
            return 1+height(temp.right);
        }
        else if(temp.right==null) 
        {
            return 1+height(temp.left);
        } 
        else 
        {
            return 1+maximum(height(temp.left),height(temp.right));
        }
    }
    int maximum(int x, int y) 
    {
        if(x >= y) 
            return x;
        else 
            return y;
    }
    Node rotateRight(Node B)
    {
        Node A = B.left;
        B.left = A.right;
        A.right = B;
        B = A;
        return B;
    }
    Node rotateLeft(Node B)
    {
        Node A = B.right;
        B.right = A.left;
        A.left = B;
        B = A;
        return B;
    }
    Node doubleRotateLeft(Node B)
    {
        rotateRight(B.left);
        rotateLeft(B);
        return B;
    }
    Node doubleRotateRight(Node B)
    {
        rotateRight(B.right);
        rotateLeft(B);
        return B;
    }
    void Insert(int data)
    {
        Node newNode = new Node(data);
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
        recursiveBalance(newNode);
    }
    void recursiveBalance(Node newNode)
    {
        if(balance < -1 && balance > 1)
        {
            updateBalanceFactor(newNode);
            int balance = newNode.balance;
            if(balance == -2) 
            {
                if(height(newNode.left.left) >= height(newNode.left.right)) 
                {
                    newNode = rotateRight(newNode);
                } 
                else 
                {
                    newNode = doubleRotateLeft(newNode);
                }
            }
            else if(balance == 2) 
            {
            if(height(newNode.right.right) >= height(newNode.right.left)) 
            {
                newNode = rotateLeft(newNode);
            } 
            else 
            {
                newNode = doubleRotateRight(newNode);
            }
            }
            if(newNode.parent != null) 
            {
                recursiveBalance(newNode.parent);
            } 
            else 
            {
                this.root = newNode;
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