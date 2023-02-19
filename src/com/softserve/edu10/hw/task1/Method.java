package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class Method<T> {

    public Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }
    public Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> set = new HashSet<>();
        for (T temp: set2) {
            if(set1.contains(temp)) {
                set.add(temp);
            }
        }
        return set;
    }

}
