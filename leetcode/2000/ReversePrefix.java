import java.util.*;

public class ReversePrefix {
    public static String reversePrefix(String word, char ch) {
        char temp;
        char[] str = word.toCharArray();
        int rem = 0, left=1, right;
        for (int i = 0; i < word.length(); i++) {
            if(str[i] == ch){
                rem = i;
                temp = str[i];
                str[i] = str[0];
                str[0] = temp;
            }
        }
        right = rem - 1;
        
        while(left < right){
                temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
        }
        
        return new String(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word : ");
        String word = sc.nextLine();
        System.out.println("enter reversal index : ");
        char ch = sc.next().charAt(0);
        word = reversePrefix(word, ch);
        System.out.println(word);
        sc.close();
    }
}
