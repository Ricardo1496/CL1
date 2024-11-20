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
public class countrylanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String CountryCode;
    private String Language;
    private String IsOfficial;
    private Integer Percentage;
}
