package com.frox.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.frox.Dto.FroxDto;

import connect.db.DBConnection;

public class FroxDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public FroxDao() {
		conn = DBConnection.getConn();
	}
	
	public int insertMember(FroxDto dto) {
		int w = 0; // 입력여부 체크용
		String sql = "insert into froxmembers values(?,?,?,?,?,?,sysdate)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getBirth());
			ps.setString(5, dto.getGender());
			ps.setString(6, dto.getPhone());
			w = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("insertMember메소드");
			return -1;
		}finally {
			DBConnection.closeConn(null, ps, conn);
		}
		return w;
	}
	
	public int checkId(String id) {
		String sql = "select * from froxmembers where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				return -1; //있는 아이디일 경우 반환값
			}else {
				return 1; //없는 아이디일 경우 반환값
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("insertMember메소드");
			return 1;
		}finally {
			DBConnection.closeConn(null, ps, conn);
		}
	}
}
