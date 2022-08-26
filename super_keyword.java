public class super_keyword {
    public static void main(String[] args){

        Hero hero1 = new Hero("Superman", 35, "Everything");
        Hero hero2 = new Hero("Spiderman", 28, "Spider-Sense");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        
        System.out.println(hero2.toString());   // prints all info at once instead of the above 3 print statements
    }
}
