package CaseStudy.Models;


public class House extends Facility {
    String roomStandard;
    int numberOfFloors;
    public House() {
    }

    public House(String serviceName, double useArea, double rentalCosts, int maxPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, useArea, rentalCosts, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }
}
