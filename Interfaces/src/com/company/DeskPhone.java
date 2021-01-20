package com.company;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //metody mozna generowac automatycznie
    @Override
    public void powerOn() {
        System.out.println("Desktop phone is always on!");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now calling: " + phoneNumber);
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
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring!!");
        }
        else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
