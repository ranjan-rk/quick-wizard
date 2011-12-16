package org.quick.wizard.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/qw")
@Consumes( { "application/xml", "application/json" })
@Produces( { "application/xml", "application/json" })
public interface IQuickWizardService {

	@GET
	@Path("/appname")
	String getApplicationName();
}
