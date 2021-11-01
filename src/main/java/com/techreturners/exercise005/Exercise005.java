package com.techreturners.exercise005;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Exercise005 {

    public boolean isPangram(String input) {

        boolean isPangram = TRUE;
        int[] check = new int[26];
        String str = input.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != 36 && str.charAt(i) >= 97 && str.charAt(i) <= 122)
            {
                check[str.charAt(i) - 97] = 1;
            }
        }

        for(int i = 0; i < 26; i++)
        {
            if(check[i] != 1)
            {
                isPangram = FALSE;
            }
        }

        return isPangram;
    }

}
