import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * c
 */
public class c {

    public static void main(String[] args) {
        int c;
        
       
        try{
            FileInputStream fin = new FileInputStream("hi.txt");
            FileOutputStream fout = new FileOutputStream("output.txt");
            
        while((c=fin.read())!=-1){
        
            System.out.println((char)c);
            fout.write(c);
            
            
        }
        fin.close();
        fout.close();
        }  
        catch(Exception e)
        {
            e.printStackTrace();


        }
        finally{
            
                
            
        }

    }
}