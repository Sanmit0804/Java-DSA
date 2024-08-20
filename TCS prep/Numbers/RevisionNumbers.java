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

    public static void sumOfGPSeries(float firstTerm, float commonRatio, float numberOfTerms) {
        float sum = 0;
        for (int i = 0; i < numberOfTerms; i++) {
            sum = sum + firstTerm;
            firstTerm = firstTerm * commonRatio;
        }
        System.out.println(sum);
    }

    public static void maxAndMin(int num) {
        int d;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        while (num != 0) {
            d = num % 10;
            mini = Math.min(mini, d);
            maxi = Math.max(maxi, d);
            num = num / 10;
        }

        System.out.println("The minimum number is: " + mini);
        System.out.print("The maximum number is: " + maxi);
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
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

        // Scanner sc = new Scanner(System.in);
        // float firstTerm = sc.nextFloat();
        // float commonDiff = sc.nextFloat();
        // float numberOfTerms = sc.nextFloat();
        // sumOfAPSeries(firstTerm, commonDiff, numberOfTerms);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first term: ");
        // float firstTerm = sc.nextFloat();
        // System.out.print("Enter the common Difference: ");
        // float commonRatio = sc.nextFloat();
        // System.out.print("Enter the number of terms: ");
        // float numberOfTerms = sc.nextFloat();
        // sumOfGPSeries(firstTerm, commonRatio, numberOfTerms);

        // int num = 123456;
        // maxAndMin(num);

        int year = 2024;
        System.out.println(isLeap(year));
    }
}
