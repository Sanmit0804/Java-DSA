public class Substring {
    // Custom substring method
    public static String subString(String str, int start, int end) {
        String substr = "";
        for (int i = start; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String name = "Sanmit Suthar";
        System.out.println(subString(name, 0, 4));
        System.out.println(name.substring(0, 6));
    }
}
