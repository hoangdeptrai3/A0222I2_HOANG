package ss13_ThuatToanTimkiem.ThucHanh;

public class SearchBinary {
    public static int searchBinary(int[] arr , int value){
        int begin = 0;
        int end = arr.length-1;
        int middle;
        while (end >= begin){
            middle = (begin + end )/2;
            if (arr[middle] == value){
                return middle;
            }else if(arr[middle] > value){
                end = middle -1;
            }else {
                begin = middle +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12};
        System.out.println("result : " +searchBinary(arr,5));
    }
}
