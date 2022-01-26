public class Factorial {

    public static int factorialFor(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialWhile(int x) {
        int i = 1;
        int result = 1;
        while (i < x) {
            i++;
            result *= i;
        }
        return result;
    }

    public static int factorialDoWhile(int x) {
        int i = 1;
        int result = 1;
        do {
            i++;
            result *= i;
        }
        while (i < x);
        return result;
    }

    public static void chooseLoopType(int loopType, int x) {

        switch (loopType) {
            case 1:
                factorialFor(x);
                break;
            case 2:
                factorialWhile(x);
                break;
            case 3:
                factorialDoWhile(x);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + loopType);
        }
    }
}

