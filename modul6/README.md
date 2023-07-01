MODUL BAB 6
Struktur Kontrol 

///

import javax.swing.JOptionPane;

public class LatihanModul6_1BufferedReader {

    public static void main( String[] args ){ 
        String name = "";
        name = 
        JOptionPane.showInputDialog("Please enter your name");
        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}

Program di atas adalah program sederhana yang meminta pengguna untuk memasukkan nama mereka menggunakan input dialog dari JOptionPane. Setelah pengguna memasukkan namanya, program akan menampilkan pesan sapaan "Hello" dengan nama pengguna yang dimasukkan sebelumnya menggunakan dialog dari JOptionPane.

Baris pertama program mengimpor kelas JOptionPane dari paket javax.swing.
Baris kedua mendefinisikan kelas "LatihanModul6_1BufferedReader".
Baris ketiga mendefinisikan metode "main".
Baris keempat mendeklarasikan variabel "name" sebagai String dan memberinya nilai kosong ("").
Baris kelima menggunakan JOptionPane untuk menampilkan dialog input yang meminta pengguna untuk memasukkan nama mereka dan nilai yang dimasukkan akan disimpan ke dalam variabel "name".
Baris keenam mendefinisikan variabel "msg" sebagai String dan menggabungkan nilai "Hello" dengan nilai variabel "name".
Baris terakhir menggunakan JOptionPane untuk menampilkan dialog pesan sapaan dengan isi pesan yang disimpan dalam variabel "msg" yang telah dibuat sebelumnya.

///

import javax.swing.JOptionPane;

public class LatihanModul6_1JOptionPane {

    public static void main(String[]args)
        {
        int a=0;
        int b=0;
        int c=0;
        int rata=0;

        String input1="";
        String input2="";
        String input3="";
        String hasil="";
        String senyum="";

        input1=JOptionPane.showInputDialog("Nilai1:" );
        input2=JOptionPane.showInputDialog("Nilai2:" );
        input3=JOptionPane.showInputDialog("Nilai3:" );

        a=Integer.parseInt(input1);
        b=Integer.parseInt(input2);
        c=Integer.parseInt(input3);

        rata=(a+b+c)/3;

        if(rata>60){
        senyum=":D";
        }else
        senyum=":)";

        hasil +=(hasil)+(" Menghitung Rata-rata")+"\n";
        hasil +="\n";
        hasil +="Nilai 1:"+Integer.toString(a)+"\n";
        hasil +="Nilai 2:"+Integer.toString(b)+"\n";
        hasil +="Nilai 3:"+Integer.toString(c)+"\n";

        hasil +="\n";
        hasil +="Hasil Rata-rata= "+Integer.toString(rata)+"\n"+"\n"+"\n";
        JOptionPane.showMessageDialog(null,hasil+"Ekspresi"+" "+senyum);
        }
}

Kodingan di atas merupakan program untuk menghitung rata-rata dari tiga nilai yang diinputkan oleh user menggunakan JOptionPane.

Pada awal program, tiga variabel untuk menyimpan input dari user diinisialisasi dengan nilai awal 0. Kemudian, tiga string untuk menyimpan input dari user juga diinisialisasi dengan string kosong.

Setelah itu, masing-masing string input dari user ditampilkan pada dialog box menggunakan JOptionPane.showInputDialog(). Kemudian, ketiga input tersebut diubah dari tipe data string menjadi integer menggunakan Integer.parseInt() dan disimpan ke dalam variabel masing-masing.

Setelah tiga input dikonversi ke tipe data integer, program menghitung rata-rata dari tiga nilai tersebut dan menyimpannya dalam variabel rata.

Selanjutnya, program membandingkan nilai rata-rata dengan 60. Jika nilai rata-rata lebih besar dari 60, variabel senyum diisi dengan ":D". Jika tidak, variabel senyum diisi dengan ":)".

Terakhir, program membangun sebuah string pesan yang berisi nilai dari ketiga input, nilai rata-rata, dan ekspresi senyum. String tersebut ditampilkan pada dialog box menggunakan JOptionPane.showMessageDialog().

///

import javax.swing.JOptionPane;

public class LatihanModul6_2ifelse {

