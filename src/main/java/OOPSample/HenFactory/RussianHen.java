package OOPSample.HenFactory;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    String getDescription() {
        return String.format("%s. Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.RUSSIA, getCountOfEggsPerMonth());
    }

}
