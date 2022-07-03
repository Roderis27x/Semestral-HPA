import java.util.LinkedList; //Importar la biblioteca LinkedList

public class Figuras {

    LinkedList<String> posicion = new LinkedList<>();  //Lista de posiciones de los caballos
    int x, y; //Coordenadas de los caballos
    String nombre, posc; //Nombre y posicion del caballo
    char color; //Color del caballo

    public  void Caballo(int x, int y, char color, String posc, String nombre) {

        this.x = x; //Asigna la posicion inicial en x
        this.y = y; //Asigna la posicion inicial en y
        this.nombre = nombre; //Asigna el nombre del caballo
        this.posc = posc; //Asigna la posicion inicial 
        this.color = color; //Asigna el color del caballo
        posicion.add(posc); //Agrega la posicion inicial a la lista de registro

        }//Fin del constructor Caballos

} //Fin de la clase Figuras