    public static void main(String[]args){
            String angka="";
            angka=JOptionPane.showInputDialog("Silahkan masukkan angka ");
            int z = Integer.valueOf(angka).intValue();

            String hasil ="";
            if (z>=1&&z<=10){
             hasil += "Valid number";
            }
            else{
             hasil += "Invalid Number";
            }
           JOptionPane.showMessageDialog(null, hasil);
           }
}

Kode di atas merupakan contoh program Java yang menggunakan JOptionPane untuk meminta input dari pengguna. Program akan menampilkan dialog input box untuk meminta pengguna memasukkan sebuah angka. Setelah pengguna memasukkan angka, program akan memeriksa apakah angka tersebut berada dalam rentang 1 hingga 10 menggunakan struktur percabangan if-else.

Jika angka yang dimasukkan berada dalam rentang 1 hingga 10, maka program akan menampilkan pesan "Valid number". Namun jika angka tidak berada dalam rentang tersebut, maka program akan menampilkan pesan "Invalid number". Hasil dari pengecekan tersebut akan ditampilkan pada sebuah dialog box menggunakan JOptionPane.

///

import javax.swing.JOptionPane;

public class LatihanModul6_2switch {

    public static void main(String[]args){
        String angka="";
        angka=JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int z = Integer.valueOf(angka).intValue();

        String hasil="";
        switch(z){
        case 1: hasil+= "Valid Number"; break;
        case 2: hasil+= "Valid Number"; break;
        case 3: hasil+= "Valid Number"; break;
        case 4: hasil+= "Valid Number"; break;
        case 5: hasil+= "Valid Number"; break;
        case 6: hasil+= "Valid Number"; break;
        case 7: hasil+= "Valid Number"; break;
        case 8: hasil+= "Valid Number"; break;
        case 9: hasil+= "Valid Number"; break;
        case 10: hasil+= "Valid Number"; break;
        default: hasil+= "Invalid Number"; break;
        }
       JOptionPane.showMessageDialog(null, hasil);
       }
}

Kode di atas merupakan program Java yang menggunakan statement switch-case untuk mengecek apakah sebuah angka yang dimasukkan valid atau tidak. Program meminta pengguna untuk memasukkan sebuah angka melalui JOptionPane. Kemudian angka tersebut diubah menjadi integer dengan menggunakan metode Integer.valueOf(). Angka yang dimasukkan kemudian akan diperiksa apakah termasuk dalam rentang 1 hingga 10 dengan menggunakan statement switch-case. Jika angka tersebut termasuk dalam rentang tersebut, maka program akan mengeluarkan output "Valid Number", jika tidak maka output yang dihasilkan adalah "Invalid Number". Output ditampilkan menggunakan JOptionPane.

///
public class LatihanModul6_3dowhile {

    public static void main(String args[]){
            int r = 0;
            do {
             System.out.println("Melida Sari");
             r++;
             } while (r<100);
            }  
}

Kodingan tersebut merupakan contoh penggunaan perulangan do-while dalam bahasa pemrograman Java. Program akan mengeksekusi perintah pada blok kode di dalam do setidaknya satu kali, bahkan jika kondisi di dalam while tidak terpenuhi.

Pada kodingan di atas, program akan mencetak string "Melida Sari" dan menambahkan nilai variabel r sebanyak 1 setiap kali perulangan dilakukan. Perulangan akan terus dilakukan selama nilai variabel r kurang dari 100. Oleh karena itu, string "Melida Sari" akan dicetak sebanyak 100 kali pada output program.

///
public class LatihanModul6_3forloop {

     public static void main(String args[]){
            int r;
            for (r=0; r<100; r++){
            System.out.println("Melida Sari"); 
            }
            }
}

Kodingan di atas merupakan contoh penggunaan perulangan for loop dalam bahasa pemrograman Java. Pada program tersebut, sebuah variabel r dengan tipe data integer dideklarasikan terlebih dahulu, kemudian perulangan for digunakan untuk mencetak pesan "Melida Sari" sebanyak 100 kali. Pada setiap iterasi, variabel r akan ditambahkan nilai 1 dan perulangan akan terus berlanjut selama variabel r kurang dari 100.

///

public class LatihanModul6_3whileloop {

