package udemy.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("String"));
    }

    public static void main(String[] args) {
        def((String s) -> s.length());
    }
}

interface I{
    int abc(String s);
}
