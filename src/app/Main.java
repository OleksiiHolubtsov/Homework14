package app;

import app.Interface.Printer;
import app.Printer.PrinterImpl;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();

        PrinterImpl.Message msg1 = new PrinterImpl.Message("Привіт", "Іван");
        PrinterImpl.Message msg2 = new PrinterImpl.Message("Привіт", "");
        PrinterImpl.Message msg3 = new PrinterImpl.Message("", null);

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}