package dao;

public interface VisitDao {
	
	//admin mainpage 금일 방문자수
		int todayVisitCount();
		int todayVisitInsert();
		int todayVisitUpdate(int count);

}
