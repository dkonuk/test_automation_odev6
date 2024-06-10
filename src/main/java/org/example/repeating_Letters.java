package org.example;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class repeating_Letters {
    public static void main(String[] args) {

        ArrayList<String> kelime_listesi = new ArrayList<String>();
        kelime_listesi.add("kalem");
        kelime_listesi.add("kelam");
        kelime_listesi.add("elalem");
        kelime_listesi.add("kelime");
        ArrayList<String> duplicate = new ArrayList<String>();

        for (String word : kelime_listesi) {
            ArrayList<String> letters = new ArrayList<String>();

            boolean containsDuplicate = false;
            for (int i = 0; i < word.length(); i++) {
                int duplicate_size = duplicate.size();

                if (letters.contains(word.substring(i, i + 1))) {
                    if (duplicate_size >= 2) {
                break;
            }
                    containsDuplicate = true;
                    duplicate.add(word);
                    break;


                } else {
                    letters.add(word.substring(i, i + 1));
                }
            }



            }
                ArrayList<String> duplicate_Letters = new ArrayList<String>();
                for (String word : duplicate) {
                    for (int i = 0; i < word.length(); i++){
                    String letter = word.substring(i, i + 1);
                    if (duplicate_Letters.contains(letter)) {
                        continue;
                    }
                    duplicate_Letters.add(letter);



            }

            }
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        StringBuilder newWord = new StringBuilder();

        // generate random numbers within 1 to 10
        for (int i = 0; i < 6; i++) {
            int rand = (int)(Math.random() * range) + min;
            newWord.append(duplicate_Letters.get(rand-1));

        }

        System.out.println("Random new word: " + newWord.toString());
    }

}





