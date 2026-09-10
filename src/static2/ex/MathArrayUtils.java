package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minimum = values[0];
        for (int value : values) {
            if (values[0] > value) {
                minimum = value;
            }
        }
        return minimum;
    }

    public static int max(int[] values) {
        int maximum = values[0];
        for (int value : values) {
            if (values[0] < value) {
                maximum = value;
            }
        }
        return maximum;
    }



}
