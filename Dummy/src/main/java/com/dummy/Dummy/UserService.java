package com.dummy.Dummy;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.arpit.webservices.exception.UserNotFoundException;


@RestController
public class UserService {
	
	@Autowired
	private UserRep userRepo;
	
	@Autowired
	private PostRepo postRepo;
	
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	/* This method get a Object by passing a id in request parameter*/
	@RequestMapping(value = "/getAllUsers/{id}", method = RequestMethod.GET)
	public Optional<User> retrieveUser(@PathVariable int id) throws Exception{
		Optional<User> user = userRepo.findById(id);
		System.out.println("User Is ::" +user);
		if ( !user.isPresent() ) {
			throw new UserNotFoundException("User not found with id ::: "+id);
		}
		return user;
	}
	
	/* This method saved a User Object and return Response to client with Status code we have used ResponseEntity class*/
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.POST)
	public ResponseEntity<Object> createUser( @Valid @RequestBody User user) {
		User user1 = userRepo.save(user);
		URI location =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user1.getId()).toUri();
		return 	ResponseEntity.created(location).build();
	}
	

	/* Deleting a Object */
	@RequestMapping(value = "/getAllUsers/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable int id) {
		userRepo.deleteById(id);
	}
	
	
	/* Updating a Object */
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.PUT)
	public void updateUser(@RequestBody User user) {
		userRepo.save(user);
	}
	
	
	/*One to Many Mappings Method*/
	
	
	@RequestMapping(value = "/getAllUsers/{id}/posts", method = RequestMethod.GET)
	public List<Post> getListOfPost(@PathVariable int id) throws Exception{
		Optional<User> user = userRepo.findById(id);
		System.out.println("User Is ::" +user);
		if ( !user.isPresent() ) {
			throw new UserNotFoundException("User not found with id ::: "+id);
		}
		return user.get().getPost();
	}
	
	
	@RequestMapping(value = "/getAllUsers/{id}/post", method = RequestMethod.POST)
	public ResponseEntity<Object> createPost( @RequestBody Post post, @PathVariable int id) {
		Optional<User> userPost = userRepo.findById(id);
		if ( !userPost.isPresent() )
			throw new UserNotFoundException("User not found with id ::: "+id);
		
		User user = userPost.get();
		post.setUser(user);
		postRepo.save(post);
		
		URI location =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId()).toUri();
		return 	ResponseEntity.created(location).build();
	}
}
