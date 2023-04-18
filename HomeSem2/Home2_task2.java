// 2. Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

public class Home2_task2 {
    public static void main(String[] args) {

        if (IsIncreasSequence()){
            System.out.println("Последовательность возрастающая!");
        }
        else{
            System.out.println("Последовательность НЕ является возрастающей!");
        }

    }
    public static boolean IsIncreasSequence(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длинну последовательности N: ");
        int lengthSequence = scanner.nextInt();

        System.out.println("Последовательность N: ");
        int N = scanner.nextInt();

        int num;
        int count = 1;
        boolean isIncreas = true;

        while (count != lengthSequence){
            num = N;
            N = scanner.nextInt();
            if (num > N){
                isIncreas = false;
            }
           count++;
        }
        scanner.close();
        
        return isIncreas;
    }
}
