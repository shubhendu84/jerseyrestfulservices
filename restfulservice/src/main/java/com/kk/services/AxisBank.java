package com.kk.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import com.kk.models.Customer;

@Path("/customer")
public class AxisBank {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Customer> getCustomerProfile() {
		
		// 1. Savings Account - Kisan (farmer)
		   Customer customer1 = new Customer(
	                "AXIS12345", "Rahul", "Sharma", "rahul.sharma@email.com", 
	                "+919876543210", "SAVINGS", "923010012345678", new BigDecimal("75000.50")
	            );
		// 2. Current Account - Business Owner
		   Customer customer2 = new Customer(
		       "AXIS67890", "Priya", "Patel", "priya.patel@outlook.com", 
		       "+919812345678", "CURRENT", "926020054321098", new BigDecimal("450000.75")
		   );

		   // 3. Salary Account - Corporate Employee
		   Customer customer3 = new Customer(
		       "AXIS54321", "Amit", "Verma", "amit.verma@gmail.com", 
		       "+919123456789", "SALARY", "923010098765432", new BigDecimal("125000.00")
		   );

		   // 4. Savings Account - Senior Citizen
		   Customer customer4 = new Customer(
		       "AXIS11223", "Sunita", "Kulkarni", "s.kulkarni@yahoo.com", 
		       "+918765432109", "SAVINGS", "923010088776655", new BigDecimal("8900.25")
		   );

		   // 5. Savings Account - Tech Professional
		   Customer customer5 = new Customer(
		       "AXIS44556", "Vikram", "Singh", "vikram.singh@live.com", 
		       "+917012345678", "SAVINGS", "923010022334455", new BigDecimal("320500.60")
		   );

		   // 6. Current Account - Retail Trader
		   Customer customer6 = new Customer(
		       "AXIS99887", "Ananya", "Nair", "ananya.nair@icloud.com", 
		       "+919945678901", "CURRENT", "926020077665544", new BigDecimal("18500.00")
		   );

			/*
			 * List<Customer> listofcustomer = new ArrayList<Customer>();
			 * listofcustomer.add(customer1); listofcustomer.add(customer2);
			 * listofcustomer.add(customer3); listofcustomer.add(customer4);
			 * listofcustomer.add(customer5); listofcustomer.add(customer6);
			 */
		   
		   List<Customer> listofcustomer=Arrays.asList(customer1,customer2);
		   
		return listofcustomer;   
		
	}
	
	public void checkBalance() {
	        
	        
	}
}
