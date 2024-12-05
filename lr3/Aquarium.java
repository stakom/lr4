package com.aquarium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AquariumApp {
    public static void main(String[] args) {
        // Создание рыб
        List<Fish> fishList = new ArrayList<>();
        fishList.add(new Shark("Акула", 200, new Size(50.0, 300.0)));
        fishList.add(new Shark("Акула", 150, new Size(40.0, 250.0)));
        fishList.add(new Piranha("Пиранья", 90, new Size(15.0, 40.0)));
        fishList.add(new ClownFish("Клоунская рыба", 30, new Size(10.0, 20.0)));
        fishList.add(new ClownFish("Ангел", 45, new Size(12.0, 25.0)));
        fishList.add(new ClownFish("Золотая рыба", 25, new Size(8.0, 15.0)));

        // Используем try-with-resources для автоматического закрытия ресурса Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Вывести всех рыб");
                System.out.println("2. Вывести только мирных рыб");
                System.out.println("3. Вывести только хищных рыб");
                System.out.println("4. Вывести хищных рыб весом больше 100 грамм");
                System.out.println("5. Выйти");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера

                switch (choice) {
                    case 1:
                        System.out.println("Все рыбы:");
                        for (Fish fish : fishList) {
                            System.out.println(fish);
                        }
                        break;
                    case 2:
                        System.out.println("Мирные рыбы:");
                        for (Fish fish : fishList) {
                            if ("Мирная".equals(fish.getType())) {
                                System.out.println(fish);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Хищные рыбы:");
                        for (Fish fish : fishList) {
                            if ("Хищная".equals(fish.getType())) {
                                System.out.println(fish);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Хищные рыбы весом больше 100 грамм:");
                        for (Fish fish : fishList) {
                            if ("Хищная".equals(fish.getType()) && fish.getWeight() > 100) {
                                System.out.println(fish);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Выход из программы.");
                        return; // Завершение программы
                    default:
                        System.out.println("Некорректный выбор. Попробуйте снова.");
                }
            }
        }
    }
}
