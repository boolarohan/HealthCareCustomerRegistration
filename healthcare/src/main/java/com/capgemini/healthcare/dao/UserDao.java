package com.capgemini.healthcare.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.capgemini.healthcare.dto.DiagnosticCenter;
import com.capgemini.healthcare.dto.Test;
import com.capgemini.healthcare.dto.User;

public interface UserDao {
	 
	  //public boolean addCenter(ArrayList <DiagnosticCenter> center);
	  //public boolean removeCenter(ArrayList <DiagnosticCenter> center);
	  //public String addTest(ArrayList<Test> test);
	  //public boolean removeTest(ArrayList<Test> test);
	  //public boolean approveAppointment();
	  //public String makeAppointment(ArrayList <User> user,ArrayList <DiagnosticCenter> center,ArrayList<Test> test,List<Date> datetime);
	  public String register(List<User> user);
}
