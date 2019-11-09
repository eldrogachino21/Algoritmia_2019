


public class Arista {
    private Nodo origin;
    private Nodo destination;
    private double distance;
 
    public Arista(Nodo origin, Nodo destination, double distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }
 
    public Nodo getOrigin() {
        return origin;
    }
 
    public void setOrigin(Nodo origin) {
        this.origin = origin;
    }
 
    public Nodo getDestination() {
        return destination;
    }
 
    public void setDestination(Nodo destination) {
        this.destination = destination;
    }
 
    public double getDistance() {
        return distance;
    }
 
    public void setDistance(double distance) {
        this.distance = distance;
    }
 
    @Override
    public String toString() {
        return "\n Arista [origin=" + origin.getCity() + ", destination=" + destination.getCity() + ", distance="
                + distance + "]";
    }
 
}