    public static void main(String args[]){
            int r=0;
            while (r<100){
             System.out.println("Melida Sari");
             r++;
            }
           }
}

Kode di atas adalah contoh program Java untuk menampilkan pesan "Melida Sari" sebanyak 100 kali menggunakan perulangan while loop. Pertama, variabel r diinisialisasi dengan nilai awal 0. Kemudian, while loop diterapkan untuk mencetak pesan "Melida Sari" sebanyak 100 kali selama nilai r kurang dari 100. Setiap kali loop dieksekusi, nilai variabel r ditingkatkan dengan 1. Proses ini akan terus berlanjut hingga nilai r mencapai 100, saat itu loop akan berhenti dan program akan selesai.

///

import java.util.Scanner;

public class LatihanModul6_4dowhile {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukkan angka : ");
    int angka = input.nextInt();
    System.out.println("masukkan pangkat : ");
    int pangkat = input.nextInt();

    int i = 1;
    int h = 1;

    do {
    h = h*angka;
    i++ ;
    }while(i<pangkat);
    System.out.println(angka +" ^ " + pangkat + " = " +h);
   }
}

Program di atas merupakan program yang menghitung pangkat dari sebuah bilangan. Program ini menggunakan perulangan do-while yang akan mengulang sebanyak pangkat yang dimasukkan oleh pengguna.

Pada awal program, terdapat perintah untuk menginputkan bilangan yang akan dipangkatkan dan pangkat yang diinginkan oleh pengguna menggunakan Scanner. Selanjutnya, variabel i dan h diinisialisasi dengan nilai 1.

Kemudian, perulangan do-while dilakukan untuk menghitung hasil pangkat. Pada setiap iterasi perulangan, variabel h akan dikalikan dengan bilangan yang dimasukkan oleh pengguna, sedangkan variabel i akan diincrement. Perulangan akan dilakukan selama variabel i kurang dari pangkat yang dimasukkan oleh pengguna.

Setelah perulangan selesai dilakukan, program akan menampilkan hasil pangkat dari bilangan yang dimasukkan oleh pengguna dengan menggunakan statement System.out.println().

///

import java.util.Scanner;

public class LatihanModul6_4forloop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int nilai = input.nextInt();
        System.out.println("masukkan pangkat : ");
        int pkt = input.nextInt();

        int h = 1;

        for (int i = 1; i < pkt;i++){
        h = h * nilai;
        }
        System.out.println(nilai+ " ^ " + pkt + " = " +h);
         }
}

Program di atas merupakan program Java yang menghitung nilai suatu bilangan yang dipangkatkan dengan bilangan tertentu menggunakan loop for.

Program meminta pengguna untuk memasukkan dua angka yaitu nilai bilangan dan pangkatnya menggunakan objek Scanner. Kemudian, variabel h diinisialisasi dengan 1, dan loop for dijalankan dari 1 hingga nilai pangkat dikurangi 1. Di setiap iterasi, nilai h akan dikalikan dengan nilai bilangan. Setelah loop selesai dijalankan, program akan mencetak hasil dari nilai bilangan yang dipangkatkan dengan bilangan tertentu yang dimasukkan oleh pengguna.

///

import java.util.Scanner;

public class LatihanModul6_4whileloop {

    public static void main(String[] args) {
            Scanner b = new Scanner(System.in);
            System.out.println("masukkan angka : ");
            int input = b.nextInt();

            System.out.println("masukkan pangkat : ");
            int pangkat = b.nextInt();

            int i = 1;
            int h = 1;

            while (i<pangkat){
            h = h*input;
            i++;
            }
            System.out.println(input + " ^ " +pangkat +" = " +h);
            }
}

Kode di atas merupakan program Java untuk menghitung hasil perpangkatan dari sebuah bilangan bulat dan pangkat yang dimasukkan oleh pengguna menggunakan loop while.

Pertama, program meminta pengguna untuk memasukkan bilangan bulat dan pangkatnya menggunakan objek Scanner.

Selanjutnya, program melakukan inisialisasi variabel i dan h dengan nilai 1. Variabel i digunakan sebagai counter untuk loop while, sedangkan variabel h menyimpan hasil perpangkatan.

Kemudian, program masuk ke loop while yang akan berjalan selama nilai variabel i kurang dari nilai pangkat yang dimasukkan oleh pengguna. Pada setiap iterasi, variabel h akan dikalikan dengan bilangan bulat yang dimasukkan oleh pengguna. Setelah itu, nilai variabel i akan ditingkatkan sebesar 1.

Setelah loop selesai, program akan mencetak hasil perpangkatan bilangan bulat dan pangkat yang dimasukkan oleh pengguna menggunakan metode println dari objek System.out.


