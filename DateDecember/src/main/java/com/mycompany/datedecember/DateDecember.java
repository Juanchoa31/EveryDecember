package com.mycompany.datedecember;

import javax.swing.*;
import java.util.Date;

public class DateDecember {

    public static void main(String[] args) {
        Icon image = new ImageIcon("P:\\Juan\\Desktop\\December"
                + "\\EveryDecember"
                + "\\DateDecember\\src\\main\\java\\com\\mycompany"
                + "\\images\\nochebuena.png");
        Date date = new Date();
        JOptionPane.showMessageDialog(null,
            "Feliz navidad, basuras! ❤️\n"+date
            ,"Feliz navidad. ❤",JOptionPane.PLAIN_MESSAGE, image);
    }
}
