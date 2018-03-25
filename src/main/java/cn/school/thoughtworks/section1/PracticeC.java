package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<String>();
        for(int i = 0; i < collection1.size(); i++) {
            result.add(collection1.get(i));
        }
        result.retainAll(collection2.get("value"));
        return result;
    }
}