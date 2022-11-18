package interviews.glovo.live_coding_interview.questions;

import java.util.HashMap;
import java.util.Map;

//Write a function to check whether two given strings are anagrams of each
//other. An anagram of a string is another string that contains the same
//characters, only the order of characters can be different. For example,
public class Question1 {
    public static boolean isAnagram(String s1, String s2){
        Map<String, Integer> s1Freq = new HashMap<>();
        for (char c:s1.toCharArray()){
            s1Freq.put(String.valueOf(c), s1Freq.getOrDefault(String.valueOf(c), 0) + 1);
        }
        System.out.println(s1Freq);
        for (char c: s2.toCharArray()){
            if (s1Freq.containsKey(String.valueOf(c))){
                Integer occur = s1Freq.get(String.valueOf(c));
                if (occur>1){
                    s1Freq.put(String.valueOf(c), occur - 1);
                } else {
                    s1Freq.remove(String.valueOf(c));
                }
            }
        }
        if (s1Freq.size()>0){
            return false;
        } else {
            return true;
        }
    }
}
