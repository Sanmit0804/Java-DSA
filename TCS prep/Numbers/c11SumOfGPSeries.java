// Problem Statement: Given a geometric Progression (G.P) sequence with some inputs as:-

// a, first term
// r, common ratio
// n, number of terms
// Write a program to find the sum of the geometric Progression Series.

import java.util.Scanner;

public class c11SumOfGPSeries {
    public static void sum(float firstTerm, float commonRatio, float numberOfTerms) {
        float sum = 0;
        for (int i = 0; i < numberOfTerms; i++) {
            sum = sum + firstTerm;
            firstTerm = firstTerm * commonRatio;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        float firstTerm = sc.nextFloat();
        System.out.print("Enter the common Difference: ");
        float commonRatio = sc.nextFloat();
        System.out.print("Enter the number of terms: ");
        float numberOfTerms = sc.nextFloat();
        sum(firstTerm, commonRatio, numberOfTerms);
    }
}