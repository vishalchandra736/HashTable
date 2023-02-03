package com.blz.hashtable;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Hash table API!!!");
        String testString = "To be or not to be";

        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words = testString.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = hashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            hashMap.add(word, value);
        }

        for (String word : words) {
            int frequency = hashMap.get(word);
            System.out.println("Frequency of '" + word + "' : \t" + frequency);
        }
    }
}
