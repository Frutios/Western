package com.formation.heritage;

public class Cowboy extends Human implements PaleFace{

    private int popularity = 0;
    private String trait = "vaillant";

    public Cowboy(String name){
        super(name, "whiskey");
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        speak(": On dit de moi que je suis " + trait + ", ma popularité est de " + popularity + " points \n");
    }

    public void free(Lady lady){
        speak(": Vous êtes libre gente dame !");
        this.popularity =+ 1;
        lady.free();
    }

    public void shootOn(Brigand brigand){
        System.out.println("Le " + this.trait + " " + getName() + " tire sur " + brigand.getName() + ". PAN !");
        speak(": Prends ça, rascal !");
    }

    @Override
    public void scalped() {
        speak(": Aïe ma tête !");
    }
}
