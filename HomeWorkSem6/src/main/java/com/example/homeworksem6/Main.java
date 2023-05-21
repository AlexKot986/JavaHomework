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
        System.out.println(sortBooks.toString());
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
        return sortNote;
    }
}
