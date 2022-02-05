import java.util.*;
class StringReversal {
    public static String reverseString(String a){
        int left = 0, right = a.length() -1;
        char[] chars = a.toCharArray();
        while(left < right){
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left ++;
            right --;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = reverseString(str);
        char[] s = str.toCharArray();
        System.out.print(Arrays.toString(s));
        sc.close();
    }
}
