package com.kruchinin_Vadim.javacore.chapter13.applet;

import java.applet.Applet;
import java.awt.*;

class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Простейший аплет", 20, 20);
    }
}
