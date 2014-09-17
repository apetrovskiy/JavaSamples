package com.apress.prospring3.ch8.dao.plain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.apress.prospring3.ch8.dao.ContactDao;
import com.apress.prospring3.ch8.domain.Contact;

public class PlainContactDao implements ContactDao {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			// nothing
		}
	}
	
	private Connection getConnection() throws SQLException {
		// return DriverManager.getConnection("jdbc:mysql://localhost:3306/prospring3_ch8", "prospring3", "prospring3");
		// return DriverManager.getConnection("jdbc:postgresql://localhost:5434/shuran's", "shuran", "=1qwerty");
		// return DriverManager.getConnection("jdbc:mysql://localhost:3306/shuran_schema", "shuran", "=1qwerty");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/shuran_schema", "root", "");
	}
	
	private void closeConenction(Connection connection) {
		if (connection == null) return;
		
		try {
			connection.close();
		} catch (SQLException ex) {
			// nothing
		}
	}
	
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		List<Contact> result = new ArrayList<Contact>();
		Connection connection = null;
		try {
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from contact");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Contact contact = new Contact();
				contact.setId(resultSet.getLong("id"));
				contact.setFirstName(resultSet.getString("first_name"));
				contact.setLastName(resultSet.getString("last_name"));
				contact.setBirthDate(resultSet.getDate("birth_date"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConenction(connection);
		}
		return result;
	}

	public List<Contact> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Contact contact) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"insert into Contact (first_name, last_name, birth_date) values (?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, contact.getFirstName());
			statement.setString(2, contact.getLastName());
			statement.setDate(3, contact.getBirthDate());
			statement.execute();
			
			ResultSet generatedKeys = statement.getGeneratedKeys();
			if (generatedKeys.next()) {
				contact.setId(generatedKeys.getLong(1));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConenction(connection);
		}
	}

	public void update(Contact contact) {
		// TODO Auto-generated method stub

	}

	public void delete(Long contactId) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from contact where id=?");
			statement.setLong(1, contactId);
			statement.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConenction(connection);
		}
	}

}
