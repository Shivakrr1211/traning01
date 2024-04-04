package reptile;

import reptile.Reptile;

public class Crocodile extends Reptile {
    public Crocodile(){
        super();
       egg = "Hard Shelled";

    }


    public String toString() {
        return "reptile.Crocodile{" +
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
