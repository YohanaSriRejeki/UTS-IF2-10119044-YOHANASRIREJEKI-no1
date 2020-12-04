/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119044.yohanasrirejeki.no1;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menentukan hasil perhitungan umur
 */

class Age {
    private int yearBirth;
    private final int yearNow;
    private static String red = "\u001b[31m";
    
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public int hitungUmur(){
        int umur;
        umur = getYearNow() - getYearBirth();
        return umur;
    }
    
    public String tandanyaKamu(int umur){
        if(umur >= 0 && umur <= 5){
            return red+"LAGI LUCU-LUCU NYA";
        }else if (umur > 5 && umur <= 10){
            return red+"MASIH ANAK-ANAK";
        }else if (umur > 10 && umur <= 13){
            return red+"MASIH REMADJA";
        }else if (umur > 13 && umur <= 19){
            return red+"ALAY";
        }else if (umur > 19 && umur <= 29){
            return red+"LAGI GALAU NYARI JODOH";
        }else if (umur > 29 && umur <= 35){
            return red+"LAGI SIBUK NYARI UANG";
        }else if (umur > 35 && umur <= 150){
            return red+"SUDAH TUA";
        }else {
            return red+"TIDAK TERDETEKSI KEHIDUPAN";
        }
    }
}
