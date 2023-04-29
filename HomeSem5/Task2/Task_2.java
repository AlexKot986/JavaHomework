
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task_2 {
    public static void main(String[] args) {

        String file = "workers.txt";

        System.out.println("Список работников:");
        for (String string : ReadFile(file)) {
            System.out.println(string);
        }

        System.out.println(sortByValue(CountNames(ReadFile(file))));
    }

    public static List<String> ReadFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            List<String> strList = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                strList.add(line);
                line = br.readLine();
            }
            return strList;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static TreeMap<String, Integer> CountNames(List<String> list) {
        TreeMap<String, Integer> tMap = new TreeMap<>();
        LinkedList<String> listName =new LinkedList<>();
        for (String fullName : list) {
            listName.add(GetName(fullName));
        }
        for (String name : listName.toString()
                .replace(" ", "")
                .replace("[", "")
                .replace("]", "")
                .split(",")) {

            tMap.putIfAbsent(name, 0);
            if (tMap.containsKey(name))
                tMap.put(name, tMap.get(name) + 1);
        }
        return tMap;
    }

    public static LinkedHashMap<String, Integer> sortByValue(TreeMap<String, Integer> tMap) {
        LinkedHashMap<String, Integer> linkMap = new LinkedHashMap<>();
        LinkedList<Integer> list = new LinkedList<>(tMap.values());
        Collections.sort(list);
        Collections.reverse(list);

        for (Integer number : list) {
            for (String name : tMap.keySet()) {
                if (tMap.get(name) == number)
                    linkMap.putIfAbsent(name, number);
            }
        }
        return linkMap;
    }

    public static String GetName(String fullName) {
        for (int index = 0; index < fullName.length(); index++) {
            if (fullName.charAt(index) == ' ')
                return fullName.substring(0, index);
        }
        return fullName;  
    }
}
