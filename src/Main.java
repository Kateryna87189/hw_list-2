import java.util.ArrayList;
import java.util.List;

/*
# 2
Допустим, у вас есть List целых чисел. Напишите метод, который формирует List,
в котором будут индексы цифр из первого листа, которые больше некоторого заданного значения
Например: дано 10,44,7,6,12,89 значение 33  результат: 1, 5
*/
public class Main {
    public static void main(String[] args) {
        List<Integer>numbers = List.of(10,44,7,6,12,89);
        int value = 33;

        ;

        List<Integer> result = findIndicesGreaterThan(numbers, value);
        System.out.println(result);
    }

    public static List<Integer> findIndicesGreaterThan(List<Integer> numbers, int limit) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > limit) {
                result.add(i);
            }
        }
        return result;
    }
}