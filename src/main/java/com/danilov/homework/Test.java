/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.danilov.homework;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List <Animal> animals = new ArrayList<>();
        Menu [] menu = Menu.values();

        Scanner scan = new Scanner(System.in);
        String input = "";
        String animalType = "";
        String animalName = "";
        int animalAge = 0;
        int animalWeight = 0;
        String animalAgeString = "";
        String animalWeightString = "";
        String animalColor = "";
        Menu enumString = null;


        while (!input.equals("EXIT")){
            System.out.println("Меню:");
            System.out.println("Введите " + menu[0] + " для добавления животного");
            System.out.println("Введите " + menu[1] + " для просмотра списка животных");
            System.out.println("Введите " + menu[2] + " для выхода из программы");
            input = scan.next().toUpperCase(Locale.ROOT).trim();

            boolean correct = false;
            while (correct != true) {
                try {
                    enumString = Menu.valueOf(input);
                    correct = true;
                }
                catch (IllegalArgumentException ex) {
                    System.out.println("Введен некорректный пункт меню, попробуйте заново");
                    input = scan.next().toUpperCase(Locale.ROOT).trim();
                }
            }
            switch (enumString){
                case ADD:
                    System.out.println("Какое животное вы хотите добавить? (cat/dog/duck)");
                    animalType = scan.next();
                    switch (animalType) {
                        case "cat":
                            Animal newAnimal = new Cat();

                            System.out.println("Введите имя");
                            animalName = scan.next();
                            newAnimal.setName(animalName);

                            System.out.println("Введите возраст");
                            animalAgeString = scan.next();
                            boolean animalCorrectAge = false;
                            while (animalCorrectAge != true) {
                                try {
                                    animalAge = Integer.parseInt(animalAgeString);
                                    newAnimal.setAge(animalAge);
                                    animalCorrectAge = true;
                                } catch (NumberFormatException ex1) {
                                    System.out.println("Введен некорректный возраст животного, попробуйте заново");
                                    animalAgeString = scan.next();
                                }

                            }

                            System.out.println("Введите цвет");
                            animalColor = scan.next();
                            newAnimal.setColor(animalColor);

                            System.out.println("Введите вес");
                            animalWeightString = scan.next();
                            boolean animalCorrectWeight = false;
                            while (animalCorrectWeight != true) {
                                try {
                                    animalWeight = Integer.parseInt(animalWeightString);
                                    newAnimal.setWeight(animalWeight);
                                    animalCorrectWeight = true;
                                } catch (NumberFormatException ex1) {
                                    System.out.println("Введен некорректный вес животного, попробуйте заново");
                                    animalWeightString = scan.next();
                                }
                            }
                            if ((animalAge < 0) | (animalWeight<0)) {
                                System.out.println("Вы ввели отрицательный возраст или вес. Попробуйте добавить животное заново");
                                break;

                            } else {
                                animals.add(newAnimal);
                                newAnimal.say();
                                break;
                            }


                        case "dog":
                            Animal newAnimal2 = new Dog();

                            System.out.println("Введите имя");
                            animalName = scan.next();
                            newAnimal2.setName(animalName);

                            System.out.println("Введите возраст");
                            animalAgeString = scan.next();
                            boolean animalCorrectAge2 = false;
                            while (animalCorrectAge2 != true) {
                                try {
                                    animalAge = Integer.parseInt(animalAgeString);
                                    newAnimal2.setAge(animalAge);
                                    animalCorrectAge2 = true;
                                } catch (NumberFormatException ex1) {
                                    System.out.println("Введен некорректный возраст животного, попробуйте заново");
                                    animalAgeString = scan.next();
                                }

                            }

                            System.out.println("Введите цвет");
                            animalColor = scan.next();
                            newAnimal2.setColor(animalColor);

                            System.out.println("Введите вес");
                            animalWeightString = scan.next();
                            boolean animalCorrectWeight2 = false;
                            while (animalCorrectWeight2 != true) {
                                try {
                                    animalWeight = Integer.parseInt(animalWeightString);
                                    newAnimal2.setWeight(animalWeight);
                                    animalCorrectWeight2 = true;
                                } catch (NumberFormatException ex1) {
                                    System.out.println("Введен некорректный вес животного, попробуйте заново");
                                    animalWeightString = scan.next();
                                }
                            }
                            if ((animalAge < 0) | (animalWeight<0)) {
                                System.out.println("Вы ввели отрицательный возраст или вес. Попробуйте добавить животное заново");
                                break;

                            } else {
                                animals.add(newAnimal2);
                                newAnimal2.say();
                                break;
                            }

                        case "duck":
                            Animal newAnimal3 = new Duck();

                            System.out.println("Введите имя");
                            animalName = scan.next();
                            newAnimal3.setName(animalName);

                            System.out.println("Введите возраст");
                            animalAgeString = scan.next();
                            boolean animalCorrectAge3 = false;
                            while (animalCorrectAge3 != true) {
                                try {
                                    animalAge = Integer.parseInt(animalAgeString);
                                    newAnimal3.setAge(animalAge);
                                    animalCorrectAge3 = true;
                                } catch (NumberFormatException ex1) {
                                    System.out.println("Введен некорректный возраст животного, попробуйте заново");
                                    animalAgeString = scan.next();
                                }

                            }

                            System.out.println("Введите цвет");
                            animalColor = scan.next();
                            newAnimal3.setColor(animalColor);

                            System.out.println("Введите вес");
                            animalWeightString = scan.next();
                            boolean animalCorrectWeight3 = false;
                            while (animalCorrectWeight3 != true) {
                                try {
                                    animalWeight = Integer.parseInt(animalWeightString);
                                    newAnimal3.setWeight(animalWeight);
                                    animalCorrectWeight3 = true;
                                } catch (NumberFormatException ex1) {
                                    System.out.println("Введен некорректный вес животного, попробуйте заново");
                                    animalWeightString = scan.next();
                                }
                            }
                            if ((animalAge < 0) | (animalWeight<0)) {
                                System.out.println("Вы ввели отрицательный возраст или вес. Попробуйте добавить животное заново");
                                break;

                            } else {
                                animals.add(newAnimal3);
                                newAnimal3.say();
                                break;
                            }

                        default:
                            System.out.println("Вы ввели некорректное значение. Попробуйте заново добавить животное");
                    }
                    break;

                case LIST:
                    System.out.println(animals);
                    break;
                case EXIT:
                    break;
                default:
                    System.out.println("Некорректный ввод команды. Пожалуйста, введите заново");

        }

        }
    }
}
