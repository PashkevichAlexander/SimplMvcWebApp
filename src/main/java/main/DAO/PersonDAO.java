package main.DAO;

import main.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private static  int PEOPLE_AGE;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT,++PEOPLE_AGE, "alex1","Alex1@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT,++PEOPLE_AGE, "alex2","Alex2@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT,++PEOPLE_AGE, "alex3","Alex3@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT,++PEOPLE_AGE, "alex4","Alex4@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT,++PEOPLE_AGE, "alex5","Alex5@mail.ru"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete (int id){
        people.removeIf(person -> person.getId()==id);
    }
}
