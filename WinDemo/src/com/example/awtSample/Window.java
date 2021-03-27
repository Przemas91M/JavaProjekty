package com.example.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends Frame {
    public Window(String title) throws HeadlessException {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font SansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font SansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(SansSerifLarge);
        g.drawString("Kurs programowania Javy", 60, 60);
        g.setFont(SansSerifSmall);
        g.drawString("w moim wykonaniu", 60, 100);
    }
}
