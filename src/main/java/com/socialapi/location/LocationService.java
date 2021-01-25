package com.socialapi.location;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {

	Location location=new Location("l1", "Mumbai");
	Location location1=new Location("l2", "Gujrat");
	Location location2=new Location("l3", "Goa");
	Location location3=new Location("l4", "Rajasthan");
	
	List<Location> locations=Arrays.asList(location,location1,location2,location3);

	
	
	public List<Location> getAllLocations()
	{
		return locations;
	}
	
	public Location getLocationById(String id)
	{
		Location location=locations.stream()
				.filter(t -> id.equals(t.getId()))
				.findFirst()
				.orElse(null);
		
		return location;
	}
}
