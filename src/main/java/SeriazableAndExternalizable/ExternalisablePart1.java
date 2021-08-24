package SeriazableAndExternalizable;



import java.io.*;

/**
 * реализовать интерфейс Externalisable в классе Apartment
 */
public class ExternalisablePart1 {

    public static class Apartment implements Externalizable {
        private String address;
        private int year;

        public Apartment(String address, int year) {
            this.address = address;
            this.year = year;
        }

        public Apartment() {
            super();
        }

        @Override
        public String toString() {
            return (address +"\n" +
                     year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address=(String) in.readObject();
            year=in.readInt();

        }
    }
    public static void main(String[] args) {
        Apartment apartment=new Apartment("Gomel", 1990);
        try (ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("ExternalisableSample.txt", false))) {
            apartment.writeExternal((ObjectOutput) outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("ExternalisableSample.txt"))) {
            Apartment loadApatnment=new Apartment();
            loadApatnment.readExternal(inputStream);
            System.out.println(loadApatnment);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
