package school.lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivavan@sandbox.com", 2369856, 30000, 45);
        emplArray[1] = new Employee("Petrov Petr", "Accountant", "petrov@sandbox.com", 2598645, 40000, 37);
        emplArray[2] = new Employee("Sidorov Sidr", "PM", "sidoro@sandbox.com", 2499856, 50000, 58);
        emplArray[3] = new Employee("Plushkina Josel", "AQA", "plushkina@sandbox.com", 2659856, 70000, 35);
        emplArray[4] = new Employee("Morskih Sean", "SEO", "morskih@sandbox.com", 2979856, 100000, 49);
        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getAge() > 40) {
                emplArray[i].printInfo();
            }
        }
    }
}
