/**
 * Created by mohammadreza on 12/5/2016.
 */
class Body {

    private int allBody_Power;
    private int body_power;
    private int costOfBodyRepair;
    private int price;

    public Body (int allBody_Power, int costOfRepair, int price){

        this.allBody_Power = allBody_Power;
        this.body_power = allBody_Power;
        this.costOfBodyRepair = costOfRepair;
        this.price = price;
    }

    public void setBody_power(int body_power){
        this.body_power = body_power;
    }


    public int getBody_power() {
        return body_power;
    }


    public int getAllBody_Power() {
        return allBody_Power;
    }


    public int getCostOfBodyRepair() {
        return costOfBodyRepair;
    }

    public int getPrice() {
        return price;
    }
}
