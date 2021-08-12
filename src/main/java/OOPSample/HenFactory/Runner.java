package OOPSample.HenFactory;

public class Runner {
    public static void main(String[] args) {
Hen hen=HenFactory.getHen(Country.BELARUS);

        System.out.println(hen.getDescription());
    }

    static class HenFactory implements Country {
        static Hen getHen(String country) {
           Hen hen=null;
            switch (country) {
                case Country.RUSSIA:
                    hen=new RussianHen();
                    break;
                case Country.UKRAINE:
                    hen=new UkrinianHen();
                    break;
                case Country.BELARUS:
                    hen=new BelarussianHen();
                    break;
                case Country.MOLDOVA:
                    hen=new MoldovanHen();
                    break;
            }
            return hen;
        }

    }
}
