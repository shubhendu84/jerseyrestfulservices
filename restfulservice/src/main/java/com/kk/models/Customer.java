package com.kk.models;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement//(name="Customer")
public class Customer {

	// Core Customer Fields
    private String customerId;      // Unique Axis Bank Customer ID (e.g., "AXIS123456")
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String accountType;     // "SAVINGS", "CURRENT", "SALARY"
    private String accountNumber;   // 15-digit Axis Bank account number
    private BigDecimal balance;     // Current available balance
	
    public Customer() {
    	// default constructor
    }
    
    public Customer(String customerId, String firstName, String lastName, String email, String phoneNumber,
			String accountType, String accountNumber, BigDecimal balance) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
    
    
}
