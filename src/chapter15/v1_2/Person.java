package chapter15.v1_2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Person {
    Integer age;
    String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person(11, "Ali");
        Person p2 = new Person(13, "Ahmet");
        Person p3 = new Person(14, "Oguz");
        Person p4 = new Person(15, "Ali");

        List<Person> personList = List.of(p1, p2, p3, p4);



        personList.stream().filter(p1.new FilterByName()).forEach(x -> System.out.println(x.age));




    }

    class FilterByName implements Predicate<Person> {

        Set<String> set = new HashSet<>();

        @Override
        public boolean test(Person person) {
            return set.add(person.name);
        }
    }
}
