package com.jjeun.squaretriangularnumbertest;
import java.util.*;

/**
 * Created by Jesse on 1/17/2018.
 */

public class CheckNumberType {

    public boolean checkTriangular(int number){

        int x = 1;
        int triangularNumber = 1;

        while (triangularNumber < number) {
            x++;
            triangularNumber += x;
        }

        if (triangularNumber == number) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkSquare(int number){

        double squareRoot = Math.sqrt(number);

        if (Math.floor(squareRoot) == squareRoot) {
            return true;
        }
        else {
            return false;
        }
    }
}
