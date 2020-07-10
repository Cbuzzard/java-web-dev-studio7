package org.launchcode.studio7;

public class Record extends BaseDisc{

    public Record(int rpm, double storageGb, boolean containsData) {
        super(rpm, storageGb, containsData);
    }

    @Override
    public void spinDisc() {
        this.startDisc();
        System.out.println("Record spins up to 45rpm");
    }

    @Override
    public void writeDisc() {
        if(!this.containsData()) {
            System.out.println("Information is pressed onto Record");
        } else {
            System.out.println("Record has already been pressed");
        }
    }

    @Override
    public void readDisc() {
        if(this.isSpinning()) {
            System.out.println("Needle is placed onto record groove");
        } else {
            System.out.println("Record is not spinning");
        }
    }
}
