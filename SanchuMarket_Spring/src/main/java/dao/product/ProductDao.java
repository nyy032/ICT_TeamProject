package dao.product;

import java.util.List;
import java.util.Map;

import vo.product.ProductVo;

public interface ProductDao {


	//��ǰ ��ü��ȸ
	public List<ProductVo> selectList(); 

		
	// ī�װ����� ��ȸ
	public List<ProductVo> selectList_cate(int c_idx);
		
	//u_idx �������� �ѱ�
	public List<ProductVo> selectList(int u_idx);
	
	
	//��ǰ���� �ѱ�
	public ProductVo selectList2(int p_idx);

	//�ֱ� ��ǰ ��ȸ(mainpage_admin)
	public List<ProductVo> selectRecentList();
		
	
	public int todayProductCount();
		
	
	// ��ǰ��� �޼���
	public int insert(ProductVo vo);
	
	
	//��ǰ 1�� ��ȸ �޼���
	public ProductVo selectOne(int p_idx);
		
	//��ǰ�˻�
	public List<ProductVo> selectList(Map map);
	
	public int selectMaxIdx();

	//���� ���� ��ǰ�� �˻�
	public List<ProductVo> select_price_text_search(Map map);

	//���� �����˻�
	public List<ProductVo> select_price_search(Map map);
	


//	//��ǰ����Ʈ �׽�Ʈ
//	public List<ProductVo> select();
//	
	
}