fungsi import javax.swing.JOptionPane;
"javax.swing.JOptionPane" adalah kelas yang ada di Java API, yang digunakan untuk menampilkan dialog box pada aplikasi Java. Dialog box dapat digunakan untuk meminta input dari pengguna, menampilkan pesan, dan mengambil keputusan dari pengguna.

Untuk menggunakan kelas JOptionPane, perlu dilakukan import pada awal file Java, seperti contoh berikut:
import javax.swing.JOptionPane;

public class ContohDialogBox {
   public static void main(String[] args) {
      String nama = JOptionPane.showInputDialog("Masukkan nama Anda: ");
      JOptionPane.showMessageDialog(null, "Halo " + nama + "!");
   }
}
Dalam contoh di atas, kelas JOptionPane digunakan untuk menampilkan dialog box input (showInputDialog) untuk meminta pengguna untuk memasukkan nama, dan dialog box pesan (showMessageDialog) untuk menampilkan pesan yang menyapa pengguna.

/// Struktur Kontrol Keputusan 
1. Statement if
Statement-if menentukan sebuah statement (atau blok kode) yang akan dieksekusi jika 
dan hanya jika persyaratan boolean (boolean statement) bernilai true. 
"Statement if" adalah salah satu struktur kontrol pada bahasa pemrograman Java yang digunakan untuk melakukan pengujian kondisi atau ekspresi boolean. Dalam Java, if statement digunakan untuk mengevaluasi kondisi atau ekspresi boolean dan menjalankan blok kode tertentu jika kondisi tersebut benar.

Contoh penggunaan dari statement if di Java adalah sebagai berikut:
int x = 5;

if (x > 0) {
   System.out.println("x adalah bilangan positif");
}
Dalam contoh di atas, jika nilai variabel x lebih besar dari 0, maka statement "x adalah bilangan positif" akan dicetak di konsol. Namun jika nilai x kurang dari atau sama dengan 0, maka statement tersebut tidak akan dicetak.


2. Statement if-else
Statement if-else digunakan apabila kita ingin mengeksekusi sebuah statement dengan 
kondisi true dan statement yang lain dengan kondisi false. 

"Statement if-else" adalah struktur kontrol pada bahasa pemrograman Java yang digunakan untuk menguji kondisi atau ekspresi boolean dan melakukan tindakan yang berbeda tergantung pada hasil evaluasi kondisi tersebut.

Dalam Java, statement if-else menggunakan sintaks berikut:
if (kondisi) {
    // blok kode yang dijalankan jika kondisi benar
} else {
    // blok kode yang dijalankan jika kondisi salah
}
Contoh penggunaan dari statement if-else di Java adalah sebagai berikut:
int x = 5;

if (x > 0) {
   System.out.println("x adalah bilangan positif");
} else {
   System.out.println("x adalah bilangan negatif atau nol");
}
Dalam contoh di atas, jika nilai variabel x lebih besar dari 0, maka statement "x adalah bilangan positif" akan dicetak di konsol. Namun jika nilai x kurang dari atau sama dengan 0, maka statement "x adalah bilangan negatif atau nol" akan dicetak.


3. Statement if-else-if
"Statement if-else-if" adalah struktur kontrol pada bahasa pemrograman Java yang digunakan untuk mengevaluasi beberapa kondisi atau ekspresi boolean dan menjalankan tindakan yang berbeda tergantung pada hasil evaluasi kondisi tersebut.

Dalam Java, statement if-else-if menggunakan sintaks berikut:
if (kondisi1) {
    // blok kode yang dijalankan jika kondisi1 benar
} else if (kondisi2) {
    // blok kode yang dijalankan jika kondisi2 benar
} else if (kondisi3) {
    // blok kode yang dijalankan jika kondisi3 benar
} else {
    // blok kode yang dijalankan jika tidak ada kondisi yang benar
}
Contoh penggunaan dari statement if-else-if di Java adalah sebagai berikut:
int x = 5;

if (x > 0) {
   System.out.println("x adalah bilangan positif");
} else if (x < 0) {
   System.out.println("x adalah bilangan negatif");
} else {
   System.out.println("x adalah nol");
}
Dalam contoh di atas, jika nilai variabel x lebih besar dari 0, maka statement "x adalah bilangan positif" akan dicetak di konsol. Namun jika nilai x kurang dari 0, maka statement "x adalah bilangan negatif" akan dicetak. Jika nilai x adalah 0, maka statement "x adalah nol" akan dicetak.

