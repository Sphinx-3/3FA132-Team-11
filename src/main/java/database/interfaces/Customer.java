package database.interfaces;

import java.time.LocalDate;


    enum Gender{
        D,M,U,W
    }

public interface Customer {

    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setBirthDate(LocalDate birthDate);
    void setGender(Gender gender);

    String getFirstName();
    String getLastName();
    LocalDate getBirthDate();
    Gender getGender();
}
