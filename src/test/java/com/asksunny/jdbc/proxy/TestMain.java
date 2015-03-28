package com.asksunny.jdbc.proxy;

import java.lang.reflect.Method;
import java.sql.ParameterMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class TestMain {

	public TestMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class<ResultSetMetaData> clzaa = 	ResultSetMetaData.class;
		
		Method[]  m = clzaa.getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			String name = m[i].getName();
			if(name.startsWith("get")){
				name = m[i].getReturnType().getSimpleName().toLowerCase() + " " + name.substring(3, 4).toLowerCase() + name.substring(4);
			}else if (name.startsWith("is")){
				name = "bool " +  name.substring(2, 3).toLowerCase() + name.substring(3);
			}
			
			System.out.println(String.format("%s,", name, m[i].getReturnType().getSimpleName()));
		}
		

	}

}


