package Utilis;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Region {

    public List<Pais> region;
    public Pais P;

    public Region(){
         region = new ArrayList<Pais>();

    }

    public void AñadirRegion(Pais p){
        String cadena = p.getRegion();
        Pattern pat = Pattern.compile(p.getRegion());
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {

        } else {
           region.add(p);
        }
    }



    public void promedioSocialSupport(Region region){
        double  num = 0, count = 0, res = 0;
        for(int i = 0; i< region.region.size(); i++){
        }
        System.out.println("El promedio social " );
    }
    public void promedioHealthyLifeExpectancy(Region g){
        System.out.println("El promedio healthy ");
    }
    public void promedioGenerosity(Region g){
        System.out.println("El promedio de Generocidad ");
    }

    public void promedioPerceptionOfCorruption(Region g){
        System.out.println("El promedio de corrupcion ");
    }
    public void paiscorrupcion(List<Pais> p){
        System.out.println("Pais nivel mas alto de corrupcion ");
    }

    public void paisGeneroso(Pais p){
        System.out.println("Pais con nivel mas alto en generosidad ");
    }

}
