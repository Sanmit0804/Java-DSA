public class c7ReverseString {
    public static void reverse(String str) {
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(str.length() - 1 - i);
        // sb.append(ch);
        // }
        // System.out.println(sb);
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        String str = "Sanmit";
        reverse(str);
    }
}
