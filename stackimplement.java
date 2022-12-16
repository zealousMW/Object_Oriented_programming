import java.util.Scanner;

class stackcreator{

   public int stack[];
   public int top ,size;

    stackcreator(int size){

        this.stack = new int[size];
        this.top = -1;
        this.size = size;
    }

    public void push(int x)
    {
      if (this.top == this.size-1) {
        System.out.println("overflow");
        return;
      } 
      this.stack[++this.top] = x;
    }

    public void pop(){

        if (this.top == -1) {
            System.out.println("Underflow");
            return;
        }
        this.top--;
           

    }

    
   public void display()
    {
        for (int i = 0; i <=this.top; i++) {
            System.out.println(stack[i]+" ");
            
        }

    }


}

public class stackimplement {
    public static void main(String[] args) {
        

        stackcreator q1 = new stackcreator(2);
        Scanner scanner = new Scanner(System.in);
        
        int data ,n;
      
        do {
        System.out.println("Select the oeration \n 1.push \n 2.pop \n 3.display \n 4.exit");
         n = scanner.nextInt();
            switch (n) {
                case 1:
                System.out.println("enter the element \n");
                data = scanner.nextInt();
                    q1.push(data);
                    
                break;
                
                case 2:
                q1.pop();
                    
                break;
                case 3:
                System.out.println("element are :");
                q1.display();
                    
                break;
                case 4:
                System.out.println("Closed");
                    
                break;
            
                default:
                    break;
            }
        } while (n!=4);
    }
    
}

