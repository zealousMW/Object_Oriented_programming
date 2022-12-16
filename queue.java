import java.util.Scanner;

class queuecreator{

    public int queue[];
    public int front, rear,max;

    queuecreator(int size){
    this.front= 0;
    this.rear = 0;
    this.max = size;
    this.queue = new int[size];
    }

    public void enqueue(int x)
    {
        if(this.rear==this.max)
        {
            System.out.println("Queue Overflow");
            return;
        }
        this.queue[this.rear] = x;
        this.rear++;
    }

    public void dequeue(){
        if(this.front==this.max)
        {
            System.out.println("Queue Underflow");
            return;
        }
        for (int i = 0; i <=this.rear-1; i++) {
            this.queue[i] = this.queue[i+1];   
        }
        this.queue[rear] = 0;
        this.rear--;
        {
    }    

    }

    
   public void display()
    {
        for (int i = 0; i <= this.rear-1; i++) {
            System.out.print(this.queue[i] + " ");
        }
    }


}

public class queue {
    public static void main(String[] args) {
        

        queuecreator q1 = new queuecreator(12);
        System.out.println(q1.rear);
        Scanner scanner = new Scanner(System.in);
        
        int data ,n;
      
        do {
        System.out.println("Select the oeration \n 1.quence \n 2.dequeue \n 3.display \n 4.exit");
         n = scanner.nextInt();
            switch (n) {
                case 1:
                System.out.println("enter the element \n");
                data = scanner.nextInt();
                    q1.enqueue(data);
                    
                break;
                
                case 2:
                q1.dequeue();
                    
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

