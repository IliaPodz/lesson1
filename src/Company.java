
import java.util.ArrayList;

public class Company {
    String name;
    ArrayList<Person> listOfEmployees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void invite(Person person) {
        listOfEmployees.add(person);
        person.nameOfСompany = name;
        person.salary = 40;
        System.out.println("Сотрудник " + person.name + " принят на работу!");

    }

    public void delete(Person person) {
        if (listOfEmployees.contains(person)) {
            listOfEmployees.remove(person);
            person.nameOfСompany = "Безработный";
            person.salary = 0;
            System.out.println("Сотрудник " + person.name + " уволен!");
        } else {
            System.out.println("Такого сотрудника нет!");

        }


    }
}







