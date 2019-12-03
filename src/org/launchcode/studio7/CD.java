package org.launchcode.studio7;

public class CD extends BaseDisc {

    // TODO: Implement your custom interface.

    public CD(String audio, String storageDataCapacity, String speed, String discInfo) {
        super(audio, storageDataCapacity, speed, discInfo);
    }

    @Override
    public void readData() {
        System.out.println("I am reading" +audio+ ".");
    }

    @Override
    public void writeData(String aData) {
        this.audio = aData;
        System.out.println("I am writing" +aData+ ".");

    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
