package com.codedifferently.boxing;

import com.codedifferently.boxing.boxers.Boxer;
import com.codedifferently.boxing.boxers.HeavyWeight;
import com.codedifferently.boxing.boxers.LightWeight;

public class Game {

    public static Boolean punch(Boxer a , Boxer b){
        System.out.println(a.getName() + " throws punch");
        a.attack(b);
        Integer checkBoxer2Stamina = b.getStamina();
        if(checkBoxer2Stamina <= 0){
            System.out.println(b.getName() + " got knocked out");
            return false;
        } else {
            System.out.println(b.getName() + " is still standing");
            return true;
        }
    }

    public static void main(String[] args) {
        HeavyWeight boxer1 = new HeavyWeight("Tariq");
        LightWeight boxer2 = new LightWeight("Myke");
        Boolean flag = true;
        while(flag){
            flag = punch(boxer1, boxer2);
            if(!flag)
                continue;
            flag = punch(boxer2, boxer1);
        }
    }
}
