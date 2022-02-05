import java.util.*;

public class ReverseFirstK {
    public static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += 2*k) {
            int start = i, end = i + k - 1 < s.length() ? i + k - 1 : s.length() - 1;
            while(start < end){
                char temp = ch[start];
                ch[start++] = ch[end];
                ch[end--] = temp;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.next();
        System.out.println("enter k");
        int k = sc.nextInt();
        s = reverseStr(s, k);
        System.out.println(s);
        sc.close();
    }    
}
