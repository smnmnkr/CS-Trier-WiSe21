package chapter.two;

public class E01_Shunting {

    public static void main(String[] args) {

        int index;
        int count;

        int[] track_a;
        int[] track_b;

        count = 5;
        // count = Integer.parseInt(System.console().readLine("Count: "));

        track_a = new int[count];
        track_b = new int[count];

        index = 0;
        while (index < count) {
            track_a[index] = index * index;
            index = index + 1;
        }

        index = 0;
        while (index < count) {
            System.out.print(track_a[index]);

            index = index + 1;
            if (index < count) {
                System.out.print("-");
            } else {
                System.out.println();
            }
        }

        index = 0;
        while (index < count) {
            track_b[index] = track_a[count-1-index];
            index = index + 1;
        }

        index = 0;
        while (index < count) {
            System.out.print(track_b[index]);

            index = index + 1;
            if (index < count) {
                System.out.print("-");
            } else {
                System.out.println();
            }
        }

    }
}
