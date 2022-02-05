/**
 * Array-01
 */
class ReverseArray {

    static int reverse_array(int arr[], int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return 0;
    }

    static void printArray(int arr[], int size){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {1,5,26,8};
        int size = arr.length;
        int start = 0, end = size -1;
        printArray(arr, size);
        reverse_array(arr, start, end);
        printArray(arr, size);
    }

}