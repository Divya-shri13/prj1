package com.capgemin;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

 

@SuppressWarnings("unused")
public class MapDemo {
    public static void main(String[] args) {
        String str="hello";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        char[] strArray = str.toCharArray();
        for (char c: strArray) {
        if(map.containsKey(c)) {
        map.put(c,map.get(c)+1);
        }
        else {
        map.put(c, 1);
        }
        }
        for(@SuppressWarnings("rawtypes") Map.Entry entry: map.entrySet()) {
        System.out.println(entry.getKey()+ " " + entry.getValue());
        }

    }

 

}


