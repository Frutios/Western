package com.formation.heritage;

public class Brigand extends Human implements Outlaw, PaleFace{

    private String look = "voyou";
    private int nbKidnappedLadies = 0;
    private int catchReward = 400;
    private boolean inJail = false;


    public Brigand(String name){
        super(name,"gel hydro-alcoolique" );
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        speak(": J'ai l'air d'un "+ look +" et j'ai enlevé " + nbKidnappedLadies + " dames");
        speak(": Ma tête est mise à prix " + catchReward + "$ \n");
    }

    public void kidnap(Lady lady){
        speak("le " + look + " : Ah ah ! " + lady.getName() + ", tu es mienne desormais !");
        nbKidnappedLadies += 1;
        lady.kidnapped();
    }

    public void inJail(Cowboy cowboy){
        speak(" le " + look + " : Damned, je suis fait ! " + cowboy.getName());
    }

    public int getCatchReward() {
        return catchReward;
    }

    public void howMuchIsCatchReward(){
        speak(" le " + look + " : My catch reward is " + getCatchReward());
    }

    @Override
    public void scalped() {
        speak(" : Aïe ma tête !");
    }
}
