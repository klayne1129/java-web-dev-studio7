package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    String audio;
    String storageDataCapacity;
    String speed;
    String discInfo;

    public BaseDisc(String audio, String storageDataCapacity, String speed, String discInfo) {
        this.audio = audio;
        this.storageDataCapacity = storageDataCapacity;
        this.speed = speed;
        this.discInfo = discInfo;
    }

    public void spin(){
        System.out.println("I'm spinning at " + speed + ".");
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getStorageDataCapacity() {
        return storageDataCapacity;
    }

    public void setStorageDataCapacity(String storageDataCapacity) {
        this.storageDataCapacity = storageDataCapacity;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDiscInfo() {
        return discInfo;
    }

    public void setDiscInfo(String discInfo) {
        this.discInfo = discInfo;
    }
}
