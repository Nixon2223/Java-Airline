package Airline;

public class Plane {
    public enum Type {
        AIRBUS_A380(200, 5000),
        BOEING_757(300, 7000);

        public int getCapacity() {
            return capacity;
        }

        public int getWeight() {
            return weight;
        }

        private final int capacity;
        private final int weight;

        Type(int capacity, int weight) {
            this.capacity = capacity;
            this.weight = weight;
        }
    }

    private Type type;

    public Plane(Type type) {
        this.type = type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
