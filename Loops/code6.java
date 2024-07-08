// Break Statement 
// Continue Statement -> To skip the iteration

// Keep entering numbers till user enters a multiple of 10

package Loops;

import java.util.*;

public class code6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n %10 ==0) {
                break;
                // continue; // if you want to skip printing number of multiple of 10
            }
        }
    }
}
