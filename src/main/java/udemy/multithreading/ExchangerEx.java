package udemy.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * два друга играют в камень ножницы бумага
 * метод
 */
public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.Ножницы);
        friend1Action.add(Action.Бумага);
        friend1Action.add(Action.Ножницы);
        List<Action>  friend2Action= new ArrayList<>();
        friend2Action.add(Action.Бумага);
        friend2Action.add(Action.Камень);
        friend2Action.add(Action.Камень);
        new BestFriend("ivan", exchanger, friend1Action);
        new BestFriend("lena", exchanger, friend2Action);
    }
}

enum Action {
    Камень, Ножницы, Бумага;
}

class BestFriend
       extends Thread
{
    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> myActions;

    public BestFriend(String name, Exchanger<Action> exchanger, List<Action> myActions) {
        this.name = name;
        this.exchanger = exchanger;
        this.myActions = myActions;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if((myAction==Action.Камень && friendsAction==Action.Ножницы) ||
                (myAction==Action.Ножницы && friendsAction==Action.Бумага) ||
                (myAction==Action.Бумага && friendsAction==Action.Камень)) {
            System.out.println(name + " WINS!!!");
        }
    }

    public void run() {
        Action reply;
        for(Action action: myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}