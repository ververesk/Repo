package udemy.nested_classes.local_inner_class;

public class LocalInner1 { //класс который находится внутри какого-то блока виден только внутри метода getResult не может быть static
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{
    private int a=10;
    public void getResult() {

        class Division{
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe/delitel;
            }

            public int getOstatok() {
                System.out.println(a);
                return delimoe%delitel;
            }
        }

        Division division=new Division();
        division.setDelimoe(21);
        division.setDelitel(4);
        System.out.println("Delimoe = "+division.getDelimoe());
        System.out.println("Delitel = "+division.getDelitel());
        System.out.println("Chastnoe = "+division.getChastnoe());
        System.out.println("Ostatoc = "+division.getOstatok());

    }
}
