package ait.set.person;

import ait.set.person.model.Person;

import java.util.HashSet;
import java.util.Set;

public class PersonAppl {
    public static void main(String[] args) {
        Person romeo = new Person(1,"Romeo","Montague");
        Person juliet = new Person(2,"Juliet","Capulet");
        Set<Person> person = new HashSet<>();
        person.add(romeo);
        person.add(juliet);
        System.out.println(person.contains(romeo));
        System.out.println(person.contains(juliet));
        System.out.println("==========================================");
        juliet.setLastName("Montague");
        System.out.println(person.contains(romeo));
        System.out.println(person.contains(juliet));
        System.out.println("==========================================");
        System.out.println(person.size());
        person.forEach(p-> System.out.println(p));

    }
}
