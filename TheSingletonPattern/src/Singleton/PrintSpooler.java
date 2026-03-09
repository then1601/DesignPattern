package Singleton;

public class PrintSpooler {
    private static PrintSpooler instance;

    private PrintSpooler() {
        init();
    }

    private void init() {
        System.out.println("Đang khởi tạo");
    }
    // trả về instance duy nhất
    public static synchronized PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}

