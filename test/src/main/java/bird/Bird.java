package bird;

import animal.Animal;

public class Bird extends Animal {
    protected boolean feather;
    protected boolean canFly;

    public Bird(){
        this.feather = true;
        this.canFly = true;
    }


    @Override
    public String toString() {
        return "Bird{" +
                "feather=" + feather +
                ", canFly=" + canFly +
                "} " + super.toString();
    }
}
