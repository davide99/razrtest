package com.example;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

public class HelloMIDlet extends MIDlet implements CommandListener {
    private Form form;
    private final Command exit = new Command("Esci", Command.EXIT, 1);

    protected void startApp() {
        if (form == null) {
            form = new Form("Hello");
            form.append("Hello J2ME!");
            form.addCommand(exit);
            form.setCommandListener(this);
        }
        Display.getDisplay(this).setCurrent(form);
    }

    protected void pauseApp() {}

    protected void destroyApp(boolean unconditional) {}

    public void commandAction(Command c, Displayable d) {
        if (c == exit) {
            destroyApp(true);
            notifyDestroyed();
        }
    }
}