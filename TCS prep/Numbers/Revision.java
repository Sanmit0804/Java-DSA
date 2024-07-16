import java.util.Scanner;

public class Revision {
    public static Boolean isPalindrom(int num) {
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
        for (int i = min; i < max; i++) {
            if (isPalindrom(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int length = String.valueOf(num).length();
        int sum = 0;
        int myNum = num;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + (int) Math.pow(lastDigit, length);
            num = num / 10;
        }
        if (sum == myNum) {
            return true;
        } else {
            return false;
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
            System.out.println("Not perfect");
        }
    }

    public static void sumOfAPSeries(float firstTerm, float commonDiff, float numberOfTerms) {
        float sum = 0;
        for (float i = 0; i < numberOfTerms; i++) {
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

    public static void largestOfThree(int a, int b, int c) {
        System.out.println(Math.max(a, Math.max(b, c)));
    }

    public static boolean isLeapYear(int year) {
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

    public static void reverse(int n) {
        int revNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(revNum);
    }

    public static void maxAndMin(int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (n > 0) {
            int lastDigit = n % 10;
            min = Math.min(lastDigit, min);
            max = Math.max(lastDigit, max);
            n = n / 10;
        }
        System.out.println("The smallest digit is : " + min);
        System.out.println("The largest digit is : " + max);
    }

    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void printFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void printValue(int num, int pow) {
        // int result = (int) Math.pow(num, pow);
        // System.out.println(result);

        int ans = 1;
        for (int i = 0; i < pow; i++) {
            ans = ans * num;
        }
        System.out.println(ans);
    }

    public static void printFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printPrimeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void isStrong(int num) {
        int sum = 0;
        int myNum = num;

        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + fact(lastDigit);
            num = num / 10;
        }
        System.out.println(sum);
        if (sum == myNum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numStr)) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an automorphic number");
        }
    }

    public static void gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);

        // public static int findGCD(int a, int b)
        // {
        // if (b == 0) {
        // System.out.println(a);
        // }
        // System.out.println(gcd(b, a % b));
        // }
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {

        int gcd = getGCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
        return lcm;
    }

    public static void isHarshad(int num) {
        int sum = 0;
        int myNum = num;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        if (myNum % sum == 0) {
            System.out.println("Harshad number");
        } else {
            System.out.println("Not a harshad number");
        }
    }

    public static void isAbundant(int num) {
        int sum = 0;
        int factor = 1;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factor = i;
                sum = sum + factor;
            }
        }
        if (sum > num) {
            System.out.println("Abundant number");
        } else {
            System.out.println("Not");
        }
    }

    public static void sumOfNumbersInRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void permute(int n, int r) {
        int permute = fact(n) / fact(n - r);
        System.out.println(permute);
    }

    public static void fractionSum(int num1, int deno1, int num2, int deno2) {
        int ansNumerator, ansDenominator;
        ansDenominator = lcm(deno1, deno2);

        int newNum1 = num1 * (ansDenominator / deno1);
        int newNum2 = num2 * (ansDenominator / deno2);
        ansNumerator = newNum1 + newNum2;

        // Simplify the fraction
        int gcd = getGCD(ansNumerator, ansDenominator);
        ansNumerator = ansNumerator / gcd;
        ansDenominator = ansDenominator / gcd;

        // Print the result
        if (ansDenominator == 1) {
            System.out.println("Result : " + ansNumerator);
        } else {
            System.out.println("Result : " + ansNumerator + "/" + ansDenominator);
        }

    }

    public static void replace(int n) {
        String num = String.valueOf(n).replaceAll("0", "1");
        int ans = Integer.parseInt(num);
        System.out.println(ans);
    }

    public static void canBeExpressedAsSumOfTwoPrimes(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    public static void findRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {
            System.out.println("Roots are same");
            double root = -b / (2 * a);
            System.out.println(root);
        } else if (discriminant > 0) {
            System.out.println("Roots are real and different");
            double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
        } else if (discriminant < 0) {
            System.out.println("Roots are complex");
            System.out.println(-b / (2 * a) + " +i" + Math.sqrt(Math.abs(discriminant)));
            System.out.println(-b / (2 * a) + " -i" + Math.sqrt(Math.abs(discriminant)));

        }
    }

    public static void main(String[] args) {
        // int num = 123454321;
        // System.out.println(isPalindrom(num));

        // int min = 10;
        // int max = 50;
        // palindromInRange(min, max);

        // int num = 7;
        // System.out.println(isPrime(num));

        // int start = 2;
        // int end = 10;
        // printPrimesInRange(start, end);

        // int num = 153;
        // System.out.println(isArmstrong(num));

        // int num = 28;
        // isPerfect(num);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first term: ");
        // float firstTerm = sc.nextFloat();
        // System.out.print("Enter the common Difference: ");
        // float commonDiff = sc.nextFloat();
        // System.out.print("Enter the number of terms: ");
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

        // int a = 1;
        // int b = 2;
        // int c = 3;
        // largestOfThree(a, b, c);

        // int year = 2000;
        // System.out.println(isLeapYear(year));

        // int num = 123456;
        // reverse(num);

        // int num = 123456;
        // maxAndMin(num);

        // int n = 5;
        // printFibonacci(n);

        // int n = 5;
        // printFactorial(n);

        // int num = 2;
        // int pow = 5;
        // printValue(num, pow);

        // int num = 6;
        // printFactors(num);

        // int n = 60;
        // printPrimeFactors(n);

        // int n = 145;
        // isStrong(n);

        // int n = 76;
        // isAutomorphic(n);

        // int a = 9;
        // int b = 12;
        // gcd(a, b);

        // int a = 9;
        // int b = 12;
        // lcm(a, b);

        // int num = 378;
        // isHarshad(num);

        // int num = 18;
        // isAbundant(num);

        // int start = 2;
        // int end = 7;
        // sumOfNumbersInRange(start,end);

        // int N = 5;
        // int r = 3;
        // permute(N, r);

        // int num1 = 3;
        // int deno1 = 4;
        // int num2 = 1;
        // int deno2 = 7;
        // fractionSum(num1, deno1, num2, deno2);

        // int n = 102003;
        // replace(n);

        // int n = 74;
        // canBeExpressedAsSumOfTwoPrimes(n);

        // double a = 1;
        // double b = 1;
        // double c = 1;
        double a = 1;
        double b = -3;
        double c = -10;
        findRoots(a, b, c);
    }
}