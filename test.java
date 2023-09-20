/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utppemdas;

import java.util.Scanner;

public class test {

    static int up = 3, skor = 0, lvl = 1;
    static String jawaban = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        short pil = 0, lanjut = 0;
        boolean y = true, tampilUlang = false;
        System.out.println("==============================================================\n"
                + "      SELAMAT DATANG DI KUIS MATEMATIKA ABAL ABAL");
        System.out.println("user akan menjawab soal matematika dari mudah hingga sulit "
                + "\nsetiap soal yang benar akan menambah skor sebanyak 5 poin"
                + "\nsetiap soal yang salah akan mengurangi nyawa sebanyak 1 poin"
                + "\n            anda akan mulai dengan 3 nyawa\n"
                + "=============================================================="
                + "\n1.SOAL SEJARAH\t\t 3.PERATURAN KUIS\n2.SOAL MATEMATIKA \t 4.KELUAR");
        do {
            if (tampilUlang == true) {
                System.out.println("ANDA MENGULANG KUIS");
                System.out.println("1.Mulai \t 2.keluar");
            }
            System.out.print("Masukan pilihan : ");
            pil = in.nextShort();
            garis();
            if (pil == 1) {
                //logika soal
                while (up != 0) {
                    info(lvl, up);
                    soal1();
                    tj();
                    jawaban = in2.nextLine();
                    penentu();
                    garis();
//                    if (lvl == 1) {
//                        info(lvl, up);
//                        soal1();
//                        tj();
//                        jawaban = in2.nextLine();
//                        penentu();
//                        garis();
//                        
//                    } else if (lvl == 2) {
//                        info(lvl, up);
//                        soal1();
//                        tj();
//                        jawaban = in2.nextLine();
//                        penentu();
//                        garis();
//                        
//                    } else if (lvl == 3) {
//                        info(lvl, up);
//                        soal1();
//                        tj();
//                        jawaban = in2.nextLine();
//                        penentu();
//                        garis();
//                        
//                    }
                    //batas soal
                }
                tskor(skor, lvl);
                System.out.println("apakah ingin mengulang soal?\n1.YA\t2.TIDAK");
                System.out.print("pilihan :");
                lanjut = in.nextShort();
                if (lanjut == 1) {
                    up += 3;
                    lvl = 1;
                    skor = 0;
                    jawaban = null;
                    tampilUlang = true;
                    garis();
                } else if (lanjut == 2) {
                    y = false;
                } else if (lanjut != 1 && lanjut != 2) {
                    System.out.println("menu tidak tersedia");
                }

            } else if (pil == 2) {
                keluar();
                y = false;
            } else {
                System.out.println("menu tidak tersedia");
            }
        } while (y);
        if (pil != 2) {
            keluar();
        }
    }

    //============================================================================
    public static void tj() {
        System.out.print("jawaban : ");
    }

    public static void tskor(int skor, int lvl) {
        if (jawaban.equalsIgnoreCase("x")) {
            keluar();
        } else {
            System.out.println("nyawa anda telah habis");
        }
        int level = lvl - 1;
        System.out.println("anda mengerjakan " + level + " level dengan skor : " + skor);
    }

    public static void keluar() {
        System.out.println("anda telah keluar dari kuis");
    }

    public static void info(int lvl, int up) {
        System.out.println("level " + lvl + "                     tekan x untuk keluar\n"
                + "                                       nyawa : " + up + "\n"
                + "-------------------------------------------------");
    }

    public static void penentu() {
        if (jawaban.equalsIgnoreCase(jawaban())) {
            skor += 5;
            lvl++;
        } else if (jawaban.equalsIgnoreCase("x")) {
            up = 0;
        } else {
            up -= 1;
        }
    }

    public static void garis() {
        System.out.println("=================================================");
    }

    //soal
    public static void soal1() {
        String soal = null;
        switch (lvl) {
            case 1:
                System.out.println("1.1+1=?");
                break;
            case 2:
                System.out.println("2.3-1=?");
                break;
            case 3:
                System.out.println("3.3x3=?");
                break;
            case 4:
                System.out.println("4.10:2=?");
                break;
        }

    }

    //batas soal
    //jawaban
    public static String jawaban() {
        String jawaban = null;
        if (lvl == 1) {
            jawaban = "2";
        } else if (lvl == 2) {
            jawaban = "2";
        } else if (lvl == 3) {
            jawaban = "9";
        } else if (lvl == 3) {
            jawaban = "9";
        }
        return jawaban;
    }

}
