BAB 5 

Mendapatkan Input dari Keyboard

///

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

public class LatihanModul5_1 {

    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader ( new InputStreamReader(System.in));

            String name = "";

            System.out.print ("Please enter your words 1 = ");

            try {

            name = dataIn.readLine();

            }catch (IOException e){

            System.out.println ("Error ");

            }
            
         BufferedReader dataMasuk = new BufferedReader (new InputStreamReader(System.in));

                String nama ="";

                System.out.print ("Please enter your words 2 =" );

                try{

                nama = dataMasuk.readLine();

                }catch(IOException e){

                System.out.println ("Error !");

                } 
                
         BufferedReader dataMlebu = new BufferedReader (new InputStreamReader(System.in));

                String namawa ="";

                System.out.print("Please enter your words 3 =" );

                try{

                namawa = dataMlebu.readLine();

                }catch(IOException e){

                System.out.println ("Error !");

                }

                System.out.println (name +" "+ nama +" "+ namawa);

                }
}

Program di atas adalah contoh program Java yang menggunakan kelas BufferedReader untuk meminta input dari pengguna. Program ini meminta pengguna untuk memasukkan tiga kata atau frasa dan kemudian mencetaknya ke layar sebagai satu kalimat yang dihubungkan dengan spasi.

Program akan menampilkan tiga pesan instruksi terpisah, masing-masing dengan prompt khusus yang berisi nomor kata yang diminta dari pengguna. Kemudian, program meminta input pengguna untuk masing-masing nomor kata tersebut, menggunakan BufferedReader untuk membaca input dari pengguna.

Setelah memperoleh tiga kata dari pengguna, program menggabungkannya menjadi satu kalimat dengan memasukkan spasi di antara setiap kata, dan kemudian mencetak kalimat ke layar menggunakan metode println.


///

import javax.swing.JOptionPane; 

public class LatihanModul5_2 {

    public static void main (String[] args)
	{
		//input OptionPane1
	String name = "";
	name = JOptionPane.showInputDialog("Please enter your words 1");
	
		//input OptionPane2
	String nama = "";
	nama = JOptionPane.showInputDialog("Please enter your words 2");
	
		//input OptionPane3
	String namawa = "";
	namawa = JOptionPane.showInputDialog("Please enter your words 3 ");
	
	String msg = name +" "+ nama +" "+ namawa ;
	JOptionPane.showMessageDialog(null, msg);
		}	
}

Program tersebut merupakan contoh penggunaan JOptionPane di Java untuk mengambil input dari pengguna dalam bentuk dialog box dan menampilkan hasilnya kembali dalam dialog box.

Pada program tersebut, terdapat tiga dialog box input dengan masing-masing menggunakan metode showInputDialog() dari kelas JOptionPane untuk menampilkan kotak dialog dan mengambil input teks dari pengguna.

Ketiga input teks kemudian digabungkan menjadi satu string dengan memasukkannya ke dalam variabel msg dan ditampilkan kembali dalam dialog box menggunakan metode showMessageDialog() dari kelas JOptionPane dengan parameter null dan variabel msg.





