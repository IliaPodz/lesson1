public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Андрей", 27);// сделано с помощью конструктора
        Person person2 = new Person("Вася", 45);
        Company company = new Company("Яндекс");
        System.out.println(person1);
        System.out.println(person2);

        company.invite(person1);//от объекта company вызываем метод invite
        company.invite(person2);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(company.listOfEmployees);
        System.out.println("Зарплата " + person1.name + " больше или равно его возрасту " + person1.chekSalary());
        System.out.println("Зарплата " + person2.name + " больше или равно его возрасту " + person2.chekSalary());

        company.delete(person1);
        System.out.println(person1);
        System.out.println(person2);

    }
}