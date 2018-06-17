package org.calculatorimc.client;

import java.rmi.RemoteException;

import org.calculatorimc.webservice.CalculatorIMCWebService;
import org.calculatorimc.webservice.CalculatorIMCWebServiceProxy;

public class Main {

	public static void main(String[] args) {
		try {
			CalculatorIMCWebService calculatorwebservice = new CalculatorIMCWebServiceProxy();
			String resultImc = calculatorwebservice.calculateIMC(81.2, 1.84);
			System.out.println(resultImc);
		} catch(RemoteException re) {
			re.printStackTrace();
		}
	}
}
