import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sina on 12/8/2016.
 */
class Way {
    private ArrayList<Node> nodes;
    private HashMap <Node, Boolean> checkCorrectWay;

    public Way(ArrayList<Node> nodes) {
        this.nodes = nodes;
        for (Node node : nodes){
            checkCorrectWay.put(node, false);
        }

    }

    public HashMap <Node, Boolean> getCheckCorrectWay(){
        return this.checkCorrectWay;
    }


    public void setCheckCorrectWay(Node node, boolean b){
        this.checkCorrectWay.put(node, b);
    }


    public void setFalseAllCheckCorrectWay(){
        for (Node node: this.nodes){
            this.setCheckCorrectWay(node, false);
        }
    }

    public ArrayList <Node> getNodes(){
        return this.nodes;
    }

}

