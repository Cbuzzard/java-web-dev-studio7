package org.launchcode.studio7;

public class CD extends BaseDisc{

    public CD(int rpm, double storageGb, boolean containsData) {
        super(rpm, storageGb, containsData);
    }

    @Override
    public void spinDisc() {
        this.startDisc();
        System.out.println("CD spins up to 500rpm");
    }

    @Override
    public void writeDisc() {
        if(this.isSpinning()) {
            System.out.println("CD uses laser to read contents.");
        } else {
            System.out.println("CD is not spinning");
        }
    }

    @Override
    public void readDisc() {
        if(this.isSpinning()) {
            System.out.println("CD uses laser to read contents.");
        } else {
            System.out.println("CD is not spinning");
        }
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
