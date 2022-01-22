package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double r;
        Circle1 k1 = new Circle1(3.1, 4.1, 5.1, "\u201c");
        System.out.println("Длина окружности = " + k1.getLength() + "см\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введитерадиус ");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getLength() + "см") ;
    }
}

class Circle1 {


    private double x;
    private double y;
    private double r;
    private String colour;

    public Circle1(double x, double y, double r, String colour) {
        this. x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;}

    public double getX() {
            return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
            return y;}

    public void setY(double y) {
            this.y = y;}

    public double getR() {
        return r;}

    public void setR(double r){
        this.r = r;}

    public String getColour() {
        return colour;}

    public void setColour(String colour) {
        this.colour = colour;}

    public double getLength() {
        double c;
        c = 2*Math.PI*r;
        return c;
    }


}
