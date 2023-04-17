package com.example.sem_home2;
//1. Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class home_task_1 {
    public static void main(String[] args) {
        int[] arr = GetNumsAr();
        PrintAr(arr);
        System.out.println("Сумма простых чисел : " + SumSimpleNums(arr));

    }

    public static int SumSimpleNums(int[] ar) {
        int sumSN = 0;

        boolean isSimple = false;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 2; j <= ar[i] / 2; j++) {
                if (ar[i] % j != 0) {
                    isSimple = true;

                } else {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple || ar[i] == 2 || ar[i] == 3) {
                sumSN += ar[i];
            }
        }
        return sumSN;
    }

    public static int[] GetNumsAr() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введете длинну массива: ");
        int size = scanner.nextInt();
        int[] ar = new int[size];
        for (int count = 0; count < size; count++) {
            ar[count] = scanner.nextInt();
        }
        scanner.close();
        return ar;
    }

    public static void PrintAr(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int num :
                arr) {
            System.out.print(num + " ");
        }
    }
}
