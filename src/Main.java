import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    static DinnerConstructor dc;
    static Scanner scanner;

    public static void main(String[] args) {
        dc = new DinnerConstructor();
        scanner = new Scanner(System.in);

        dc.addD();



        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    addNewDish();
                    System.out.println("Меню: ");
                    dc.Viever();
                    break;
                case "2":
                    generateDishCombo();
                    break;
                case "3":
                    return;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Сгенерировать комбинации блюд");
        System.out.println("3 - Выход");
    }

    private static void addNewDish() {

        System.out.println("Введите тип блюда:");
        String dishType = scanner.nextLine();
        System.out.println("Введите название блюда:");
        String dishName = scanner.nextLine();
        dc.DinnerMenu(dishType, dishName);


    }

    private static void generateDishCombo() {
        ArrayList<String> dinnerGenMenu = new ArrayList<>();
        dinnerGenMenu.add("Обед");
        dinnerGenMenu.add("Завтрак");
        dinnerGenMenu.add("Ужин");

        System.out.println("Начинаем конструировать обед...");

        System.out.println("Введите количество наборов, которые нужно сгенерировать:");
        int numberOfCombos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
        //String nextItem = scanner.nextLine();

        //реализуйте ввод типов блюд
        //   while (!nextItem.isEmpty()) {
         //   dinnerGenMenu = dc.SearchDinner(nextItem);

      //  }

        dc.GeneratedDinner(numberOfCombos, dinnerGenMenu);

        // сгенерируйте комбинации блюд и выведите на экран

    }
}
