package com.example;

import java.util.List;
//.
public class Lion {

    boolean hasMane;
    private FelineGetKittens felineGetKittens;  // шаг 2 DI. Создали в классе Lion приватное поле типа FelineGetKittens
    private FelineGetFood felineGetFood;         // шаг 2 DI. Создали в классе Lion приватное поле типа FelineGetFood


    public Lion(String sex, FelineGetKittens felineGetKittens, FelineGetFood felineGetFood) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.felineGetKittens = felineGetKittens;
        this.felineGetFood = felineGetFood;

    }

   // Feline feline = new Feline();

    public int getKittens() {
        return felineGetKittens.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }



    public List<String> getFood() throws Exception {
        return felineGetFood.getFood("Хищник");
    }
}
