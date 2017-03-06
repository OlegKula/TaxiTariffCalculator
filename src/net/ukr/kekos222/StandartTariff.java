package net.ukr.kekos222;

/**
 * Created by Олег on 06.03.2017.
 */
public class StandartTariff implements TaxiTariff {

    @Override
    public long calculatePrice(TaxiRide ride) {
        long price = 30 + 5 * ride.getDistance() + 2* ride.getDuration();
        return price;
    }
}
