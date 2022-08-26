public class string {
    public static void main(String[] args){
    
        // equals
        String name = "bro";
        boolean result = name.equals("Bro");
        System.out.println(result);

        // ignore case 
        String str = "Sis";
        boolean rslt = str.equalsIgnoreCase("sis");
        System.out.println(rslt);

        // length
        int length = name.length();
        System.out.println("Name length: " + length);
        
        // index - num
        char index = name.charAt(0);
        System.out.println(index);
        
        // index - char
        int indx = name.indexOf("b");
        System.out.println(indx);
        
        // empty string
        boolean reslt = name.isEmpty();
        System.out.println(reslt);

        // upper case
        String s = name.toUpperCase();
        System.out.println(s);

        // lower case
        String st = name.toLowerCase();
        System.out.println(st);

        // trim - removing whitespace
        String nam = " Bro ";
        String t = nam.trim();
        System.out.println(t);

        // replacing 
        String replc = name.replace('r', 'o');
        System.out.println(replc);
    }
}
