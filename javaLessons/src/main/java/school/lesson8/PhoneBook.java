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

public class PhoneBook {
    HashMap<String, String> phoneInfo = new HashMap<>();
    String name;
    String phone;

    public String getName() {
        return name;
    }

    public void setPhoneInfo(HashMap<String, String> phoneInfo) {
        this.phoneInfo = phoneInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
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
            for (Map.Entry<String, String> temp : set) {
                if (temp.getValue().equals(name)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("No Such a name in the list.");
        }
    }
}
      /*  if (result == null) {
            System.out.println("There is not any " + name + " in the list");

        }else {
            System.out.println(result);
        }*
      /*
            //получить ключ
            K key = entry.getKey();
            //получить значение
        }*/

/*
public class PhoneBook {
    static HashMap<String, Integer> phoneInfo = new HashMap<>();

    public HashMap<String, Integer> getPhoneInfo() {
        return phoneInfo;
    }

    public void add(String name, Integer phone) {
        phoneInfo.put(name, phone);
    }

    public static String get(String name) {
        String result = String.valueOf(phoneInfo.get(name));
        if (result == null){
            System.out.println("Aбонента с такой фамилией нет");

               }*/


