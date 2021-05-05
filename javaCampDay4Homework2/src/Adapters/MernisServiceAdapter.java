package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		 
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result;
		try {
			return client.TCKimlikNoDogrula( customer.getNationalityId(), customer.getFirtName().toUpperCase(),customer.getLastName().toUpperCase() , customer.getDateofBirth());
		} catch(RemoteException e) {
			e.printStackTrace();
			result = false;
		}
		
		return result;
		
		
			
		
	}

}
