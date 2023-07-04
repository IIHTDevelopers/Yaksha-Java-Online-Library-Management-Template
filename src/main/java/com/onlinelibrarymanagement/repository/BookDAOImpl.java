package com.onlinelibrarymanagement.repository;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import org.jboss.jandex.Main;

import com.onlinelibrarymanagement.model.Book;

public class BookDAOImpl implements BookDAO {
	private static Connection connection;

	public BookDAOImpl() {
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
	public void create(Book book) {
	}

	@Override
	public Book getById(int id) {
		return null;
	}

	@Override
	public List<Book> getAll() {
		return null;
	}

	@Override
	public void update(Book book) {
	}

	@Override
	public boolean delete(int id) {
		return false;
	}

	@Override
	public List<Book> getAllIssued() {
		return null;
	}

	@Override
	public List<Book> searchByName(String name) {
		return null;
	}

	@Override
	public void deleteAll() {
	}
}
