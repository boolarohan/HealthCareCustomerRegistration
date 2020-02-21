package com.capgemini.healthcare.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.healthcare.dao.UserDao;
import com.capgemini.healthcare.dao.UserDaoImpl;
import com.capgemini.healthcare.dto.DiagnosticCenter;
import com.capgemini.healthcare.dto.Test;
import com.capgemini.healthcare.dto.User;

public class ServiceLayerImpl implements ServiceLayer {
	UserDao userdao=new UserDaoImpl();

	public boolean addCenter(ArrayList<DiagnosticCenter> center) {
	// TODO Auto-generated method stub
	return false;
	}

	public boolean removeCenter(ArrayList<DiagnosticCenter> center) {
	// TODO Auto-generated method stub
	return false;
	}

	public String addTest(ArrayList<Test> test) {
	// TODO Auto-generated method stub
	return null;
	}

	public boolean removeTest(ArrayList<Test> test) {
	// TODO Auto-generated method stub
	return false;
	}

	public boolean approveAppointment() {
	// TODO Auto-generated method stub
	return false;
	}

	public String makeAppointment(ArrayList<User> user, ArrayList<DiagnosticCenter> center, ArrayList<Test> test,
	List<Date> datetime) {
	// TODO Auto-generated method stub
	return null;
	}

	public String register(List<User> user) {

	return null;
	}
	public boolean validateName(String username) {
	Pattern p=Pattern.compile("[A-Z]\\w");
	Matcher m=p.matcher(username);
	if(m.find())
	  return true;
	else
	return false;
	}

	public boolean validatePassword(String userpassword) {

	Pattern p1=Pattern.compile("\\w{1,4}[!@#$%^&*]{1,4}+");
	Matcher m1=p1.matcher(userpassword);
	if(m1.find())
	  return true;
	else
	return false;
	}
	public boolean validateNum(String contactno) {
	Pattern p1=Pattern.compile("0?[7-9][0-9]{9}");
	Matcher m1=p1.matcher(contactno);
	if(m1.find())
	  return true;
	else
	  return false;
	}

	public boolean validateemail(String email) {
	Pattern p1=Pattern.compile("[0-9a-zA-Z][0-9a-zA-Z._]*[@]gmail.com");
	Matcher m1=p1.matcher(email);
	if(m1.find())
	  return true;
	else
	  return false;
	}
	  /*public void downloadAppointmentService(){
	 System.out.println("-----------------");
	 userdao.download();
	  }*/

}
