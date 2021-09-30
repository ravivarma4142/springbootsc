package com.userdata.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.userdata.data.UserData;
import com.userdata.repository.UserDataRepo;
import com.userdata.service.UserDataService;

@Service("userDataService")
public class UserDataServiceImpl implements UserDataService {

	@Autowired
	private UserDataRepo userRepo;

	@Override
	public boolean updateUserData(UserData userData) {

		try {
			userData.setCreatedDate(new Date());
			userRepo.save(userData);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public UserData fetchUser(String name) {

		List<UserData> users = userRepo.findAll().stream().filter(user -> user.getName() != null)
				.filter(user -> user.getName().equals(name)).collect(Collectors.toList());
		if (users.size() > 0)
			return users.get(0);

		return null;
	}

}