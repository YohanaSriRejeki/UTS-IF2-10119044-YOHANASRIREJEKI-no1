/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119044.yohanasrirejeki.no1;
import java.time.YearMonth;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menentukan hasil perhitungan umur
 */

public class UTSIF210119044YOHANASRIREJEKINo1 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age objAge = new Age(YearMonth.now().getYear());
        System.out.print("Masukkan Tahun Lahir Anda : ");
        objAge.setYearBirth(input.nextInt());
        System.out.println();
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir Anda : "+objAge.getYearBirth());
        System.out.println("Hari ini tahun : "+objAge.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+objAge.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu "+objAge.tandanyaKamu(objAge.hitungUmur()));
    }
}
