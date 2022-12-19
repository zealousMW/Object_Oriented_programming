interface shape{
    public float l ,b;
   public double printarea();
}
class rectangle implements shape{
    rectangle(float le,float br){
        this.l = le;
        this.b = br;

    }
     public double printarea(){
        return l*b;
     }

}
class square implements shape{
    square(float le, float br){
        this.l = le;
        this.b = br;
    }
     public double printarea(){
        return (l *b)/2;
     }

}
class circle implements shape{
    circle(float le){
        this.l = le;
        
    }
     public double  printarea(){
        return  3.14 * l * l;
     }
}

class inter2{
    public static void main(String[] args) {
        rectangle r = new rectangle(2, 3);
        square s = new square(2, 3);
        circle c =new circle(6);
        System.out.println("area of rectangle "+ r.printarea()+"\narea of square "+ s.printarea()+"\narea of circle "+ c.printarea());
    }
}