/* 
Problem Statement: The standard form of a quadratic equation is:

ax2 + bx + c = 0, where a, b and c are real numbers and a != 0

You have given a, b, c of the equation, you have found the roots of the equation.

*/

/*Examples:

Example 1:
Input: a = 1, b = -3, c = -10
Output: Roots are real and different, i.e(5 , -2).

Example2:

Input: a = 1, b = 1, c = 1
Output: Roots are complex, i.e-(-0.5+i1.732 , -0.5-i1.732). */

// Approach:

// Find discriminant of the equation.
// Discriminant(D) = b^2 - 4a*c
// If the discriminant is greater than 0, the roots are real and different.
// If the discriminant is equal to 0, the roots are real and equal.
// If the discriminant is less than 0, the roots are complex and different.

public class c35QuadraticEquation {
    public static void findRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {
            System.out.println("Root are real and same");
            double roots = -b / (2 * a);
            System.out.println(roots);
        } else if (discriminant > 0) {
            System.out.println("Roots are real and Different");
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
        } else if (discriminant < 0) {
            System.out.println("Roots are complex");
            // double root1 = (-b/ (2*a) + " +i" + Math.sqrt(discriminant));
            System.out.println(-b / (2 * a) + " +i" + Math.sqrt(Math.abs(discriminant)));
            System.out.println(-b / (2 * a) + " -i" + Math.sqrt(Math.abs(discriminant)));
        }
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;
        // double a = 1;
        // double b = -3;
        // double c = -10;
        findRoots(a, b, c);
    }
}
