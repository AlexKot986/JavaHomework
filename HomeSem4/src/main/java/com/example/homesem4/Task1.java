package com.example.homesem4;

import java.util.Arrays;
import java.util.LinkedList;

public class Task1 {
    /**
     * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1 -> 2->3->4
     * Вывод:
     * 4->3->2->1
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        System.out.println(RevList(list));
    }
    public static LinkedList<Integer> RevList(LinkedList<Integer> list){

        if(list.size() > 1) {
            int number = list.pop();
            RevList(list);
            list.add(number);
        }
        return list;
    }
}
