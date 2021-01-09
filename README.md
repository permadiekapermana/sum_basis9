# Penjumlahan Basis 9

Program
- Program penjumlahan sederhana dengan menggunakan dua bilangan basis 9 dan akan menghasilkan hasil penjumlahan basis 9

Cara Penggunaan Program
-	Masukkan jumlah test case penjumlahan yang ingin dilakukan dengan mengisi angka 1 hingga max 1000x
-	Masukkan dua bilangan, bilangan satu dengan bilangan dua dipisahkan dengan menggunakan spasi

Algoritma
-	Buat class baru dengan deklarasi program mesinHitung
-	Deklarasikan variabel String a, b, s dan sum
a = Bilangan pertama
b = Bilangan kedua
s = untuk menambah nilai 0 pada bilangan agar menjadi nilai sama Ketika dua bilangan yang diinputkan jumlah panjang bilangannya berbeda
sum = menampung nilai penjumlahan
-	Deklarasikan variabel Int basis, Panjang_a, Panjang_b, beda
basis = menentukan basis berapakah operasi penjumlahan berlangsung
panjang_a = menghitung Panjang dari bilangan input a
panjang_b = menghitung Panjang dari bilangan input b
beda = menampung nilai perbedaan antara bilangan a dan bilangan b
-	Gunakan fungsi .lenght() untuk mengetahui Panjang bilangan yang diinput user (a,b)
-	Gunakan fungsi Math.abs pada var beda untuk mengubah nilai negative menjadi positif, tujuannya untuk mengatasi masalah jika bilangan kedua lebih Panjang akan bernilai negative, jadi fungsi Math.abs akan mengubah nilai negative menjadi positif
-	Lakukan perulangan sebanyak i = 1 <= beda untuk menambah nilai 0 pada var s agar nilai input yang berbeda panjangnya akan ditambahkan agar nilainya sama
Contoh :
111 + 55555 maka akan menjadi 00111 + 55555
-	Lakukan validasi pengecekan untuk mengecek apakah Panjang input a < Panjang input b, jika iya tambahkan nilai var s pada depan bilangan atau sebaliknya, agar jumlah Panjang bilangannya sama
-	Deklarasikan var angkaSekarang dan sisa, isi dengan 0
angkaSekarang = mengidentifikasi angka dari hasil penjumlahan yang berlangsung untuk kemudian di operasikan dengan dibagi angka basis dan kemudian di modulo basis
sisa = untuk menyimpan nilai sisa dari hasil penjumlahan, jika ada sisa akan ditambahkan ke operasi berikutnya atau untuk ditambahkan ke hasil sum jika nilai sisa akhir bernilai >0
-	Lakukan perulangan
-	Identifikasikan i untuk mencari nilai terpanjang dari dua var a dan var b dengan fungsi Math.max lalu -1, karena kondisi yang diharapkan adalah looping sampai mencapai nilai i >= 0, kurangi nilai i – 1 setiap kali kondisi i terpenuhi
-	angkaSekarang menampung nilai dari penjumlahan sisa + angka a ke (i) + angka b ke (i), fungsi charat(i) – “0” untuk mengkonversi String ke int karena a dan b tipe datanya String dan akan disimpan dalam tipe data int
-	sisa = angkaSekarang / basis, nilai sisa akan ditampung dalam variable sisa untuk dijumlahkan pada perulangan berikutnya atau ditambahkan pada setelah akhir perulangan pada variable sum
-	Berikutnya angkaSekarang akan diisi dengan modulo dari basis
-	Lalu hasil tersebut akan disimpan dalam variable sum, fungsi (char) digunakan untuk mengubah tipe data int agar bisa digabungkan dengan String
-	Lakukan perulangan sampai nilai i terpenuhi
-	End perulangan
-	Cek apabila nilai sum > 0 maka tambahkan nilai sum ke depan nilai sum terakhir, gunakan char untuk menggabungkan nilai agar tidak terjadi penjumlahan namun menggabungkan nilai string 
-	Print nilai sum
