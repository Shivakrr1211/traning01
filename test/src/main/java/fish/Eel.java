package fish;

import fish.Fish;

public class Eel extends Fish {
    private String special;
    public Eel(){
        super();
        this.special = "Releases electric shock";

    }


    public String toString() {
        return "fish.Eel{" +
                "special='" + special + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                "} " + super.toString();
    }
}
