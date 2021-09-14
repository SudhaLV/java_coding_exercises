package com.techreturners.exercise002;

import com.techreturners.exercise001.User;

public class Exercise002 {

    public boolean isFromManchester(Person per) {

       /*     if (per.getCity().equals("Manchester"))
                return true;
            else
                return false;
         */

    return per.getCity().equals("Manchester");
    }

    public boolean canWatchFilm(Person per, int ageLimit) {

    /*    if(per.getAge() >= ageLimit)
            return true;
        else
            return false;

     */

        return per.getAge() >= ageLimit;
    }
    
}
