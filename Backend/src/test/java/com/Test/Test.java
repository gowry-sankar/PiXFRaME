package com.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAO.BillingaddressDAO;
import com.DAO.CartDAO;
import com.DAO.CategoryDAO;
import com.DAO.ProductDAO;
import com.DAO.RoleDAO;

import com.DAO.ShippingaddressDAO;
import com.DAO.SupplierDAO;
import com.DAO.UserDAO;
import com.Model.Billingaddress;
import com.Model.Cart;
import com.Model.Category;
import com.Model.User;
import com.Model.Product;
import com.Model.Role;
import com.Model.Shippingaddress;
import com.Model.Supplier;

public class Test {

	private static Cart productid;

	@SuppressWarnings("resource")
	public static void main (String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();

		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
		ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
		BillingaddressDAO billingaddressDAO = (BillingaddressDAO) context.getBean("BillingaddressDAO");
		CartDAO cartDAO = (CartDAO) context.getBean("CartDAO");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		ShippingaddressDAO shippingaddressDAO = (ShippingaddressDAO) context.getBean("ShippingaddressDAO");
		RoleDAO roleDAO = (RoleDAO) context.getBean("RoleDAO");
		
		Category category = (Category) context.getBean("category");
		User user = (User) context.getBean("user");
		Product product = (Product) context.getBean("product");
		Billingaddress billingaddress = (Billingaddress) context.getBean("billingaddress");
		Cart cart = (Cart) context.getBean("cart");
		Supplier supplier = (Supplier) context.getBean("supplier");
				Shippingaddress shippingaddress = (Shippingaddress) context.getBean("shippingaddress");
		Role role = (Role) context.getBean("role");
		
		
		category.setCategoryName("DSLR CAMERAS");
		
		categoryDAO.saveOrUpdate(category);
		
		
		
	}

	}