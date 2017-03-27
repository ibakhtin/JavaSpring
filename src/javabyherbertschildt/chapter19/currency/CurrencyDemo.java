package javabyherbertschildt.chapter19.currency;

// Demonstrate Currency.

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
    public static void main(String[] args) {
        Currency usCurrency, ruCurrency;

        usCurrency = Currency.getInstance(Locale.US);
        ruCurrency = Currency.getInstance(new Locale("ru", "RU"));

        System.out.println("getCurrencyCode() " + usCurrency.getCurrencyCode());
        System.out.println("getDisplayName() " + usCurrency.getDisplayName());
        System.out.println("getSymbol() " + usCurrency.getSymbol());
        System.out.println("getNumericCode() " + usCurrency.getNumericCode());
        System.out.println("getDefaultFractionDigits() " + ruCurrency.getDefaultFractionDigits());
    }
}
