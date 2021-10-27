package chapter.two;

public class E01_Shunting_Refactored {

    public static void main(String[] args) {

        int count;
        int[] track_a;
        int[] track_b;

        // count = Integer.parseInt(System.console().readLine("Count: "));
        count = 5;
        track_a = new int[count];
        track_b = new int[count];

        for (int i = 0; i < count; i++) {
            track_a[i] = i * i;
        }
        print_track(track_a);

        for (int i = 0; i < count; i++) {
            track_b[i] = track_a[count-1-i];
        }
        print_track(track_b);
    }

    private static void print_track(int[] track) {

        for (int i = 0; i < track.length; i++) {
            System.out.print(track[i]);

            if (i + 1 < track.length) {
                System.out.print("-");
            }
        }
        System.out.println();
    }

}
