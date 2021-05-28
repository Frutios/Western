package com.formation.heritage;

import com.formation.heritage.model.*;

public class Main {

    public static void main(String[] args) {

        Lady lady = new Lady("Miss Jodie","rouge");
        Cowboy cowboy = new Cowboy("Cowboy John");
        Brigand brigand = new Brigand("Brigand Kévin");
        Barman barman = new Barman("Barman José", "Chez José");
        Sherif clint = new Sherif("Shérif Clint");
        CalamityJane cj = new CalamityJane("Calamity Jane", "noire");
        Indian indian = new Indian("Pedro l'indien");


        lady.introduceYourself();
        cowboy.introduceYourself();
        clint.introduceYourself();
        barman.introduceYourself();
        clint.speak(": Sers moi un " + clint.getFavoriteDrink());
        indian.speak(": Un " + indian.getFavoriteDrink() + " pour moi l'ami !");
        barman.speak(": Et un " + clint.getFavoriteDrink() +
                             " pour le shérif et un " + indian.getFavoriteDrink() + " pour toi Pedro");
        System.out.println(brigand.getName() + " et " + cj.getName() + " entrent " + barman.getBarName());
        brigand.introduceYourself();
        cj.introduceYourself();


    }
}
