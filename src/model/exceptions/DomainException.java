package model.exceptions;

public class DomainException extends Exception { //exceções personalizadas herdam de Exception		
	private static final long serialVersionUID = 1L; //classes serializeble precisão declarar um numero de versão
	
	public DomainException(String msg) {
		super(msg);
	}
}
