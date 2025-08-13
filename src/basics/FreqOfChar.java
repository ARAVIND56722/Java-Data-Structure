package basics;
import java.util.*;
public class FreqOfChar {
        public static void main(String[] args) {
            String st = "Java is the Good Programming Language";
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char ch : st.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
            System.out.println("Uppercase letters:");
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                if (freqMap.containsKey(ch)) {
                    System.out.println(ch + " : " + freqMap.get(ch));
                }
            }
         System.out.println("Unique characters:");
         for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
             if (entry.getValue() == 1) {
                 System.out.println(entry.getKey() );
             }
         }
            System.out.println("\nLowercase letters:");
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (freqMap.containsKey(ch)) {
                    System.out.println(ch + " : " + freqMap.get(ch));
                }
            }
            System.out.println("\nDigits:");
            for (char ch = '0'; ch <= '9'; ch++) {
                if (freqMap.containsKey(ch)) {
                    System.out.println(ch + " : " + freqMap.get(ch));
               }
          }
     }
}