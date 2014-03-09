package org.uwiga.dao;

import java.util.ArrayList;
import java.util.List;

import org.uwiga.model.Customer;

public class App {
	
	public App(){
		//objek dao
		CustomerDao customerManager = new CustomerDaoImpl();
		
		//memasukkan data
		Customer cust1 = new Customer();
		cust1.setIdCustomer("1992");
		cust1.setName("Rifqy");
		customerManager.saveOrUpdate(cust1);
		
		Customer cust2 = new Customer();
		cust2.setIdCustomer("1991");
		cust2.setName("nuril");
		customerManager.saveOrUpdate(cust2);
		
		//menampilkan data
		List<Customer> keranjangCustomer = new ArrayList<>();
		keranjangCustomer = customerManager.findAll();
		for (Customer item : keranjangCustomer){
			System.out.println(item);
		}
		for (int i=0; i<keranjangCustomer.size(); i++){
			Customer item = new Customer();
			item = keranjangCustomer.get(i);
			System.out.println(item);
		}
	}
	
	public static void main (String[]args){
		App f = new App();
	}

}
