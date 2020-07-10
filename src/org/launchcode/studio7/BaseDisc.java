package org.launchcode.studio7;

public abstract class BaseDisc implements Disc{

    private int rpm;
    private double storageGb;
    private boolean isSpinning = false;
    private boolean containsData;

    public BaseDisc(int rpm, double storageGb, boolean containsData) {
        this.rpm = rpm;
        this.storageGb = storageGb;
        this.containsData = containsData;
    }

    public void stopDisc() {
        this.isSpinning = false;
    }

    public void startDisc() {
        this.isSpinning = true;
    }

    public int getRpm() {
        return rpm;
    }

    public double getStorageGb() {
        return storageGb;
    }

    public boolean containsData() {
        return containsData;
    }

    public boolean isSpinning() {
        return isSpinning;
    }

    public void wipeDisc() {
        this.containsData = false;
    }
}
