package chapter.one;

public class E06_Arrays {

    public static void main(String[] args) {

        int index;
        int count;
        int[] array;

        count = 5;
        array = new int[count];

        index = 0;
        while (index < count) {
            array[index] = index * index;
            index = index + 1;
        }

        index = 0;
        while (index < count) {
            System.out.println(array[index]);
            if(index < count) System.out.println("-");
            index = index + 1;
        }
    }
}
