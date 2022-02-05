import java.util.*;
class Sort012Arr {
    static int[] sortedArray(int[] arr, int len){
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count0++;
            }else if(arr[i] == 1){
                count1++;
            }else{
                count2++;
            }  
        }
            int j =0;
            while(count0>0){
                arr[j] = 0;
                j++;
                count0--;
            }

            while(count1>0){
                arr[j] = 1;
                j++;
                count1--;
            }

            while(count2>0){
                arr[j] = 2;
                j++;
                count2--;
            }

        

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,0,1,1,1,2,2,1,0};
        int len = arr.length;
        arr = sortedArray(arr, len);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
