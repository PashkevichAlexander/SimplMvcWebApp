package main.DAO;

import main.models.Person;

import java.util.ArrayList;
import java.util.List;


public class PersonDAO {
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(1,"alex1"));
        people.add(new Person(2,"alex2"));
        people.add(new Person(3,"alex3"));
        people.add(new Person(4,"alex4"));
        people.add(new Person(5,"alex5"));
    }
}
