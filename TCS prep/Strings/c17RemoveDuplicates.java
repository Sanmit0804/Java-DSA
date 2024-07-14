// https://www.youtube.com/watch?v=xblRNKf_0l8

public class c17RemoveDuplicates {
    public static String removeDuplicates(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (ans.contains(ch)) {
                continue;
            }
            ans = ans + ch;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abcabcabc";
        System.out.println(removeDuplicates(str));
    }
}
