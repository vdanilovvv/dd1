

package com.danilov.homework;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        int toDrob = age % 10;
        int check10 = age % 100;

        if ((check10 >= 11) & (check10<=19)) {
            return "\nПривет! Меня зовут " + name + " ,мне " + age + " лет, я вешу " + weight + "кг., мой цвет - " + color;
        } else {

            switch (toDrob) {
                case (1):
                    return "\nПривет! Меня зовут " + name + " ,мне " + age + " год, я вешу " + weight + "кг., мой цвет - " + color;
                case (2):
                case (3):
                case (4):
                    return "\nПривет! Меня зовут " + name + " ,мне " + age + " года, я вешу " + weight + "кг., мой цвет - " + color;
                default:
                    return "\nПривет! Меня зовут " + name + " ,мне " + age + " лет, я вешу " + weight + "кг., мой цвет - " + color;
            }
        }
    }
}

