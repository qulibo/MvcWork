package cn.et.model;

import java.sql.*;
import java.util.*;

public class ArticleDao {
	public void insert(Article art) throws Exception {
		Connection con = DbUtils.getConnection();
		String sql = "insert into article(title, content) values(?,?);";
		PreparedStatement pre = con.prepareStatement(sql);
		pre.setString(1, art.getTitle());
		pre.setString(2, art.getContent());
		pre.execute();
		pre.close();
		con.close();
	}
	public void update(Article art) throws Exception {
		Connection con = DbUtils.getConnection();
		String sql = "update article set title = ?, content = ? where aid = ?;";
		PreparedStatement pre = con.prepareStatement(sql);
		pre.setString(1, art.getTitle());
		pre.setString(2, art.getContent());
		pre.setString(3, art.getAid());
		pre.execute();
		pre.close();
		con.close();
	}
	public void delete(String id) throws Exception {
		Connection con = DbUtils.getConnection();
		String sql = "delete from article where aid = ?";
		PreparedStatement pre = con.prepareStatement(sql);
		pre.setString(1, id);
		pre.execute();
		pre.close();
		con.close();
	}
	public List<Article> query() throws Exception {
		List<Article> list = new ArrayList<Article>();
		Connection con = DbUtils.getConnection();
		String sql = "select * from article;";
		PreparedStatement pre = con.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		while(rs.next()) {
			Article art = new Article();
			art.setAid(rs.getString(1));
			art.setTitle(rs.getString(2));
			art.setContent(rs.getString(3));
			list.add(art);
		}
		rs.close();
		pre.close();
		con.close();
		return list;
	}
}
