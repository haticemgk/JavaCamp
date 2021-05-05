package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckManager customerCheckManager;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService, CustomerCheckManager customerCheckManager) {
		super();
		this.customerCheckManager=customerCheckManager;
	}
	
	@Override
	public void save(Customer customer) {
		if (customerCheckManager.CheckIfRealPerson(customer))
		{
			super.save(customer);
		}else
		{
			System.out.println("Not a valid person");
		}
	}

	

	
}
