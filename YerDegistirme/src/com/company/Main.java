package com.company;

public class Main {

    public static void main(String[] args) {
	float birinci = 1.2f, ikinci = 2.5f;
    System.out.print("---Değişimden Önce---\n");
    System.out.println("Birinci sayi : "+birinci);
    System.out.println("İkinci sayi : "+ikinci);

    float gecici = birinci ;
    birinci = ikinci ;
    ikinci = gecici ;

    System.out.print("---Değişimden Sonra---\n");
    System.out.println("Birinci sayı : "+birinci);
    System.out.println("İkinci sayı : "+ikinci);
    }
}
