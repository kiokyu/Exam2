package store;

public class Main {
    public static void main(String[] args) {
        Director dir = new Director();

        System.out.println("Добро пожаловать в наш магазин!");

        dir.setBuilder(new CreatePhone());
        Phone phone = dir.buildPhone();

        System.out.println(phone);
    }
}
