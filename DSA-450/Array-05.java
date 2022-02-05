/**
 * Array-05
 */
 class Move_Negative {
     static int[] moveNegative(int[] a){
         int j = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<0){
                if(i != j){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        return a;
     }
    public static void main(String[] args) {
        int[] arr = {1,-1,0,-2,-8,7};
        arr = moveNegative(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}