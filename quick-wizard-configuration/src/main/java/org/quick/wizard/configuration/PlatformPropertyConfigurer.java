package org.quick.wizard.configuration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class PlatformPropertyConfigurer extends PropertyPlaceholderConfigurer
{

	private String propertiesFile;

	@Override
	protected void loadProperties(final Properties properties) throws IOException
	{
		Resource fileSystemResource = null;
		
		String platformHome = System.getenv("PLATFORM_PROPERTIES_HOME");
		if(null == platformHome)
		{
			platformHome = System.getProperty("PLATFORM_PROPERTIES_HOME");
		}
		
		if(null != platformHome && null != propertiesFile)
		{
			fileSystemResource = new FileSystemResource(platformHome + File.separator + propertiesFile);
		}
		else
		{
			System.out.println("NO REMOTE PROPERTIES FILE EXIST!!");
		}
		
		DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource localProperties = resourceLoader.getResource("classpath:"+propertiesFile);
		
		List<Resource> resources = new ArrayList<Resource>();
		resources.add(fileSystemResource);
		resources.add(localProperties);
		
		setLocations(resources.toArray(new Resource[resources.size()]));
		
		super.loadProperties(properties);
	}

	public String getPropertiesFile()
	{
		return propertiesFile;
	}

	public void setPropertiesFile(final String propertiesFile)
	{
		this.propertiesFile = propertiesFile;
	}

}
