import java.io.*;

public class Rw {  
    public static void main(String[] args) {
        try
        {
            FileWriter fw = new
                    FileWriter("File.Txt");
            BufferedWriter WriteFileBuffer = new
                    BufferedWriter(fw);
            WriteFileBuffer.write("hello");
            WriteFileBuffer.newLine();
            WriteFileBuffer.write("I am maheshwar");
            WriteFileBuffer.newLine();

            WriteFileBuffer.close();

            FileReader fr = new 
                    FileReader("File.txt");
            BufferedReader ReadFileBuffer = new BufferedReader(fr);

            System.out.println(ReadFileBuffer.readLine());
            System.out.println(ReadFileBuffer.readLine());
            System.out.println(ReadFileBuffer.readLine());

            ReadFileBuffer.close();
        } catch (IOException Ex)
        {
            System.out.println(Ex.getMessage());
        }
    }
}