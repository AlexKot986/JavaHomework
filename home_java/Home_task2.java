/* 2) Дана последовательность целых чисел, оканчивающаяся нулем.
Найти сумму положительных чисел, после которых следует отрицательное число.

Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5 */

import java.util.Scanner;

public class Home_task2 {
    public static void main(String[] args) {

        getSumPos();
    }

    public static void getSumPos() {

        Scanner scanner = new Scanner(System.in);
        int sumPos = 0;
        int num = scanner.nextInt();
        
        while(num != 0) {
            if (num > 0) sumPos += num;
            if (num < 0) {
                System.out.println("Сумма целых чисел равна: " + sumPos);
                sumPos = 0;
            }
            num = scanner.nextInt();
        }
        scanner.close();
    }
}
