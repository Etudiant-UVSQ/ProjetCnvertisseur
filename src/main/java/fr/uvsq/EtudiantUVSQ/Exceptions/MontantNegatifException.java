package fr.uvsq.EtudiantUVSQ.Exceptions;

public class MontantNegatifException extends RuntimeException {

	public MontantNegatifException() {
		super("Le montant donné est négatif");
		
	}

}