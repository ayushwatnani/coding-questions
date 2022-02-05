/**
 * Array-02
 */
class MinMax {
    static int find_Min(int[] arr, int len){
        int min = arr[0];
        for (int i = 0; i < len; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int find_Max(int[] arr,int len){
        int max = arr[0];
        for (int i = 0; i < len; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,34,-5,7,-9,0};
        int len = arr.length;
        int min = find_Min(arr, len);
        int max = find_Max(arr, len);
        System.out.println("Min : " + min + "  Max : " + max);
    }
}