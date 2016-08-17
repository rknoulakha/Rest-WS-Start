package com.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tutorialspoint.User;
import com.tutorialspoint.UserDao;

@Path("/colors")
public class Colors {

	@GET
	@Path("/colorList")
	@Produces(MediaType.TEXT_PLAIN)
	public String getColors() {
		String str = new String("Red");
		return str;
	}

	UserDao userDao = new UserDao();

	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers() {

		List<User> str = userDao.getAllUsers();
		return userDao.getAllUsers();
	}

}
