public class removeDuplicates {
    static String removeDuplicatesChar(String str) {
        int len = str.length();
        char[] ch = str.toCharArray();
        char[] temp = new char[len];
        temp[0] = ch[0];
        for (int i = 0; i <len; i++) {
            for(int j = 0; j <= i; j++) { 
            if(temp[j] == ch[i]){
                continue;
            }else{
                temp[j] = ch[i];
            }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "abcabdef";
        str = removeDuplicatesChar(str);
        System.out.println(str);
    }
}
