package org.example;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setAge(int age) {
        if (age >= 0 && age <=80 ){
            this.age = age;
            return;
        }else {
        return;
        }
        }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
