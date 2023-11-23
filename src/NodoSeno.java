/**
 * Clase de la operación seno
 */

public class NodoSeno extends NodoOperador{

	/**
	 * @param izq
	 * @param der
	 */
	public NodoSeno(CompositeEA izq, CompositeEA der) {
		super(izq, der);
		precedence = 1;
	}

	/**
	 * La evaluación del nodo, da el seno del hijo derecho.
	 * El hijo izquierdo es null siempre.
	 * 
	 * @return El semo del hijo derecho.
	 */
	@Override
	public double evalua() {
		return izq.evalua() * Math.sin(der.evalua());
	}
}