package CaseStudy.Models;


public class Villa extends Facility {
    private String roomStandard;
    private double swimArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceName, double useArea, double rentalCosts, int maxPeople, String rentalType, String roomStandard, double swimArea, int numberOfFloors) {
        super(serviceName, useArea, rentalCosts, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimArea = swimArea;
        this.numberOfFloors = numberOfFloors;
    }
}
