import java.util.*;

public class RevisionNumbers {
    public static boolean isPalindrom(int num) {
        int revNum = 0;
        int myNum = num;
        while (num > 0) {
            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }
        if (myNum == revNum) {
            return true;
        }
        return false;
    }

    public static void palindromInRange(int min, int max) {
        while (max > min) {
            if (isPalindrom(min)) {
                System.out.println(min);
            }
            min++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeIntRange(int min, int max) {
        while (max > min) {
            if (isPrime(min)) {
                System.out.println(min);
            }
            min++;
        }
    }

    public static void isArmstrong(int num) {
        // An Amrstrong number is a number that is equal to the sum of its own digits
        // each raised to the power of the number of digits.
        int length = Integer.toString(num).length();
        int sum = 0;
        int myNum = num;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + (int) Math.pow(lastDigit, length);
            num = num / 10;
        }
        if (myNum == sum) {
            System.out.println("Number is Armstrong number");
        } else {
            System.out.println("It's Not armstrong");
        }
    }

    public static void isPerfect(int num) {
        // A perfect number is defined as a number that is the sum of its proper
        // divisors ( all its positive divisors excluding itself).

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect number");
        }
    }

    public static void sumOfAPSeries(float firstTerm, float commonDiff, float numberOfTerms) {
        float sum = 0;
        for (int i = 0; i < numberOfTerms; i++) {
            sum = sum + firstTerm;
            firstTerm = firstTerm + commonDiff;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // int num = 1234321;
        // System.out.println(isPalindrom(num));

        // int min = 10;
        // int max = 50;
        // palindromInRange(min, max);

        // int num = 11;
        // System.out.println(isPrime(num));

        // int min = 10;
        // int max = 50;
        // primeIntRange(min, max);

        // int num = 153;
        // isArmstrong(num);

        // int num = 28;
        // isPerfect(num);

        Scanner sc = new Scanner(System.in);
        float firstTerm = sc.nextFloat();
        float commonDiff = sc.nextFloat();
        float numberOfTerms = sc.nextFloat();
        sumOfAPSeries(firstTerm, commonDiff, numberOfTerms);
    }
}
