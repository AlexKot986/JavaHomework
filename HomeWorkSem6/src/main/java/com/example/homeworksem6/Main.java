package com.example.homeworksem6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Menu();
    }

    public static void Menu() {
        Set<Notebook> notebooks = GetNote();
        System.out.println("Введите цифру или несколько цифр, соответствующих необходимому критерию: \n" +
                        "1 - ОЗУ \n" +
                        "2 - Объем ЖД \n" +
                        "3 - Операционная система \n" +
                        "4 - Цвет\n" +
                        "5 - Показать все");
        Map<String, Object> sortMap = GetSortMap();
        Set<Notebook> sortBooks = new HashSet<>(GetSortNote(notebooks, sortMap));
        for (Notebook note : sortBooks)
            System.out.println(note.toString());
    }
    public static Set<Notebook> GetNote() {

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("MSI_R1", 4, 1000, "windows", "black"));
        notebooks.add(new Notebook("MSI_R2", 16, 750, "linux", "white"));
        notebooks.add(new Notebook("MSI_R3", 32, 500, "windows", "silver"));
        notebooks.add(new Notebook("MSI_R4", 64, 1202, "windows", "black"));
        notebooks.add(new Notebook("MSI_R5", 128, 2000, "windows", "black"));

        notebooks.add(new Notebook("Honor_H1", 18, 2543, "windows", "silver"));
        notebooks.add(new Notebook("Honor_H2", 26, 451, "windows", "white"));
        notebooks.add(new Notebook("Honor_H3", 74, 642, "linux", "black"));
        notebooks.add(new Notebook("Honor_H4", 43, 1122, "windows", "black"));
        notebooks.add(new Notebook("Honor_H5", 4, 2324, "linux", "black"));

        notebooks.add(new Notebook("Asus_A1", 12, 1555, "windows", "wight"));
        notebooks.add(new Notebook("Asus_A2", 46, 1324, "windows", "black"));
        notebooks.add(new Notebook("Asus_A3", 142, 234, "linux", "white"));
        notebooks.add(new Notebook("Asus_A5", 126, 4332, "mac", "white"));
        notebooks.add(new Notebook("Asus_A6", 2, 432, "linux", "black"));

        notebooks.add(new Notebook("Lenovo_L1", 12, 1000, "linux", "white"));
        notebooks.add(new Notebook("Lenovo_L2", 32, 999, "linux", "white"));
        notebooks.add( new Notebook("Lenovo_L3", 62, 777, "linux", "black"));
        notebooks.add( new Notebook("Lenovo_L4", 102, 1222, "linux", "silver"));
        notebooks.add( new Notebook("Lenovo_L5", 16, 657, "linux", "black"));

        notebooks.add(new Notebook("Apple_A1", 32, 1000, "mac", "white"));
        notebooks.add(new Notebook("Apple_A2", 64, 2000, "mac", "silver"));

        return notebooks;
    }
    public static Map<String, Object> GetSortMap() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> sortMap = new HashMap<>();
        Set<Character> sortChar = new HashSet<>();
        String sortStr = scanner.next();

        for (int i = 0; i < sortStr.length(); i++) {
            sortChar.add(sortStr.charAt(i));
        }

        if (sortChar.contains('5')) return sortMap;

        for (Character ch : sortChar) {
            switch (ch) {
                case '1':
                    System.out.print("Введите ram: ");
                    sortMap.put("ram", scanner.nextInt());
                break;
                case '2':
                    System.out.print("Введите hdd: ");
                    sortMap.put("hdd", scanner.nextInt());
                break;
                case '3':
                    System.out.print("Введите System: ");
                    sortMap.put("system", scanner.next());
                break;
                case '4':
                    System.out.print("Введите Color: ");
                    sortMap.put("color", scanner.next());
                break;
            }
        }
        scanner.close();
        return sortMap;
    }
    public static Set<Notebook> GetSortNote(Set<Notebook> notebooks, Map<String, Object> sortMap) {
        Set<Notebook> sortNote = new HashSet<>();

        for (Notebook note : notebooks) {
            boolean flag = true;

            for (String key : sortMap.keySet()) {
                switch (key) {
                    case "ram": if (!note.GetRam((int)sortMap.get(key))) flag = false;
                    break;
                    case "hdd": if (!note.GetHdd((int)sortMap.get(key))) flag = false;
                    break;
                    case "system": if (!note.GetSystem((String)sortMap.get(key))) flag = false;
                    break;
                    case "color": if (!note.GetColor((String) sortMap.get(key))) flag = false;
                    break;
                }
            }
            if (flag) sortNote.add(note);
        }
        if (sortNote.isEmpty()) System.out.println("Таких ноутбуков нет!");
        return sortNote;
    }
}
