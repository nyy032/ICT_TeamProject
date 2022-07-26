package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.UserVo;

public class UserDaoImpl implements UserDao{

	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	
	//������ ��ü ȸ�� ��ȸ
	public List<UserVo> selectList(){
		
		return sqlSession.selectList("user.user_list");
	}
	
	
	public List<UserVo> selectList(int u_idx) {

		return sqlSession.selectList("product.product_user_list",u_idx);
	}
	
	
	public UserVo selectOneByIdx(int u_idx){
		
		return sqlSession.selectOne("user.user_idx", u_idx);
	}
	
	
	// �Ǹ��� ������ ������ ������ ���������
	public UserVo selectOneByIdxTime(int u_idx){
		
		return sqlSession.selectOne("user.user_idx_reg", u_idx);
	}
	
	
	//id���翩��
	public UserVo selectOneById(String u_id){
		
		return sqlSession.selectOne("user.check_id", u_id);
		
	}
	
	//nickname���翩��
	public UserVo selectOneByNickname(String u_nickname){
		
		return sqlSession.selectOne("user.check_nickname", u_nickname);
	}
	
	
	//email���翩��
	public UserVo selectOneByEmail(String email) {
		
		return sqlSession.selectOne("user.check_email", email);
		
	}
	
	
	//��й�ȣ ã��� ���̵�,�̸��� ���� ����
	public int countForFindPwd(UserVo vo) {
		
		return sqlSession.selectOne("user.check_emailAndId",vo);
	}
	
	//admin mainpage ���� ���Լ�
	public int todayEnrollCount() {
		
		return sqlSession.selectOne("user.enroll_count");
	}
		
	
	public int insert(UserVo vo) {

		return sqlSession.insert("user.user_insert", vo);
	}
	

	public int update(UserVo vo) {

		return sqlSession.update("user.user_update",vo);
	}
	
	//���̵�ã��(�ߺ����̵����)
	public List<String> selectIdByNameTel(UserVo vo) {
		
		/*
		 * System.out.printf("daoimple��u_name:%s\n",vo.getU_name());
		 * System.out.printf("daoimple��u_tel:%s\n",vo.getU_tel());
		 */
		
		return sqlSession.selectList("user.findId", vo);
	}
	
	//��й�ȣ ã��
	public int updatePwd(UserVo vo) {
		return sqlSession.update("user.pwd_update",vo);
	}
	
	
	public int delete(String u_id) {
		
		return sqlSession.delete("user.withdraw_account", u_id);
		
	}





	

	
}