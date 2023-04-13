//* 2. Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class Sem1_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");

        int num = scanner.nextInt();
        scanner.close();
        
        getSimpleNums(num);
    }
    public static void getSimpleNums(int n){
        System.out.println("Простые числа от 1 до " + n);
        int count = 0;
        for (int i = 3; i <= n; i ++){
            boolean f = true;

            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0) f = false;

            if (f) {
                System.out.print(i + "\t");
                count++;
            }
            if (count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}