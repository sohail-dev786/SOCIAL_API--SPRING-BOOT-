package com.socialapi.post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialapi.location.Location;
import com.socialapi.user.User;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public List<Post> getAllPosts()
	{
		List<Post> posts=(List<Post>)postRepository.findAll();
		return posts;
	}
	
	public Optional<Post> getPostById(String id)
	{
		return postRepository.findById(id);
	}

	public void addPost(Post post) 
	{		
		postRepository.save(post);	
	}

	public void addPost(String id, Post post) 
	{
		postRepository.save(post);
	}
	

	public void deletePost(String id) 
	{
	postRepository.deleteById(id);
	}
	

	
	
	
	// HARD CODED VALUES --> METHOD APPROACH

//	User user = new User("101", "Sohail", "Shaikh", new Location("L1", "Mumbai"), "sohailss4444@gmail.com");
//
//	User user1 = new User("102", "Kedar", "Sir", new Location("L2", "Mumbai"), "kedarSir@gmail.com");
//	User user2 = new User("103", "Viral", "Demo", new Location("L3", "Mumbai"), "Viral@gmail.com");
//
//	Post post = new Post("p1", "26-Jan-2021", user, "First Post");
//
//	Post post1 = new Post("p2", "26-Jan-2021", user1, "Second Post");
//	Post post2 = new Post("p3", "26-Jan-2021", user2, "Third Post");
//	
//	List<Post> posts = new ArrayList<>(Arrays.asList(post, post1, post2));

	
	
	
//	public List<Post> getAllPosts(){
//		return posts;
//	}
//	
//	public Post getPostById(String id){
//		Post post=posts.stream()
//				.filter(t -> id.equals(t.getId()))
//				.findFirst()
//				.orElse(null);
//		
//		return post;	
//	}
//
//	public void addPost(Post post) {		
//		posts.add(post);
//	}
//
//	public void addPost(String id, Post post) {
//		
//		for(int i=0;i<posts.size();i++) {
//			
//			Post p=posts.get(i);
//			
//			if(p.getId().equals(id))
//			{
//				posts.set(i, post);
//			}
//		}
//	}
//
//	public void deletePost(String id) {
//	
//		posts.removeIf(p ->p.getId().equals(id));
//	}
//	
	
	
}
