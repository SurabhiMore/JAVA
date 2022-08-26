public class inheritance {
    public static void main(String[] args){

        Motor motor = new Motor();
        motor.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(motor.speed);
        System.out.println(bike.speed);

        System.out.println(motor.doors);
        System.out.println(bike.pedals); 
    }
}
