package my.datastructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Node 
{
    char color;
    int key, data, balance;
    Node left, right, parent;
    private static final int ORDER = 4;
    int numItems;
    Node childArray[] = new Node[ORDER];
    DataItem itemArray[] = new DataItem[ORDER-1];

    Node()
    {
        
    }
    Node(int data)
    {
        this.data = data;
    }
    Node(Node left, Node right)  
    {    
        this.left = left;   
        this.right = right; 
    }
    public int getData()
    {
        return data;
    }
    public void setData(int value)
    {
        data = value;
    }
    public Node getLeft()
    {
        return left;
    }
    public void setLeft(Node temp)
    {
        left = temp;
    }
    public Node getRight()
    {
        return right;
    }
    public void setRight(Node temp)
    {
        right = temp;
    }
    public Node getParent()
    {
        return parent;
    }
    void setParent(Node temp)
    {
        parent = temp;
    }
    int getHeight()  
    {   
        int leftHeight = 0;    
        int rightHeight = 0;      
        if(left == null && right == null)              
        {
            return 0;   
        }
        if(left != null) 
        {  
            leftHeight = 1 + left.getHeight();
        }   
        if(right != null) 
        {    
            rightHeight = 1 + right.getHeight();
        }   
        return Math.max(leftHeight, rightHeight);  
    }
    void traversePreorder(Node.Visitor visitor) 
    {
        visitor.visit(this);
        if (left != null) left.traversePreorder(visitor);
        if (right != null) right.traversePreorder(visitor);
    }
    void traversePostorder(Visitor visitor) 
    {
        if (left != null) left.traversePostorder(visitor);
        if (right != null) right.traversePostorder(visitor);
        visitor.visit(this);
    }
    void traverseInorder(Visitor visitor) 
    {
        if (left != null) left.traverseInorder(visitor);
        visitor.visit(this);
        if (right != null) right.traverseInorder(visitor);
    }
    interface Visitor 
    {
        void visit(Node node);
    }
    static String getString() throws IOException
    {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
    }
    static char getChar() throws IOException
    {
        String s = getString();
        return s.charAt(0);
    }
    static int getInt() throws IOException
    {
        String s = getString();
        return Integer.parseInt(s);
    }
    void connectChild(int childNum, Node child)
    {
        childArray[childNum] = child;
        if(child != null)
            child.parent = this;
    }
    Node disconnectChild(int childNum)
    {
        Node tempNode = childArray[childNum];
        childArray[childNum] = null;
        return tempNode;
    }
    Node getChild(int childNum)
    { 
        return childArray[childNum]; 
    }
    boolean isLeaf()
    { 
        return (childArray[0]==null) ? true : false; 
    }
    int getNumItems()
    { 
        return numItems; 
    }
    DataItem getItem(int index)   
    { 
        return itemArray[index]; 
    }
    boolean isFull()
    { 
        return (numItems == ORDER-1) ? true : false; 
    }
    int findItem(long key)       
    {                                    
        for(int j=0; j<ORDER-1; j++)         
        {                                 
            if(itemArray[j] == null)          
                break;
            else if(itemArray[j].dData == key)
                return j;
        }
        return -1;
    }  
    int insertItem(DataItem newItem)
    {
        numItems++;                          
        long newKey = newItem.dData;         
        for(int j=ORDER-2; j>=0; j--)        
        {                                 
            if(itemArray[j] == null)         
                continue;                    
            else                            
            {                            
                long itsKey = itemArray[j].dData;
                if(newKey < itsKey)            
                itemArray[j+1] = itemArray[j]; 
                else
                {
                   itemArray[j+1] = newItem;   
                   return j+1;                
                }                       
            } 
        }                 
        itemArray[0] = newItem;             
        return 0;
    }  
    DataItem removeItem()        
    {
        DataItem temp = itemArray[numItems-1]; 
        itemArray[numItems-1] = null;           
        numItems--;                           
        return temp;                           
    }
    String displayNode()         
    {
        String node="";
        for(int j=0; j<numItems; j++)
        {
            node = " "+node + itemArray[j].displayItem();            
        }
        return node;
    }
}