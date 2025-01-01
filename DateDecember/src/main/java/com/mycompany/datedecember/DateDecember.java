package com.mycompany.datedecember;

import javax.swing.*;
import java.util.Date;

public class DateDecember {

    public static void main(String[] args) {
        Icon image = new ImageIcon("P:\\Juan\\Desktop\\December"
                + "\\EveryDecember"
                + "\\DateDecember\\src\\main\\java\\com\\mycompany"
                + "\\images\\nochevieja.png");
        Date date = new Date();
        JOptionPane.showMessageDialog(null,
            "Feliz año nuevo, tonotos! ❤️\n"+date
            ,"Feliz año. ❤",JOptionPane.PLAIN_MESSAGE, image);
    }
}
