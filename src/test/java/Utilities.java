import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utilities {

    public static List<String[]> readFromCSV() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\gular\\IdeaProjects\\CarDealership\\src\\test\\java\\vehicleInfo.csv");



        List<String[]> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(fr);


        String line;
        while((line = bufferedReader.readLine()) != null ){

            String[] split = line.split(",");

            for(int i = 0; i < split.length; i++){
               split[i] = split[i].trim();
            }

            list.add(split);

        }
        bufferedReader.close();
        return list;

    }
}
