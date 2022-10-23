package Properties;

public enum Engine {
    MICRO(1.1),
    LOW(1.8),
    MEDIUM(3.5);
    public double engine;

    Engine (double engine) {
        this.engine = engine;
    }
}
