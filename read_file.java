import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read_file {
    public static void main(String[] args){

        try{
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while(data != -1){  // data=-1 => eof
                System.out.print((char)data);
                data = reader.read();   // read the next character
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
      
    }
}
