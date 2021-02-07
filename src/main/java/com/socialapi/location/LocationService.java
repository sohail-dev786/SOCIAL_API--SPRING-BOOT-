package com.socialapi.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {

	Location location=new Location("l1", "Mumbai");
	Location location1=new Location("l2", "Gujrat");
	Location location2=new Location("l3", "Goa");
	Location location3=new Location("l4", "Rajasthan");
	
	List<Location> locations=new ArrayList<>(Arrays.asList(location,location1,location2,location3));

	
	
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

	public void addLocation(Location location) {
		locations.add(location);	
	}

	public void updateLocation(String id, Location location) {
		
		for(int i=0;i<locations.size();i++) {
			
			Location l=locations.get(i);
			
			if(l.getId().equals(id))
			{
				locations.set(i, location);
			}
			
		}
		
	}

	public void deleteLocation(String id) {
		
		locations.removeIf(l ->l.getId().equals(id));
	}
}
