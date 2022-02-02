package store;

import java.util.Scanner;

public class CreatePhone extends PhoneBuilder{

    Scanner in = new Scanner(System.in);

    public int initialPrice = 20000; //Условная начальная цена телефона с минимальной конфигурацией
    public int addPrice = 0;

    @Override
    public void buildInternalMemory() {
        boolean check = false;
        System.out.println("Выберите нужное вам количество внутренней памяти");
        System.out.println("1 - 256 GB; 2 - 512 GB; 3 - 1 TB");

        while (!check) {
            while (!in.hasNextInt()) {
                System.out.println("Ошибка ввода");
                in.next();
            }

            int op = in.nextInt();

            if (op == 1 || op == 2 || op == 3) {
                switch (op) {
                    case 1 -> phone.setInternalMemory("256 GB");
                    case 2 -> {
                        phone.setInternalMemory("512 GB");
                        addPrice += 2500;
                    }
                    case 3 -> {
                        phone.setInternalMemory("1 TB");
                        addPrice += 5000;
                    }
                }
            }else{
                System.out.println("Ошибка ввода");
                continue;
            }
            check = true;
        }
    }

    @Override
    public void buildExternalMemory() {
        boolean check = false;
        System.out.println("Выберите нужное вам количество внешней памяти");
        System.out.println(" 0 - не нужна; 1 - 128 GB; 2 - 256 GB; 3 - 512 GB");

        while (!check) {
            while (!in.hasNextInt()) {
                System.out.println("Ошибка ввода");
                in.next();
            }

            int op = in.nextInt();

            if (op == 0 || op == 1 || op == 2 || op == 3) {
                switch (op) {
                    case 0 -> phone.setExternalMemory("Отсутствует");
                    case 1 -> {
                        phone.setExternalMemory("128 GB");
                        addPrice += 1000;
                    }
                    case 2 -> {
                        phone.setExternalMemory("256 GB");
                        addPrice += 1750;
                    }
                    case 3 -> {
                        phone.setExternalMemory("512 GB");
                        addPrice += 2500;
                    }
                }
            }else{
                System.out.println("Ошибка ввода");
                continue;
            }
            check = true;
        }
    }

    @Override
    public void buildSIMcards() {
        boolean check = false;
        System.out.println("Выберите нужное вам количество слотов под SIM-карты");
        System.out.println("1 - Одна; 2 - Две;");

        while (!check) {
            while (!in.hasNextInt()) {
                System.out.println("Ошибка ввода");
                in.next();
            }

            int op = in.nextInt();

            if (op == 0 || op == 1 || op == 2 || op == 3) {
                switch (op) {
                    case 1 -> {
                        phone.setSimCards(1);
                    }
                    case 2 -> {
                        phone.setSimCards(2);
                        addPrice += 1000;
                    }
                }
            }else{
                System.out.println("Ошибка ввода");
                continue;
            }
            check = true;
        }

    }

    @Override
    public void buildCPU() {
        boolean check = false;
        System.out.println("Выберите какой процессор будет установлен в ваш телефон");
        System.out.println("1 - SnapDragon 678; 2 - SnapDragon 778G; 3 - SnapDragon 888");

        while (!check) {
            while (!in.hasNextInt()) {
                System.out.println("Ошибка ввода");
                in.next();
            }

            int op = in.nextInt();

            if (op == 0 || op == 1 || op == 2 || op == 3) {
                switch (op) {
                    case 1 -> {
                        phone.setCPU("SnapDragon 678");
                        addPrice += 10000;
                    }
                    case 2 -> {
                        phone.setCPU("SnapDragon 778G");
                        addPrice += 15000;
                    }
                    case 3 -> {
                        phone.setCPU("SnapDragon 888");
                        addPrice += 20000;
                    }
                }
            }else{
                System.out.println("Ошибка ввода");
                continue;
            }
            check = true;
        }
    }

    @Override
    public void endPrice() {
        phone.setEndPrice(initialPrice + addPrice);
    }
}
