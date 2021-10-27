package chapter.one;

public class E04_IO_Parameters {

    public static void main(String[] args) {

        int inputNumber;
        String inputText;

        inputText = args[0];
        inputNumber = Integer.parseInt(inputText);

        System.out.println("Output: " + inputNumber);
    }
}
