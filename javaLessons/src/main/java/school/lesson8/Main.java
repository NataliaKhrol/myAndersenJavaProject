package school.lesson8;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("3758969", "Pavel");
        phoneBook.add("51259", "Yurij");
        phoneBook.add("799999", "Pavel");
        phoneBook.add("876414359", "Crash");

        System.out.println(phoneBook.getPhoneInfo());

        phoneBook.get("Pavel");
        phoneBook.get("Yarik");
    }
}
