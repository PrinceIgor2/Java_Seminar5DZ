// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;

public class Task1 
{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Сидоров");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("+7(234)234-45-56", "+7(456)678-23-45"));
        phoneBook.put("Петров", List.of("+7(678)567-45-89", "+7(234)789-45-45"));
        phoneBook.put("Сидоров",List.of("+7(888)678-45-45", "+7(567)345-23-54"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
