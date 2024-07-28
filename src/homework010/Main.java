package homework010;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {11, 24, 38, 41, 54, 60, 76, 85, 9};
        System.out.println("Массив чисел: " + Arrays.toString(array));
        ByCondition condition = x -> x % 2 == 0;
        ByCondition conditionNotEven = x -> x % 2 != 0;
        int[] filtered = Sequence.filter(array, condition);
        int[] filterNotEven = Sequence.filter(array,conditionNotEven);
        System.out.println("Массив четных чисел: " + Arrays.toString(filtered));
        System.out.println("Массив не четных чисел: " + Arrays.toString((filterNotEven)));
        Integer reduce = Arrays.stream(array).reduce(Integer::sum).getAsInt();
        System.out.println("сумма  чисел изначального массива равна: " + reduce);
        if (reduce % 2 == 0) {
            System.out.println("Сумма массива четное число");
        } else {
            System.out.println("Сумма массива не четное число");
        }
    }
}
