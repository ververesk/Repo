package OOPSample.Comp;

public class Runner {
    public static void main(String[] args) {
   Computer computer=new Computer(new Keyboard(), new Monitor(), new Mouse());
   if(isWork(computer.getKeyboard())&&isWork(computer.getMonitor()) && isWork(computer.getMouse())) {
       System.out.println("work");
   }
    }
    public static boolean isWork(CompItem compItem) {
        System.out.println(compItem.getName());
        return compItem.getName()!=null && compItem.getName().length()>4;
    }

}
