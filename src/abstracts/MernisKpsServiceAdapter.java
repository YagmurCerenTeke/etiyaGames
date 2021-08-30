package abstracts;

import concretes.UserValidatorService;
import entities.User;
import webService.MernisKpsService;

public class MernisKpsServiceAdapter implements UserValidatorService {

	@Override
	public boolean isValid(User user) {
		
		MernisKpsService mernisKpsService = new MernisKpsService();
		
		return mernisKpsService.tcKimlikNoDogrula(Long.parseLong(user.getIdentityNumber()), 
				user.getFirstName(), user.getLastName(), user.getBirthYear());
		
	}

}
