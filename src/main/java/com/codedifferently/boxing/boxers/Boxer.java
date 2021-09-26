package com.codedifferently.boxing.boxers;

import java.util.Random;

public abstract class Boxer {

    private String name;
    private Integer stamina;
    private Integer strike;

    public String getName() {
        return name;
    }

    public Integer getStamina() {
        return stamina;
    }

    public Integer getStrike() {
        return strike;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public void setStrike(Integer strike) {
        this.strike = strike;
    }

    public void attack(Boxer opponent){
       Integer getStamina = opponent.getStamina();
       Random random = new Random();
       Integer strikePower = random.nextInt(strike)  + 1;
       getStamina -= strikePower;
       opponent.setStamina(getStamina);
    }
}
