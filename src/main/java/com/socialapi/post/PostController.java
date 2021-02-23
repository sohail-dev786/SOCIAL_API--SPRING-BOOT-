package com.socialapi.post;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.socialapi.location.Location;
import com.socialapi.user.User;

@RestController
public class PostController {

	@Autowired
	private PostService postService;
	
	@RequestMapping(value = "/posts")
	public List<Post> getAllPosts()
	{
		return postService.getAllPosts();
	}
	
	@RequestMapping(value="/posts/{id}")
	public Optional<Post> getPostById(@PathVariable String id)
	{
		return postService.getPostById(id);
	}
	
	@RequestMapping(value="/posts",method = RequestMethod.POST)
	public void addPost(@RequestBody Post post) 
	{
		postService.addPost(post);
	}
	
	@RequestMapping(value = "/posts/{id}",method =RequestMethod.PUT)
	public void updatePost(@RequestBody Post post,@PathVariable String id) {
		
		postService.updatePost(id,post);
		
	}
	
	@RequestMapping(value = "/posts/{id}",method = RequestMethod.DELETE)
	public void deletePost(@PathVariable String id) {
		postService.deletePost(id);
	}
	
}
