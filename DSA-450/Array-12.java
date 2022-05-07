class MergeTwoSortedArray {
    public static void main(String[] args) {
        int ar1[] = {1, 5, 9, 10, 15, 20};
        int ar2[] = {2, 3, 8, 13};
        int temp;
        for (int i = 0; i <ar1.length; i++){
            for (int j = 0; j < ar2.length; j++){
                if(ar1[i] < ar2[j]){
                    break;
                }else{
                    temp = ar1[i];
                    ar1[i] = ar2[j];
                    ar2[j] = temp;
                }
            }
        }
        // int min = ar2[0];
        for(int i = 0; i < ar2.length; i++){
           for (int j = i+1; j < ar2.length; j++){
               if(ar2[j] < ar2[i]){
                   temp = ar2[i];
                   ar2[i] = ar2[j];
                   ar2[j] = temp;
               }
           }
        }

        for (int i = 0; i < ar1.length; i++){
            System.out.print(ar1[i] + " ");
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < ar2.length; i++){
            System.out.print(ar2[i] + " ");
        }
    }
}
