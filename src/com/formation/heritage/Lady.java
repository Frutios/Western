package com.formation.heritage;

public class Lady extends Human implements PaleFace {

    private String dressColor;
    private boolean free = true;

    public Lady(String name, String dressColor){
        super(name, "gin tonic");
        this.dressColor = dressColor;
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        speak(": Non mais vous avez vu ma MAGNIFIQUE robe " + dressColor + " ? \n");
    }

    public void free() {
        free = true;
        if (free == true){
            speak(": Merci cowboy");
        }
    }

    public void kidnapped(){
        free = false;
        if (free == false) {
            speak(": AHHHHHH !!!");
        }
    }

    public void changeDress(String newColor){
        dressColor = newColor;
        speak(": Regardez ma nouvelle robe " + newColor + " !");
    }

    @Override
    public void scalped() {
        speak(": Aïe ma tête !");
    }
}
