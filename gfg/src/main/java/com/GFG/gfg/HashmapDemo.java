package com.GFG.gfg;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Jim", 35);

        System.out.println(map);

        map.put("John", 26);

        System.out.println(map);
        System.out.println(map.get("John"));

        map.remove("Jane");

        System.out.println(map);

        System.out.println(map.containsKey("John"));
        System.out.println(map.containsValue(26));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.clear();

        System.out.println(map);

        map.putIfAbsent("John", 27);
        System.out.println(map);

        map.putIfAbsent("John", 28);
        System.out.println(map);

        System.out.println(map.getOrDefault("John", 30));

        map.merge("John", 30, (oldValue, newValue) -> oldValue + newValue);
        System.out.println(map);

        map.compute("John", (key, value) -> value + 1);
        System.out.println(map);

    }

    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
          for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
              array[0] = i;
              array[1] = j;
              return array;
            }
          }
        }
        return array;
      }
}
