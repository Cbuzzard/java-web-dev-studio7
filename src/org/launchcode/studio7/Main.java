package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD(500, .7, true);
        DVD dvd = new DVD(1600, 4.7, true);
        Record record = new Record(45, .5, true);

        cd.writeDisc();
        dvd.writeDisc();
        record.writeDisc();

        cd.spinDisc();
        dvd.spinDisc();
        record.spinDisc();

    }
}
