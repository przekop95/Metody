public class Operation implements FirstInterface, TwoInterface {

    @Override
    public int dodawanie(int a, int b) {
        return a+b;
    }

    @Override
    public int odejmowanie(int a, int b) {
        return a-b;
    }
}
