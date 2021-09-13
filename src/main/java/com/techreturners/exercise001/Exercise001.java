package com.techreturners.exercise001;

import java.util.List;
import java.util.Objects;


public class Exercise001 {
    public String capitalizeWord(String word) {
        String capStr = word.substring(0, 1).toUpperCase() + word.substring(1);
        return capStr;
    }

    public String generateInitials(String firstName, String lastName) {

       /* Using toUpperCase function on a character variable */

        Character fname = Character.toUpperCase(firstName.charAt(0));
        Character lname = Character.toUpperCase(lastName.charAt(0));
        String Initials = fname +"." + lname;
        return Initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        Double vat;
        vat = (vatRate * originalPrice)/100;
        Double finalPrice= originalPrice + vat;

        return Double.parseDouble(String.format("%.2f",finalPrice));
    }

    public String reverse(String sentence) {
        String reversedString = "";
        for(int i = sentence.length()-1; i>=0; i--){
            reversedString = reversedString + sentence.charAt(i);
        }
        return reversedString;
    }

    public int countLinuxUsers(List<User> users) {
        // if user type is Linux increment counter

        int counter = 0;

        // counter=Collections.frequency(users.type, "Linux");
        for(User usr:users) {
            String usrtype = usr.getType();
            if (usrtype.equals("Linux"))
                counter++;
        }
            return counter;
    }
}
