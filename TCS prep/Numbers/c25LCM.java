public class c25LCM {
    public static void lcm(int num1, int num2) {
        int mul = num1 * num2;
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD is: " + num1);

        int lcm = mul / num1;
        System.out.println("LCM is: " + lcm);
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        lcm(num1, num2);
    }
}
