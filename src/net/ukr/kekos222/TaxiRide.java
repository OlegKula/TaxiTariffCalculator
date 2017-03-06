package net.ukr.kekos222;

/**
 * Created by Олег on 06.03.2017.
 */
public class TaxiRide {

    private int passengers;
    private int distance;
    private int duration;

    public TaxiRide(int passengers, int distance, int duration){
        this.distance = distance;
        this.duration = duration;
        this.passengers = passengers;
    }

    public int getPassengers(){
        return passengers;
    }

    public int getDistance(){
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Passengers : " + passengers
                + "\nDistance : " + distance
                + "\nDuration : " + duration;
    }
}
