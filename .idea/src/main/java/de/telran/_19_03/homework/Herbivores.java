package de.telran._19_03.homework;

public class Herbivores {
    private String type;
    private String colour;
    private boolean has_hooves;

    public Herbivores(String type, String colour, boolean has_hooves) {
        this.type = type;
        this.colour = colour;
        this.has_hooves = has_hooves;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", has_hooves=" + has_hooves +
                '}';
    }

    public void eat(Plants plants) {
        System.out.println(type + " eats " + plants.getType());
    }


}
