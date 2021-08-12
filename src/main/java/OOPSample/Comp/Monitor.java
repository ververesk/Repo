package OOPSample.Comp;

public class Monitor implements CompItem{
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
