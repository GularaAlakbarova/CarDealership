import sun.text.normalizer.Utility;

import java.io.IOException;
import java.util.List;

public class carTester {

    public static void main(String[] args) {


        List<String[]> result = null;
        try{
            result = Utilities.readFromCSV();

        } catch(IOException io){

            System.out.println("IO Exception");

        }



        for(int i = 1; i < result.size(); i++){
            String [] line = result.get(i);

            int year = Integer.parseInt(line[0]);

            int cost = Integer.parseInt(line[5]);

            if(line[3].equals("SUV")){
                SUV suv = new SUV(year, line[1], line[2], line[4], cost, line[6], line[3]);
                suv.getInventoryNumber();
                suv.setStatus("sold");
                suv.setVehicleCost(0);
                suv.getInfo();

            }else if(line[3].equals("Sedan")){
                Sedan sedan = new Sedan(year, line[1], line[2], line[4], cost, line[6], line[3]);
                sedan.getInventoryNumber();
                sedan.setStatus("availabe");
                sedan.setVehicleCost(0);
                sedan.getInfo();

            }else if(line[3].equals("Truck")){
                Truck truck = new Truck(year, line[1], line[2], line[4], cost, line[6], line[3]);
                truck.getInventoryNumber();
                truck.setStatus("set aside");
                truck.setVehicleCost(5000);
                truck.getInfo();

            }else{
                Car car = new Car(year, line[1], line[2],  line[4], cost, line[6], line[3]);
                car.getInventoryNumber();
                car.setStatus("sold");
                car.setVehicleCost(0);
                car.getInfo();
            }

        }











    }
}
