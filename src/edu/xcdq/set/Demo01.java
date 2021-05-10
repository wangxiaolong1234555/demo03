package edu.xcdq.set;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        Set<String> keys = map.keySet();
        System.out.println(keys);
        ArrayList<String> arrayListKeys = new ArrayList<>(keys);
        System.out.println(arrayListKeys);
        Collection<String> v = map.values();
        System.out.println(v);
        LinkedList<String> llisttv = new LinkedList<>(v);
        System.out.println(llisttv);
    }
}
