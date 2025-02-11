package com.dev.userService.dto;

import java.util.Date;
import java.util.List;

import com.dev.userService.model.User;

public class UserDto {
	
	private String id;
	private String name;
	private String username;
	private String email;
	private Date dob;
	private String about;
	private String token;
	private List<String> friendIds;
	private List<String> pendingRequests;
	private List<String> friendRequests;
	
	public UserDto(User user, String token) {
		this.id = user.getId();
		this.name = user.getName();
		this.username = user.getUsername();
		this.token = token;
		this.about = user.getAbout();
		this.dob = user.getDob();
		this.email = user.getEmail();
		this.friendIds = user.getFriendIds();
		this.pendingRequests = user.getPendingRequests();
		this.friendRequests = user.getFriendRequests();
	}
	
	public List<String> getPendingRequests() {
		return pendingRequests;
	}

	public void setPendingRequests(List<String> pendingRequests) {
		this.pendingRequests = pendingRequests;
	}

	public List<String> getFriendRequests() {
		return friendRequests;
	}
	public void setFriendRequests(List<String> friendRequests) {
		this.friendRequests = friendRequests;
	}
	public String getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getFriendIds() {
		return friendIds;
	}
	public void setFriendIds(List<String> friendIds) {
		this.friendIds = friendIds;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", dob=" + dob
				+ ", about=" + about + ", token=" + token + ", friendIds=" + friendIds + ", pendingRequests="
				+ pendingRequests + ", friendRequests=" + friendRequests + "]";
	}
}
