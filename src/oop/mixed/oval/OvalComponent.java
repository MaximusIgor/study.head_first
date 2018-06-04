package oop.mixed.oval;

import javax.swing.*;
import java.awt.*;

// Наследуемся от стандартного класса, который
// используется для создания компонентов на форме
public class OvalComponent extends JComponent {
    // Переопределяем метод рисованиая, в который передается
    // объект класса Graphics

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        // Используем Graphics для рисования овала с отступами
        g.drawOval(5,5, getWidth() -10, getHeight()-10);
        //g.draw3DRect(5,5,getWidth()-10,getHeight()-10,getAutoscrolls());

    }
}
