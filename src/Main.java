import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> productsList = new ArrayList<>();

        while (true) {
            System.out.println("Список возможных операций: ");
            System.out.println("1. Добавить продукт.");
            System.out.println("2. Посмотреть список продуктов.");
            System.out.println("3. Удалить продукт.");

            System.out.println("Выберите номер операции или введите `end`");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }


            if ("1".equals(input)) {
                System.out.println("Какую покупку хотите добавить?");
                String addProduct = scanner.nextLine();
                //Добавляем продукт в корзину
                productsList.add(addProduct);
                int size = productsList.size();
                System.out.println("Итого в списке покупок: " + size);
            }

            if ("2".equals(input)) {
                System.out.println("Список покупок:");
                for (int i = 0; i < productsList.size(); i++) {
                    System.out.println((i + 1) + ". " + productsList.get(i));
                }
            }


            if ("3".equals(input)) {
                System.out.println("Список покупок:");
                for (int i = 0; i < productsList.size(); i++) {
                    System.out.println((i + 1) + ". " + productsList.get(i));
                }
                System.out.println("Какую хотите удалить? Введите номер или название.");

                if (scanner.hasNextInt()) {
                    String deleteProduct = scanner.nextLine();
                    int productId = Integer.parseInt(deleteProduct) - 1;
                    String deleteName = productsList.get(productId);
                    productsList.remove(productId);
                    System.out.println("Покупка " + deleteName + " удалена, список покупок:");
                    for (int i = 0; i < productsList.size(); i++) {
                        System.out.println((i + 1) + ". " + productsList.get(i));
                    }
                } else {
                    String deleteProduct = scanner.nextLine();
                    boolean isRemoved = productsList.remove(deleteProduct);
                    System.out.println("Покупка " + deleteProduct + " удалена, список покупок:");
                    for (int i = 0; i < productsList.size(); i++) {
                        System.out.println((i + 1) + ". " + productsList.get(i));
                    }

                }
            }
        }
    }
}
