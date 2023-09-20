package utppemdas;
import java.util.Scanner;
public class UTPpemdas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2=new Scanner(System.in);
        System.out.println("Selamat Datang, silahakan login terlebih dahulu");
       System.out.print("masukkan username :");
        String un=in.nextLine();
        if (un.equalsIgnoreCase("muhammad hafi mufaddhol")){
            System.out.print("masukkan password :");
            String pw=in.nextLine();
            if (pw.equals("2211016210025")){
                System.out.print("ANDA TELAH BERHASIL LOGIN\nmenu layanan:\n"
                        + "1.menghitung luas persegi\n"
                        + "2.menetukan angka yang lebih besar\n"
                        + "3.menentukan ganjil genap\n"
                        + "Masukan pilihan anda :");
                int men=in.nextInt();
                switch (men){
                    case 1:
                        System.out.println("masukan panjang sisi:");
                        float p=in.nextFloat();
                        Float lu=p*p;
                        System.out.println("luas persegi tersebut ="+lu);break;
                    case 2:
                        System.out.println("masukan angka pertama:");
                        int a1=in.nextInt();
                        System.out.println("masukan angka kedua:");
                        int a2=in.nextInt();
                        if (a1>a2){
                            System.out.println("angka pertama lebih besar:");
                        }else if (a1<a2){
                            System.out.println("angka kedua lebih besar:");
                        }else {
                            System.out.println("kedua angka sama besar:");
                        };break;
                    case 3:
                        System.out.println("masukan bilangan bulat berapa saja:");
                        int bilb=in.nextInt();
                        String gg=bilb%2==0? "genap":"ganjil";
                        System.out.println("bilangan tersebut adalah "+gg);break;
                    default :System.out.println("menu tidak tersedia");break;
                        }              
            }else{
                System.out.println("password yang anda masukkan salah");
            }
        }else{
            System.out.println("username yang anda masukkan tidak terdaftar");
        }
    }
    
}
