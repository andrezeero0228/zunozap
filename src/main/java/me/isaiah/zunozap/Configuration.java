package me.isaiah.zunozap;

import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.util.Properties;

 public class Configuration {
 	public static void change(String file, String field, String text) throws FileNotFoundException {
 		FileOutputStream out = new FileOutputStream(file);
 		FileInputStream in = new FileInputStream(file);
 		Properties props = new Properties();
 		try {
 			props.load(in);
 		} catch (IOException e1) {
 			e1.printStackTrace();
 		}
 		try {
 			in.close();
 		} catch (IOException e1) {
 			e1.printStackTrace();
 		}

 		props.setProperty(field, text);
 		try {
 			props.store(out, null);
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
 		try {
 			out.close();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
 	}
 	public static String view(String file, String field) throws FileNotFoundException {
        FileInputStream in = new FileInputStream(file);
 		Properties prop = new Properties();
        try {
 			prop.load(in);
 		} catch (IOException e1) {
 			e1.printStackTrace();
 		}
        try {
 			in.close();
 		} catch (IOException e1) {
 			e1.printStackTrace();
 		}
 	    return prop.getProperty(field);
 	}
 	
 }