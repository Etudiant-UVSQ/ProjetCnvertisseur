package fr.uvsq.EtudiantUVSQ.Exceptions;

public class DecouvertException extends RuntimeException {

	public DecouvertException() {
		super("L'opération implique que le compte soit à découvert");
		
	}
}
