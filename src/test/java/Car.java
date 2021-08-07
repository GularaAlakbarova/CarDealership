public class Car {

    int year;
    String make;
    String model;
    String VIN;
    String inventoryNumber;
    String status;
    int cost;
    String yearPurchased;
    int repairCost;
    String type;


    public Car(int year, String make, String model, String VIN, int cost, String yearPurchased, String type){
        this.year = year;
        this. make = make;
        this.model = model;
        this.VIN = VIN;
        this.cost = cost;
        this.yearPurchased = yearPurchased;
        this.type = type;

    }

  public void setStatus(String status) {
      if ((status == "set aside") || (status == "sold") || (status == "available")){
          this.status = status;
      }
  }

    public void setVehicleCost(int repairCost){

        if(status == "set aside"){
            this.repairCost = repairCost;
            this.cost += repairCost;
        }else{
            this.cost = cost;
        }

    }

    public String getInventoryNumber(){

        return yearPurchased.substring(yearPurchased.length()-2, yearPurchased.length()) + yearPurchased.substring(0, 2) + VIN.substring(VIN.length()-6, VIN.length());
    }

    public void getInfo(){
        System.out.println("Year: " + year + ", Make: " + make + ", Model: " + model + "Type: " + type + ", VIN: " + VIN +  ", Cost: " + cost + ", Date purchased: " + yearPurchased);
    }




}
