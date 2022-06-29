package demo;

public class SapXepNoiBot {

     public static void bubbleSort(int[] arr){
         boolean check = true;
         for (int i = 1;i< arr.length && check;i++){
             check = false;
             for (int j = 0; j < arr.length -i;j++){
                 if (arr[j] > arr[j+1]){
                     int temp = arr[j+1];
                     arr[j+1] = arr[j];
                     arr[j] = temp;
                     check = true;
                 }
             }
         }
     }

    public static void main(String[] args) {
        int[] arr = {3,2,5,4,9};
        bubbleSort(arr);
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
