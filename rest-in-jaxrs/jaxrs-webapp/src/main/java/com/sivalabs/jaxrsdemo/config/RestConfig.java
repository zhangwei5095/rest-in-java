package com.sivalabs.jaxrsdemo.config;

//import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Siva
 *
 */
//@ApplicationPath("/rest")
public class RestConfig extends ResourceConfig
{
	public RestConfig()
	{
		packages("com.sivalabs.jaxrsdemo");
        register(JacksonFeature.class);
	}
}
