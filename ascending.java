import java.util.Scanner;

public class ascending {

    public static void main(String[] args) {
        int[] val;
        System.out.print("Enter the number of enlements: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        val = new int[n];
        System.out.print("enter the numbers: ");
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }
        int temp =0;
        //bubble sort
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-1; j++) {

                if(val[j]<val[j-1]){
                 temp = val[j-1];
                 val[j-1]=val[j];
                 val[j]=temp; 

                }
                
            }
            
        }

        System.out.println("sorted value");
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i]+" ");
        }
        scanner.close();

    }
    
}
