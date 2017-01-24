import java.util.ArrayList;

/**
 * Created by mohammadreza on 12/5/2016.
 */
class Node {
    private String name;
    private int x_center, y_center;
    private String type;
    private int area;
    private int length,wide;
    private ArrayList <Street> northStreets;
    private ArrayList <Street> eastStreets;
    private ArrayList <Street> westStreets;
    private ArrayList <Street> southStreets;

    public Node (String name, int x_center, int y_center, String type){

        this.name = name;
        this.x_center = x_center;
        this.y_center = y_center;
        this.type = type;

        northStreets = new ArrayList<>();
        eastStreets = new ArrayList<>();
        westStreets = new ArrayList<>();
        southStreets = new ArrayList<>();
    }

    public int getX_center() {
        return this.x_center;
    }


    public int getY_center() {
        return this.y_center;
    }


    public void addNorthStreets(Street street){
        this.northStreets.add(street);

    }

    public void addSouthStreets(Street street){
        this.southStreets.add(street);

    }

    public void addEastStreets(Street street){
        this.eastStreets.add(street);

    }

    public void addWestStreets(Street street){
        this.westStreets.add(street);

    }

    public String getName(){
        return this.name;
    }


    public int getLength() {
        for (Street street: northStreets) {
            this.length += street.getwide();
        }
        return length;
    }

    public int getWide() {
        for (Street street: westStreets) {
            this.wide += street.getwide();
        }
        return wide;
    }
}
