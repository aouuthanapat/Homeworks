import Properties.*;

public class Car {
    final Model model = Model.MAZDA;
    final Year year = Year.NEW;
    final Engine engine = Engine.MEDIUM;
    Color color;
    Wheels wheels;
    Options options;

    public Car(Color color, Wheels wheels, Options options) {
        this.color = color;
        this.wheels = wheels;
        this.options = options;
    }

    public Color changeColor(Color color) {
        this.color = color;
        System.out.println("Новый цвет: " + color);
        return this.color;
    }

    public Wheels changeWheels(Wheels wheels) {
        this.wheels = wheels;
        System.out.println("Новые колёса: " + wheels);
        return this.wheels;
    }

    public Options changeOptions(Options options) {
        this.options = options;
        System.out.println("Новая опция: " + options);
        return this.options;
    }

    public String toString() {
        return "Получившийся автомобиль: \n" +
                "Марка автомобиля: " + this.model + " " +
                "Цвет автомобиля: " + this.color + " " +
                "Размер колёс автомобиля: " + this.wheels + "(" + this.wheels.wheels + ")" + " " +
                "Объем двигателя автомобиля: " + this.engine + "(" + this.engine.engine + ")" + " " +
                "Функции автомобиля: " + this.options;
    }

    public void printInfoAboutAuto() {
        System.out.println();
    }

    public static void main(String[] args) {
        Car car = new Car(Color.BLUE, Wheels.BIG, Options.HEATED_SEATS);
        car.changeColor(Color.RED);
        car.changeWheels(Wheels.SMALL);
        System.out.println();

        System.out.println(car.toString());
    }
}

// С опциями не разобрался не понял как их удалять/добавлять //

