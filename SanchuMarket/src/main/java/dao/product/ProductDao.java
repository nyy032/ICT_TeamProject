package dao.product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.connect.spi.Connection;


import vo.product.ProductVo;

public class ProductDao {
	
	//single-ton : 객체 1개만 생성해서 사용
	static ProductDao single = null;

	public static ProductDao getinstance() {

		//객체가 null이면 생성해라
		if (single == null)
			single = new ProductDao();

		return single;
	}

	//외부에서 생성하지 말 것
	private ProductDao() {
		// TODO Auto-generated constructor stub

	}
	
	public List<ProductVo> selectList() {
		

		List<ProductVo> list = null;

		
		return list;
	}

}
