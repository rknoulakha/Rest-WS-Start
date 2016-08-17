package com.tutorialspoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserServices")
public class UserService {

	UserDao userDao = new UserDao();

	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers() {

		List<User> str = userDao.getAllUsers();
		return userDao.getAllUsers();
	}

	@GET
	@Path("/color")
	@Produces(MediaType.TEXT_PLAIN)
	public String getColors() {
		String str = new String("Red");
		return str;
	}
}