package net.ukr.kekos222;

/**
 * Created by Олег on 06.03.2017.
 */

import java.util.ArrayList;

public class TaxiRides {

    private ArrayList<TaxiRide> rides = new ArrayList<>();

    public void addRide(TaxiRide ride){
        rides.add(ride);
    }

    public long getPrice(TaxiTariff tariff){
        long price = 0;
        for (TaxiRide r: rides) {
            price = tariff.calculatePrice(r);

        }
        return price;
    }


}
