package com.formation.heritage;

public class Barman extends Human {

    private String barName;

    public Barman(String name, String barName){
        super(name,"vin");
        this.barName = barName;
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        speak(": Bienvenue " + barName + ". Je vous sers un verre Coco? \n");
    }

    public String getBarName() {
        return barName;
    }

    public void serve(){
        speak(" : Je sais que toi tu tournes au "+ getFavoriteDrink() +", tiens !");
    }
}
