package practice.regex;
import java.util.Scanner;
public class FullNameFormatterRegex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("0")) {
                scanner.close();
                break;
            }
            String regex = "([А-Я-а-я-ёЁ]+)(\\s[А-Яа-яёЁ]+)(\\s[А-Яа-яёЁ]+)?$";
            String[] array = name.split("\\s");
            if (name.matches(regex)) {
                System.out.println("Фамилия: " + array[0] + System.lineSeparator() +
                        "Имя: " + array[1]);
                if (array.length == 3) {
                    System.out.println("Отчество: " + array[2]);
                }
            } else {
                System.out.println("Введенная строка не является ФИО");
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

        }
    }
}