/**
 * Clase de la operación Coseno
 */

public class NodoCoseno extends NodoOperador {
	/**
	 * @param izq
	 * @param der
	 */
	public NodoCoseno(CompositeEA izq, CompositeEA der) {
		super(izq, der);
		precedence = 1;
	}

	/**
	 * La evaluación del nodo, da el coseno del hijo derecho.
	 * El hijo izquierdo siempre es null.
	 * 
	 * @return El coseno del hijo derecho.
	 */
	@Override
	public double evalua() {
		return Math.cos(der.evalua());
	}
}