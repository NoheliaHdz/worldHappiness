package Utilis;

import com.csvreader.CsvReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV{
    List<Pais> pais = new ArrayList<Pais>(); // Lista donde guardaremos los datos del archivo
    public void leer(){
        Path filePath = Paths.get("C:\\Users\\Dell\\Downloads\\world-happiness-report-2021.csv");
        List<Region> R;
        int j;
        ArrayList<String> region = new ArrayList<String>();
        try{
            BufferedReader base = Files.newBufferedReader(filePath);
            String linea = null;
            while ((linea = base.readLine())!=null){
                String [] parte= linea.split(",");
                region.add(linea);
                for( j=0 ; j<region.size()-1; j++){
                }
                System.out.println("\n");
                System.out.println(region.get(j));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
    }
    public void ImportarCSV() {
        try {


            CsvReader leerPais = new CsvReader("C:\\Users\\Dell\\Downloads\\world-happiness-report-2021.csv");
            leerPais.readHeaders();

            // Mientras haya lineas obtenemos los datos del archivo
            while (leerPais.readRecord()) {
                String Pais = leerPais.get(0);
                String Region = leerPais.get(1);
                double spor = Double.valueOf(leerPais.get(8));
                double hel = Double.valueOf(leerPais.get(9));
                double fre = Double.valueOf(leerPais.get(10));
                double gene = Double.valueOf(leerPais.get(11));
                double percepcio = Double.valueOf(leerPais.get(12));

                pais.add(new Pais(Pais, Region, spor, hel, fre, gene, percepcio));

            }

            leerPais.close(); // Cierra el archivo

            // Recorremos la lista y la mostramos en la pantalla
            for (Pais p : pais) {
                System.out.println(p.getPais() + ","
                        + p.getRegion() + ","
                        + p.getFredomToMakeChoises() + ","
                        + p.getHealthyLifeExpectancy() + ","
                        + p.getSocialSupport() + ","
                        + p.getGenerosity() + ","
                        + p.getPerceptionOfCorruption());

            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
