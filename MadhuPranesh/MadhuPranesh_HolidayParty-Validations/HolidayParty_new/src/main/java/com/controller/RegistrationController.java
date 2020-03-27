package com.controller;
import com.model.*;
import com.validate.CustomValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

                  @Autowired
                private CustomValidator custValidator;

                @RequestMapping(value = "/register", method = RequestMethod.POST)

                public String performRegistration(@ModelAttribute("register") RegistrationBean registrationBean,BindingResult result) {

                custValidator.validate(registrationBean,result);

                if (result.hasErrors()) {

                return "registrationpage";
                }

                return "thankyou";

                }

                @RequestMapping(value="/registrationpage", method=RequestMethod.GET)

                public String registerPage(@ModelAttribute("register")RegistrationBean registrationBean,BindingResult result) {
                
                return "registrationpage";

                }
                
                }    