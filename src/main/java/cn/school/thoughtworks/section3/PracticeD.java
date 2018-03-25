package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {

        HashMap<String, Integer> result = countSameElements(collectionA);

        List<String> listKeys = object.get("value");

        for(String key : listKeys) {
            if(result.containsKey(key)) {
                if(result.get(key)/3 > 0) {
                    result.put(key, result.get(key) - result.get(key)/3);
                }else {
                    result.put(key, result.get(key) - 1);
                }
            }
        }

        System.out.println(result);
        return result;
    }

    HashMap<String, Integer> countSameElements(List<String> collection) {

        HashSet<String> uniqueWords = new HashSet<String>(collection);

        HashMap<String, Integer> lists = new HashMap<>();

        for(String word : uniqueWords) {
            if(word.contains("-")) {
                int count = Integer.parseInt(word.split("-")[1]);
                lists.put(word.split("-")[0], count);
            }else {
                int count = Collections.frequency(collection, word);
                lists.put(word, count);
            }

        }
        return lists;
    }
}
