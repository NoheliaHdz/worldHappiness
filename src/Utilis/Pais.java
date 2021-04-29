package Utilis;

import java.util.List;

public class Pais {
    public String pais;
    public String region;
    public double SocialSupport;
    public double HealthyLifeExpectancy;
    public double FredomToMakeChoises;
    public double Generosity;
    public double PerceptionOfCorruption;

    public Pais(String pais,String region,double SocialSupport,double HealthyLifeExpectancy,double FredomToMakeChoises,double Generosity,double PerceptionOfCorruption){
        this.pais=pais;
        this.region = region;
        this.FredomToMakeChoises = FredomToMakeChoises;
        this.Generosity = Generosity;
        this.SocialSupport = SocialSupport;
        this.HealthyLifeExpectancy = HealthyLifeExpectancy;
        this.PerceptionOfCorruption = PerceptionOfCorruption;

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSocialSupport() {
        return SocialSupport;
    }

    public void setSocialSupport(double socialSupport) {
        SocialSupport = socialSupport;
    }

    public double getHealthyLifeExpectancy() {
        return HealthyLifeExpectancy;
    }

    public void setHealthyLifeExpectancy(double healthyLifeExpectancy) {
        HealthyLifeExpectancy = healthyLifeExpectancy;
    }

    public double getFredomToMakeChoises() {
        return FredomToMakeChoises;
    }

    public void setFredomToMakeChoises(double fredomToMakeChoises) {
        FredomToMakeChoises = fredomToMakeChoises;
    }

    public double getGenerosity() {
        return Generosity;
    }

    public void setGenerosity(double generosity) {
        Generosity = generosity;
    }

    public double getPerceptionOfCorruption() {
        return PerceptionOfCorruption;
    }

    public void setPerceptionOfCorruption(double perceptionOfCorruption) {
        PerceptionOfCorruption = perceptionOfCorruption;
    }


}
