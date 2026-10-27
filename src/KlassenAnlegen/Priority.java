package KlassenAnlegen;

public class Priority  {
    private int value;
    private String name;
    
    /* erste Variante */
    public Priority() {}

     /* zweite Variante */
    public Priority(String name) {
        this.name = name;
    }
     /* dritte Variante */
    public Priority(int value, String name) {
        this.value = value;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}
