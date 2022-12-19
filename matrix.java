import java.io.PrintStream;
import java.util.Scanner;
public class matrix{

public static void main(String[] args) {
    PrintStream c = System.out;

c.println("enter the size of the matric: \n");
Scanner scan = new Scanner(System.in);
c.print("Row: ");
int size_row = scan.nextInt();
c.print("column: ");
int size_col = scan.nextInt();

int m1[][] = new int[size_row][size_col];
int m2[][] = new int[size_row][size_col];
int m3[][] = new int[size_row][size_col];

for (int i = 0; i < size_row; i++) {

    for(int j=0; j< size_col;j++)
    { 
        c.print("enter value for m1 : ");
        m1[i][j] = scan.nextInt();
    }
    
}
for (int i = 0; i < size_row; i++) {

    for(int j=0; j< size_col;j++)
    { 
        c.print("enter value for m2: ");
        m2[i][j] = scan.nextInt();
    }
    
}
c.print("addition \n [ ");
for (int i = 0; i < size_row; i++) {

    for(int j=0; j< size_col;j++)
    { 
        
        m3[i][j] = m1[i][j]+m2[i][j]; 
        c.print(m3[i][j]+" ");
    }
    
    c.println(" ");
}
c.print(" ]");
c.print("subraction \n [ ");
for (int i = 0; i < size_row; i++) {

    for(int j=0; j< size_col;j++)
    { 
        
        m3[i][j] = m1[i][j]-m2[i][j]; 
        c.print(m3[i][j]+" ");
    }
    
    c.println(" ");
}
c.print(" ]");
c.print("multipication \n [ ");
for (int i = 0; i < size_row; i++) {

    for(int j=0; j< size_col;j++)
    { 
        
        m3[i][j] = m1[i][j]*m2[i][j]; 
        c.print(m3[i][j]+" ");
    }
    
    c.println(" ");
}
c.print(" ]");
scan.close();
}

}