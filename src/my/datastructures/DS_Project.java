package my.datastructures;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class DS_Project 
{
    public void function(int cht, int chd, String inpt)
    {
        switch(cht)
        {
            case 1:
            {
                String str="", num="";
                BST obj = new BST();
                int nums=0, mul=1;
                for(int i=0;i<inpt.length();i++)
                {
                    if(inpt.charAt(i)!=' ')
                    {
			num=num+inpt.charAt(i);
			mul=mul*10;
                    }
                    else
                    {
			for(int j=0;j<num.length();j++)
			{
				nums=nums+((num.charAt(j)-48)*mul);
				mul=mul/10;
			}
			nums=nums/10;
                        obj.Insert(nums);
			nums=0;
			mul=1;
			num="";
                    }
                }
                for(int j=0;j<num.length();j++)
		{
                    nums=nums+((num.charAt(j)-48)*mul);
                    mul=mul/10;
		}
		nums=nums/10;
                System.out.println(nums);
		obj.Insert(nums);	
                if(chd==1)
                str = obj.inOrder(obj.root);
                if(chd==2)
                str = obj.preOrder(obj.root);
                if(chd==3)
                str = obj.postOrder(obj.root);
                
                DataStructures.traverse.setText(str);
                DrawPanel panel = new DrawPanel(obj.root,40,60);
                panel.setTree(obj.root);
                JFrame application = new JFrame("Binnary Tree");
                
                application.setDefaultCloseOperation(application.DISPOSE_ON_CLOSE);
                application.add(panel);

                application.setSize(650, 500);
                application.setVisible(true);
                break;
            }
            case 2:
            {
                String str="", num="";
                AVL obj1 = new AVL();
                int nums=0, mul=1;
                for(int i=0;i<inpt.length();i++)
                {
                    if(inpt.charAt(i)!=' ')
                    {
			num=num+inpt.charAt(i);
			mul=mul*10;
                    }
                    else
                    {
			for(int j=0;j<num.length();j++)
			{
				nums=nums+((num.charAt(j)-48)*mul);
				mul=mul/10;
			}
			nums=nums/10;
                        obj1.Insert(nums);
			nums=0;
			mul=1;
			num="";
                    }
                }
                for(int j=0;j<num.length();j++)
		{
                    nums=nums+((num.charAt(j)-48)*mul);
                    mul=mul/10;
		}
		nums=nums/10;
		obj1.Insert(nums);
                if(chd==1)
                str = obj1.inOrder(obj1.root);
                if(chd==2)
                str = obj1.preOrder(obj1.root);
                if(chd==3)
                str = obj1.postOrder(obj1.root);
              
                DataStructures.traverse.setText(str);
              /*
                DrawPanel panel = new DrawPanel(obj1.root,40,60);
                panel.setTree(obj1.root);
                JFrame application = new JFrame("AVL Tree");
              
                application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                application.add(panel);           

                application.setSize(650, 500);
                application.setVisible(true); 
              */
                break;
            }
            case 3:
            {
                String str="", num="";
                RBT obj = new RBT();
                int nums=0, mul=1;
                for(int i=0;i<inpt.length();i++)
                {
                    if(inpt.charAt(i)!=' ')
                    {
			num=num+inpt.charAt(i);
			mul=mul*10;
                    }
                    else
                    {
			for(int j=0;j<num.length();j++)
			{
                            nums=nums+((num.charAt(j)-48)*mul);
                            mul=mul/10;
			}
			nums=nums/10;
                        obj.Insert(nums);
			nums=0;
			mul=1;
			num="";
                    }
                }
                for(int j=0;j<num.length();j++)
		{
                    nums=nums+((num.charAt(j)-48)*mul);
                    mul=mul/10;
		}
		nums=nums/10;
		obj.Insert(nums);
                if(chd==1)
                str = obj.inOrder(obj.root);
                if(chd==2)
                str = obj.preOrder(obj.root);
                if(chd==3)
                str = obj.postOrder(obj.root);
                
                DataStructures.traverse.setText(str);
                DrawPanel panel = new DrawPanel(obj.root,40,60);
                panel.setTree(obj.root);
                JFrame application = new JFrame("Red Black Tree");
                
                application.setDefaultCloseOperation(application.DISPOSE_ON_CLOSE);
                application.add(panel);

                application.setSize(650, 500);
                application.setVisible(true);
                
                break;
            }
            case 4:
            {
                MaxHeap hp = new MaxHeap(20);
                String str="", num="";
                int nums=0, mul=1;
                for(int i=0;i<inpt.length();i++)
                {
                    if(inpt.charAt(i)!=' ')
                    {
			num=num+inpt.charAt(i);
			mul=mul*10;
                    }
                    else
                    {
			for(int j=0;j<num.length();j++)
			{
                            nums=nums+((num.charAt(j)-48)*mul);
                            mul=mul/10;
			}
			nums=nums/10;
                        hp.Insert(nums);
			nums=0;
			mul=1;
			num="";
                    }
                }
                for(int j=0;j<num.length();j++)
		{
                    nums=nums+((num.charAt(j)-48)*mul);
                    mul=mul/10;
		}
		nums=nums/10;
		hp.Insert(nums);
                
                JOptionPane.showMessageDialog(null,"\n                      *MAX HEAP\n"+hp.display());
                break;
            }
            case 5:
            {   String str="", num="";
                Tree234 obj = new Tree234();
                int nums=0, mul=1;
                for(int i=0;i<inpt.length();i++)
                {
                    if(inpt.charAt(i)!=' ')
                    {
			num=num+inpt.charAt(i);
			mul=mul*10;
                    }
                    else
                    {
			for(int j=0;j<num.length();j++)
			{
                            nums=nums+((num.charAt(j)-48)*mul);
                            mul=mul/10;
			}
			nums=nums/10;
                        obj.Insert(nums);
			nums=0;
			mul=1;
			num="";
                    }
                }
                for(int j=0;j<num.length();j++)
		{
                    nums=nums+((num.charAt(j)-48)*mul);
                    mul=mul/10;
		}
		nums=nums/10;
		obj.Insert(nums);
                
                obj.displayTree();
                break;
            }
            case 6:
            {
                MinHeap mhp = new MinHeap(20);
                String str="", num="";
                int nums=0, mul=1;
                for(int i=0;i<inpt.length();i++)
                {
                    if(inpt.charAt(i)!=' ')
                    {
			num=num+inpt.charAt(i);
			mul=mul*10;
                    }
                    else
                    {
			for(int j=0;j<num.length();j++)
			{
                            nums=nums+((num.charAt(j)-48)*mul);
                            mul=mul/10;
			}
			nums=nums/10;
                        mhp.Insert(nums);
			nums=0;
			mul=1;
			num="";
                    }
                }
                for(int j=0;j<num.length();j++)
		{
                    nums=nums+((num.charAt(j)-48)*mul);
                    mul=mul/10;
		}
		nums=nums/10;
		mhp.Insert(nums);
                JOptionPane.showMessageDialog(null,"\n                      *MIN HEAP\n"+mhp.display());
                break;
            }
        }       
    }
    public static void main(String[] args) 
    {
        int ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Options:"
                + "\n\t1. BST TREE"
                + "\n\t2. AVL TREE"
                + "\n\t3. RED BLACK TREE"
                + "\n\t4. HEAP TREE"
                + "\n\t5. 2-3 TREE");
        System.out.print("Enter your choice: ");
        ch = scan.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("\n*BINARY SEARCH TREE:");
                BST obj = new BST();
                obj.Insert(5);
                System.out.println("Inserting '5'");
                obj.Insert(4);
                System.out.println("Inserting '4'");
                obj.Insert(3);
                System.out.println("Inserting '3'");
                obj.Insert(2);
                System.out.println("Inserting '2'");
                obj.Insert(1);
                System.out.println("Inserting '1'");
                System.out.println("InOrder Display: ");
                obj.inOrder(obj.root);
                System.out.println("");
                break;
            }
            case 2:
            {
                System.out.println("\n*AVL TREE:");
                AVL obj = new AVL();
                obj.Insert(5);
                System.out.println("Inserting '5'");
                obj.Insert(4);
                System.out.println("Inserting '4'");
                obj.Insert(3);
                System.out.println("Inserting '3'");
                obj.Insert(2);
                System.out.println("Inserting '2'");
                obj.Insert(1);
                System.out.println("Inserting '1'");
                System.out.println("InOrder Display: ");
                obj.inOrder(obj.root);
                System.out.println("");
                break;
            }
            case 3:
            {
                System.out.println("\n*RED BLACK TREE:");
                RBT obj = new RBT();
                obj.Insert(5);
                System.out.println("Inserting '5'");
                obj.Insert(3);
                System.out.println("Inserting '3'");
                obj.Insert(7);
                System.out.println("Inserting '7'");
                obj.Insert(2);
                System.out.println("Inserting '2'");
                obj.Insert(4);
                System.out.println("Inserting '4'");
                System.out.println("InOrder Display: ");
                obj.inOrder(obj.root);
                System.out.println("");
                break;
            }
            case 4:
            {
                System.out.println("\n*MAXHEAP:");
                MaxHeap hp = new MaxHeap(5);
                hp.Insert(5);
                System.out.println("Inserting '5'");
                hp.Insert(4);
                System.out.println("Inserting '4'");
                hp.Insert(3);
                System.out.println("Inserting '3'");
                hp.Insert(2);
                System.out.println("Inserting '2'");
                hp.Insert(1);
                System.out.println("Inserting '1'");
                hp.display();
                System.out.println("");
                break;
            }
            case 5:
            {
                System.out.println("\n*2-3 TREE:");
                
                System.out.println("");
                break;
            }
        }
         System.out.println("           "+"*GROUP MEMBERS*\n"
            + "\n\t*(K14-2081)      HISHAM AHMED    (Group Leader)"
            + "\n\t*(K14-2095)      SHAHERYAR RASHID"
            + "\n\t*(K14-2802)      RAKAISHWER"
            + "\n\t*(K14-2194)      ALI MURTAZA"
            + "\n\t*(K14-2226)      MANESH KUMAR");
    }
}