package org.example;

public class Main {
    public static void main(String[] args) {
        EnumSample enumSample = EnumSample.getEnumFromValue(107);
        System.out.println(enumSample.getComment());

        EnumSampleOverride mondayOverride = EnumSampleOverride.MONDAY;
        mondayOverride.getDummy();

        EnumSampleOverride fridayOverride = EnumSampleOverride.FRIDAY;
        fridayOverride.getDummy();
        fridayOverride.dummyAbstract();
        System.out.println(fridayOverride.toLowerCase());
    }
}