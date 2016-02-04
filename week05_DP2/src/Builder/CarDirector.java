package Builder;

/**
 * Created by OliverW on 04/02/2016.
 */
public class CarDirector {
    CarBuilder carBuilder;
    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void build(){
        carBuilder.buildBodyStyle();
        carBuilder.buildBreaks();
        carBuilder.buildEngine();
        carBuilder.buildFuelType();
        carBuilder.buildPower();
        carBuilder.buildPower();
        carBuilder.buildSeats();
        carBuilder.buildWindows();

    }
}
