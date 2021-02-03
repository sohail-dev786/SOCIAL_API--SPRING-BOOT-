package com.socialapi.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.socialapi.location.Location;

@Service
public class UserService {

	
	User user=new User(
			"101",
			"Sohail",
			"Shaikh",
			new Location("L1","Mumbai"),
			"sohailss4444@gmail.com"
			);
	
	User user1=new User(
			"102",
			"Kedar",
			"Sir",
			new Location("L2","Mumbai"),
			"kedarSir@gmail.com"
			);
	List<User> users= new ArrayList<>(Arrays.asList(user,user1));

	
	public List<User> getAllUsers()	{	
		return users;
	}
	
	public  User getUserById(String id){
		User user=users.stream()
				.filter(t -> id.equals(t.getId()))
				.findFirst()
				.orElse(null);
		
		return user;		
	}

	public void addUser(User user) {
			users.add(user);
	}

	
	
	public void updateUser(String id, User user)
	{
		for(int i=0;i<users.size();i++)
		{	
			User l=users.get(i);
			
			if(l.getId().equals(id))
			{
				users.set(i, user);
			}
		}	
	}

	
	
}
