package com.socialapi.post;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialapi.location.Location;
import com.socialapi.user.User;

@RestController
public class PostController {

	@Autowired
	private PostService postService;
	
	@RequestMapping(value = "/posts")
	public List<Post> getAllPosts(){
		return postService.getAllPosts();
	}
	
	@RequestMapping(value="/posts/{id}")
	public Post getPostById(@PathVariable String id)
	{
		return postService.getPostById(id);
	}
	
}
