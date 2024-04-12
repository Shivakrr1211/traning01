package org.example;

public class Iphone implements Phone, Ios{

    public String processor(){
        return "A15";
    }
    @Override
    public String spaceInGb(){
        return "256";
    }

    @Override
    public String airdrop() {
        return "copy and paste anywhere";
    }
}


