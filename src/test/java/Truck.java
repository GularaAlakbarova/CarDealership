public class Truck extends Car{


    public Truck(int year, String make, String model, String VIN, int cost, String yearPurchased, String type) {
        super(year, make, model, VIN, cost, yearPurchased, type);
    }

    @Override
    public String getInventoryNumber(){

        return super.getInventoryNumber().replace("U", "T");
    }
}
