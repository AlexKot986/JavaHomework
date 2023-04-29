import java.util.HashMap;
import java.util.Map;

/**
 * 1) Подсчитать количество искомого слова, через map (наполнением значение, где
 * искомое слово будет являться ключом), вносить все слова не нужно
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * Запрос: Россия
 * Ответ: Россия - 2
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */

public class Taks_1 {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета - это не Россия.";
        String someWord = "Россия";
        System.out.println("Пример:\n" + str);
        System.out.println("Запрос: " + someWord);
        System.out.println("Ответ: " + toLoverCase(GetMap(str), someWord));
    }

    public static Map<String, Integer> GetMap(String s) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : s.replace('.', ' ').split(" ")) {
            if (word != "")
                map.putIfAbsent(word, 0);
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
        }
        return map;
    }

    public static String toLoverCase(Map<String, Integer> map, String s) {
        return s + " - " + map.get(s);
    }
}