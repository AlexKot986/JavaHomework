// 3. Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

import java.util.Random;

public class Home2_task3 {
    public static void main(String[] args) {

        int[] array = GetArray();
        System.out.print("Input: ");
        PrintArray(array);
        System.out.println();
        System.out.print("Output: ");
        PrintArray(ReplaceNegativeToIndx(array, SumTwixItemsIndx(array)));
    }

    public static int[] GetArray(){
        Random random = new Random();

        int[] arr = new int[random.nextInt(10, 20)];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(-100, 200);
        }
        return arr;
    }

    public static void PrintArray(int[] arr){
        for (int item : arr) {
            System.out.print( item + " ");
        }
    }

    public static int SumTwixItemsIndx(int[] arr){
        int sumIndx = 0;
        for (int indx = 0; indx < arr.length; indx++){
            if ((arr[indx] > 9 & arr[indx] < 100) || (arr[indx] > -100 & arr[indx] < -9)){
                sumIndx += indx;
            }
        }
        return sumIndx;
    }

    public static int[] ReplaceNegativeToIndx(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                arr[i] = num;
            }
        }
        return arr;
    }
}
