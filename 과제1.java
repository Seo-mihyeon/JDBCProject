package com.hansin.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbc_driver = "com.mysql.cj.jdbc.Driver"; 
		String jdbc_url = "jdbc:mysql://localhost:3306/databasetest2?serverTimezone=UTC"; 
		try { 
 			Class.forName(jdbc_driver).newInstance(); 
 			Connection con = DriverManager.getConnection(jdbc_url, "root", "123456"); 
 			
 			//���� 1
 			/*
 			Statement st = con.createStatement();
 			String sql ="CREATE TABLE addressbook(id INT not null primary key,name VARCHAR(45) not null,tel VARCHAR(45) not null,email VARCHAR(60) not null,address VARCHAR(60) not null)";
 			st.executeUpdate(sql);
 			*/
 			
 			//���� 2
 			/*
 			PreparedStatement pst = con.prepareStatement("insert into databasetest2.addressbook VALUES(?, ?, ?, ?, ?)");
			pst.setInt(1,1);
			pst.setString(2, "������");	//�̸�
			pst.setString(3, "010-8615-0345");	//��ȭ��ȣ
			pst.setString(4, "algus0345@hansin.ac.kr");	//�̸���
			pst.setString(5, "seoul");	//�ּ�
			pst.executeUpdate();
			pst.setInt(1,2);
			pst.setString(2, "�谡��");	//�̸�
			pst.setString(3, "010-1234-1234");	//��ȭ��ȣ
			pst.setString(4, "gana@hansin.ac.kr");	//�̸���
			pst.setString(5, "seoul");	//�ּ�
			pst.executeUpdate();
			pst.setInt(1,3);
			pst.setString(2, "���־�");	//�̸�
			pst.setString(3, "010-1212-1212");	//��ȭ��ȣ
			pst.setString(4, "like@hansin.ac.kr");	//�̸���
			pst.setString(5, "incheon");	//�ּ�
			pst.executeUpdate();
			pst.setInt(1,4);
			pst.setString(2, "���Ⱦ�");	//�̸�
			pst.setString(3, "010-5555-1255");	//��ȭ��ȣ
			pst.setString(4, "sell@hansin.ac.kr");	//�̸���
			pst.setString(5, "incheon");	//�ּ�
			pst.executeUpdate();
			pst.setInt(1,5);
			pst.setString(2, "���ڿ�");	//�̸�
			pst.setString(3, "010-5943-1253");	//��ȭ��ȣ
			pst.setString(4, "yes@hansin.ac.kr");	//�̸���
			pst.setString(5, "gyeonggi");	//�ּ�
			pst.executeUpdate();
 			*/
 			
 			//����2 -1 ( ��� ���)
 			/*
 			Statement st = con.createStatement();
 			String sql = "SELECT * FROM databasetest2.addressbook";
 			ResultSet rs = st.executeQuery(sql);
 			
 			while(rs.next()) {
 				int id = rs.getInt("id");
 				String name = rs.getString("name");
 				String tel = rs.getString("tel");
 				String email = rs.getString("email");
 				String address = rs.getString("address");
 				System.out.printf("id: %d,  name: %s,  tel: %s,  email: %s,  address: %s" + "\n", id, name, tel, email, address);
 			}
 			
 			rs.close();
 			*/
 			
 			//����3
 			/*
 			PreparedStatement pst = con.prepareStatement("update databasetest2.addressbook set email=? where id = ?");
			pst.setString(1, "algus0345@naver.com");	//�̸���
 			pst.setInt(2,1);
			pst.executeUpdate();
			
			pst.setString(1, "gana@naver.com");	//�̸���
			pst.setInt(2,2);
			pst.executeUpdate();
			
			pst.setString(1, "like@naver.com");	//�̸���
			pst.setInt(2,3);
			pst.executeUpdate();
			
			pst.setString(1, "sell@naver.com");	//�̸���
			pst.setInt(2,4);
			pst.executeUpdate();
			
			pst.setString(1, "yes@naver.com");	//�̸���
			pst.setInt(2,5);
			pst.executeUpdate();
 			
			Statement st = con.createStatement();
 			String sql = "SELECT * FROM databasetest2.addressbook";
 			ResultSet rs = st.executeQuery(sql);
 			
 			while(rs.next()) {
 				int id = rs.getInt("id");
 				String name = rs.getString("name");
 				String tel = rs.getString("tel");
 				String email = rs.getString("email");
 				String address = rs.getString("address");
 				System.out.printf("id: %d,  name: %s,  tel: %s,  email: %s,  address: %s" + "\n", id, name, tel, email, address);
 			}
 			
 			rs.close();
 			*/
 			
 			//����4
 			PreparedStatement pst = con.prepareStatement("delete from databasetest2.addressbook where id = ?");
 			pst.setInt(1,4);
			pst.executeUpdate();
			pst.setInt(1, 5);
			pst.executeUpdate();

			Statement st = con.createStatement();
 			String sql = "SELECT * FROM databasetest2.addressbook";
 			ResultSet rs = st.executeQuery(sql);
 			
 			while(rs.next()) {
 				int id = rs.getInt("id");
 				String name = rs.getString("name");
 				String tel = rs.getString("tel");
 				String email = rs.getString("email");
 				String address = rs.getString("address");
 				System.out.printf("id: %d,  name: %s,  tel: %s,  email: %s,  address: %s" + "\n", id, name, tel, email, address);
 			}
 			
 			rs.close();
 			pst.close(); 
 			con.close();			 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 		}  
 	} 

}
