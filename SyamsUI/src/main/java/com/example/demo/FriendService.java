package com.example.demo;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {
	@Autowired
	private FriendRepository repository;
	
	public List<Friend> getFriends() {		
		List<Friend> result = repository.findAll();
		 System.out.println(result.toString());
		 for(Friend model : result) {
	            System.out.println(model.getFirstname());
	        }
		
		return result;
		
		
	}

	public  void addFriend(Friend friend) {
		repository.save(friend);
	}

	public void updateFriend(Friend friend) {
		repository.save(friend);
	}
	
public void deleteFriend(Integer id) {
	repository.deleteById(id);
		
	}


}
