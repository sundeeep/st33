import java.util.Scanner;

public class Sort{

    private int[] arr;
    public Sort(){}
    public Sort(int[] arr){
        this.arr = arr;
    }

    public int[] bubbleSort(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1]; 
                }
            }
        }
        return arr;
    }

    public int[] selectionSort(){

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sizeOfAnArray;
        System.out.println("Enter the size of an array: ");
        sizeOfAnArray = input.nextInt();

        int arr[] = new int[sizeOfAnArray];
        System.out.println("Enter the elements of an array seperated by space:");
        for(int index=0; index<arr.length; index++ ){
            arr[index] = input.nextInt();
        }
        Sort sort = new Sort(arr);
        int[] sortedArray = sort.bubbleSort();
        System.out.print("Therefore, Sorted Array: ");
        for(int element: sortedArray){
            System.out.print(element+" ");
        }
    }
}