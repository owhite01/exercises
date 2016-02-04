/**
 * Created by OliverW on 04/02/2016.
 */
public class SedanCarBuilder implements CarBuilder {
    private Car car = new Car("Sedan");

    //Override the methods in the carBuilder interface for 'building' the car

    @Override
    public void buildBodyStyle(){
        car.setBodyStyle(" Body: External dimensions: overall length (inches): 202.9,\n" +
                "   overall width (inches): 76.2, overall height (inches): 60.7,\n" +
                "   wheelbase (inches): 112.9, front track (inches): 65.3,\n" +
                "   rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
    }




}
