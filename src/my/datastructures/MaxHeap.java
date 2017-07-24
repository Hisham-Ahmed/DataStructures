package my.datastructures;
public class MaxHeap 
{    
    int heap[];
    int maxsize, size;
    String output="";
    static int front = 1; 
    MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[this.maxsize+1];
        heap[0] = Integer.MAX_VALUE;
    }
    int parent(int pos)
    {
        return pos/2;
    }
    int leftchild(int pos)
    {
        return (2*pos);
    }
    int rightchild(int pos)
    {
        return (2*pos)+1;
    }
    void Insert(int data)
    {
        heap[++size] = data;
        int curr = size;
        while (heap[curr] > heap[parent(curr)])
        {
            swap(curr, parent(curr));
            curr = parent(curr);
        }
    }
    String display()
    {
        for(int i=1; i<=size/2; i++)
        {
            System.out.println("Parent: "+heap[i]+"\tLeft Child: "+heap[2*i]+"\tRight Child: "+heap[2*i+1]);
            output = output+"\nParent: "+heap[i]+"      "+"Left Child: "+heap[2*i]+"      "+"Right Child: "+heap[2*i+1];
        }
        return output;
    }
    void swap(int x, int y)
    {
        heap[y] = (heap[x]+heap[y]) - (heap[x]=heap[y]);
    }
}