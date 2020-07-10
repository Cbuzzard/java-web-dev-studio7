package org.launchcode.studio7;

public class DVD extends BaseDisc {

    public DVD(int rpm, double storageGb, boolean containsData) {
        super(rpm, storageGb, containsData);
    }

    @Override
    public void spinDisc() {
        this.startDisc();
        System.out.println("DVD spins up to 1600rpm");
    }

    @Override
    public void writeDisc() {
        if(this.isSpinning()) {
            System.out.println("DVD uses laser to read contents.");
        } else {
            System.out.println("DVD is not spinning");
        }
    }

    @Override
    public void readDisc() {
        if(this.isSpinning()) {
            System.out.println("DVD uses laser to read contents.");
        } else {
            System.out.println("DVD is not spinning");
        }
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
