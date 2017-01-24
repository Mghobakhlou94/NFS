import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mohammadreza on 12/5/2016.
 */
class Race {

    protected ArrayList <Player> players;
    protected int numberOfPlayers;
    protected Way way;
    protected HashMap<Player, Integer> player_counterTime;
    protected int theNumberOfLoop;
    protected HashMap<Player, Integer> bestPlayers_record = new HashMap<>();
    protected ArrayList <Player> bestPlayers = new ArrayList<>();

    public void startRace(){

        if (this.numberOfPlayers == this.players.size()){
            this.duringRace();
        }
    }

    public void firstSetPlayerHashmap(){
        for (Player player : this.players){
            int [] temp = new int[numberOfPlayers];
            player.firstSetRecordOfEachLoopOfRace(this, temp);
        }
    }

    public void duringRace(){
        for (int j = 0; j < this.theNumberOfLoop; j++){
            for (Player player : this.players){
                for (Node node : this.way.getNodes()){
                    while (!player.getCurrentMachine().getNode().equals(node)){
                        this.player_counterTime.put(player, this.player_counterTime.get(player) + 1);
                        if (player.getCurrentMachine().getBody().getBody_power() == 0){
                            removePlayer(player);
                        }
                    }
                }
                player.setRecordOfEachLoopOfRace(this, j, this.player_counterTime.get(player) * Machine.Time);
            }
        }
        this.setFullRecordAndBestPlayers();
    }

    public void addPlayer(Player player){
        if (player.getCurrentMachine().getBody().getBody_power() >= player.getCurrentMachine().getBody().getAllBody_Power()*3/10){
            this.players.add(player);
        }

        this.startRace();
    }

    public void removePlayer(Player player){

        this.players.remove(player);
    }

    public void setFullRecordAndBestPlayers(){
        for (Player player : this.players){

            int temp =0;
            for (int record : player.getRecordOfEachLopp(this)) {
                temp += record;
            }

            this.bestPlayers_record.put(player, temp);

            if (player.getFullRecordOfRace(this) > temp){
                player.setFullRecordOfRace(this, temp);
            }
        }

    }

    public void sortHashmap(HashMap<Player, Integer> h){
//        int min = this.players.;
//        for (int i =0; i<h.size(); i++){
//            for (Player player1 : this.players){
//                if (max < h.get(player1) ){max = h.get(player1);}
//            }
//            h.remove;
//        }
    }

}



class TrainingRace extends Race{
    private ArrayList<Double> recordPlayer;
    public TrainingRace(Way way1, int theNumberOfLoop1) {
        way = way1;
        theNumberOfLoop = theNumberOfLoop1;
        numberOfPlayers = 1;
    }

    public void addPlayerIn(Player player){
        addPlayer(player);
    }

}




class CompetetiveRace extends Race{
    private int minPopularity;
    private int[] awardPopularity;
    private int[] awards;

    public CompetetiveRace(Way way1, int theNumberOfPlayers1, int theNumberOfLoop1, int minPopularity, int[] awardPopularity, int[] awards) {
        way = way1;
        theNumberOfLoop = theNumberOfLoop1;
        numberOfPlayers = theNumberOfPlayers1;

        this.awardPopularity = new int[3];
        this.awards = new int[3];
        this.minPopularity = minPopularity;
        this.awardPopularity = awardPopularity;
        this.awards = awards;
    }

    public void addPlayerInExtend(Player player){
        if (this.minPopularity <= player.getPopularity()){
            addPlayer(player);
        }
    }




}