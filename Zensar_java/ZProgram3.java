/* Static methods : called without creating an object 
 * referenced by - class name itself
 *               - reference to the Object
 * 
 * Instance methods :  require an object of its class to be created before it can be called
 * To invoke a instance method - create an Object of the class in which the method is defined
 */

public class ZProgram3 {

    // initialize and declare an array
    int[] array = {};

    // 1. write method returning array and parameter is array
    public int[] returnDoubleArray(int[] array){
        this.array = array;
        for(int i=0;i<array.length;i++){
            array[i] *= 2;
        }
        return array;
    }

    // 2. write method returning object and parameter is object
    public static void main(String args[]){

        // creating class instance
        ZProgram3 obj = new ZProgram3();

        // calling an instance method in the class
        int[] sample = {1,2,3,4,5};
        obj.returnDoubleArray(sample);
        for(int i=0; i<obj.array.length; i++){
            System.out.print(obj.array[i] + " ");
        }
    }
}
