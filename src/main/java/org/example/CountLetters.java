package org.example;

public class CountLetters {
    /*
    create a code that separate the below string and count how many word contains the letters "an"
    String words =“A world, work, A man, a plan, a canal, Panama”;
    */

        public static void main(String[] args) {
            String words = "A world, work, A man, a plan, a canal, Panama";

            // Split the string into words using space and comma as delimiters
            String[] wordArray = words.split("[,\\s]+");

            // Counter for words containing "an"
            int count = 0;

            // Iterate over each word
            for (String word : wordArray) {
                // Convert the word to lowercase and check if it contains "an"
                if (word.toLowerCase().contains("an")) {
                    count++;
                }
            }

            System.out.println("Number of words containing 'an': " + count);
        }


}
