//package midterm.Midterm.src.PersonalProject;
//
//
//
//
//
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.List;
//
//public class HighwayDAODemo {
//
//	public static void main(String[] args) throws IOException {
//		IHighwayDAO dao = new HighwayDAO();
//		
//		try {
//			dao.getConnection();
//			
//			HighwayBean num1 = new HighwayBean();//insert
//			num1.set��D�O("��D�K��");
//			num1.set��V("N");
//			num1.set�s��("01F-000.0N");
//			num1.set�]�w���O�ϥN�X("01F0000N");
//			num1.set�_�I��y�D("�t�s�q");
//			num1.set���I��y�D("��q");
//			num1.set���O�ϳ]�w���{(1.1F);
//			num1.set�p�����P��(2.2F);
//			num1.set�j�����P��(3.3F);
//			num1.set�p�����P��(4.4F);
//			int count1 =dao.insert(num1);
//			System.out.println("insert"+count1+"rows");
			
			
//			HighwayBean num2 = new HighwayBean();//update
//			num2.set��D�O("��D�E��");
//			num2.set��V("N");
//			num2.set�s��("11F-000.0N");
//			num2.set�]�w���O�ϥN�X("11F0000N");
//			num2.set�_�I��y�D("�t�s�q");
//			num2.set���I��y�D("��q");
//			num2.set���O�ϳ]�w���{(1.1F);
//			num2.set�p�����P��(2.2F);
//			num2.set�j�����P��(3.3F);
//			num2.set�p�����P��(4.4F);
//			int count2 =dao.insert(num2);
//			System.out.println("insert"+count2+"rows");
			
//			HighwayBean num3 =  dao.findBy�s��("01F-000.5N");//�d�@��
//			System.out.println("��D�O="+num3.get��D�O());
//			System.out.println("��V"+num3.get��V());
//			System.out.println("�s��"+num3.get�s��());
//			System.out.println("�]�w���O�ϥN�X"+num3.get�]�w���O�ϥN�X());
//			System.out.println("�_�I��y�D"+num3.get�_�I��y�D());
//			System.out.println("���I��y�D"+num3.get���I��y�D());
//			System.out.println("���O�ϳ]�w���{"+num3.get���O�ϳ]�w���{());
//			System.out.println("�p�����P��"+num3.get�p�����P��());
//			System.out.println("�j�����P��"+num3.get�j�����P��());
//			System.out.println("�p�����P��"+num3.get�p�����P��());
		
//			List<HighwayBean>nums = dao.getAll();
//			for(HighwayBean num:nums) {
//				System.out.print(num.get��D�O()+",");
//				System.out.print(num.get��V()+",");
//				System.out.print(num.get�s��()+",");
//				System.out.print(num.get�]�w���O�ϥN�X()+",");
//				System.out.print(num.get�_�I��y�D()+",");
//				System.out.print(num.get���O�ϳ]�w���{()+",");
//				System.out.print(num.get�p�����P��()+",");
//				System.out.print(num.get�j�����P��()+",");
//				System.out.print(num.get�p�����P��()+"\n");
//			}
//			
//			
//			
//			int count3 = dao.delete("01F-000.0N");
//			System.out.println("delete"+count3+"rows");
//			
//			 try {
//				dao.fileInput("C:/temp/data01.csv");
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//			 
//			 
//			 try {
//				dao.fileOutput("C:/temp/data02.xml");
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				dao.closeConn();
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
