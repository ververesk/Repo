package udemy.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("String"));
    }

    public static void main(String[] args) {
        int i=10; //i должна быть либо final либо ее значение дольще нигде не должно меняться
        def((String s) -> {
            System.out.println(i);
            return s.length();
        });
    }
}

interface I{
    int abc(String s);
}
