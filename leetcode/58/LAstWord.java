public class LAstWord {
    public static int lengthOfLastWord(String s) {
        boolean char_flag = false;
        int len = 0;
        for (int i = s.length() -1 ; i > 0; i--) {
            if(Character.isLetter(s.charAt(i))) {
                char_flag = true;
                len++;
            }else{
                if(char_flag) {
                    return len;
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String str = "  Hi thi s s is a str ";
        int len = lengthOfLastWord(str);
        System.out.println(len);
    }
}
