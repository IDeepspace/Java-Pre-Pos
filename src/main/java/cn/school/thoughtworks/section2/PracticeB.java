package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.*;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        HashSet<String> uniqueWords = new HashSet<String>(collection1);

        HashMap<String, Integer> result = new HashMap<>();

        for(String word : uniqueWords) {
            if(word.contains("-")) {
                int count = Integer.parseInt(word.split("-")[1]);
                result.put(word.split("-")[0], count);
            }else {
                int count = Collections.frequency(collection1, word);
                result.put(word, count);
            }

        }
        System.out.println(result);
        return result;
    }
}
