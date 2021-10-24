package week.one;

public class E01_first_example {

    public static void main(String[] args) {

        int index;
        int count;

        index = 0;
        count = 10;

        while(index <= count) {
            System.out.println(index * index);
            index = index + 1;
        }
    }
}
