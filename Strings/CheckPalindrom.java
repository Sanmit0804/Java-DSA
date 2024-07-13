public class CheckPalindrom {
    public static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str2 = "noon";
        String str3 = "madam";
        System.out.print(isPalindrom("rrrrasdrrr"));
        isPalindrom(str2);
        isPalindrom(str3);
    }
}
