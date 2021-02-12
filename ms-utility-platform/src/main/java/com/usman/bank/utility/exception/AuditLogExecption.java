/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.exception;

/**
 * Description: This class AuditLogExecption.java
 *
 * @author  vXebiau
 * @date    Sep 11, 2019
 * @version 1.0
 *
 */
public class AuditLogExecption extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AuditLogExecption() {
		super();
	}
	
	 public String getMessage() {
        return "Audit Exception:"+ super.getMessage();
    }
}
