package homework010;

import java.util.Arrays;

public class Sequence {
    public static int[] filter(int[] array, ByCondition condition) {
        return Arrays.stream(array).filter(condition::isOk).toArray();
    }
    public static int[] filterNotEven(int[] array, ByCondition conditionNoteven) {
        return Arrays.stream(array).filter(conditionNoteven::isOk).toArray();
    }
}
