package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FriendController {
	@Autowired
	private FriendService service;
	
	@GetMapping("/friend")			
	public List<Friend> getFriends() {
		return service.getFriends();

	}
	
	@PostMapping("/friend/add")
	public void addFriend(@RequestBody Friend friend) {
		service.addFriend(friend);
	}
	
	@PutMapping("friend/update")
	public void updateFriend(@PathVariable("id") Integer id, Friend friend) {
		service.updateFriend(friend);
	}
	@DeleteMapping("friend/{id}/delete")
	public void deleteFriend(@PathVariable("id") Integer id) {
		service.deleteFriend(id);
	}
	

}
