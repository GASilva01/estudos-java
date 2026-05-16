package utils;

public class CurrencyConverter{
    public static final double IOF = 0.06;
    public static double toBePaid(double dollar, double dollar_amount){

    double final_amount = dollar_amount * dollar;
    double tax_percentage = final_amount * IOF;
    return final_amount + tax_percentage;
    }

}
