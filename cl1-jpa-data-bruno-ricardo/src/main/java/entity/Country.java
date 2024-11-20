package entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private Integer SurfaceArea;
    private Integer IndepYear;
    private Integer LifeExpectancy;
    private Integer GNP;
    private Integer GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private  String HeadOfState;
    private Integer Capital;
    private String Code2;

}
