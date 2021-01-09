import java.util.Scanner;

public class mesinHitung {
    public static void main(String[] args) {

        int tc, j;
        System.out.println("Mau test case berapa kali ? : ");
        Scanner inputan = new Scanner(System.in);
        Scanner inputan2 = new Scanner(System.in);
        tc = inputan.nextInt();

        String[] input = new String[tc];

        System.out.println();

        if (tc>100) {
            System.out.println("Jumlah input nilai tidak boleh lebih dari 100!");
        }
        else {
            for (j=0; j<tc; j++){
                int k = j+1;                
                    System.out.println("Masukan bilangan pertama dan kedua, pisahkan dengan spasi! Test Case ke " + k);
                    input[j] = inputan2.nextLine();
                    System.out.println();
            }
            System.out.println("0 0");
            System.out.println();
            System.out.println("Hasil :");
            for (j=0; j<tc; j++) {
            
                String[] splitString = input[j].split(" ");
                
                String a = splitString[0];
                String b = splitString[1];

                String s, sum;
                int basis, panjang_a, panjang_b, beda;
                        
                basis = 9;        
        
                s = "";
                sum = "";
        
                panjang_a = a.length();
                panjang_b = b.length();
        
                beda = Math.abs(panjang_a - panjang_b);
                
                for (int i = 1; i <= beda; i++ ) {
                    s += "0";
                }
                
                if (panjang_a < panjang_b) {
                    a = s + a;
                }
                else {
                    b = s + b;
                }
        
                int angkaSekarang, sisa = 0;
        
                for (int i = Math.max(panjang_a, panjang_b) - 1; i >= 0; i--) { 
                    
                    angkaSekarang = sisa + (a.charAt(i) - '0') + (b.charAt(i) - '0');
                    
                    sisa = angkaSekarang / basis;
                    
                    angkaSekarang = angkaSekarang % basis;
                    
                    sum = (char)(angkaSekarang + '0') + sum;
                            
                }
        
                if (sisa > 0) {
                    sum = (char)(sisa + '0') + sum;
                }
                
                System.out.println("Hasil dari penjumlahan menggunakan basis 9 dari "+a+ " + "+ b +" adalah :");
                System.out.println(sum);
                System.out.println();

            }
        }


        

        
    }
}