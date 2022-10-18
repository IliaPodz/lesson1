

public class Person {
    String name;//имя
    int age;// возраст
    double salary;//зарплата
    String nameOfСompany;// название компании

    public Person() {
    }

    public Person(String name, int age) { //конструктор
        this.name = name;
        this.age = age;
        this.salary = 0;
        this.nameOfСompany = "Безработный";

    }

    public boolean chekSalary() {
        return this.salary >= this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", nameOfСompany='" + nameOfСompany + '\'' +
                '}';
    }

}

