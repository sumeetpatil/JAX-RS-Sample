package com.maventic.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/library")
public class Library extends javax.ws.rs.core.Application {

	@GET
	@Path("/books")
	public String getBooks() {
		return "List of Books";
	}

	@GET
	@Path("/book/{isbn}")
	public String getBook(@PathParam("isbn") String id) {
		return "Test with id = " + id;
	}
}