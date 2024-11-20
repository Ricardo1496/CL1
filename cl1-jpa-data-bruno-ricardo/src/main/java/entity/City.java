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
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Name;
    private String CountryCode;
    private String District;
    private Integer population;


}
