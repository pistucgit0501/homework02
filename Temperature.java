package homework02;

import java.util.Scanner;

public class Temperature {
    int[] temperature = new int[10];
    public void  getTemperatureDataFromConsole(){
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i <temperature.length ; i++) {
            System.out.println("Kérem a hömérséklet értékét");
            temperature[i]=scanner.nextInt();


        }

    }
    public void printHighestTemperature(){
        int num =0;
        for (int i = 0; i <temperature.length ; i++) {
            if(num<temperature[i]){
                num=temperature[i];
            }

        }
        System.out.println( "A legnagyöbb hőmérséklet "+ num);
    }
    public void printLowestTemperature(){
        int num =0;
        for (int i = 0; i <temperature.length ; i++) {
            if(num>temperature[i]){
                num=temperature[i];
            }

        }
        System.out.println( "A legkisebb hőmérséklet "+ num);
    }

}
