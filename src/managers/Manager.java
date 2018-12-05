package managers;

import utils.Printer;

public abstract class Manager {
    private Printer printer = new Printer();

    public Printer getPrinter() {
        return printer;
    }
}


