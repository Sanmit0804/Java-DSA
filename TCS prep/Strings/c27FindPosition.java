public class c27FindPosition {
    public static int findSubstringPosition(String str1, String str2) {
        return str1.indexOf(str2);
    }

    public static void main(String[] args) {
        // Example 1
        String str1 = "takeuforward";
        String str2 = "forward";
        System.out.println(findSubstringPosition(str1, str2)); // Output: 5

        // Example 2
        str1 = "hello";
        str2 = "az";
        System.out.println(findSubstringPosition(str1, str2)); // Output: -1
    }
}
