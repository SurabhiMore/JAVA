import java.io.FileWriter;
import java.io.IOException;

public class write_to_file {
    public static void main(String[] args){

        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nSugar is sweet \nAnd so are you ;)");
            writer.append("\n~ by me");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}



    
  
