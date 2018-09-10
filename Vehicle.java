public class Vehicle 
{
    // A unique ID for this vehicle.
    private String id;
    // The destination of this taxi.
    private String destination;
    // The location of this shuttle.
    private String location;

    public Vehicle(String id, String destination)
    {
        this.id = id;
	this.destination = destination;
    }
    
    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getID()
    {
        return id;
    }

    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void setLocation(String location)
    {
	this.location = location;
    }

    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * Return the status of this vehicle.
     * @return The status.
     */
    public String getStatus()
    {
        return id + " at " + location + " headed for " + destination;
    }
}
