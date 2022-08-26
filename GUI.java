import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name"); // this method returns string
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // converting string to int
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        // string to double
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
        
    }
}
