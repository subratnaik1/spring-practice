package com.subrat.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subrat.sbeans.Product;

@Repository("repo")
public class ProductDAO implements IproductDAO {
	@Autowired
	private DataSource ds;
	public static final String INSERT_PRODUCT = "INSERT INTO PRODUCT VALUES(?,?,?,?)";
	public static final String RETRIVE_PRODUCT = "SELECT * FROM PRODUCT";
    public static final String Delete_product="DELETE FROM PRODUCT WHERE PRODUCTID=?";
    public static final String UPDATE_PRODUCT="UPDATE PRODUCT SET PRODUCTID=?,PRODUCTNAME=?,DESCRIPTION=?,PRICE=? WHERE PRODUCTID=?"; 
    
	public int insertProduct(Product product) throws Exception {
		int rowCount = 0;
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(INSERT_PRODUCT);
			pstmt.setInt(1, product.getProductID());
			pstmt.setString(2, product.getProductName());
			pstmt.setString(3, product.getDescription());
			pstmt.setDouble(4, product.getPrice());

			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<>();
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(RETRIVE_PRODUCT);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setProductID(rs.getInt(1));
				p.setProductName(rs.getString(2));
				p.setDescription(rs.getString(3));
				p.setPrice(rs.getInt(4));
				
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int deleteProduct(int productId) throws Exception {
		int rowCount=0;
		try(Connection con=ds.getConnection()){
		PreparedStatement pstmt=con.prepareStatement(Delete_product);
		pstmt.setInt(1, productId);
		rowCount=pstmt.executeUpdate();		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	@Override
	public int updateProduct(Product product) throws Exception {
      int rowCount=0;
      try(Connection con=ds.getConnection()){
    	PreparedStatement pstmt= con.prepareStatement(UPDATE_PRODUCT); 
    	pstmt.setInt(1, product.getProductID());
    	pstmt.setString(2, product.getProductName());
    	pstmt.setString(3, product.getDescription());
    	pstmt.setDouble(4, product.getPrice());
    	pstmt.setInt(5, product.getProductID());
    	
    	rowCount=pstmt.executeUpdate();
      }
      catch(Exception e) {
    	  throw e;  	  
      }
		return rowCount;
	}

}
