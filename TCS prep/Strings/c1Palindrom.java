public class c1Palindrom {
    public static boolean isPalindrom(String str) {
        str = str.trim().toLowerCase();
        str = str.replaceAll("[^a-zA-Z]", "");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str =  "A man, a plan, a canal: Panama";
        System.out.println(isPalindrom(str));
    }
}