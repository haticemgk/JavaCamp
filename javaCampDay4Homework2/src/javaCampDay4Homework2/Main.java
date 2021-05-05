package javaCampDay4Homework2;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer= new Customer();
		customer.setId(1);
		customer.setFirtName("hatice");
		customer.setLastName("ersoy");
		customer.setDateofBirth(1987);
		customer.setNationalityId(98765431);
		
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		
		baseCustomerManager.save(customer);
		
		
	}

	
	
	
	

}


