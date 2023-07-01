BAB 4 

Dasar-Dasar Pemrograman


///
public class LatihanModul4_1 {

    public static void main (String[] args ){
        int number = 10;
        char letter = 'a';
        boolean result = true;
        String str = "hello";
        
        System.out.println(number);
        System.out.println(letter);
        System.out.println(result);
        System.out.println(str);
        
    }
}

Program di atas merupakan contoh penggunaan beberapa tipe data dalam bahasa pemrograman Java seperti int, char, boolean, dan String. Pada program ini, sebuah variabel integer "number" diinisialisasi dengan nilai 10, sebuah variabel char "letter" diinisialisasi dengan karakter 'a', sebuah variabel boolean "result" diinisialisasi dengan nilai true, dan sebuah variabel String "str" diinisialisasi dengan string "hello".

Kemudian, setiap variabel dicetak ke layar menggunakan metode System.out.println (). Hasilnya adalah nilai dari setiap variabel yang tercetak ke layar.

///

public class LatihanModul4_2 {

    public static void main (String[] args ){
        int number1 = 10;
        int number2 = 20;
        int number3 = 45;
        int average;
        
        average = (number1+number2+number3)/3;
        
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(average);
    }
}

Program di atas merupakan contoh program Java yang menggunakan variabel dan operasi aritmatika sederhana untuk menghitung rata-rata dari tiga bilangan bulat. Berikut adalah penjelasan singkat mengenai program tersebut:

Baris 3-6: Pendefinisian variabel bilangan bulat (int) dan satu variabel karakter (char), serta satu variabel boolean (boolean) dan satu variabel String (String).
Baris 8-11: Menampilkan isi dari setiap variabel pada baris terpisah menggunakan System.out.println().
Baris 14-20: Pendefinisian tiga variabel bilangan bulat dan satu variabel rata-rata, kemudian menghitung rata-rata dengan rumus (number1 + number2 + number3) / 3, dan menyimpan hasilnya ke dalam variabel rata-rata.
Baris 22-25: Menampilkan isi dari setiap variabel bilangan bulat dan rata-rata pada baris terpisah menggunakan System.out.println().


/// 

public class LatihanModul4_3 {

    public static void main (String[] args ){
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int score = 0;
        
        score = (number2 > number3)?(number2>number1)?number2:number1:number3;
        
        System.out.println("number 1 = "+number1);
        System.out.println("number 2 = "+number2);
        System.out.println("number 3 = "+number3);
        System.out.println("nilai tertingginya = "+score);
    }
}

Program di atas merupakan program untuk mencari nilai tertinggi dari tiga buah bilangan. Pertama, dilakukan pendeklarasian variabel number1, number2, number3 dan score dengan tipe data integer dan diinisialisasi dengan nilai masing-masing. Kemudian, dilakukan operasi untuk mencari nilai tertinggi dengan menggunakan operator ternary. Jika number2 lebih besar dari number3, maka akan dicek apakah number2 lebih besar dari number1, jika benar maka score akan diisi dengan nilai number2, jika salah maka score akan diisi dengan nilai number1. Jika number2 lebih kecil dari number3, maka score akan diisi dengan nilai number3. Terakhir, dilakukan pencetakan nilai dari variabel number1, number2, number3, dan score menggunakan method System.out.println().

/// 

public class LatihanModul4_4 {

    public static void main (String[] args ){
        String a = "((a/((b*c)*d)-c+f-(g-h)+i";
        int b = (((3*10)*2)/15)-2+((4*2)*2);
        String c ="((r*s)*t/u)-v+(w*x)-y++";
        System.out.println("Hasil = "+b);
        
    }
}

Pada kodingan diatas, terdapat sebuah program sederhana yang mencetak hasil dari operasi matematika dan juga mencetak sebuah string.

Pada baris ke-4, variabel a memiliki nilai ((a/((b*c)*d)-c+f-(g-h)+i. Variabel ini berisi sebuah string matematika, namun tidak dapat dihitung karena terdapat variabel-variabel yang tidak didefinisikan.
Pada baris ke-5, variabel b dihitung hasilnya dengan operasi matematika yaitu (((3*10)*2)/15)-2+((4*2)*2), sehingga hasilnya adalah 6. Program mencetak hasilnya dengan menggunakan System.out.println.
Pada baris ke-6, variabel c memiliki nilai ((r*s)*t/u)-v+(w*x)-y++. Variabel ini berisi sebuah string matematika, namun tidak dapat dihitung karena terdapat variabel-variabel yang tidak didefinisikan.
