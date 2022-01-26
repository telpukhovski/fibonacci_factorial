public class ChooseAlgorithm {
    public static void chooseAlgorithm(int algorithmId, int loopType, int n) {
        switch (algorithmId) {
            case 1:
                Fibonacci.chooseLoopType(loopType, n);
                break;
            case 2:
                Factorial.chooseLoopType(loopType, n);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + algorithmId);
        }
    }

    public static void main(String[] args) {
        chooseAlgorithm(1, 3, 5);
        chooseAlgorithm(2, 2, 7);
        chooseAlgorithm(1, 1, 10);
    }
}