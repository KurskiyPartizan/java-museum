package sekerin.museum.javamuseum.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String PersonLastName;
    private String PersonFirstName;
    private String PersonSecondName;


    private String DateOfBirth;
    private String PlaceOfBirth;


    private String DateOfDeath;
    private String PlaceOfDeath;

    private String Biography;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public String getPersonLastName() {
        return PersonLastName;
    }
    public void setPersonLastName(String PersonLastName) {
        this.PersonLastName = PersonLastName;
    }

    public String getPersonFirstName() {
        return PersonFirstName;
    }
    public void setPersonFirstName(String PersonFirstName) {
        this.PersonFirstName = PersonFirstName;
    }

    public String getPersonSecondName() {
        return PersonSecondName;
    }
    public void setPersonSecondName(String PersonSecondName) {
        this.PersonSecondName = PersonSecondName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String x) {
        this.DateOfBirth = x;
    }

    public String getPlaceOfBirth() {
        return PlaceOfBirth;
    }
    public void setPlaceOfBirth(String x) {
        this.PlaceOfBirth = x;
    }

    public String getDateOfDeath() {
        return DateOfDeath;
    }

    public void setDateOfDeath(String x) {
        this.DateOfDeath = x;
    }

    public String getPlaceOfDeath() {
        return PlaceOfDeath;
    }
    public void setPlaceOfDeath(String x) {
        this.PlaceOfDeath = x;
    }

    public String getBiography() {
        return Biography;
    }
    public void setBiography(String x) {
        this.Biography = x;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "UserId", nullable = true)
    private User user;

}
