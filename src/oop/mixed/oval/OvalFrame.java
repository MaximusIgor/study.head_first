package oop.mixed.oval;

import javax.swing.*;

public class OvalFrame extends JFrame {
    public OvalFrame(){
        // Создаем обьект типа OvalComponent
        OvalComponent oc = new OvalComponent();
        // Используем метод класса JFrame для добавления компонента на главную панель.
        add(oc);

        //  Устанавливаем координаты и размеры окна
        setBounds(200,200,300,250);
    }
}
