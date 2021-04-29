import Utilis.LectorCSV;
import Utilis.Pais;
import Utilis.Region;

public class App {
    public static void main(String[] args){

        LectorCSV lector = new LectorCSV();
        lector.leer();

        lector.ImportarCSV();
    }
}
