public class encapsulation {
    public static void main(String[] args){
        
        Automobile auto = new Automobile("Chevrolet", "Camaro", 2021);
        // System.out.println(auto.make);   ~ inaccessible
        System.out.println(auto.getMake());
        System.out.println(auto.getYear());

        // auto.yaer = 2022 ~ not visible
        auto.setYear(2022);
        System.out.println(auto.getYear());
    }
}
