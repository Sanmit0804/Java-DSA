public class code1 {
    public static void swapValue(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        // Swap - Values Exchange
        int a =10;
        int b = 20;
        swapValue(a,b);
    }
}
