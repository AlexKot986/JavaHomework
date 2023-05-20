package com.example.homeworksem6;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Menu();
    }

    public static void Menu() {

        Set<Notebook> notebook = GetNote();
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
            case 5: for (Notebook note : notebook) {
                System.out.println(note.toString());
            }
        }
        scanner.close();
    }


    public static Set<Notebook> GetNote() {

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("MSI_R1", 4, 1, "windows", "black"));
        notebooks.add(new Notebook("MSI_R2", 8, 2, "linux", "white"));
        notebooks.add(new Notebook("MSI_R3", 2, 2, "windows", "silver"));

        notebooks.add(new Notebook("Honor_H1", 8, 2, "windows", "silver"));
        notebooks.add(new Notebook("Honor_H2", 6, 1, "windows", "white"));
        notebooks.add(new Notebook("Honor_H3", 4, 2, "linux", "black"));

        notebooks.add(new Notebook("Asus_A1", 2, 1, "windows", "wight"));
        notebooks.add(new Notebook("Asus_A2", 4, 1, "windows", "black"));
        notebooks.add(new Notebook("Asus_A3", 12, 4, "linux", "white"));

        notebooks.add(new Notebook("Lenovo_L1", 2, 1, "linux", "white"));
        notebooks.add(new Notebook("Lenovo_L2", 2, 1, "linux", "white"));
        notebooks.add( new Notebook("Lenovo_L3", 2, 1, "linux", "black"));

        notebooks.add(new Notebook("Apple_A1", 4, 1, "mac", "white"));
        notebooks.add(new Notebook("Apple_A2", 4, 2, "mac", "silver"));

        return notebooks;
    }

    public static void TakeRam(Set<Notebook> notebooks, Integer val) {
        boolean flag = false;
        System.out.println("SORT---RAM---" + val + "--->");
        for (Notebook note : notebooks) {
            if (note.GetRam(val)) {
                System.out.println(note.toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Ноутбуков с таким параметром нет!");
    }
    public static void TakeHdd(Set<Notebook> notebooks, Integer val) {
        boolean flag = false;
        System.out.println("SORT---HDD---" + val + "--->");
        for (Notebook note : notebooks) {
            if (note.GetHdd(val)) {
                System.out.println(note.toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Ноутбуков с таким параметром нет!");
    }
    public static void TakeSystem(Set<Notebook> notebooks, String val) {
        boolean flag = false;
        System.out.println("SORT---SYSTEM---" + val + "--->");
        for (Notebook note : notebooks) {
            if (note.GetSystem(val)) {
                System.out.println(note.toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Ноутбуков с таким параметром нет!");
    }
    public static void TakeColor(Set<Notebook> notebooks, String val) {
        boolean flag = false;
        System.out.println("SORT---COLOR---" + val + "--->");
        for (Notebook note : notebooks) {
            if (note.GetColor(val)) {
                System.out.println(note.toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Ноутбуков с таким параметром нет!");
    }
}
