import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        logger.log("Запускаем программу");
        logger.log("Подготавливаем сканнер");
        Scanner scanner = new Scanner(System.in);
        logger.log("Подготавливаем генератор случайных чисел");
        Random random = new Random();
        System.out.println("Саламалейкум, введите размер списка");
        int N = scanner.nextInt();
        logger.log("Размер списка = " + N);
        System.out.println("Введите верхнюю границу значений элемента");
        int M = scanner.nextInt();
        logger.log("Верхняя граница = " + M);
        logger.log("Подготавливаем массив случайных чисел");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }
        logger.log("Массив случайных чисел:");
        System.out.println(list);

        System.out.println("Введите число для фильтрации списка");
        int F = scanner.nextInt();
        logger.log("Фильтрующее верхнее значение = " + F);
        Filter filter = new Filter(F);
        System.out.println(filter.filterOut(list));
        logger.log("Закрываем программу");
    }
}
