package lesson_14;

import lesson_14.model.Score;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
        // 1 - создание коллекции
        Map<String, Integer> table = new HashMap<>();

        // 2 - добавление данных в виде пар ключ-значение
        table.put("Zenith", 57);
        table.put("Krasnodar", 56);
        table.put("Lokomotiv", 52);
        table.put("Spartak", 50);

        // 3 - Мапа не хранит в себе дубликаты, а при добавлении дубликата
        // обновит значение ключа

        table.put("Spartak", 53);

        // 4 - проверка значения по какому-либо ключу

        boolean containsKey = table.containsKey("Dinamo");

        System.out.println(containsKey);

        // 5 - как проходиться по каждому элементу мапы

        for (Map.Entry<String , Integer> elementOfMap : table.entrySet()) {
            System.out.println(elementOfMap.getKey() + " - " + elementOfMap.getValue());
        }

        System.out.println();

        // 6 - перебор ключей

        for (String aliasForKey : table.keySet()) {
            System.out.println(aliasForKey);
        }

        // 7 - получить значение по ключу можно через вызов метода get()

        for (String aliasForKey : table.keySet()) {
            Integer score = table.get(aliasForKey);
            System.out.println(score);
        }

        // 8 - мапа может хранить в себе не только служебные типы классов

        Map<String , Score> modifiedTable = new HashMap<>();

//        Score score = new Score(30, 57, 52);

        modifiedTable.put("Zenith", new Score(30, 57, 52));
        modifiedTable.put("Krasnodar", new Score(30, 56, 46));
        modifiedTable.put("Lokomotiv", new Score(30, 54, 71));
        modifiedTable.put("Spartak", new Score(30, 50, 59));
        modifiedTable.put(null, new Score(30, 50, 59));
        modifiedTable.put(null, new Score(30, 555, 999));

        for (String key : modifiedTable.keySet()) {
            System.out.print(key);
            Score score = modifiedTable.get(key);
            System.out.print(" - " + score.getGames());
            System.out.print(" - " + score.getGoals());
            System.out.print(" - " + score.getPoints() + "\n");
        }

        System.out.println();
    }
}
