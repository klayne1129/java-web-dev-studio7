package org.launchcode.studio7;

public class DVD extends BaseDisc {
    String video;

    public DVD(String audio, String storageDataCapacity, String speed, String discInfo, String video) {
        super(audio, storageDataCapacity, speed, discInfo);
        this.video = video;
    }
    // TODO: Implement your custom interface.

    @Override
    public void readData() {
        System.out.println("I am reading" +audio+ " data" + video+  " data.");
    }

    @Override
    public void writeData(String aData) {
        this.video = aData;
        System.out.println("I am writing" +aData+ ".");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
