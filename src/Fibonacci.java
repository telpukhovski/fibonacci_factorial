public class Fibonacci {

    public static int[] fibonacciWhile(int array) {
        int[] fibonacci = new int[array];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 2;
        while (i < array) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        return fibonacci;

    }

    public static int[] fibonacciDoWhile(int array) {
        int[] fibonacci = new int[array];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 2;
        do {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        } while (i < array);
        return fibonacci;
    }

    public static int[] fibonacciFor(int array) {
        int[] fibonacci = new int[array];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < array; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static void chooseLoopType(int loopType, int n) {

        switch (loopType) {
            case 1:
                fibonacciFor(n);
                break;
            case 2:
                fibonacciWhile(n);
                break;
            case 3:
                fibonacciDoWhile(n);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + loopType);
        }
    }
}
