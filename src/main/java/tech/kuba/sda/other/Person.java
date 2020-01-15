package tech.kuba.sda.other;

public class Person {
    int age;
    String firstName;
    String lastName;
    String sex;

    public Person(int age, String firstName, String lastName, String sex) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getIntroduction() {
        String introduction;
        introduction = "Hi, im  " + firstName + " " + lastName + "\nI'm " + age + " years old";
        return introduction;
    }

    public int celebrateBirthday() {
        System.out.println("Happy birthday " + firstName);
        return ++age;
    }

    public int getAge() {
        return age;
    }
}
