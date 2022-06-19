package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.UserVo;

public class UserDao {

	SqlSessionFactory factory;
	//single-ton : ��ü 1���� �����ؼ� �������!
	//����ƽ��ü�� ������ �ϳ��� ���������.
	static UserDao single = null;

	//����ƽ�� ������ ����ƽ���θ�
	public static UserDao getInstance() {

		//��ü�� ������ �����ض� ȣ��� �ѹ��� ��ü�� ����
		if (single == null)
			single = new UserDao();

		return single;
	}

	//�ܺο��� ��ü�� �������� ���ϰ� ����
	private UserDao() {
		factory = MyBatisConnector.getInstance().getSqlSessionFactory();
	}
	
	//������ ��ȸ
	public List<UserVo> selectList(){
		
		List<UserVo> list = null;
		
		SqlSession sqlsession = factory.openSession();
		
		list = sqlsession.selectList("user.user_list");
		
		return list;
	}
	
	public UserVo selectOneByIdx(int u_idx){
		
		UserVo user = null;
		
		SqlSession sqlsession = factory.openSession();
		
		user = sqlsession.selectOne("user.user_idx", u_idx);
		
		return user;
	}
	
	//�α��ν� ���� ���� ��ȸ(ajax)
	public UserVo selectOneById(String u_id){
		
		UserVo user = null;
		
		SqlSession sqlsession = factory.openSession();
		
		user = sqlsession.selectOne("user.check_id", u_id);
		
		return user;
	}
	
	public int insert(UserVo vo) {
		
		int res = 0;
		
		SqlSession sqlsession = factory.openSession();

		res = sqlsession.selectOne("user.user_insert", vo);
		
		return res;
	}
		
	
	
}