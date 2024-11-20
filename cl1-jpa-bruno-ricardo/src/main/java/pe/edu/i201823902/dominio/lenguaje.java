package pe.edu.i201823902.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "countrylanguage")
public class lenguaje {
    @Id
    private String CountryCode;
    private String Lenguage;
    private Boolean IsOfficial;
    private Double Percentage;

    public lenguaje(String countryCode, String lenguage, Boolean isOfficial, Double percentage) {
        CountryCode = countryCode;
        Lenguage = lenguage;
        IsOfficial = isOfficial;
        Percentage = percentage;
    }

    public lenguaje() {
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLenguage() {
        return Lenguage;
    }

    public void setLenguage(String lenguage) {
        Lenguage = lenguage;
    }

    public Boolean getOfficial() {
        return IsOfficial;
    }

    public void setOfficial(Boolean official) {
        IsOfficial = official;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }

    @Override
    public String toString() {
        return "lenguaje{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Lenguage='" + Lenguage + '\'' +
                ", IsOfficial=" + IsOfficial +
                ", Percentage=" + Percentage +
                '}';
    }
}
