public class ChooseAlgorithm {
    public static int chooseAlgorithm(int algorithmId, int loopType, int n) {
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
        return algorithmId;
    }
}