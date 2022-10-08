package school.lesson8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный
справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
 учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
  выводиться все телефоны.

Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

public class PhoneBook2 {
    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public Set<String> get(String name) {
        return phoneBook.get(name);
    }

    public void add(String name, String phone) {
        HashSet<String> numbers = phoneBook.get(name);
        if (numbers == null) {
            numbers = new HashSet<>();
            phoneBook.put(name, numbers);
        }
        //если использовать ArrayList, то повторные значения будут присутствовать, при HashSet повторные игнорируются
        numbers.add(phone);
    }

    public static void main(String[] args) {
        PhoneBook2 phoneBook = new PhoneBook2();
        phoneBook.add("Rybkin", "5425566");
        phoneBook.add("Rybkin", "545525566");
        phoneBook.add("Pavel", "9875");
        phoneBook.add("Rybkin", "5425566");

        System.out.println(phoneBook.get("Rybkin"));
    }
}
