package net.ukr.kekos222;

/**
 * Created by Олег on 06.03.2017.
 */
public class TaxiRunner {

    public static void main(String[] args){

    TaxiRide a = new TaxiRide(3,45,30);
    TaxiRide b = new TaxiRide(6, 100, 70);

    TaxiRides taxiRides = new TaxiRides();
    taxiRides.addRide(a);
    taxiRides.addRide(b);

    long p = taxiRides.getPrice(new StandartTariff());
    System.out.println(p);


    }
}
