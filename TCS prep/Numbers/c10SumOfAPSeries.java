// Given an A.P. Series, we need to find the sum of the Series.
// a = first term of A.P.
// d= common Difference of A.P.
// n= Number of Terms in  A.P.

import java.util.*;

public class c10SumOfAPSeries {
    public static void sum(float firstTerm, float commonDiff, float numberOfTerms) {
        float sum = 0;
        for(int i = 0; i<numberOfTerms; i++)
        {
            sum = sum + firstTerm;
            firstTerm = firstTerm + commonDiff;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        float firstTerm = sc.nextFloat();
        System.out.print("Enter the common Difference: ");
        float commonDiff = sc.nextFloat();
        System.out.print("Enter the number of terms: ");
        float numberOfTerms = sc.nextFloat();
        sum(firstTerm, commonDiff, numberOfTerms);
    }
}
