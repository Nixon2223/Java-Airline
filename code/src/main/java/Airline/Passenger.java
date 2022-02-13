package Airline;

public class Passenger {

    private String name;
    private int bags;


    public void Passenger(String name, int bags){
        this.name = name;
        this.bags = bags;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

}
