package com.xworkz.birthdays.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.birthdays.app.dto.BirthdayDTO;

public class BirthdayRepositorytIMPL implements BirthdayRepository {

	String query;

	public BirthdayRepositorytIMPL() {
		System.out.println("BirthdayRepositorytIMPL");
	}

	public BirthdayRepositorytIMPL(String query) {
		this.query = query;
	}

	@Override
	public boolean onSave(BirthdayDTO dto) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday", "root",
					"Xworkzodc@123");
			System.out.println("----");

			String query = "insert into raj values(?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getMens());

			statement.setInt(2, dto.getWomens());
			statement.setString(3, dto.getCake_name());

			statement.setString(4, dto.getName_candel());
			statement.setInt(5, dto.getCake_price());

			int i = statement.executeUpdate();

			if (i != 0) {

				System.out.println("data is Save");
			} else {
				System.out.println("data not save");
			}
			/* System.out.println("this is onSave"); */

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean onUpdate(int cake_price) {
		// TODO Auto-generated method stub


		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday", "root",
					"Xworkzodc@123");

			String query = "update raj set cake_name='copy' where cake_price=cake_price";
			Statement statement = connection.createStatement();

			int i = statement.executeUpdate(query);
			if (i != 0) {

				System.out.println("updeted");

			} else {

				System.out.println("not updated");
			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean onRead() {
		// TODO Auto-generated method stub

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday", "root",
					"Xworkzodc@123");

			String query = "select * from raj";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("mens=" + resultSet.getInt(1) + " , " + "womens =" + resultSet.getInt(2) + ", "
						+ "cake_name=" + resultSet.getString(3) + " , " + "name_candel=" + resultSet.getString(5) + " ,"
						+ "cake_price=" + resultSet.getInt(5));

			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean onUpdate1(int mens) {
		// TODO Auto-generated method stub

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday", "root",
					"Xworkzodc@123");

			String query = "update raj set cake_name='molody' where mens=mens";
			Statement statement = connection.createStatement();

			int i = statement.executeUpdate(query);
			if (i != 0) {

				System.out.println("updeted");

			} else {

				System.out.println("not updated");
			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean onUpdate2(int womens) {
		// TODO Auto-generated method stub
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday", "root",
					"Xworkzodc@123");

			String query = "update raj set cake_name='blackberrry' where womens=" + womens;
			Statement statement = connection.createStatement();

			int i = statement.executeUpdate(query);
			if (i != 0) {

				System.out.println("updeted");

			} else {

				System.out.println("not updated");
			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean onDelete(int womens) {
		// TODO Auto-generated method stub
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday", "root",
					"Xworkzodc@123");

			String query = "delete from raj  where womens=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, womens);

			int i = statement.executeUpdate();
			if (i != 0) {

				System.out.println("delete");

			} else {

				System.out.println("not delete");
			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
		return true;
	}

}