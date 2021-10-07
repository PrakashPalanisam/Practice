package org.sample;

import org.base.Employee;

public class Client {
	private void Clientid() {
		System.out.println("Client id is 456123");

	}
	private void Clientname() {
		System.out.println("Client name is Venki");

	}
	
	public static void main(String[] args) {
		Client x=new Client();
		x.Clientid();
		x.Clientname();
		
		Employee e= new Employee();
		e.empid();
		e.empname();
		 
		
		
	}

}
