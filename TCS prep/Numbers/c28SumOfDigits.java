public class c28SumOfDigits {
    public static void sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num = 102;
        sumOfDigit(num);
    }
}
