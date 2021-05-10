package edu.xcdq.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 20000; i++) {
            map.put(i, "haha" + i);
        }
        Iterator<Map.Entry<Integer, String>> interator = map.entrySet().iterator();
        while (interator.hasNext()) {
            Map.Entry<Integer, String> next = interator.next();
            System.out.println(next);
        }
    }
}
