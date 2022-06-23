package demo;

public class CayNhiPhan {
    public static int searchBinary(int[] array, int value) {
        int begin = 0;
        int end = array.length - 1;
        int middle;
        while (end >= begin) {
            middle = (begin + end) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] > value) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int num = 7;
        System.out.println("ket qua : "+searchBinary(array,num));
    }
}
