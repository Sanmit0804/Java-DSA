// Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.

public class c6RemoveSpecialChar {
    public static void removeSpecialChar(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";
        // String str = "1.Python & 2.Java";
        removeSpecialChar(str);
    }
}