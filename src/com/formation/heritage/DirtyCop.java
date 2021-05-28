package com.formation.heritage;

public class DirtyCop extends Brigand implements Outlaw, PaleFace{

    private int nbKidnappedLadies = 0;
    private int catchReward = 200;

    public DirtyCop(String name) {
        super(name);
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
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
