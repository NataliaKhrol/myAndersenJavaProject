package school.lesson8;

import java.util.*;

/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
из которых состоит массив (дубликаты не считаем). Предпологаю, что Уникальными считаются те слова, которые встречаются в массиве
 ЛИШЬ ОДИН РАЗ.
Посчитать, сколько раз встречается каждое слово.
 */

// ВТОРОЙ ВАРИАНТ РЕШЕНИЯ

public class WordsInArray {
    public static void main(String[] args) {
        String[] wordsArray = new String[]{"word", "word", "circle", "miracle", "cat", "fairy", "wisdom", "word", "bug", "miracle"};
        Set<String> uniqueWords = new HashSet<>();
        HashMap<String, Integer> everyWord = new HashMap<String, Integer>();

        int counter = 0;
        String word;
        for (int j = 0; j < wordsArray.length; j++) {
            word = wordsArray[j];

            for (int i = 0; i < wordsArray.length; i++) {
                if (word.equals(wordsArray[i])) {
                    counter = counter + 1;
                    //temp= wordsArray[i+1];
                }
            }
            if (counter == 1) {
                uniqueWords.add(word);
            }
            everyWord.put(word, counter);
            counter = 0;
        }
        System.out.println(uniqueWords);
        System.out.println(everyWord);
    }
}
