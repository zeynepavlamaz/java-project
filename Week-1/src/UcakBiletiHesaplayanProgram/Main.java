package UcakBiletiHesaplayanProgram;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        int mesafe, yas, tip;
        double normalTutar, indrmTutar, tplmTutar, perMsf = 0.10;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => tek yön, 2 => gidiş-dönüş) : ");
        tip = input.nextInt();

        if ( (mesafe>0) && (yas>0) && (tip==1 || tip==2) ){
            normalTutar = mesafe * perMsf;

            if(yas<=12){
                indrmTutar = normalTutar * 0.5;
            }

            else if(12<yas && yas<24){
                indrmTutar = normalTutar * 0.9;
            }

            else if(65<=yas){
                indrmTutar = normalTutar * 0.7;
            }

            else{
                indrmTutar = normalTutar;
            }

            if(tip==1){
                System.out.println("Toplam Tutar : " + indrmTutar + " TL");
            }

            else{
                tplmTutar= 2*indrmTutar*0.8;
                System.out.println("Toplam Tutar : " + tplmTutar + " TL");
            }
        }

        else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}