package l2test;

import java.util.Scanner;

public class RotatedString {
    public static boolean findRotatedString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
       // int n = str2.length();
        String newStr = str1 + str1;
        if(str1.length()==str2.length()) {
            for (int i = 0; i < newStr.length(); i++) {
                if (newStr.indexOf(str2) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        System.out.println( findRotatedString(str1,str2));
    }
}
