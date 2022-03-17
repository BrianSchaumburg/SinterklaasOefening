package domain;

import java.time.LocalDate;

public interface VervalbaarObject {
    void setVervaldatum(LocalDate vervaaldatum);
    LocalDate getVervaldatum();
    boolean vervallen();
}
