package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD myCd = new CD("loud","small","slow","I'm a Riveting Audio CD.");
        DVD  myDvd = new DVD("Quiet","Large","fast","I'm a boring DVD.","Mimes");
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCd.readData();
        myDvd.spin();

    }
}
