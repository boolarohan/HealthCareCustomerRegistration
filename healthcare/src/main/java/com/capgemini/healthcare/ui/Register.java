package com.capgemini.healthcare.ui;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.healthcare.dto.User;
import com.capgemini.healthcare.service.ServiceLayer;
import com.capgemini.healthcare.service.ServiceLayerImpl;

public class Register {
	static HashMap<String, String> adminlist = new HashMap<String, String>();
	static HashMap<String, User> userlist = new HashMap<String, User>();

	public Register() {
		addSomeAdminDetails();
		addSomeUser();
	}

	private void addSomeUser() {
		User u1 = new User("101", "manikanta", "Nagi" + "reddymani", 9505411992L, "Customer", "16211a0278@gmail.com",
				21, "male");
		User u2 = new User("102", "harsh", "SambhuHarsh", 8106327350L, "Customer", "16211a0280@gmail.com", 25, "male");
		userlist.put(u1.getUserName(), u1);
		userlist.put(u2.getUserName(), u2);
	}

	public static void addSomeAdminDetails() {
		adminlist.put("Nagireddymani", "11111");
		adminlist.put("eppakayala", "22222");
		adminlist.put("Ravali2420", "33333");
		adminlist.put("Ashritha3", "4444");

	}

	public static void main(String[] args) throws Exception {
		ServiceLayerImpl service = new ServiceLayerImpl();
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println("Home");
		System.out.println("1.Customer");
		System.out.println("2.Admin");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			int n;
			System.out.println("1.Register\n2.exit");
		case 2:
			System.out.println("YOU ARE NOT AUTHORISED");
			System.out.println("Enter your Choice:");
			n = sc.nextInt();
			switch (n) {
			case 1:
				register(); 
				break;
			case 2:
				System.out.println("EXIT");
				break;
			default:
			System.out.println("Go  to Home");
			break;
			}
		}
		

	}

	private static void downloadAppointment() {
		// TODO Auto-generated method stub

	}

	private static void login() {
		// TODO Auto-generated method stub

	}

	public static void register() {
		ServiceLayer service = new ServiceLayerImpl();
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("REGISTRATION FORM");
		User u = new User();
		u.setUserId(Integer.toString(Math.abs(rand.nextInt(1000))));
		System.out.println("UserId : " + u.getUserId());

		System.out.println("UserName : ");
		String username = sc.next();
		if (service.validateName(username)) {
			System.out.println("Validated Successfully");
			u.setUserName(username);
		} else {
			System.out.println(
					"Name should not start with special characters and should not be blank. First letter should be capital ");
		}
		// UserPassword
		System.out.println("UserPassword : ");
		String userpassword = sc.next();
		if (service.validatePassword(userpassword)) {
			System.out.println("Validated Successfully");
			u.setUserPassword(userpassword);
		} else {
			System.out.println(
					" Password must contain one number,one alphabet,one special character and size should be at least 8 characters and not more than 14 characters.");
		}

		// Contact Number
		System.out.println("Contact No : ");
		long contactno = sc.nextLong();
		if (service.validateNum(Long.toString(contactno))) {
			u.setContactNo(contactno);
			System.out.println("Validated Successfully");
		} else {
			System.out.println("Invalid Number");
		}
		System.out.println("Age : ");
		u.setAge(sc.nextInt()); // Age
		System.out.println("Gender : ");
		u.setGender(sc.next()); // Gender
		System.out.println("UserRole : ");
		u.setUserRole(sc.next()); // StudentRole

		// email
		System.out.println("email Id : ");
		String email = sc.next();
		if (service.validateemail(email)) {
			System.out.println("Validated Successfully");
			u.setEmailId(email);
		} else {
			System.out.println("Invalid Email");
		}
		userlist.put(u.getUserName(), u.getUserPassword());
		// System.out.println("......................");
		// System.out.println(userlist);
		// System.out.println("......................");
		login();

	}

}
