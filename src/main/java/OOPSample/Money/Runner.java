package OOPSample.Money;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Person ivan=new Person("Иван");
        for(Money money: ivan.getAllMoney()) {
            System.out.println(ivan.name+" имеет заначку в размере "+money.getAmount()+" "+money.getCurrencyName());
        }

    }
    static class Person {
        public String name;
        private List<Money> allMoney;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Hryvnia(10));
            allMoney.add(new Ruble(22));
            allMoney.add(new USD(30));
        }

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
