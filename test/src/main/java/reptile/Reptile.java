package reptile;

import animal.Animal;

public class Reptile extends Animal {
    protected String skin, egg;
    protected boolean backbone;

    public Reptile(){
        heightInFeet = 5;
        weightInKilos = 20;
        animalType = "reptile.Reptile";
        bloodType = "cold";
        this.skin = "Dry Skin";
        this.backbone = true;
        this .egg = "Soft Shelled";

    }


    public String toString(){
        return "reptile.Reptile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                "} " + super.toString();
    }
}
