/**
 * Created by mohammadreza on 12/5/2016.
 */
class Wheel {

    private double verticalFriction;
    private double powerSteering;
    private double friction;
    private int price;

    public Wheel (double verticalFriction, double powerSteering, double friction, int price){

        this.verticalFriction = verticalFriction;
        this.powerSteering = powerSteering;
        this.friction = friction;
        this.price = price;

    }

    public double getVerticalFriction(){
        return this.verticalFriction;
    }

    public double getPowerSteering() {
        return powerSteering;
    }


    public double getFriction() {
        return friction;
    }


    public int getPrice() {
        return price;
    }
}
