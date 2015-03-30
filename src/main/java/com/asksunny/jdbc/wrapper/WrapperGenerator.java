package com.asksunny.jdbc.wrapper;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class WrapperGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		genResultSetMetaData();
	}
	
	
	
	public static void genResultSetMetaData() throws Exception {
		StringBuilder buf = new StringBuilder();
		Class<ResultSetMetaData> cstmtClazz = ResultSetMetaData.class;
		Method[] methods = cstmtClazz.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			String name = m.getName();
			if(name.startsWith("is")){
				name = m.getName().substring(2,3).toLowerCase() + name.substring(3);
			}else if (name.startsWith("get")){
				name = m.getName().substring(3,4).toLowerCase() + name.substring(4);
			}
			
			buf.append(String.format("private %2$s %1$s;\n", name, m.getReturnType().getSimpleName()));
		}

		PrintWriter out = new PrintWriter(new File("resultsetmetadata.txt"));
		out.println(buf.toString());
		out.flush();
		out.close();
		System.out.println(buf.toString());
	}
	
	
	private static String implementResultSetMetaDataMethod(Method m) {
		StringBuilder buf = new StringBuilder();
		int modifier = m.getModifiers();
		if ((modifier & Modifier.PUBLIC) > 0) {
			buf.append("public ");
		} else if ((modifier & Modifier.PROTECTED) > 0) {
			buf.append("protected ");
		} else if ((modifier & Modifier.PRIVATE) > 0) {
			buf.append("private ");
		}

		if ((modifier & Modifier.STATIC) > 0) {
			buf.append("static ");
		}

		if ((modifier & Modifier.SYNCHRONIZED) > 0) {
			buf.append("synchornized ");
		}

		buf.append(m.getReturnType().getSimpleName());
		buf.append(" ").append(m.getName()).append("(");
		Class<?>[] params = m.getParameterTypes();
		for (int i = 0; i < params.length; i++) {
			if (params[i].isArray()) {
				buf.append(params[i].getSimpleName()).append(" ");
				String name = params[i].getSimpleName().toLowerCase();
				buf.append(name.subSequence(0, name.length() - 2))
						.append("sArg").append(i);
			} else {
				buf.append(params[i].getSimpleName()).append(" ")
						.append(params[i].getSimpleName().toLowerCase())
						.append("Arg").append(i);
			}
			if (i < params.length - 1)
				buf.append(",");
		}
		buf.append(") ");

		Class<?>[] exs = m.getExceptionTypes();
		if (exs != null && exs.length > 0) {
			buf.append("throws ");
			for (int i = 0; i < exs.length; i++) {
				buf.append(exs[i].getSimpleName());
				if (i < exs.length - 1)
					buf.append(", ");
			}
		}
		buf.append("{\n ");

		String mname = m.getName();
		if (m.getName().startsWith("get") && m.getParameterTypes().length > 0
				&& m.getParameterTypes()[0].equals(String.class)
				&& !m.getReturnType().getSimpleName().equals("void")) 
		{			
			buf.append("int columnIndex = getColumnIndex(stringArg0);\n");
			buf.append("return ").append(m.getName()).append("(columnIndex);\n");			
		}else if (m.getName().startsWith("get") && m.getParameterTypes().length > 0
				&& m.getParameterTypes()[0].equals(int.class)
				&& !m.getReturnType().getSimpleName().equals("void")) 
		{
			buf.append("return getObject(intArg0);\n");			
		}
		

		buf.append("}\n ");
		return buf.toString();

	}
	
	
	

	public static void genResultSet() throws Exception {
		StringBuilder buf = new StringBuilder();
		Class<ResultSet> cstmtClazz = ResultSet.class;
		Method[] methods = cstmtClazz.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			buf.append(implementResultSetMethod(m));
		}

		PrintWriter out = new PrintWriter(new File("resultset.txt"));
		out.println(buf.toString());
		out.flush();
		out.close();
		System.out.println(buf.toString());
	}

	private static String implementResultSetMethod(Method m) {
		StringBuilder buf = new StringBuilder();
		int modifier = m.getModifiers();
		if ((modifier & Modifier.PUBLIC) > 0) {
			buf.append("public ");
		} else if ((modifier & Modifier.PROTECTED) > 0) {
			buf.append("protected ");
		} else if ((modifier & Modifier.PRIVATE) > 0) {
			buf.append("private ");
		}

		if ((modifier & Modifier.STATIC) > 0) {
			buf.append("static ");
		}

		if ((modifier & Modifier.SYNCHRONIZED) > 0) {
			buf.append("synchornized ");
		}

		buf.append(m.getReturnType().getSimpleName());
		buf.append(" ").append(m.getName()).append("(");
		Class<?>[] params = m.getParameterTypes();
		for (int i = 0; i < params.length; i++) {
			if (params[i].isArray()) {
				buf.append(params[i].getSimpleName()).append(" ");
				String name = params[i].getSimpleName().toLowerCase();
				buf.append(name.subSequence(0, name.length() - 2))
						.append("sArg").append(i);
			} else {
				buf.append(params[i].getSimpleName()).append(" ")
						.append(params[i].getSimpleName().toLowerCase())
						.append("Arg").append(i);
			}
			if (i < params.length - 1)
				buf.append(",");
		}
		buf.append(") ");

		Class<?>[] exs = m.getExceptionTypes();
		if (exs != null && exs.length > 0) {
			buf.append("throws ");
			for (int i = 0; i < exs.length; i++) {
				buf.append(exs[i].getSimpleName());
				if (i < exs.length - 1)
					buf.append(", ");
			}
		}
		buf.append("{\n ");

		String mname = m.getName();
		if (m.getName().startsWith("get") && m.getParameterTypes().length > 0
				&& m.getParameterTypes()[0].equals(String.class)
				&& !m.getReturnType().getSimpleName().equals("void")) 
		{			
			buf.append("int columnIndex = getColumnIndex(stringArg0);\n");
			buf.append("return ").append(m.getName()).append("(columnIndex);\n");			
		}else if (m.getName().startsWith("get") && m.getParameterTypes().length > 0
				&& m.getParameterTypes()[0].equals(int.class)
				&& !m.getReturnType().getSimpleName().equals("void")) 
		{
			buf.append("return getObject(intArg0);\n");			
		}
		

		buf.append("}\n ");
		return buf.toString();

	}

	public static void genConnection() throws Exception {
		StringBuilder buf = new StringBuilder();
		Class<Connection> cstmtClazz = Connection.class;
		Method[] methods = cstmtClazz.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			buf.append(implementConnectionMethod(m));
		}

		PrintWriter out = new PrintWriter(new File("connection.txt"));
		out.println(buf.toString());
		out.flush();
		out.close();
		System.out.println(buf.toString());
	}

	private static String implementConnectionMethod(Method m) {
		StringBuilder buf = new StringBuilder();
		int modifier = m.getModifiers();
		if ((modifier & Modifier.PUBLIC) > 0) {
			buf.append("public ");
		} else if ((modifier & Modifier.PROTECTED) > 0) {
			buf.append("protected ");
		} else if ((modifier & Modifier.PRIVATE) > 0) {
			buf.append("private ");
		}

		if ((modifier & Modifier.STATIC) > 0) {
			buf.append("static ");
		}

		if ((modifier & Modifier.SYNCHRONIZED) > 0) {
			buf.append("synchornized ");
		}

		buf.append(m.getReturnType().getSimpleName());
		buf.append(" ").append(m.getName()).append("(");
		Class<?>[] params = m.getParameterTypes();
		for (int i = 0; i < params.length; i++) {
			if (params[i].isArray()) {
				buf.append(params[i].getSimpleName()).append(" ");
				String name = params[i].getSimpleName().toLowerCase();
				buf.append(name.subSequence(0, name.length() - 2))
						.append("sArg").append(i);
			} else {
				buf.append(params[i].getSimpleName()).append(" ")
						.append(params[i].getSimpleName().toLowerCase())
						.append("Arg").append(i);
			}
			if (i < params.length - 1)
				buf.append(",");
		}
		buf.append(") ");

		Class<?>[] exs = m.getExceptionTypes();
		if (exs != null && exs.length > 0) {
			buf.append("throws ");
			for (int i = 0; i < exs.length; i++) {
				buf.append(exs[i].getSimpleName());
				if (i < exs.length - 1)
					buf.append(", ");
			}
		}
		buf.append("{\n ");

		if (!m.getReturnType().getSimpleName().equals("void")) {
			buf.append("return ");
		}
		buf.append("wrappedConnection");
		if (m.getDeclaringClass().equals(CallableStatement.class)
				|| m.getDeclaringClass().equals(PreparedStatement.class)) {
			buf.append(")");
		}
		buf.append(".").append(m.getName()).append("(");
		for (int i = 0; i < params.length; i++) {
			if (params[i].isArray()) {

				String name = params[i].getSimpleName().toLowerCase();
				buf.append(name.subSequence(0, name.length() - 2))
						.append("sArg").append(i);
			} else {
				buf.append(params[i].getSimpleName().toLowerCase())
						.append("Arg").append(i);
			}
			if (i < params.length - 1)
				buf.append(", ");
		}
		buf.append(");\n");
		buf.append("}\n ");
		return buf.toString();

	}

	public static void genStatement() throws Exception {
		StringBuilder buf = new StringBuilder();
		Class<CallableStatement> cstmtClazz = CallableStatement.class;
		Method[] methods = cstmtClazz.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			buf.append(implementStatementMethod(m));
		}

		PrintWriter out = new PrintWriter(new File("statement.txt"));
		out.println(buf.toString());
		out.flush();
		out.close();
		System.out.println(buf.toString());
	}

	private static String implementStatementMethod(Method m) {
		StringBuilder buf = new StringBuilder();
		int modifier = m.getModifiers();
		if ((modifier & Modifier.PUBLIC) > 0) {
			buf.append("public ");
		} else if ((modifier & Modifier.PROTECTED) > 0) {
			buf.append("protected ");
		} else if ((modifier & Modifier.PRIVATE) > 0) {
			buf.append("private ");
		}

		if ((modifier & Modifier.STATIC) > 0) {
			buf.append("static ");
		}

		if ((modifier & Modifier.SYNCHRONIZED) > 0) {
			buf.append("synchornized ");
		}

		buf.append(m.getReturnType().getSimpleName());
		buf.append(" ").append(m.getName()).append("(");
		Class<?>[] params = m.getParameterTypes();
		for (int i = 0; i < params.length; i++) {
			if (params[i].isArray()) {
				buf.append(params[i].getSimpleName()).append(" ");
				String name = params[i].getSimpleName().toLowerCase();
				buf.append(name.subSequence(0, name.length() - 2))
						.append("sArg").append(i);
			} else {
				buf.append(params[i].getSimpleName()).append(" ")
						.append(params[i].getSimpleName().toLowerCase())
						.append("Arg").append(i);
			}
			if (i < params.length - 1)
				buf.append(",");
		}
		buf.append(") ");

		Class<?>[] exs = m.getExceptionTypes();
		if (exs != null && exs.length > 0) {
			buf.append("throws ");
			for (int i = 0; i < exs.length; i++) {
				buf.append(exs[i].getSimpleName());
				if (i < exs.length - 1)
					buf.append(", ");
			}
		}
		buf.append("{\n ");

		if (!m.getReturnType().getSimpleName().equals("void")) {
			buf.append("return ");
		}

		if (m.getDeclaringClass().equals(CallableStatement.class)) {
			buf.append("((CallableStatement)");
		} else if (m.getDeclaringClass().equals(PreparedStatement.class)) {
			buf.append("((PreparedStatement)");
		}
		buf.append("wrappedStatement");
		if (m.getDeclaringClass().equals(CallableStatement.class)
				|| m.getDeclaringClass().equals(PreparedStatement.class)) {
			buf.append(")");
		}
		buf.append(".").append(m.getName()).append("(");
		for (int i = 0; i < params.length; i++) {
			if (params[i].isArray()) {

				String name = params[i].getSimpleName().toLowerCase();
				buf.append(name.subSequence(0, name.length() - 2))
						.append("sArg").append(i);
			} else {
				buf.append(params[i].getSimpleName().toLowerCase())
						.append("Arg").append(i);
			}
			if (i < params.length - 1)
				buf.append(", ");
		}
		buf.append(");\n");
		buf.append("}\n ");
		return buf.toString();

	}

}
