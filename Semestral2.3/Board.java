public class Board {

    String[][] Board = new String[8][8];
    char[] letras = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
    char[] numeros = new char[] { '8', '7', '6', '5', '4', '3', '2', '1' };

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Board[i][j] = " ";
            }
        }
    }

    public void PrintBoard() {
        // System.out.print(" A B C D E F G H ");

        for (int fila = 0; fila < 8; fila++) {
            System.out.println("");
            // System.out.println("-----------------------------------");
            System.out.println("===================================================");
            System.out.print(8 - fila);

            for (int col = 0; col < 8; col++) {
                System.out.print(" || " + Board[fila][col] + " ");
            }
            System.out.print("||");
        }
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("     A      B     C     D     E     F     G     H   ");

    }

    public void CheckPosition(String entrada, Figuras ca) {

        char fila2 = entrada.charAt(0);
        char col2 = entrada.charAt(1);
        int t1 = ca.ax + 1;
        int t2 = ca.ay + 1;
        int l = 0, n = 0;
        int valor;

        for (int i = 0; i < letras.length; i++) {

            if (fila2 == letras[i]) {
                l = i + 1;

            }

        }

        for (int i = 0; i < numeros.length; i++) {

            if (col2 == numeros[i]) {
                n = i + 1;

            }

        }


        valor = (t1 - n) * (t1 - n) + (t2 - l) * (t2 - l);
    
        if (valor == 5) {
            ca.registroPos.add(entrada);
            ca.posc = entrada;
            Displace(ca, n - 1, l - 1);
        } else {
            System.out.println("Movimiento invalido, pierdes el turno");
        }

    }

    public void Displace(Figuras ca, int x, int y) {

        Board[ca.ax][ca.ay] = " ";

        ca.ax = x;
        ca.ay = y;

        Board[ca.ax][ca.ay] = ca.nombre;

    }

}
