
import java.util.StringTokenizer;



/**
 *
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
public class Calculadora {
    static Compilador comp;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ErrorDeSintaxisException {
        String cadena = "(1r4)*3-(1s2)+4*(1t6)";
        comp= new Compilador();
        StringTokenizer lexemas = comp.analisisLexico(cadena);
        CompositeEA nodo = comp.arbolDeAnalisisSintactico(lexemas);
        System.out.println(nodo);
        System.out.println(nodo.evalua());
    }
}