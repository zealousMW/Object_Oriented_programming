
 abstract class areaAbstract {
    abstract float rectArea(float len, float wit);
    abstract double circleArea(float radius);
    abstract float squareArea(float side);    
   }
   class areaCalculator extends areaAbstract{
       float length,radius,width,side;
       public float rectArea(float len, float wit){

           this.length = len;
           this.width = wit;
           return this.length * this.width;

       } 
       
       public double circleArea(float radius) {
           this.radius = radius;
           return Math.PI * (this.radius * this.radius);
       }
       public float squareArea(float side){
           this.side = side;
           return (this.side * this.side);

       } 


   }

public class absract {
     
   



    public static void main(String[] args) {

        areaAbstract areacal;
        areacal = new areaCalculator();
        System.out.println(areacal.rectArea(10,10));
        System.out.println(areacal.circleArea(10));
        System.out.println(areacal.squareArea(10));
        
    }
    
}

