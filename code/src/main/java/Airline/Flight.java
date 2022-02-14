package Airline;

import Airline.Employees.CabinCrew;
import Airline.Employees.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private String departureAirport;
    private String getDepartureTime;

    public Flight(Pilot pilot, Plane plane, String flightNum, String departureAirport, String getDepartureTime) {
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.departureAirport = departureAirport;
        this.getDepartureTime = getDepartureTime;
    }

    public void bookPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int passengerCount(){
        return passengers.size();
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void setCabinCrew(ArrayList<CabinCrew> cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setGetDepartureTime(String getDepartureTime) {
        this.getDepartureTime = getDepartureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrew> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getGetDepartureTime() {
        return getDepartureTime;
    }
}
