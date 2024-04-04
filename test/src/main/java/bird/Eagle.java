package bird;

import bird.Bird;

public class Eagle extends Bird {


    public String toString() {
        return "bird.Eagle{" +
                "feather=" + feather +
                ", canFly=" + canFly +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                "} " + super.toString();
    }
}
