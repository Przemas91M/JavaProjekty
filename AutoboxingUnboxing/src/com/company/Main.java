package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	String[] strArray = new String[10];
	int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>(); to nie zadziała - nie mozna tworzyc list z typami prymitywnymi
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>(); //jak stworzymy klase jak powyzej, to mozna uzywac jej jako inta
        intClassArrayList.add(new IntClass(54)); //tworzymy nowy obiekt o wartosci 54.

        //Java ma wbudowane klasy do kazdego typu prymitywnego:
        ArrayList<Integer> intArrayList = new ArrayList<Integer>(); //nie trzeba tworzyc klasy - autoboxing
        for (int i = 0; i < 10; i++) {  //wpisujemy wartosc 'i' do listy
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ---> " + intArrayList.get(i).intValue()); //pobieramy wartosci - unboxing
        }

        Integer myIntValue = 56; // mozna tez pojsc na skroty i tworzyc obiekt bezpośrednio bez słowa 'new'!
        //Integer.valueOf(56);  <--- to się wykonuje po wpisaniu powyższej instrukcji

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();// autoboxing
        for(double dbl = 0.0; dbl <=10.0; dbl +=0.5){
            myDoubleValues.add(Double.valueOf(dbl)); //mozna rowniez dodać samo .add(dbl) - tez zadziała
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue(); //mozna usunąć .doubleValue() - java zrobi to automatycznie
            System.out.println(i + " ---> " + value);
        }



    }
}
