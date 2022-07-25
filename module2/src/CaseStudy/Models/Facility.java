package CaseStudy.Models;

public abstract class Facility {
    protected String serviceName;
    protected double useArea;
    protected double rentalCosts;
    protected int maxPeople;
    protected String rentalType;
    public Facility(){

    }

    public Facility(String serviceName, double useArea, double rentalCosts, int maxPeople, String rentalType) {
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }
}
