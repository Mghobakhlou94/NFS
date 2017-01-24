/**
 * Created by mohammadreza on 12/5/2016.
 */
class Engine {

    private double acceleration;
    private double maxSpeed;
    private int price;

    public Engine (double acceleration, double maxSpeed, int price){

        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }


    public double getAcceleration() {
        return acceleration;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }
}
