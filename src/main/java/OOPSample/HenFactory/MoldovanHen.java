package OOPSample.HenFactory;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 7;
    }
    @Override
    String getDescription() {
        return String.format("%s. Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
