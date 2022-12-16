import java.util.Scanner;

class numIsZero extends Exception {
    public numIsZero(String s)
    {
        super(s);
    }
}

public class userdefined {
   
    public static void main(String args[])
    {
        int n;
        try {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if(n==0){
            throw new numIsZero("zero");
            
            }
        }
        catch (numIsZero ex) {
            System.out.println("enter number is zero");
            System.out.println(ex.getMessage());
        }
        catch(Exception e){
            System.out.println("enter the correct data ");
            
        }
        
    }
    }