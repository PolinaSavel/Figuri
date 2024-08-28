package org.example.figuri;

public class Romb extends Figuri {

    public Romb(){
        romb1 = "rombisha";
    }

    String getName(){
        return romb1;
    }

    protected void displayName(){
        System.out.printf("Я фигура: %s\n" , getName() );

    }

}
