package com.adactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties pro;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\user pc\\eclipse-workspace\\Adactin_7pm_Batch\\src\\test\\java\\com\\adactin\\configuration\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		pro = new Properties();
		pro.load(fis);

	}

	public String getBrowser() {
		String browser = pro.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}

}
