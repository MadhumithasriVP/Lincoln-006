package com.validate;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.stereotype.Component;
import com.model.RegistrationBean;


@Component
public class CustomValidator implements Validator{

	
	public void validate(Object arg0, Errors arg1) {
             RegistrationBean reg=(RegistrationBean)arg0;

                if(reg.getUserName().equals("")) {
                arg1.rejectValue("userName","","User Name cannot be blank");
                }

                String regex=""+reg.getContactNumber();
                if(regex.length()!=10) {
                                arg1.rejectValue("contactNumber","","Contact Number should be of 10 digits/Conact Number should not be blank");
                }

                if(reg.getEmailId().equals("")) {
                                arg1.rejectValue("emailId","","Email ID cannot be blank");
                }
                String regex1="[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+";
                if(reg.getEmailId().matches(regex1)==false) {
                                arg1.rejectValue("emailId","","Should be a proper email ID format" );
                }


                if(reg.getConfirmEmailId().equals("")) {
                                arg1.rejectValue("confirmEmailId","","Email ID cannot be blank");
                }
                String regex2="[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+";
                if(reg.getConfirmEmailId().matches(regex2)==false) {
                                arg1.rejectValue("confirmEmailId","","Should be a proper email ID format" );
                }
                if(reg.getEmailId().equals(reg.getConfirmEmailId())==false) {
                                arg1.rejectValue("confirmEmailId","","Email and Confirm Email should be same");
                }
                if(reg.isStatus()==false) {
                                arg1.rejectValue("status","","please agree to the terms and conditions");
                }

                }                                                                                                                           

	 	  	    	    	     	      	 	

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
	return RegistrationBean.class.isAssignableFrom(arg0);
	}
	

}
