package de.telran._19_03.homework;

public class Plants {
    private String type;
    private int size;
    private boolean isPoisonous;

    public Plants(String type, int size, boolean isPoisonous) {
        this.type = type;
        this.size = size;
        this.isPoisonous = isPoisonous;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", isPoisonous =" +isPoisonous+
                '}';
    }
}
