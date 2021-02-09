package com.socialapi.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialapi.location.Location;

@Service
public class UserService {


	@Autowired
	private UserRepository userRepository;
	

	public List<User> getAllUsers()	
	{	
		List<User> users=(List<User>)userRepository.findAll();
		return users;
	}
	
	public  Optional<User> getUserById(String id)
	{
	 return userRepository.findById(id);
	}

	public void addUser(User user)
	{
		userRepository.save(user);
	}

	public void updateUser(String id, User user)
	{	
		userRepository.save(user);
	}

	public void deleteUser(String id)
	{
		userRepository.deleteById(id);
	}

	public List<User> getUsersByLocationId(String id) 
	{
		return userRepository.findByLocationId(id);
	}

	public List<User> getUsersByFirstName(String firstname) 
	{	
		return userRepository.findByFirstname(firstname);
	}

	
	
	
	
	
//	User user = new User("101", "Sohail", "Shaikh", new Location("L1", "Mumbai"), "sohailss4444@gmail.com");
//
//	User user1 = new User("102", "Kedar", "Sir", new Location("L2", "Mumbai"), "kedarSir@gmail.com");
//	List<User> users = new ArrayList<>(Arrays.asList(user, user1));
//	
//	
//	public List<User> getAllUsers()	
//	{	
//		return users;
//	}
//	
//	public  User getUserById(String id)
//	{
//		User user=users.stream()
//				.filter(t -> id.equals(t.getId()))
//				.findFirst()
//				.orElse(null);
//		
//		return user;		
//	}
//
//	public void addUser(User user)
//	{
//			users.add(user);
//	}
//
//	public void updateUser(String id, User user)
//	{
//		for(int i=0;i<users.size();i++)
//		{	
//			User u=users.get(i);
//			
//			if(u.getId().equals(id))
//			{
//				users.set(i, user);
//			}
//		}	
//	}
//
//	public void deleteUser(String id)
//	{
//		users.removeIf(u ->u.getId().equals(id));
//	}
	
	
}
