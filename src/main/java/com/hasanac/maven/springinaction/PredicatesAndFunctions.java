package com.hasanac.maven.springinaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class PredicatesAndFunctions {
    public static void main(String... args) {
        new PredicatesAndFunctions().someMethod();
    }

    String name = "1234";
    String xyz= null;
    Predicate<Person> nonNullPredicate = Objects::nonNull;
    Predicate<Person> nameNotNull = p -> name!=null && name.equals(p.age);
    Predicate<Person> teamWIPredicate = p -> xyz!=null && xyz.equals(p.b);

    Predicate<Person> fullPredicate = (nameNotNull).or(teamWIPredicate);

    public void someMethod() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("123","5","1"));
        persons.add(new Person("1234",null,"2"));
        persons.add(new Person("1234","1234","3"));
        persons.add(new Person(null,"5","4"));
        persons.add(new Person("12345","1234","5"));
        persons.stream().filter(fullPredicate).forEach(p -> System.out.println(p.age+" "+p.b+" -->"+p.c));
    }
    public class Person {
        String age;
        String b;
        String c;
        Person(String x,String y, String z) {
            age=x;
            b=y;c=z;
        }
    }
}
