package com.ascending.training.basic.dataStructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Cyt");
        set.add("tt");
        set.remove("Cyt");
        set.add("cyt");
        int i = set.size();
        int j = set.hashCode();
        System.out.println("The set is: "+set+" which size is: "+i+" , and hashcode is: "+j);
    }
}
/* Characters of Set:
1. The elements cannot be duplicate;
2. The elements do not have a certain order;
 */
