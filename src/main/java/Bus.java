public class Bus {

    private int routeNumber;
    private String destination;

    public Bus(int routeNumber, String destination){
        this.routeNumber = routeNumber;
        this.destination = destination;
    }

    public int getRouteNumber(){
        return this.routeNumber;
    }

    public String getDestination(){
        return this.destination;
    }

}
