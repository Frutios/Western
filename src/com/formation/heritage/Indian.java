package com.formation.heritage;

public class Indian extends Human {

    private int feathersNumber = 23;
    private String totem = "coyote";

    public Indian(String name) {
        super(name,"jus de racine");
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        speak("J'ai " + feathersNumber + " plumes et mon totem est un " + totem + " Ugh");
    }

    public void scalp(PaleFace paleFace){
        speak(" Je t'ai scalpé Ugh !");
        feathersNumber = feathersNumber +1;
    }
}
