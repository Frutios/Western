package com.formation.heritage.model;

public class Sherif extends Cowboy{

    private int nbBrigandArrested = 3;

    public Sherif(String name) {
        super(name);
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        speak(": Hey, j'ai coffré " + nbBrigandArrested +" brigands quand même !");
    }

    public void arrestBrigand(Outlaw outlaw) {
        speak(": Au nom de la loi, je vous arrête !");
        nbBrigandArrested = nbBrigandArrested +1;
    }

    public void searchForBrigand(Brigand brigand){
        System.out.println("Le shérif placarde une affiche dans toute la ville");
        speak(": OYEZ OYEZ BRAVE GENS !! 200 $ a` qui arretera " + brigand.getName() +" mort ou vif !");
    }

}
