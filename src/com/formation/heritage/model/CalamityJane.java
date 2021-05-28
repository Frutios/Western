package com.formation.heritage.model;

public class CalamityJane extends Lady implements Outlaw, PaleFace{

    private int nbKidnappedLadies = 0;
    private int catchReward = 300;

    public CalamityJane(String name, String dressColor) {
        super(name, dressColor);
    }

    @Override
    public void inJail(Cowboy cowboy) {
        speak(" : Damned, je suis fait ! " + cowboy.getName() + "");
    }

    @Override
    public void kidnap(Lady lady) {
        speak("  : Ah ah ! " + lady.getName() + ", tu es mienne desormais !");
        nbKidnappedLadies = nbKidnappedLadies + 1;

    }

    @Override
    public void howMuchIsCatchReward() {
        speak(" :  ma tête est mise à prix à " + catchReward);
    }
}
