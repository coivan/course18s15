package model.exceptions;

public class DomainException extends Exception { //exce��es personalizadas herdam de Exception		
	private static final long serialVersionUID = 1L; //classes serializeble precis�o declarar um numero de vers�o
	
	public DomainException(String msg) {
		super(msg);
	}
}
