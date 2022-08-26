public class ZProgram1 {
    public static void main(String name[]){

        ZProgram1 obj = new ZProgram1();
        obj.j = 10;
        int a = obj.i + obj.j;
        int b = obj.i - obj.j;
        int c = obj.i * obj.j;
        System.out.println("Addition of "+obj.i+"+"+obj.j+"="+a);
        System.out.println("Subtraction of "+obj.i+"-"+obj.j+"="+b);
        System.out.println("Multiplication of "+obj.i+"*"+obj.j+"="+c);

        /* int ii = 25;
        int jj = 10;   float zz = 2.0 (2.5)   ~ solved by Typecasting */
        float ii = 25;
        float jj = 10;
        float zz = ii/jj;   // 2.5

        System.out.println("Division of "+ii+"+"+jj+"="+zz);
    }

    int i =25;
    int j;
}
