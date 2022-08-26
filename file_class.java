import java.io.File;

public class file_class {
    public static void main(String[] args){

        File file = new File("secret_msg.txt");

        if(file.exists()){
            System.out.println("That file exists! :o!");
            
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else{
            System.out.println("That file doesn't exists :(");
        }
    }
}
