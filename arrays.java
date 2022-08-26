public class arrays {
    public static void main(String[] args){
        
        // method 1
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        cars[0] = "Mustang";
        System.out.println(cars[0]);

        System.out.println(cars.length);
        
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        // method 2
        String[] car = new String[3];
        car[0] = "Camaro";
        car[1] = "Corvette";
        car[2] = "Tesla";
        System.out.println(car[1]);


        // 2D arrays: multidimensional arrays
        String[][] vehicle = new String[3][3];
        vehicle[0][0] = "bus";
        vehicle[0][1] = "train";
        vehicle[0][2] = "cycle";
        vehicle[1][0] = "car";
        vehicle[1][1] = "bike";
        vehicle[1][2] = "scooty";
        vehicle[2][0] = "truck";
        vehicle[2][1] = "van";
        vehicle[2][2] = "tempo";

        // prinnting 2D array
        for(int i=0; i<vehicle.length; i++){
            System.out.println();
            for(int j=0; j<vehicle[i].length; j++){
                System.out.print(vehicle[i][j]+" ");
            }
        }

        System.out.println();

        String[][] transport = {
            {"ship", "submarine", "boat"},
            {"car","bus","train"},
            {"helicopter","aeroplane","jet"}
        };

        for(int i=0; i<transport.length; i++){
            System.out.println();
            for(int j=0; j<transport[i].length; j++){
                System.out.print(transport[i][j]+" ");
            }
        }
    }
}
