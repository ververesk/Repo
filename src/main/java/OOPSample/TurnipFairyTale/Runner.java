package OOPSample.TurnipFairyTale;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Person("Репка", "Репку"));
        personList.add(new Person("Дедка", "Дедку"));
        personList.add(new Person("Бабка", "Бабку"));
        personList.add(new Person("Внучка", "Внучку"));
        personList.add(new Person("Жучка", "Жучку"));
        personList.add(new Person("Кошка", "Кошку"));
        personList.add(new Person("Мышка", "Мышку"));
        RepkaStory.tell(personList);

    }
}
