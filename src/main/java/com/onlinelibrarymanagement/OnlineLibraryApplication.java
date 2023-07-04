package com.onlinelibrarymanagement;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.jboss.jandex.Main;

import com.onlinelibrarymanagement.repository.BookDAO;
import com.onlinelibrarymanagement.repository.BookDAOImpl;
import com.onlinelibrarymanagement.repository.SubjectDAO;
import com.onlinelibrarymanagement.repository.SubjectDAOImpl;

public class OnlineLibraryApplication {
	private static SubjectDAO subjectDAO;
	private static BookDAO bookDAO;
	private static Properties props;

	public static void main(String[] args) {
		loadDatabaseConfiguration();

		createDatabaseIfNotExists();
		createSubjectTableIfNotExists();
		createBookTableIfNotExists();

		subjectDAO = new SubjectDAOImpl();
		bookDAO = new BookDAOImpl();

		displayMenu();
	}

	public static void loadDatabaseConfiguration() {
		try {
			props = new Properties();
			InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("application.properties");
			props.load(inputStream);
			inputStream.close();

			String url = props.getProperty("db.url");
			String username = props.getProperty("db.username");
			String password = props.getProperty("db.password");

			Connection connection = DriverManager.getConnection(url, username, password);
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createDatabaseIfNotExists() {
		try {
			String url = props.getProperty("db.url");
			String username = props.getProperty("db.username");
			String password = props.getProperty("db.password");

			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			statement.executeUpdate("CREATE DATABASE IF NOT EXISTS library_db");
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createSubjectTableIfNotExists() {
		try {
			String url = props.getProperty("db.url");
			String username = props.getProperty("db.username");
			String password = props.getProperty("db.password");

			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			statement.executeUpdate(
					"CREATE TABLE IF NOT EXISTS subjects (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(10) NOT NULL)");
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createBookTableIfNotExists() {
		try {
			String url = props.getProperty("db.url");
			String username = props.getProperty("db.username");
			String password = props.getProperty("db.password");

			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			statement.executeUpdate(
					"CREATE TABLE IF NOT EXISTS books (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255) NOT NULL, subjectId INT NOT NULL, ISBN VARCHAR(255) NOT NULL, isIssued BOOLEAN NOT NULL)");
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void displayMenu() {
	}

	private static void searchSubjectByName() {
	}

	private static void addSubject() {
	}

	private static void updateSubject() {
	}

	private static void deleteSubject() {
	}

	private static void viewAllSubjects() {
	}

	private static void addBook() {
	}

	private static void updateBook() {
	}

	private static void deleteBook() {
	}

	private static void viewAllBooks() {
	}

	private static void listAllIssuedBooks() {
	}

	private static void searchBookByName() {
	}

	private static void removeAllSubjects() {
	}

	private static void removeAllBooks() {
	}

}
