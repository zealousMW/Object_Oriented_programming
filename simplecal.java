/**
 * calculator
 */
 

import java.util.*;

public class simplecal {
    public static void main(String[] args) {
        int n,b,a;
        Scanner scanner = new Scanner(System.in);  
        System.out.println("enter any two number: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        calculator c = new calculator(a,b);
        System.out.println("selecte the operation \n 1.addition \n 2.subration \n 3.multiplication \n 4.divide");
        
        do{
         n = scanner.nextInt();
        switch (n) {
            case 1:
            c.add();
            break;
            case 2:
            c.sub();
            break;
        
            case 3:
            c.mul();
            break;
            case 4:
            c.div();
            break;
        
        
            default:
                break;
        }      
    }while(n!=5);
    scanner.close();

}   
}
class calculator {
    public int a,b;
    
    calculator(int a,int b){
        this.a=a ;
        this.b = b;
    }
    public void add(){
        System.out.println("addition: "+(this.a+this.b));
    }
    public void mul(){
        System.out.println("multupication: "+(this.a*this.b));
    }
    public void sub(){
        System.out.println("subration: "+(this.a-this.b));
    }
    public void div(){
        System.out.println("division: "+(this.a/this.b));
    }

    
}
