package OOPSample;

import java.util.ArrayList;
import java.util.List;

public class CleanerCentre {
    public static void main(String[] args) {
        List<Apartment> apartments=new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());
        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for (int i = 0; i < apartments.size(); i++) {
            if (apartments.get(i) instanceof OneRoomApt) {
                ((OneRoomApt) apartments.get(i)).clean1Room();
            } else if (apartments.get(i) instanceof TwoRoomApt) {
                ((TwoRoomApt) apartments.get(i)).clean2Room();
            } else if (apartments.get(i) instanceof ThreeRoomApt) {
                ((ThreeRoomApt) apartments.get(i)).clean3Room();
            }
        }
    }

    static interface Apartment{

    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("Однокомнатный номер убран");
        }
    }
    static class TwoRoomApt implements Apartment {
        void clean2Room() {
            System.out.println("Двухкомнатный номер убран");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Room() {
            System.out.println("Трехкомнатный номер убран");
        }
    }
}
