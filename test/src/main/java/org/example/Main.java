package org.example;

public class Main {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        String p = phone.processor();
        System.out.println(p);
        System.out.println(phone.spaceInGb());
        System.out.println(phone.whatsapp());


    }

}

