package com.techreturners.exercise001;

import java.util.List;
import java.util.Objects;


public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {

       /* Using toUpperCase function on a character variable */
        return Character.toUpperCase(firstName.charAt(0)) +"." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {

        Double finalPrice= originalPrice + (vatRate * originalPrice)/100;
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
