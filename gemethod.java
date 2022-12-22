class printer {
    
    public static <E> void hello(E e){
        System.out.println(e);
        System.out.println(e.getClass().getName());

    }
}

public class gemethod {
    public static void main(String[] args) {
    
   printer p = new printer();
   p.hello("maheshwar");
   p.hello(1);
   p.hello(1.0);
   
    
    }
}
