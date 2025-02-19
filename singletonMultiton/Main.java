package singletonMultiton;

public class Main {
    public static void main(String[] args) {
        Clock clock1 = Clock.getInstance();
        Clock clock2 = Clock.getInstance();
        clock1.showTime();

        System.out.println("clock 1 é igual a clock 2: " + (clock1 == clock2));

        CorConfig backgroundColor = CorConfig.getInstance("background Azul");
        CorConfig textColor = CorConfig.getInstance("text White");

        backgroundColor.showCor();
        textColor.showCor();

        CorConfig backgroundCor2 = CorConfig.getInstance("background Azul");
        System.out.println("cor background2 é igual a cor background: " + (backgroundColor == backgroundCor2));

        CorConfig textColor2 = CorConfig.getInstance("text Black");
        System.out.println("cor do text2 é igual a cor text: " + (textColor == textColor2));
    }
}
