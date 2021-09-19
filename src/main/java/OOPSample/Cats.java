package OOPSample;


import java.util.Scanner;

public class Cats {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите имя кота или пустую строку для завершения");
        String key;
        while (!(key=scanner.nextLine()).equals("")) {
            Cat cat=CatFactory.getCatByKey(key);
            System.out.println(cat.toString());

        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat=new MaleCat("Вася");
                    break;
                case "murka":
                    cat=new FemaleCat("Мурка");
                    break;
                case "kiska":
                    cat=new FemaleCat("Кисуня");
                    break;
                default:
                    cat=new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name=name;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return "Я уличный кот "+getName();
        }
    }

    static class FemaleCat extends Cat {

        protected FemaleCat(String name) {
            super(name);
        }
        public String toString() {
            return "Я милая кошечка "+getName();
        }

    }

    static class MaleCat extends Cat {

        protected MaleCat (String name) {
            super(name);
        }
        public String toString() {
            return "Я серьёзный кот "+getName();
        }

    }
}
