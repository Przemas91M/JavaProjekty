package com.company;
//tutaj tylko definiuję nazwy funkcji przypisanych do interfejsu
public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
