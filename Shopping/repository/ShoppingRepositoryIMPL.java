package com.xworkz.shopping.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.shopping.app.dto.ShoppingDTO;

public class ShoppingRepositoryIMPL implements ShoppingRepository {

	String query;

	public ShoppingRepositoryIMPL() {
		System.out.println("ShoppingRepositoryIMPL");
	}

	public ShoppingRepositoryIMPL(String query) {
		this.query = query;
	}

	@Override
	public boolean onSave(ShoppingDTO dto) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","Xworkzodc@123");
			System.out.println("----");
			
			String query="insert into  values(?,?,?,?,?)";

			PreparedStatement statement=connection.prepareStatement(query); 
		
		
			statement.setInt(1,dto.getNo_of_shop());

			statement.setInt(2,dto.getPeople());
			statement.setInt(3,dto.getWacth_shop());
			
			statement.setString(4,dto.getMall_owner_name());
			statement.setString(5,dto.getWorker_name());
		
			
			int i=statement.executeUpdate();
			
			if(i!=0) {
				
				System.out.println("data is Save");
			}
			else {
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
	public boolean onUpdate(String worker_name) {
		// TODO Auto-generated method stub

		try {
			//shopping orianmall
			System.out.println("loaded");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root",
					"Xworkzodc@123");

			String query = "update orianmall set mall_owner_name='ragav' where wacth_shop=wacth_shop";
			Statement statement = connection.createStatement();

			int i = statement.executeUpdate(query);
			if (i != 0) {

				System.out.println(" updated");
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
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root",
					"Xworkzodc@123");

			String query = "select * from orianmall";

			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println("no_of_shop =" + resultSet.getInt(1) + "," + "people =" + resultSet.getInt(2) + ","
						+ "wacth_shop =" + resultSet.getInt(3) + "," + "mall_owner_name =" + resultSet.getString(4)
						+ "," + "worker_name =" + resultSet.getString(5));

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean onUpdate1(int wacth_shop) {
		// TODO Auto-generated method stub
		System.out.println("inside updated method(onUpdate2)");
		try {
			//shopping orianmall
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root", "Xworkzodc@123");

			Statement st = con.createStatement();
			String query = "update orianmall set family_members=10 where sweet=sweet";

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
	public boolean onUpdate2(String mall_owner_name) {
		// TODO Auto-generated method stub
		System.out.println("inside updated method(onUpdate2)");
		try {  

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping", "root", "Xworkzodc@123");

			Statement st = con.createStatement();
			String query = "update orianmall set family_members=10 where sweet=sweet";

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

}
