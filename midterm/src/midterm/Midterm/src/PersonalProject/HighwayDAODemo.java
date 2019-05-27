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
//			num1.set國道別("國道八號");
//			num1.set方向("N");
//			num1.set編號("01F-000.0N");
//			num1.set設定收費區代碼("01F0000N");
//			num1.set起點交流道("龜山島");
//			num1.set迄點交流道("綠島");
//			num1.set收費區設定里程(1.1F);
//			num1.set小型車牌價(2.2F);
//			num1.set大型車牌價(3.3F);
//			num1.set聯結車牌價(4.4F);
//			int count1 =dao.insert(num1);
//			System.out.println("insert"+count1+"rows");
			
			
//			HighwayBean num2 = new HighwayBean();//update
//			num2.set國道別("國道九號");
//			num2.set方向("N");
//			num2.set編號("11F-000.0N");
//			num2.set設定收費區代碼("11F0000N");
//			num2.set起點交流道("龜山島");
//			num2.set迄點交流道("綠島");
//			num2.set收費區設定里程(1.1F);
//			num2.set小型車牌價(2.2F);
//			num2.set大型車牌價(3.3F);
//			num2.set聯結車牌價(4.4F);
//			int count2 =dao.insert(num2);
//			System.out.println("insert"+count2+"rows");
			
//			HighwayBean num3 =  dao.findBy編號("01F-000.5N");//查一筆
//			System.out.println("國道別="+num3.get國道別());
//			System.out.println("方向"+num3.get方向());
//			System.out.println("編號"+num3.get編號());
//			System.out.println("設定收費區代碼"+num3.get設定收費區代碼());
//			System.out.println("起點交流道"+num3.get起點交流道());
//			System.out.println("迄點交流道"+num3.get迄點交流道());
//			System.out.println("收費區設定里程"+num3.get收費區設定里程());
//			System.out.println("小型車牌價"+num3.get小型車牌價());
//			System.out.println("大型車牌價"+num3.get大型車牌價());
//			System.out.println("聯結車牌價"+num3.get聯結車牌價());
		
//			List<HighwayBean>nums = dao.getAll();
//			for(HighwayBean num:nums) {
//				System.out.print(num.get國道別()+",");
//				System.out.print(num.get方向()+",");
//				System.out.print(num.get編號()+",");
//				System.out.print(num.get設定收費區代碼()+",");
//				System.out.print(num.get起點交流道()+",");
//				System.out.print(num.get收費區設定里程()+",");
//				System.out.print(num.get小型車牌價()+",");
//				System.out.print(num.get大型車牌價()+",");
//				System.out.print(num.get聯結車牌價()+"\n");
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
