package OOPSample.Comp;

public class Keyboard implements CompItem{
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
