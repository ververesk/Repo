package udemy.nested_classes.anonymous_class;

public class AnonymousClass {
    private int x=5;
    public static void main(String[] args) {
        Math m=new Math() {
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass anonymousClass=new AnonymousClass();
                return a+b+anonymousClass.x;
            }
        };
        Math math=new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
        System.out.println(m.doOperation(3,6));
        System.out.println(math.doOperation(2,4));
    }
}

interface Math {
    int doOperation(int a, int b);
}

