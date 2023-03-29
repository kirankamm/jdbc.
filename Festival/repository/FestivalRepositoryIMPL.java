package com.xworkz.festival.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.festival.app.dto.FestivalDTO;

public class FestivalRepositoryIMPL implements FestivalRepository {

	String query;

	public FestivalRepositoryIMPL() {
		System.out.println("FestivalRepositoryIMPL defaulte construtor");
	}

	public FestivalRepositoryIMPL(String query) {
		this.query = query;
	}

	@Override
	public boolean onSave(FestivalDTO dto) {
		// TODO Auto-generated method stub

		System.out.println("inside update method (onSave(FestivalDTO dto)) ");
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully  (onSave)");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/festival", "root",
					"Xworkzodc@123");
			System.out.println("----");

			String query = "insert into new_table values(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, dto.getUgadi());

			statement.setString(2, dto.getSweet());
			statement.setString(3, dto.getCloths());

			statement.setInt(4, dto.getFamily_members());
			statement.setInt(5, dto.getGifts());

			int i = statement.executeUpdate();

			if (i != 0) {

				System.out.println("data is Save   (onSave(FestivalDTO dto))");
			} else {
				System.out.println("data not save   (onSave(FestivalDTO dto))");
			}
			/* System.out.println("this is onSave"); */

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("    onSave(FestivalDTO dto) ended");

		}
		return true;
	}

	@Override
	public boolean onUpdate(int gifts) {
		// TODO Auto-generated method stub
		System.out.println("inside updated method  (onUpdate(int gifts))");
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/festival", "root",
					"Xworkzodc@123");

			Statement st = con.createStatement();
			String query = "update new_table set family_members=10 where gifts=gifts";
			int i = st.executeUpdate(query);
			if (i != 0) {

				System.out.println("updated  (onUpdate(int gifts)) ");
			} else {

				System.out.println("not update  (onUpdate(int gifts))");
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
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/festival", "root",
					"Xworkzodc@123");

			String query = "select * from new_table";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("ugadi =" + resultSet.getString(1) + "," + "sweet =" + resultSet.getString(2) + ","
						+ "cloths =" + resultSet.getString(3) + "," + "cake_price =" + resultSet.getInt(4) + ","
						+ "gifts =" + resultSet.getInt(5));

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return true;
	}

	@Override
	public boolean onUpdate1(String ugadi) {
		// TODO Auto-generated method stub
		System.out.println("inside updated method ( onUpdate1(String ugadi))");
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/festival", "root",
					"Xworkzodc@123");

			Statement st = con.createStatement();
			String query = "update new_table set family_members=10 where ugadi=ugadi";

			int i = st.executeUpdate(query);
			if (i != 0) {

				System.out.println("updated ( onUpdate1(String ugadi)) ");
			} else {

				System.out.println("not update  ( onUpdate1(String ugadi))");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean onUpdate2(String sweet) {
		// TODO Auto-generated method stub
		System.out.println("inside updated method(onUpdate2)");
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sweet", "root", "Xworkzodc@123");

			Statement st = con.createStatement();
			String query = "update new_table set family_members=10 where sweet=sweet";

			int i = st.executeUpdate(query);
			if (i != 0) {

				System.out.println("updated   (onUpdate2(String sweet)) ");
			} else {

				System.out.println("not update   (onUpdate2(String sweet))");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean onDelete(String ugadi) {
		// TODO Auto-generated method stub
		return false;
	}
}
