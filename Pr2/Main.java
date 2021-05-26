package Pr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Human> people = new ArrayList<Human>() {{
            add(new Human(19, "Kosarev", "Vlad", LocalDate.of(2001, 8, 9), 73));
            add(new Human(20, "Ivan", "Ivanov", LocalDate.of(2000, 7, 21), 80));
            add(new Human(21, "Kolya", "Petrov", LocalDate.of(1999, 10, 17), 71));
            add(new Human(17, "Petya", "Florov", LocalDate.of(2003, 12, 27), 60));
        }};

        System.out.println("Сортировка по имени:");
        people.stream()
                .sorted(Comparator.comparing(Human::getFirstName))
                .forEach(System.out::println);
        System.out.println("\nФильтрация по дате рождения большей, чем 24 июня 2000:");
        people.stream()
                .filter(human -> human.getBirthDate().isAfter(LocalDate.of(2000, 6, 24)))
                .forEach(System.out::println);
        System.out.println("\nСортировка по фамилии:");
        people.stream()
                .sorted(Comparator.comparing(Human::getLastName))
                .forEach(System.out::println);
        System.out.print("\nСумма всех возрастов: ");
        int sumOfAges = people.stream()
                .mapToInt(Human::getAge)
                .sum();
        System.out.println(sumOfAges);
    }
}