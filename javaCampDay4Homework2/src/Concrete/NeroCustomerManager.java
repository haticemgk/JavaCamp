package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager  {
	
	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) 
	{
		this.customerCheckService= customerCheckService;
	}
	
	public void save(Customer customer)
	{
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("not valid a person");
		}
	}
		
	

}
