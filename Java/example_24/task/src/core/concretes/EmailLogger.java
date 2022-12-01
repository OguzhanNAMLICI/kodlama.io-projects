package core.concretes;

import core.abstracts.Logger;

public class EmailLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message + " logged to email.");
    }
}
