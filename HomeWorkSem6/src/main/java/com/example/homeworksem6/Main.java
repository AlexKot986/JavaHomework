package com.example.homeworksem6;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu();
    }

    public static void Menu() {

        Map<String, Notebook> notebook = GetNote();
        System.out.println("Введите цифру, соответствующую необходимому критерию: \n" +
                        "1 - ОЗУ \n" +
                        "2 - Объем ЖД \n" +
                        "3 - Операционная система \n" +
                        "4 - Цвет\n" +
                        "5 - Показать все");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1: System.out.print("Введите объем ОЗУ: ");
                    TakeRam(notebook, scanner.nextInt());
                    break;
            case 2: System.out.print("Введите объем ЖД: ");
                    TakeHdd(notebook, scanner.nextInt());
                    break;
            case 3:
                    System.out.print("Введите тип ОС: ");
                    TakeSystem(notebook, scanner.next());
                    break;
            case 4: System.out.print("Введите цвет: ");
                    TakeColor(notebook, scanner.next());
                    break;
            case 5: for (String note : notebook.keySet()) {
                System.out.println(note + ": \t" + notebook.get(note).toString());
            }
        }
        scanner.close();
    }


    public static Map<String, Notebook> GetNote() {

        Map<String, Notebook> notebooks = new HashMap<>();
        notebooks.put("MSI_R1", new Notebook(4, 1, "windows", "black"));
        notebooks.put("MSI_R2", new Notebook(8, 2, "linux", "wight"));
        notebooks.put("MSI_R3", new Notebook(2, 2, "windows", "silver"));

        notebooks.put("Honor_H1", new Notebook(8, 2, "windows", "silver"));
        notebooks.put("Honor_H2", new Notebook(6, 1, "windows", "wight"));
        notebooks.put("Honor_H3", new Notebook(4, 2, "linux", "black"));

        notebooks.put("Asus_A1", new Notebook(2, 1, "windows", "wight"));
        notebooks.put("Asus_A2", new Notebook(4, 1, "windows", "black"));
        notebooks.put("Asus_A3", new Notebook(12, 4, "linux", "wight"));

        notebooks.put("Lenovo_L1", new Notebook(2, 1, "linux", "wight"));
        notebooks.put("Lenovo_L2", new Notebook(2, 1, "linux", "wight"));
        notebooks.put("Lenovo_L3", new Notebook(2, 1, "linux", "wight"));

        notebooks.put("Apple_A1", new Notebook(4, 1, "mac", "wight"));
        notebooks.put("Apple_A2", new Notebook(4, 2, "mac", "silver"));

        return notebooks;
    }

    public static void TakeRam(Map<String, Notebook> notebooks, Integer val) {
        boolean flag = false;
        System.out.println("SORT---RAM---" + val + "--->");
        for (String note : notebooks.keySet()) {
            if (notebooks.get(note).GetRam(val)) {
                System.out.println(note + ": \t" + notebooks.get(note).toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Ноутбуков с таким параметром нет!");
    }
    public static void TakeHdd(Map<String, Notebook> notebooks, Integer val) {
        boolean flag = false;
        System.out.println("SORT---HDD---" + val + "--->");
        for (String note : notebooks.keySet()) {
            if (notebooks.get(note).GetHdd(val)) {
                System.out.println(note + ": \t" + notebooks.get(note).toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Ноутбуков с таким параметром нет!");
    }
    public static void TakeSystem(Map<String, Notebook> notebooks, String val) {
        boolean flag = false;
        System.out.println("SORT---SYSTEM---" + val + "--->");
        for (String note : notebooks.keySet()) {
            if (notebooks.get(note).GetSystem(val)) {
                System.out.println(note + ": \t" + notebooks.get(note).toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Ноутбуков с таким параметром нет!");
    }
    public static void TakeColor(Map<String, Notebook> notebooks, String val) {
        boolean flag = false;
        System.out.println("SORT---COLOR---" + val + "--->");
        for (String note : notebooks.keySet()) {
            if (notebooks.get(note).GetColor(val)) {
                System.out.println(note + ": \t" + notebooks.get(note).toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Ноутбуков с таким параметром нет!");
    }
}
