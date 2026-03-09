package Singleton;
public class Client {
    public static void main(String[] args) {
        PrintSpooler printer = PrintSpooler.getInstance();
        printer.print("Document 1");
    }
}