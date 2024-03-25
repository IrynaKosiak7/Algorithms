package de.telran._19_03.homework;

import java.util.Objects;

public class Boat {
    private int size;
    private int numberOfCrossings;
    private Object passenger_count1;
    private Object passenger_count2;

    public Boat() {
    }

    public Boat(int size, int numberOfCrossings) {
        this.size = size;
        this.numberOfCrossings =  numberOfCrossings;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "size=" + size +
                ", passenger_count1=" + passenger_count1 +
                ", passenger_count2=" + passenger_count2 +
                " , number of crossings= " + numberOfCrossings +
                '}';
    }

    private void shipping(Сarnivores carnivores, Herbivores herbivores, Plants plants){
        Boat boat = new Boat();
        if (Objects.equals(passenger_count1, carnivores) && Objects.equals(passenger_count2, herbivores)) {
            System.out.println("ERROR" + carnivores.eat(herbivores));
        } else if (Objects.equals(passenger_count1, carnivores) && Objects.equals(passenger_count2, plants)) {
            System.out.println("They can shipping");
        } else if (Objects.equals(passenger_count1, herbivores) && Objects.equals(passenger_count2, plants)) {
            System.out.println("ERROR" + herbivores.eat(plants));
        } else {
            System.out.println();
        }


    }






    public static void main(String[] args) {

        Wolf wolf = new Wolf("wolf", "Grey");
        Goat goat = new Goat("goat", "white", true);
        Cabbage cabbage = new Cabbage("Cabbage", 10,false);
        wolf.eat(goat);
        goat.eat(cabbage);
        shipping(wolf,goat,cabbage);


    }


}
