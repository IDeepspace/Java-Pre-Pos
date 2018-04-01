package cn.school.thoughtworks.section2;

import java.util.*;
import java.util.Map.Entry;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {

        HashSet<String> uniqueWords = new HashSet<String>(collection1);

        HashMap<String, Integer> lists = new HashMap<>();

        for(String word : uniqueWords) {

            if(word.length() > 1) {
                String key = getKey(word);
                int count = getValue(word);

                if(lists.containsKey(key)) {
                    lists.put(key, lists.get(key)+count);
                }else {
                    lists.put(key, count);
                }
            }else {
                int count = Collections.frequency(collection1, word);

                if(lists.containsKey(word)) {

                    lists.put(word, lists.get(word)+count);
                }else {
                    lists.put(word, count);
                }
            }
        }

        System.out.println(lists);
        return lists;
    }


    private String getKey(String word) {
        if (word.contains("-") || word.contains(":")) {
            return word.split("-|:")[0];
        }else {
            return word.split("\\[")[0];
        }
    }

    private Integer getValue(String word) {
        if (word.contains("-") || word.contains(":")) {
            return Integer.parseInt(word.split("-|:")[1]);
        }else {
            return Integer.parseInt(word.split("\\[")[1].split("\\]")[0]);
        }
    }
}
