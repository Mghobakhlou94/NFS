import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mohammadreza on 12/5/2016.
 */
class Player {

    private String name;
    private ArrayList <Machine> machines;
    private  Machine currentMachine;
    private ArrayList <Race> races;
    private int popularity;
    private int money;
    private HashMap <Race, int[]> recordOfEachLoopOfRace;
    private HashMap <Race, Integer> fullRecordOfRace;


    public Player (String name){

        this.name = name;
        this.machines = new ArrayList<>();
        this.races = new ArrayList<>();
        this.popularity = 10;
        this.money = 10;
        this.currentMachine = null;
    }



    public void buy(Machine machine){
        this.machines.add(machine);
        this.money -= machine.getPrice();
    }

    public void sell(Machine machine){
        this.machines.remove(machine);
        this.money += machine.getPrice();
    }

    public void buyEngineForMachin(Machine machine, Engine engine){
        machine.setEngine(engine);
        this.money -= engine.getPrice();
    }

    public void buyWeelForMachine(Machine machine, Wheel wheel){
        machine.setWheel(wheel);
        this.money -= wheel.getPrice();
    }

    public void buyBodyForMachine(Machine machine, Body body){
        machine.setBody(body);
        this.money -= body.getPrice();
    }


    public void setCurrentMachine(Machine currentMachine) {
        if (machines.contains(currentMachine)){

            this.currentMachine = currentMachine;
        }
        else{
            System.out.println("This machine not exist.");
        }
    }


    public Machine getCurrentMachine(){

        return this.currentMachine;
    }

    public Street getCurrentStreet() {

        return currentMachine.getMachineStreet();

    }

    public Node getCureentNode() {

        return currentMachine.getNode();
    }

    public void firstSetRecordOfEachLoopOfRace(Race race, int[] temp) {
        this.recordOfEachLoopOfRace.put(race, temp);
    }

    public void setRecordOfEachLoopOfRace(Race race, int loopNumber, int time){

        this.recordOfEachLoopOfRace.get(race)[loopNumber] = time;
    }

    public int[] getRecordOfEachLopp(Race race){

        return this.recordOfEachLoopOfRace.get(race);
    }


    public int getFullRecordOfRace(Race race) {
        return this.fullRecordOfRace.get(race);
    }


    public void setFullRecordOfRace(Race race, int record) {
        this.fullRecordOfRace.put(race, record);
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity, Race race) {
        if (!this.fullRecordOfRace.keySet().contains(race)){

            this.popularity += popularity;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money += money;
    }
}
