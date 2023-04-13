
// *Given an integer number n, return the difference between the product of its digits and the sum of its digits.

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("Output: " + subtractProductAndSum(num));
    }
    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        for (;n != 0; n /= 10){
            product *= (n % 10);
            sum += (n % 10);
        }
        return product - sum;
    }
}

