//1. Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class Home2_task1 {
    public static void main(String[] args) {

        int sumSeq = GetSimpleSumSequence();
        System.out.println("Сумма простых чисел : " + (sumSeq));

    }

    public static int GetSimpleSumSequence() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Длинна последовательности: ");
        int lengthSequence = scanner.nextInt();
        boolean isSimple;
        int count = 0;
        int sumSequence = 0;
        int num;
        while (count != lengthSequence) {
            isSimple = true;
            num = scanner.nextInt();
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isSimple = false;
                }
            }
            if (num != 1 && isSimple) {
                sumSequence += num;
            }
            count++;
        }
        scanner.close();
        return sumSequence;
    }
}
