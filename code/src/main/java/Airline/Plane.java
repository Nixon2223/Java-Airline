package Airline;

public class Plane {
    public enum Type {
        AIRBUS_A380(200, 5000),
        BOEING_757(300, 7000);

        private final int capacity;
        private final int weight;

        Type(int capacity, int weight) {
            this.capacity = capacity;
            this.weight = weight;
        }
    }
}
