package X_Chart.Xchart;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class ReadingJsonFile1 {
	// Read json file and return a list containing TitanicPassenger1 Objects
    public List<TitanicPassenger1> getPassengersFromJsonFile() throws FileNotFoundException, IOException {
        
        List<TitanicPassenger1> allPassengers = new ArrayList<TitanicPassenger1> ();
        
        ObjectMapper objectMapper = new ObjectMapper ();
        objectMapper.configure (DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        InputStream input = new FileInputStream ("C:\\Users\\iti\\eclipse-workspace\\Xchart\\src\\test\\java\\X_Chart\\Xchart\\titanic_csv.json");
        //Read JSON file
        allPassengers = objectMapper.readValue(input, new TypeReference<List<TitanicPassenger1>>(){});
        return allPassengers;
}

}
