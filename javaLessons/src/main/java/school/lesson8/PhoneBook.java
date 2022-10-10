package school.lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный
справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
 учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
  выводиться все телефоны.

Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

// ПЕРВЫЙ ВАРИАНТ РЕШЕНИЯ

public class PhoneBook {
    HashMap<String, String> phoneInfo = new HashMap<>();


    public void setPhoneInfo(HashMap<String, String> phoneInfo) {
        this.phoneInfo = phoneInfo;
    }

    public HashMap<String, String> getPhoneInfo() {
        return phoneInfo;
    }

    public void add(String phone, String name) {
        phoneInfo.put(phone, name);

    }

    public void get(String name) {
        if (phoneInfo.containsValue(name)) {
            Set<Map.Entry<String, String>> set = phoneInfo.entrySet();
            for (Map.Entry<String, String> buffer : set) {
                if (buffer.getValue().equals(name)) {
                    System.out.println(buffer.getValue() + " : " + buffer.getKey());
                }
            }
        } else {
            System.out.println("No Such a name in the list.");
        }
    }
}


