import java.util.ArrayList;

public class Bus {

    private int routeNumber;
    private String destination;
    private ArrayList<Person> passengers;
    

    public Bus(int routeNumber, String destination){
        this.routeNumber = routeNumber;
        this.destination = destination;
        this.passengers = new ArrayList<Person>();
    }

    public int getRouteNumber(){
        return this.routeNumber;
    }

    public String getDestination(){
        return this.destination;
    }
    
    public int passengerCount() {
        return this.passengers.size();
    }
}
