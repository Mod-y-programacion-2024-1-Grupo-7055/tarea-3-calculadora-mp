/**
 * Clase de la operación tangente
 */

public class NodoTangente extends NodoOperador {

	/**
	 * @param izq
	 * @param der
	 */
	public NodoTangente(CompositeEA izq, CompositeEA der) {
		super(izq,der);
		precedence = 1;
	}

	/**
	 * La evaluación del nodo, da la tangente del hijo derecho.
	 * El hijo izquierdo es null.
	 * 
	 * @return La tangente del hijo derecho
	 */
	@Override
	public double evalua() {
		return Math.tan(der.evalua());
	}
}