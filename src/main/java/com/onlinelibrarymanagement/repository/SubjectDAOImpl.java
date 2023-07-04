package com.onlinelibrarymanagement.repository;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import org.jboss.jandex.Main;

import com.onlinelibrarymanagement.model.Subject;

public class SubjectDAOImpl implements SubjectDAO {
	private static Connection connection;

	public SubjectDAOImpl() {
		try {
			Properties props = new Properties();
			InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("application.properties");
			props.load(inputStream);
			inputStream.close();

			String url = props.getProperty("db.url");
			String username = props.getProperty("db.username");
			String password = props.getProperty("db.password");

			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void create(Subject subject) {
	}

	@Override
	public Subject getById(int id) {
		return null;
	}

	@Override
	public List<Subject> getAll() {
		return null;
	}

	@Override
	public void update(Subject subject) {
	}

	@Override
	public boolean delete(int id) {
		return false;
	}

	@Override
	public List<Subject> searchByName(String name) {
		return null;
	}

	@Override
	public void deleteAll() {
	}
}
