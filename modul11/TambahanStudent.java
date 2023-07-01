/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11;

/**
 *
 * @author Ideapad 3 14ITL6
 */
public class TambahanStudent {
    public static void main(String[] args) {
        // Membuat objek ComputerScienceStudent
        Contoh student = new Contoh("Farhan Sahida", "Wonogiri", 18, "Java", 2);

        // Mengatur nilai-nilai lainnya
        student.setMathGrade(90);
        student.setEnglishGrade(90);
        student.setScienceGrade(89);

        // Menampilkan informasi siswa
        student.print("Additional Information");

        // Menampilkan rata-rata nilai
        System.out.println("Average Grade:      " + student.getAverage());

        // Menampilkan jumlah total siswa
        System.out.println("Student Count:      " + StudentRecord.getStudentCount());
}
}
