package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.*;

import com.bean.LoginBean;

@Service
public class LoginService {
	
	public boolean validate(LoginBean bean)	{
		String uName=bean.getUserName();
		String pass=bean.getPassword();
		if(uName.equals(pass))
		{
		    return true;
		}
		return false;
	}
	

}
