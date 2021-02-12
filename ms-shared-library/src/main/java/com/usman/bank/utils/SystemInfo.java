/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utils;

import java.net.InetAddress;

import com.usman.bank.constants.Constants;

/**
 * Description: This class SystemInfo.java
 *
 * @author  vXebiau
 * @date    Nov 24, 2019
 * @version 1.0
 *
 */
public class SystemInfo {

	/**
	 * Get host-name of the machine
	 * @return
	 */
	public static String getHostname() {
		String hostname = "Unknown";

		try {
			InetAddress addr;
			addr = InetAddress.getLocalHost();
			hostname = addr.getHostName();
			System.out.println("Hostname :" + hostname);
			System.out.println("\n****Renaming the hostname to test the KNet redirection with DCP-USMAN ***");
			hostname="DCP-USMAN";
			System.out.println("Renamed Hostname :" + hostname);
		} catch (Exception ex) {
			System.err.println("Hostname can not be resolved");
		}
		return hostname;
	}
	
	/**
	 * Get environment name
	 * @return
	 */
	public static String getEnvironment() {
		String env = "dev";
		try {
			if(!getHostname().equals(Constants.DEV_HOSTNAME)) {
				env = "uat";
			}
			System.out.println("env :" + env);
		} catch (Exception ex) {
			System.err.println("Hostname can not be resolved");
		}
		return env;
	}
	
	/**
	 * Get IP Address
	 * @return
	 */
	public static String getIPAddress() {
		String ipaddress = "127.0.0.1";
		try {
			InetAddress addr;
			addr = InetAddress.getLocalHost();
			ipaddress = addr.getHostAddress();
			System.out.println("ipaddress :" + ipaddress);
		} catch (Exception ex) {
			System.err.println("Hostname can not be resolved");
		}
		return ipaddress;
	}
}
