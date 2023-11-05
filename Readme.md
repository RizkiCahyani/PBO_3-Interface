PENJELASAN LAPORAN PRAKTIKUM_3 PBO

TUGAS
Membuat dua kelas turunan (minimal), satu kelas super yang dari kelas tersebut
mengimplementasikan 3 interface.

Langkah-langkah:
1. Membuat parent class nya dengan nama
Orang, Kemudian Orang mempunyai 2 turunan dengan nama OrangSunda dan
OrangMadura. Sedangkan nelayan, Penjualikan, dan BudidayaTambak merupakan
implementasi interface dari kelas OrangMadura.

2. Membuat class Parent dengan nama Orang.

Didalam kelas Orang beberapa atribut. Atribut ini menyimpan informasi tentang
tempat tinggal, golongan darah, umur, dan kewarganegaraan seseorang. Karena mereka
bersifat pribadi (private), maka perlu menggunakan metode-metode getter dan setter
untuk mengakses atau mengubah nilai-nilai ini. Metode getter digunakan untuk
mendapatkan nilai dari atribut yang bersangkutan, dan metode setter digunakan untuk
mengubah nilai atribut tersebut.
Selain itu, terdapat empat method lain dalam kelas Orang, yang masing-masing
memiliki berbagai parameter dan mengembalikan pesan berbeda tentang makanan. Ini
disebut overloading method di mana nama method yang sama digunakan dengan tipe
parameter yang berbeda.

3. Membuat interface dengan nama nelayan

Jadi, interface Nelayan ini memberikan kontrak bahwa setiap kelas yang
menggunakannya harus memiliki metode tangkapIkan(), dan implementasinya akan
berbeda-beda tergantung pada kelas yang mengimplementasikannya.

4. Membuat interface dengan nama PenjualIkan

Jadi, interface PenjualIkan ini memberikan kontrak bahwa setiap kelas yang
menggunakannya harus memiliki metode jualIkan(), dan implementasinya akan
berbeda-beda tergantung pada kelas yang mengimplementasikannya.

5. Membuat interface dengan nama BudidayaTambak

Jadi, interface BudidayaTambak ini memberikan kontrak bahwa setiap kelas
yang menggunakannya harus memiliki metode jagaTambak(), dan implementasinya
akan berbeda-beda tergantung pada kelas yang mengimplementasikannya.

6. Selanjutnya membuat kelas turunan dengan nama OrangSunda

Kelas OrangSunda diwarisi (extends) dari kelas Orang. Ini berarti OrangSunda
adalah subkelas dari Orang dan akan mewarisi semua atribut dan metode yang
didefinisikan dalam kelas Orang. Dengan kata lain, OrangSunda adalah kelas anak dari
Orang.

7. Membuat kelas turunan dengan nama OrangMadura

Di dalam kelas OrangMadura, saya mengimplementasikan metode-metode
yang didefinisikan dalam interface Nelayan, PenjualIkan, dan BudidayaTambak.
Metode tangkapIkan() dan jualIkan() adalah implementasi dari interface Nelayan dan
PenjualIkan, sementara metode jagaTambak() adalah implementasi dari interface
BudidayaTambak. Ini berarti OrangMadura sekarang memiliki perilaku yang sesuai
dengan ketiga interface tersebut.
Selain itu, terdapat konstruktor kelas OrangMadura. Konstruktor ini akan
dijalankan saat Anda membuat objek OrangMadura baru. Dalam konstruktor ini, Anda
menginisialisasi atribut-atribut yang diwarisi dari kelas Orang dengan nilai-nilai
tempat tinggal, golongan darah, umur, dan kewarganegaraan.

8. Terakhir membuat package baru (dengan nama jalankanProgram) yang didalam
akan terdapat sebuah main class dengan nama menjalankan yang akan digunakan
untuk menjalankan programnya.