/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area of " + circle.getName() + ": " + circle.getArea());

        Square square = new Square(5);
        System.out.println("Area of " + square.getName() + ": " + square.getArea());
    }
}