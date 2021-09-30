package com.userdata.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.userdata.data.UserData;
import com.userdata.repository.UserDataRepo;
import com.userdata.serviceImpl.UserDataServiceImpl;
import com.userdata.test.UserDataApplicationTest;

public class UserDataTest extends UserDataApplicationTest{
	
	@InjectMocks
	@Autowired
	UserDataServiceImpl userService;
	
	@Autowired
	UserDataRepo userRepo;
	
	@Test
    public void saveUserTest() throws Exception{
        String user = "{\n" +
                "\t\"name\" : \"Varma\",\n" +
                "\t\"age\" : \"29\",\n" +
                "\t\"sex\": \"Male\",\n" +
                "\t\"country\" : \"Kingdom\"\n" +
                "}";

        UserData users= new ObjectMapper().readValue(user, UserData.class);
        boolean stats = userService.updateUserData(users);

        Assert.assertEquals(true, stats);

    }
	
	
	 @Test
	    public void searchUserTest() {
	        UserData user = userService.fetchUser("Varma");
	        Assert.assertTrue("Varma".equals(user.getName()));
	    }
}
