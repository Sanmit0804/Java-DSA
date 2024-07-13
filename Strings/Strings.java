import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c' };
        String str = "abcd";
        String str2 = new String("zxcv");

        // Strings are immutable

        // Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
    }
}