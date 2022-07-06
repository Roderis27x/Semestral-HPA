import java.util.LinkedList; 

public class Figuras {

    LinkedList<String> registroPos = new LinkedList<>();
    int ax, ay;
    char color; 
    String nombre;
    String posc;
    public Figuras(int x, int y, char color, String posc, String nombre){
        
        this.ax = x; 
        this.ay = y; 
        this.color = color;       
        this.posc = posc;
        this.nombre = nombre; 
        registroPos.add(posc); 
        
    }
        
}
