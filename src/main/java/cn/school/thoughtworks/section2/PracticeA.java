package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        HashSet<String> uniqueWords = new HashSet<String>(collection1);

        HashMap<String, Integer> result = new HashMap<>();

        for(String word : uniqueWords) {
            int count = Collections.frequency(collection1, word);
            result.put(word, count);
        }

        return result;
    }
}
