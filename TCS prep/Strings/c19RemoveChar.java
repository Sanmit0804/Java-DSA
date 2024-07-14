// Remove Characters from first String present in the Second String

public class c19RemoveChar {
    public static void solve(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            boolean match = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    match = true;
                }
            }
            if (!match) {
                sb.append(str1.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cefz";
        solve(str1, str2);
    }
}
