import java.util.Arrays;
public class ZProgram11{

    // Write a Java program  for Find minimum and maximum element in array
    void minMax(int[] array){
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
        System.out.println("The minimum number is "+min+" and the maximum number is "+max+" in the given array.");
    }

    // Write a Java program  for Find occurrence of an integer in array
    int numCount(int[] array, int num){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                count++;
            }
        }
        return count;
    }

    //Write a Java program  for find all pairs of elements in an integer array whose sum is equal to 10 and 20
    void arraySum(){
        int arr[]={1,5,9,8,4,2,3,6,7,5,2,4,6,10,15,14,12,13,16,17};
        System.out.println("Pairs of elements whose sum is equal to 10 and 20:");
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==10){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+10);
                }
                else if(arr[i]+arr[j]==20){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+20);
                }
            }
        }
    }

    // Write java program to reverse array without using additional array 
    int[] reverseArray(int[] array){
		for(int i=0;i<array.length/2;i++) {
			int swap = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = swap;
		}
        return array;
    }
     
    // How to merge two unsorted arrays in sorted order in java
    public static int[] sortArray(int[] arrA, int[] arrB){
        int[] mergeArray = new int[arrA.length+arrB.length];
        int i=0, j=0, k=0;
        while(i<arrA.length){
            mergeArray[k] = arrA[i];
            i++;
            k++;
        }
        while(j<arrB.length){
            mergeArray[k] = arrB[j];
            j++;
            k++;
        }
        Arrays.sort(mergeArray);
        return mergeArray;
    }


    public static void main(String args[]){

        ZProgram11 obj = new ZProgram11();
        int[] array = {2,55,56,8,57,5,90,10,4,2,5,55,56,2,8,90,7};
        
        obj.minMax(array);
        
        System.out.println("Occurrence of integer 2 in array = "+obj.numCount(array, 2));

        obj.arraySum();

        int[] arr = {1,2,3,4,5};

        System.out.println("Reverse of an array: "+Arrays.toString(obj.reverseArray(arr)));

        System.out.println("Merging two unsorted arrays in sorted order: "+Arrays.toString(sortArray(array, arr)));
    }
}
