package training;

public class Statistics {

    public static void main(String[] args) {
        // test input: 64 76 19 89 81 25 67 52 32 19 38 65 78 4 58

        int[] data = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            data[i] = Integer.parseInt(args[i]);
        }

        print_array(data);
        System.out.println("Count: " + data.length);

        int data_min = minimum(data);
        System.out.println("Minimum: " + data_min);

        int data_max = maximum(data);
        System.out.println("Maximum: " + data_max);

        int data_range = range(data);
        System.out.println("Range: " + data_range);

        int data_sum = sum(data);
        System.out.println("Sum: " + data_sum);

        int data_median = median(data);
        System.out.println("Median: " + data_median);

        double data_mean = mean(data);
        System.out.println("Mean: " + data_mean);

        double data_variance = variance(data);
        System.out.println("Variance: " + data_variance);

        double data_std_deviation = std_deviation(data);
        System.out.println("Std. Deviation: " + data_std_deviation);
    }

    public static int minimum(int[] data) {

        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) min = data[i];
        }

        return min;
    }

    public static int maximum(int[] data) {

        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) max = data[i];
        }

        return max;
    }

    public static int range(int[] data) {
        return maximum(data) - minimum(data);
    }

    public static int sum(int[] data) {

        int sum = 0;

        // enhancement: 'for' loop replaceable with enhanced 'for'
        // example code: for (int x : data) { (Java Version 5)
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public static double mean(int[] data) {
        return (double) sum(data) / data.length;
    }

    public static int median(int[] data) {
        int[] data_sorted = bubble_sort(data);
        int index = data_sorted.length / 2;

        return data_sorted[index];
    }

    public static double variance(int[] data) {

        double mean = mean(data);
        double var = 0;

        // enhancement: 'for' loop replaceable with enhanced 'for'
        // example code: for (int x : data) { (Java Version 5)
        for (int i = 0; i < data.length; i++) {
            var = var + Math.pow(data[i] - mean, 2);
        }
        var = var / (data.length - 1);

        return var;
    }

    public static double std_deviation(int[] data) {

        double var = variance(data);
        return Math.sqrt(var);
    }

    private static int[] bubble_sort(int[] data) {

        int[] sorted = data.clone();
        int mem;
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < sorted.length - 1; i++) {
                if(sorted[i] > sorted[i + 1]) {
                    swapped = true;

                    // swap
                    mem = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = mem;
                }
            }
        }

        return sorted;
    }

    private static void print_array(int[] data) {

        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if(i + 1 < data.length) System.out.print(", ");
        }
        System.out.println("]");
    }
}