Dalam multiple else-if blocks, blok kode yang dijalankan pertama kali adalah yang sesuai dengan kondisi pertama yang benar. Jika tidak ada kondisi yang benar, maka blok kode yang dijalankan adalah blok terakhir dalam else block.


4. Statement switch 
Cara lain untuk membuat percabangan adalah dengan menggunakan kata kunci switch. 
Dengan menggunakan switch kita bisa melakukan percabangan dengan persyaratan 
yang beragam.
"Statement switch" adalah struktur kontrol pada bahasa pemrograman Java yang digunakan untuk mengevaluasi ekspresi atau nilai dan menjalankan blok kode tertentu tergantung pada nilai tersebut.
Contoh penggunaan dari statement switch di Java adalah sebagai berikut:
int nilai = 3;

switch (nilai) {
   case 1:
      System.out.println("Nilai Anda adalah 1");
      break;
   case 2:
      System.out.println("Nilai Anda adalah 2");
      break;
   case 3:
      System.out.println("Nilai Anda adalah 3");
      break;
   default:
      System.out.println("Nilai Anda tidak sesuai");
}
Dalam contoh di atas, ekspresi nilai adalah variabel integer "nilai" yang memiliki nilai 3. Karena nilai tersebut sama dengan case ketiga dalam switch statement, maka blok kode "Nilai Anda adalah 3" akan dicetak di konsol.

Jika nilai tidak sama dengan case mana pun dalam switch statement, maka blok kode dalam default statement akan dijalankan.

Penting untuk dicatat bahwa setiap blok kode case harus diakhiri dengan break statement, untuk menghentikan switch statement setelah case yang cocok ditemukan. Jika tidak ada break statement, maka switch statement akan terus dievaluasi hingga akhir atau hingga ditemukan break statement.



///Struktur Kontrol Perulangan

1. while loop
Statement while loop adalah statement atau blok statement yang diulang-ulang sampai 
mencapai kondisi yang cocok. 
"While loop" adalah struktur pengulangan pada bahasa pemrograman Java yang digunakan untuk mengeksekusi blok kode secara berulang selama kondisi yang diberikan masih terpenuhi atau bernilai true.
Contoh penggunaan dari while loop di Java adalah sebagai berikut:
int i = 0;

while (i < 5) {
   System.out.println("Nilai i adalah " + i);
   i++;
}
Dalam contoh di atas, nilai variabel i akan dicetak di konsol selama nilai i kurang dari 5. Setiap kali blok kode dalam while loop dieksekusi, nilai i akan bertambah 1, sehingga loop akan berhenti saat nilai i mencapai 5.

Kondisi dalam while loop harus dievaluasi sebagai boolean. Jika kondisi awal bernilai false, maka blok kode dalam while loop tidak akan pernah dieksekusi. Jika kondisi selalu bernilai true, maka while loop akan berjalan secara tak terbatas, yang disebut sebagai "infinite loop". Oleh karena itu, pastikan bahwa kondisi yang diberikan akhirnya akan bernilai false setelah beberapa iterasi.


2. do-while loop 
Do-while loop mirip dengan while-loop. Statement di dalam do-while loop akan 
dieksekusi beberapa kali selama kondisi bernilai true. 
Perbedaan antara while dan do-while loop adalah dimana statement di dalam do-while 
loop dieksekusi sedikitnya satu kali. 
"Do-while loop" adalah struktur pengulangan pada bahasa pemrograman Java yang digunakan untuk mengeksekusi blok kode secara berulang selama kondisi yang diberikan masih terpenuhi atau bernilai true, tetapi dengan satu perbedaan utama dari while loop, yaitu bahwa do-while loop akan mengeksekusi blok kode setidaknya satu kali bahkan jika kondisi awal bernilai false.
Contoh penggunaan dari do-while loop di Java adalah sebagai berikut:
int i = 0;

do {
   System.out.println("Nilai i adalah " + i);
   i++;
} while (i < 5);
Dalam contoh di atas, nilai variabel i akan dicetak di konsol setidaknya sekali karena blok kode dalam do-while loop akan dieksekusi sebelum kondisi diuji. Setiap kali blok kode dalam do-while loop dieksekusi, nilai i akan bertambah 1, sehingga loop akan berhenti saat nilai i mencapai 5.

