package org.example;

public class SamsungPhone  implements Phone, Android{
    public String processor(){
        return "sd888";
    }
    public String spaceInGb(){
        return "256";
    }


    @Override
    public String whatsapp() {
        return "send messages for free ";
    }
}
