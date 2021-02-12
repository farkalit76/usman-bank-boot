//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.usman.bank.transfer.exception;

public class NotEnoughDataException extends Exception {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotEnoughDataException() {
    }

    public NotEnoughDataException(String msg) {
        super(msg);
    }
    
	public String getMessage() {
		return "Not Enough data Exception:" + super.getMessage();
	}
}
