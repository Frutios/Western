package com.formation.heritage;

public class Human {

    private final String name;
    private String favoriteDrink;

    public Human(String name) {
        this.name = name;
        this.favoriteDrink = "water";

    }

    public Human(String name, String favoriteDrink) {
        this.name = name;
        this.favoriteDrink = favoriteDrink;
    }

    public void speak(String sentence){
        System.out.println(" - " + this.name+ " " + sentence);
    }

    public void introduceYourself(){
        speak(": Bonjour, je suis " + this.name + ", j'aime le " + this.favoriteDrink + " !");
    }

    public String getName() {
        return name;
    }

    public String getFavoriteDrink(){
        return favoriteDrink;
    }
}
