package interfaces;

import core.Engine;
import core.GPSNavigator;
import core.TripComputer;
import enums.CarType;
import enums.Transmission;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
