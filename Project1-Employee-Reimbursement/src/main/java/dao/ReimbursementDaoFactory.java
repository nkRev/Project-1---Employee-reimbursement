package dao;

public class ReimbursementDaoFactory {
	private static ReimbursementDAO dao;
	private void ReimbursementDaoFactory() {
		
	}
	
	public static ReimbursementDAO getDao() {
		if(dao==null) {
			dao = new ReimbursementImpl();
		}
		return dao;
	}
}
