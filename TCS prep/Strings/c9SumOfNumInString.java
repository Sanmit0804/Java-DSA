public class c9SumOfNumInString {
    public static int sumOfNumbersInString(String str) {
        int sum = 0;
        int currentNumber = 0;
        boolean isDigitSequence = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber = (currentNumber * 10) + (ch - '0');
                isDigitSequence = true;
            } else {
                if (isDigitSequence) {
                    sum = sum + currentNumber;
                    currentNumber = 0;
                    isDigitSequence = false;
                }
            }
        }
        if (isDigitSequence) {
            sum = sum + currentNumber;
        }
        return sum;
    }

    public static void main(String[] args) {
        String input1 = "123xyz";
        String input2 = "1xyz23";

        System.out.println(sumOfNumbersInString(input1)); // Output: 123
        System.out.println(sumOfNumbersInString(input2)); // Output: 24
    }
}