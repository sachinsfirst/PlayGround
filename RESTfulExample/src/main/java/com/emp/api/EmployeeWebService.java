package com.emp.api;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.emp.service.EmployeeService;
 
@Path("/user")
public class EmployeeWebService {
	
	
	private EmployeeService employeeService;
 
	@GET
	@Path("/echo/{message}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "echo : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response addUser(@FormParam("name") String name,	@FormParam("id") int id) {

		return Response.status(200)
				.entity("Added Succesfully !, Name : " + name + ", Id : " + id)
				.build();

	}
 
}