package com.company;/////

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}


package com.company;


        import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных:" + "\n"
                + "Это будут:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("Расписание кормлений:");

        for (int i = 9; i <= 13; i++) {
            int indexAnimal;
            if (i == 9) {
                indexAnimal = 1;
            } else if (i == 10) {
                indexAnimal = 4;
            } else if (i == 11) {
                indexAnimal = 0;
            } else if (i == 12) {
                indexAnimal = 2;
            } else {
                indexAnimal = 3;
            }

            System.out.println("В " + i + ":00 - " + animals.get(indexAnimal));
        }
    }
}

public class Praktikum {
    public static void main(String[] args)