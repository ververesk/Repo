package OOPSample.HenFactory;

public class UkrinianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 6;
    }
    @Override
    String getDescription() {
        return String.format("%s. Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
