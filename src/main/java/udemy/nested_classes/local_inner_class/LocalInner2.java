package udemy.nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Plus implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Plus plus = new Plus();
        plus.doOperation(5, 3);

    }

}

interface Math2 {
    int doOperation(int a, int b);
}
