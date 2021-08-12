package OOPSample.UserLoserCaderAndProger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        while (true) {
            String key = bufferedReader.readLine();
            boolean tr=key.equalsIgnoreCase("Loser") || key.equalsIgnoreCase("Coder") || key.equalsIgnoreCase("User") || key.equalsIgnoreCase("Proger");
             if (!tr)
                 break;

if (key.equalsIgnoreCase("Loser")) {
    person=new Loser();
break;}
else if (key.equalsIgnoreCase("Coder")) {
    person=new Coder();
    break;
    } else if (key.equalsIgnoreCase("User")) {
    person=new User();
    break;
    } else if (key.equalsIgnoreCase("Proger")) {
    person=new Proger();
    break;
    }

        }
        doWork(person);
        bufferedReader.close();
    }
    public static void doWork(Person person) {
        if (person instanceof User) {
            person.live();
        } else if (person instanceof Proger) {
            person.enjoy();
        } else if (person instanceof Coder) {
            person.writeCode();
        } else if (person instanceof Loser) {
            person.doNothing();
        }
    }
}
