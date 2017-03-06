package net.ukr.kekos222;

/**
 * Created by Олег on 06.03.2017.
 */
public class FamilyTariff implements TaxiTariff {

    @Override
    public long calculatePrice(TaxiRide ride){
        long price = 50 + 20 * ride.getDistance() / ride.getPassengers();
        return price;
    }
}
