package com.company;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false ;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //metody mozna generowac automatycznie
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Phone is powering up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now calling: " + phoneNumber);
        } else {
            System.out.println("Phone is switched off!");
        }

    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the phone");
            isRinging = false;
        } else {
            System.out.println("Phone is not ringing!");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody playing");
        }
        else {
            isRinging = false;
            System.out.println("Phone is off or number is different!");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
