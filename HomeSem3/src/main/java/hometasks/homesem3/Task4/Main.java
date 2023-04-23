package hometasks.homesem3.Task4;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    /**
     * 4. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     */
    public static void main(String[] args) {
        List<Integer> listNumbers = GetList(10);
        PrintList(listNumbers);

        System.out.println();
        System.out.println("min: " + Collections.min(listNumbers));
        System.out.println("max: " + Collections.max(listNumbers));
        System.out.println("average: " + GetAverage(listNumbers));
        //System.out.println(listNumbers.stream().mapToInt(a -> a).average().orElse(0));
        //System.out.println(listNumbers.stream().mapToInt(Integer::intValue).sum()/10f);
        //System.out.println(listNumbers.stream().reduce((x, y) -> x + y).get()/10f);
    }
    public static List<Integer> GetList(int number){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < number; i++){
            list.add(random.nextInt(-100, 200));
        }
        return list;
    }
    public static void PrintList(List<Integer> num) {
        for (int x : num) {
            System.out.print(x + " ");
        }
    }
    public static Integer GetAverage(List<Integer> num){
        int sum = 0;
        for (int x : num){
            sum += x;
        }
        return sum / num.size();
    }
}
