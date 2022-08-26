public class object_Human {

    String name;
    int age;
    double weight;

    // constructor
    object_Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // methods
    void eat(){
        System.out.println(this.name + " is eating.");
    }
    void drink(){
        System.out.println(this.name + " is drinking *burp*");
    }
}

