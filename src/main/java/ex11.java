import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
    UCF COP3330 Fall 2021 Assignment 11 Solution
    Copyright 2021 Luke Faulkner
 */
public class ex11 {
    public static void main(String[] args) {
        // Variables / Objects
        Scanner currencyReader = new Scanner(System.in);
        String euroStr, exchangeRateStr;

        System.out.print("How many euros are you exchanging? ");
        euroStr = currencyReader.nextLine();
        int euro = Integer.parseInt(euroStr);

        System.out.print("What is the exchange rate? ");
        exchangeRateStr = currencyReader.nextLine();
        double exchangeRate = Double.parseDouble(exchangeRateStr);

        // Calculations
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        double dollars = (exchangeRate * (double)euro);

        // Output
        System.out.println(euro + " euros at an exchange rate of " + exchangeRate + " is");
        System.out.print(df.format(dollars) + " U.S. dollars.");




    }
}
