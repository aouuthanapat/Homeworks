import Properties.*;

public class Factory {
    Color color;
    Engine engine;
    Model model;
    Options options;
    Wheels wheels;
    Year year;

    public Factory(Color color, Engine engine, Model model, Options options, Wheels wheels, Year year) {
        this.color = color;
        this.engine = engine;
        this.model = model;
        this.options = options;
        this.wheels = wheels;
        this.year = year;
    }

    public Factory() {
    }

    public void ModelList() {
        System.out.println("Модели машин в ассортименте: ");
        for (Model element : Model.values()) {
            System.out.println(element);
        }
        System.out.println();
    }
//
//    public void OptionList() {
//        System.out.println("Функции машин в ассортименте: ");
//        for (Options element : Options.values()) {
//            System.out.println(element);
//        }
//        System.out.println();
//    }

    public void ColorList() {
        System.out.println("Цвета машин в ассортименте: ");
        for (Color element : Color.values()) {
            System.out.println(element);
        }
        System.out.println();
    }

    public void WheelsList() {
        System.out.println("Колёса машин в ассортименте: ");
        for (Wheels element : Wheels.values()) {
            System.out.println(element + "(" + element.wheels + ")");
        }
        System.out.println();
    }

    public void EngineList() {
        System.out.println("Двигатели машин в ассортименте: ");
        for (Engine element : Engine.values()) {
            System.out.println(element + "(" + element.engine + ")");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.ModelList();
        factory.ColorList();
        factory.WheelsList();
        factory.EngineList();
        System.out.println();
    }
}
