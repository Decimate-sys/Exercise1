/*CSCI 1660, Yunis Khamis, 1/16/20, Mr. Killoran, This program takes an array and adds the values within the array
length together and then divides the summed array length values by the array length*/
package com.company.Khamis;

public class Main {

    public static void main(String[] args) {

        int zipCode = 43123;
        String city = "Columbus";
        int highTemperature[] ={25,27,32,40,45};
        double sum = 0;

        for(int i = 0; i < highTemperature.length; i++)
        {
            sum = sum + highTemperature[i];
        }

        double averageHighTemperature = sum / highTemperature.length;
       System.out.println("City: " + city + " Zip Code: " + zipCode + " + averageHighTemperature: "  + averageHighTemperature);
    }

}
