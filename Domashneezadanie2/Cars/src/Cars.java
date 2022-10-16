public class Cars {
    private String Model;
    private String Color;

    public Cars (String Model, String Color){
        this.Color = Color;
        this.Model = Model;
    }
    public void print () { System.out.println("Model: " + Model + "Color: " + Color); }
}
