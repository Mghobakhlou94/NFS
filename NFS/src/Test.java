import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//i added
// isdfasdf

/**
 * Created by sina on 12/7/2016.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        City city = new City();
        //aval bayad az file dade shode Node ha va Street ha ro besazim.
        //bad az sakhte shodane har street bayad methode setFirstNode... farakhani shavad.

        File mapFile = new File("map.txt");
        Scanner input = new Scanner(mapFile);
        int theNumberOfNodes = input.nextInt();
        for (int i = 0; i < theNumberOfNodes; i++) {

            String name = input.next();
            int x_center = input.nextInt();
            int y_center = input.nextInt();
            String type = input.next();
            Node node = new Node(name,x_center, y_center, type);
            city.addNodes(node);


        }


        int theNumberOfStreets = input.nextInt();

        for (int i = 0; i < theNumberOfStreets; i++) {
            String type = input.next();
            String nameOfFirstNode = input.next();
            Node firstNode = city.getTheNodeOfStreet(nameOfFirstNode);
            String nameOfSecondNode = input.next();
            Node secondNode = city.getTheNodeOfStreet(nameOfSecondNode);
            int numberOfline = input.nextInt();
            String direction = input.next();
            int x_center = input.nextInt();
            int y_center = input.nextInt();
            Street street = new Street(type, firstNode, secondNode, numberOfline, direction, x_center,y_center);
            city.addStreets(street);
            street.setStreetsOfFirstNodeAndSecondNode();

        }

        input.close();
    }
}
