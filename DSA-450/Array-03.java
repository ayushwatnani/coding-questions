import java.util.*;
class K_Max_Min {
    static int K_Min(int[] arr, int k ){
       
        Arrays.sort(arr);
        return arr[k-1];
    }

    static int K_Max(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = {1,5,3,78,54,0}; //0 1 3 5 54 78
        int k;
        System.out.println("Enter k for min");
        k = sc.nextInt();
        int min = K_Min(arr, k);
        System.out.println(k + " min : " + min);
        int max = K_Max(arr, k);
        System.out.println(k + " max : " + max);
        System.out.println(max);
        sc.close();
    }
}
