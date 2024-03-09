package com.hms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hms.dao.PatientDAO;
import com.hms.dao.PatientDAOImpl;
import com.hms.model.patient;
import com.hms.util.HibernateUtil;


@WebServlet("/seeep")
public class seeep extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private  PatientDAO patientDAO;
	
	public seeep() {
        this.patientDAO = new PatientDAOImpl(HibernateUtil.getSessionFactoy());
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname =request.getParameter("pname");
		String email =request.getParameter("email");
		String address =request.getParameter("address");
		
		patient p = new patient();
		p.setPid(pid);
		p.setPname(pname);
		p.setEmail(email);
		p.setAddress(address);
		
		patientDAO.savePatient(p);
		System.out.println("Data inserted");
	}

	
	

}
