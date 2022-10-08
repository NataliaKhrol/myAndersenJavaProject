package school.lesson8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
 */
public class WordsInArray2 {

    public static void main(String[] args) {
        String[] wordsArray = new String[]{"word", "word", "circle", "miracle", "cat", "fairy", "wisdom", "word", "bug", "miracle"};
        Set<String> uniqueWords = new HashSet<>();
        HashMap<String, Integer> everyWord = new HashMap<String, Integer>();

        String word;
        for (int j = 0; j < wordsArray.length; j++) {
            word = wordsArray[j];

            Integer counter = everyWord.get(word);
            if (counter == null) {
                counter = 1;
                //слово встретилось первый раз - возможно оно уникальноб сохраняем
                uniqueWords.add(word);

            } else {
                counter++;
                //слово встретилось повторно - оно не уникально, соответственно удаляем
                uniqueWords.remove(word);
            }
            everyWord.put(word, counter);
        }
        System.out.println(uniqueWords);
        System.out.println(everyWord);
    }
}

