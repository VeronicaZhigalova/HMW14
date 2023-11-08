package org.myexample;

import java.util.Objects;

public class Kitten {

    private Gender gender;
    private String name;
    private int age;

    public enum Gender {
        MALE,
        FEMALE
    }

    public Kitten(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kitten kitten)) return false;
        return age == kitten.age && gender == kitten.gender && Objects.equals(name, kitten.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, age);
    }
}
