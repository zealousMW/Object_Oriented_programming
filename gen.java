 class Box<T> {
    private T t;
 
    public void add(T t) {
       this.t = t;
    }
 
    public T get() {
       return t;
    }
    public static <E> void hello(E e){
        System.out.println(e);

    }
}

public class gen {
    public static void main(String[] args) {
    Box<Integer> box = new Box<Integer>();

    box.add(1);
    System.out.println(box.get());
    Box<String> box1 = new Box<String>();

    box1.add("maheshwar");
    System.out.println(box1.get());
    box.hello(1);
    box.hello("maheshwar");
   
   
    
    }
}
