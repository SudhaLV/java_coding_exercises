package com.techreturners.exercise003;

import java.util.*;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        
        int key = 0;
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Raspberry Ripple");  //Put elements in Map
        map.put(2,"Pistachio");
        map.put(4,"Vanilla");
        map.put(3,"Mint Chocolate Chip");
        map.put(5,"Mango Sorbet");
        map.put(6,"Chocolate");

        for(Map.Entry m : map.entrySet()) {
            if(m.getValue().equals(iceCreamFlavour)) {
                key = (int) m.getKey();
            }
        }
    return  key;
    }

    String[] iceCreamFlavours() {

        String[] Flavours = new String[6];
        int i=0;
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
         //Put elements in Map
        map.put(1,"Pistachio");
        map.put(2,"Raspberry Ripple");
        map.put(3,"Vanilla");
        map.put(4,"Mint Chocolate Chip");
        map.put(5,"Chocolate");
        map.put(6,"Mango Sorbet");

        for(Map.Entry m : map.entrySet()) {
            Flavours[i] = (String) m.getValue();
            i++;
        }
    return Flavours;
    }

}
