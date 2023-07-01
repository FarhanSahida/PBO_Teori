/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11;

/**
 *
 * @author Ideapad 3 14ITL6
 */
public class Student extends Person{
    public Student(){
    super();
    super.name = "Anna";
    super.address = "Padang";
    //memanggil super class
    System.out.println("Inside Student:Constructor");
    }
    //beberapa kode di sini
    @Override
    public String getName(){
    System.out.println("Student: getName");
    return name;
    }

    public static void main(String[] args){
        Student anna = new Student();
        System.out.println("Nama        :"+anna.name);
        System.out.println("Alamat      :"+anna.address);
    }
}
