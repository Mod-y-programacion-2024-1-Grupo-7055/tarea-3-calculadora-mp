/**
 * Clase de la operacion raiz cuadrada.
 */

public class NodoRaizC extends NodoOperador {

	/**
	 * @param izq
	 * @param der
	 */
	public NodoRaizC(CompositeEA izq, CompositeEA der) {
		super(izq, der);
		precedence = 1;
	}

	/**
	 * La evaluación del nodo, da la raiz cuadrada del hijo derecho.
	 * El hijo izquierdo el null;
	 * 
	 * @return La raiz cuadrada del hijo derecho.
	 */
	@Override
	public double evalua() {
		double d = der.evalua();
		if(d < 0){
			throw new ArithmeticException ("No puedes sacar raiz cuadrada de numeros negativos");
		}
		return Math.sqrt(d);
	}
}