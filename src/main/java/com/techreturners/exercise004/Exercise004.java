package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    public LocalDateTime givenDateTime;
    public long gigaSec = 1000000000;

    public Exercise004(LocalDate date) {
        givenDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        givenDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return givenDateTime.plusSeconds(gigaSec);
    }
}
