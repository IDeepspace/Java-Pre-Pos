package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.*;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = new ArrayList<String>(); //利用ArrayList类实例化List集合
        for(int i = 0; i < collection1.size(); i++) {
            result.add(collection1.get(i));
        }
        result.retainAll(collection2);
        return result;
    }
}