Seperti halnya while loop, kondisi dalam do-while loop harus dievaluasi sebagai boolean. Jika kondisi awal bernilai false, maka blok kode dalam do-while loop akan dieksekusi sekali, tetapi tidak akan dieksekusi lagi jika kondisi tetap bernilai false setelah itu.


3. for loop 
"For loop" adalah struktur pengulangan pada bahasa pemrograman Java yang digunakan untuk mengeksekusi blok kode secara berulang selama kondisi yang diberikan masih terpenuhi atau bernilai true, dengan menginisialisasi sebuah variabel, mengevaluasi kondisi, dan melakukan operasi iterasi dalam satu baris kode.
Contoh penggunaan dari for loop di Java adalah sebagai berikut:
for (int i = 0; i < 5; i++) {
   System.out.println("Nilai i adalah " + i);
}
Dalam contoh di atas, variabel i diinisialisasi dengan nilai 0, kemudian kode dalam loop akan dieksekusi selama nilai i kurang dari 5, dan setiap kali blok kode dalam loop dieksekusi, nilai i akan bertambah 1.

Kondisi dalam for loop juga harus dievaluasi sebagai boolean. Jika kondisi awal bernilai false, maka blok kode dalam for loop tidak akan pernah dieksekusi.



///Branching Statements 

1. break tstatement
"Break statement" adalah pernyataan yang digunakan pada bahasa pemrograman Java untuk menghentikan loop secara paksa. Ketika break statement dieksekusi dalam loop, maka program akan keluar dari loop, dan akan melanjutkan eksekusi pada pernyataan setelah loop.

Contoh penggunaan dari break statement di Java adalah sebagai berikut:
for (int i = 0; i < 5; i++) {
   if (i == 3) {
      break;
   }
   System.out.println("Nilai i adalah " + i);
}
Dalam contoh di atas, loop for akan dieksekusi selama nilai i kurang dari 5. Namun, ketika nilai i sama dengan 3, maka break statement akan dieksekusi dan program akan keluar dari loop for. Oleh karena itu, dalam contoh di atas, kode dalam loop for akan mencetak nilai i hingga i sama dengan 2 saja, dan setelah itu program akan melanjutkan eksekusi pada pernyataan setelah loop.

Break statement juga dapat digunakan dalam switch statement untuk menghentikan eksekusi case saat kondisi yang sesuai ditemukan.


2.  Continue statement 
"Continue statement" adalah pernyataan yang digunakan pada bahasa pemrograman Java untuk melanjutkan loop ke iterasi berikutnya tanpa mengeksekusi bagian dari loop yang ada di bawah continue statement pada iterasi saat ini.

Contoh penggunaan dari continue statement di Java adalah sebagai berikut:
for (int i = 0; i < 5; i++) {
   if (i == 2) {
      continue;
   }
   System.out.println("Nilai i adalah " + i);
}
Dalam contoh di atas, loop for akan dieksekusi selama nilai i kurang dari 5. Namun, ketika nilai i sama dengan 2, maka continue statement akan dieksekusi dan program akan melompat ke iterasi berikutnya tanpa mengeksekusi bagian dari loop yang ada di bawah continue statement pada iterasi saat ini. Oleh karena itu, dalam contoh di atas, kode dalam loop for akan mencetak semua nilai i kecuali nilai 2.

Continue statement biasanya digunakan dalam situasi di mana program harus mengabaikan beberapa nilai atau kondisi tertentu dalam loop, tetapi tetap melanjutkan eksekusi loop ke iterasi berikutnya.


3. Return statement 
"Return statement" adalah pernyataan yang digunakan pada bahasa pemrograman Java untuk mengembalikan nilai dari sebuah fungsi atau metode dan menghentikan eksekusi dari fungsi tersebut.

Return statement dapat digunakan dengan atau tanpa nilai pengembaliannya, tergantung pada jenis data yang dikembalikan oleh fungsi. Jika sebuah fungsi tidak mengembalikan nilai apapun, maka return statement dapat digunakan tanpa nilai pengembaliannya, seperti contoh berikut:
public void printNama(String nama) {
   System.out.println("Nama saya adalah " + nama);
   return;
}
Dalam contoh di atas, fungsi printNama menerima sebuah argumen nama dan mencetaknya ke konsol, dan tidak mengembalikan nilai apapun. Return statement digunakan untuk menghentikan eksekusi fungsi setelah kode mencetak argumen nama ke konsol.
