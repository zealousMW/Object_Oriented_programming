public class inter {
    public static void main(String[] args) {

        child c = new child();
        c.print();
        c.print2();
        c.print3();
        
    }
}

interface parent1{

    public void print();

    
}

class parent2 {
    void print2(){
        System.out.println("this is parent no 2");
        }

  
}
class child extends parent2 implements parent1 {
    void print3(){
        System.out.println("this is class inherited using inheritance");

    }
    public void print(){
        System.out.println("this is parent no 1");

    }
 
    
 }   