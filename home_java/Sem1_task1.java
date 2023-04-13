
// * 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");

        int num = scanner.nextInt();
        scanner.close();
        
        System.out.println("Сумма от 0 до " + num + ": " + sumNums(num) + 
        "\nФакториал " + num + "!: " + productNums(num));
    }
    public static int sumNums(int n){
        return n * (n + 1) / 2;
    }
    public static int productNums(int n){
        if (n == 0) return 1;
        return n * productNums(n - 1);
    }
}

