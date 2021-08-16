package OOPSample.MethodOverloading;

import java.math.BigDecimal;


public class Runner {
    public static void main(String[] args) {

        new Tree(Tree.globalNumber).info((Object) new Integer(4));
        new Tree(Tree.globalNumber).info((Object) new Short((short) 4));
        new Tree(Tree.globalNumber).info((Object) new BigDecimal(4));

        new Tree(Tree.globalNumber).info(new Integer("4"));
        new Tree(Tree.globalNumber).info(new Short("4"));
        new Tree(Tree.globalNumber).info(new BigDecimal("4"));

        new Tree(Tree.globalNumber).info("4");

    }
}
