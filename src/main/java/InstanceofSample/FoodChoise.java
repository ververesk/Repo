package InstanceofSample;

public class FoodChoise {
    public static void main(String[] args) {
        Food food=new Food();
        Selectable selectable=new Food();
        callFoodMethods(food);
    //    callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        if (food instanceof Selectable) {
            callSelectableMethods(food);
        }
        food.onEat();
    }

    public static void callSelectableMethods(Selectable selectable) {
        selectable.onSelect();

    }

    interface Selectable {
        void onSelect();
    }
    static class Food implements Selectable{
        public void onEat() {
            System.out.println("Еда была съедена");
        }

        @Override
        public void onSelect() {
            System.out.println("Еда была выбрана");
        }
    }


}
