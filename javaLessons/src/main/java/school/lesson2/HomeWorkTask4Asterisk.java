package school.lesson2;
/* �������� �����, ������� ����������, �������� �� ��� ����������, � ���������� boolean (���������� - true, �� ���������� - false).
 ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������. */

public class HomeWorkTask4Asterisk {
    public static void main(String[] args) {
        System.out.println(checkYear(1902));
    }

    public static boolean checkYear(int year) {

        boolean isLeap = true;
        if (year % 4 == 0 || ((year % 400 == 0) && !(year % 100 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}
