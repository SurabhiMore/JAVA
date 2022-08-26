import java.util.Arrays;
public class ZProgram2 {
    public static void main(String args[]){

        int[] array1 = {2,4,7,8};
        int[] array2 = {9,7,6,1};

        int[] arrayAddition = new int[4];
        int[] arraySubtraction = new int[4];
        int[] arrayMultiplication = new int[4];
        int[] arrayDivision = new int[4];

        for(int i=0; i<array1.length;i++){
            arrayAddition[i] = array1[i] + array2[i];
            arraySubtraction[i] = array1[i] - array2[i];
            arrayMultiplication[i] = array1[i] * array2[i];
            arrayDivision[i] = array1[i] / array2[i];
        }

        System.out.println(Arrays.toString(arrayAddition));
        System.out.println(Arrays.toString(arraySubtraction));
        System.out.println(Arrays.toString(arrayMultiplication));
        System.out.println(Arrays.toString(arrayDivision));
    }
}
        

