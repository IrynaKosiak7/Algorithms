package de.telran._19_03.homework;

public class Сarnivores {
    private String type;
    private String colour;

    public Сarnivores(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Сarnivores{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public void eat(Herbivores herbivores) {
        System.out.println(type + " eats " + herbivores.getType());
    }

}
