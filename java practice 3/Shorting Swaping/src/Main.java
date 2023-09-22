import java.util.*;

class Shorting{

    public static void printArray(int Arr[]){
        for (int i = 0; i < Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]= {10,13,21,24,12,14};

        //bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        printArray(arr);
    }
}



