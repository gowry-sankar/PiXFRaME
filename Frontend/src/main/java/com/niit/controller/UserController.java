package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DAO.RoleDAO;
import com.DAO.UserDAO;
import com.Model.Role;
import com.Model.User;

public class UserController {
        @Autowired
        private UserDAO userDAO;

        @Autowired
        private RoleDAO roleDAO;

        @Autowired
        private Role role;
        @RequestMapping("addnewuser")
        public String addUser(@ModelAttribute User user, Model model) {


                user.setEnabled(true);
                role.setEmail(user.getEmail());
                role.setRole("ROLE_USER");
                role.setUserName(user.getUserName());
                role.setContactNumber(user.getContactNumber());

                user.setRole(role);
                role.setUser(user);

                userDAO.saveOrUpdate(user);
                roleDAO.saveOrUpdate(role);

               
                model.addAttribute("loginButtonClicked", true);
                return "";

        }

}