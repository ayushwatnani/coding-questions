import java.util.Scanner;
class Inverted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inv = 0;
        int op =  1;
        while(n>0){
            int od = n % 10;
            int ip = od;
            int id = op;

            inv = (int) (inv + id * Math.pow(10, ip-1));
            op++;
            n = n/10;
        }
        System.out.println(inv);
    }
}