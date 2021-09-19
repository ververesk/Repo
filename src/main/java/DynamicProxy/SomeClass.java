package DynamicProxy;

public class SomeClass implements SomeInterfaceWithMethods{
    int x;
    int y;

    public SomeClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public void somePhrase() {
        System.out.println(this.sum(this.x, this.y)+" "+"Это сумма");
    }
}
