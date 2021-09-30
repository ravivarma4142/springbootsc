package com.userdata.service;

import com.userdata.data.UserData;

public interface UserDataService {

	public boolean updateUserData(UserData userData);

	public UserData fetchUser(String name);
}
