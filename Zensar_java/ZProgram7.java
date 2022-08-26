import java.util.Arrays;
public class ZProgram7 {

    int[] arr1={1,2,3,4,6,7,9}; // one missing
    int[] arr2={1,2,3,4,5,6,7,8,9,12}; // two missing
    int[] arr3={2,1,6,5,4,12};
    int[] arr4={55,66,77,44,55}; // duplicate elements

    //  How do you find the missing number in given integer array of 1 to 100
    void missingNum(int[] array){
        int n = array.length;
        int num=0;
        System.out.println("Missing numbers of array are: ");
        for(int i=array[0];i<=array[n-1];i++){
            if (array[num] == i){
                num++;
            }
            else{
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    // How do you find the duplicate number on given integer array
    void duplicateNum(int[] array){
        System.out.println("Duplicate numbers in array are:");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }

    // How do you find the largest and smallest number in an unsorted integer array
    void MaxMinNum(int[] array){
        int max = array[0];
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
            else if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Largest number = "+max+"\nSmallest number = "+min);
    }

    // How to remove duplicates from a given array in Java
    int removeDuplicates(int[] array){
        Arrays.sort(array);
        int n = array.length;
        int j=0;
        for(int i=0;i<n-1;i++){
            if(array[i]!=array[i+1]){
                array[j++] = array[i];
            }
        }
        array[j++] = array[n-1];
        return j;
    }

    // How to print reverse array
    void reverseArray(int[] array){
        System.out.println("\nPrinting reverse array: ");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main(String[] args){
        ZProgram7 obj = new ZProgram7();
        
        obj.missingNum(obj.arr1);
        obj.missingNum(obj.arr2);
        
        obj.duplicateNum(obj.arr4);
        
        obj.MaxMinNum(obj.arr3);
        
        System.out.println("Removing duplicates:");
        int num = obj.removeDuplicates(obj.arr4);
        for(int i=0;i<num;i++){
            System.out.print(obj.arr4[i]+" ");
        }
        
        obj.reverseArray(obj.arr2);
    }
}