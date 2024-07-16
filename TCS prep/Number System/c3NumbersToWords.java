// Convert the numbers in the form of words

public class c3NumbersToWords {
    public static void numbersToWords(String str) {
        String[] singleDigit = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seaven", "eight",
                "nine" };
        String[] doubleDigit = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "ninteen", "twenty" };
        String[] tensMultiple = new String[] { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy",
                "eighty", "ninty" };
        String[] tensPower = new String[] { "hundred", "thousand" };

        if (str.length() == 0) {
            System.out.println("");
            return;
        } else if (str.length() == 1) {
            System.out.println(singleDigit[str.charAt(0) - '0']);
        }

        int len = str.length();
        int i = 0;
        while (len > i) {
            if (len > 2) {
                if (str.charAt(i) - '0' != 0) {
                    System.out.println(singleDigit[str.charAt(i) - '0'] + " ");
                    System.out.println(tensPower[len - 3] + " ");
                }
                len--;
            } else {
                if (str.charAt(i) - '0' == 1) {
                    System.out.println(doubleDigit[str.charAt(i + 1) - '0'] + " ");
                    return;
                } else if (str.charAt(i) - '0' != 0) {
                    System.out.println(tensMultiple[str.charAt(i) - '0'] + " ");
                    if (str.charAt(i + 1) - '0' != 0) {
                        System.out.println(singleDigit[str.charAt(i + 1) - '0']);

                    }
                    return;
                }
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int n = 45;
        String str = Integer.toString(n);
        numbersToWords(str);
    }
}
