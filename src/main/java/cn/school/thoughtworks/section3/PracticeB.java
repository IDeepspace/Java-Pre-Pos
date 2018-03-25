package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> listKeys = object.get("value");
        for(String key : listKeys) {
            if(collectionA.containsKey(key)) {
                if(collectionA.get(key)/3 > 0) {
                    collectionA.put(key, collectionA.get(key) - collectionA.get(key)/3);
                }else {
                    collectionA.put(key, collectionA.get(key) - 1);
                }
            }
        }
        System.out.println(collectionA);
        return collectionA;
    }
}
