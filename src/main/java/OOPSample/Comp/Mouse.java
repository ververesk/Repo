package OOPSample.Comp;

public class Mouse implements CompItem{
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
