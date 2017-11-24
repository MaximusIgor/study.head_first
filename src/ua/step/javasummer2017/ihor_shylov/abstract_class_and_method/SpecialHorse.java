package ua.step.javasummer2017.ihor_shylov.abstract_class_and_method;

import javax.swing.text.View;

public abstract class SpecialHorse {

    // абстрактный метод "ржать()".
    abstract void heigh();

    // абстрактный класс может содержать и обычный метод
    void gallop(){
        System.out.println("Куда прёшь?");
    }
}

class SpecialHorseInVacuum extends SpecialHorse{

    @Override
    void heigh() {
        System.out.println("Чё ты ржешь?)");
    }
    public void onClick (View view){
        SpecialHorseInVacuum horse = new SpecialHorseInVacuum ();
        horse.heigh(); // на основе абстрактного метода
        horse.gallop(); // обычный метод

    }
}
