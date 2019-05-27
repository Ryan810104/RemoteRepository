package midterm.Midterm.src.PersonalProject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IHighwayDAO {
	public void insert(HighwayBean highway)throws SQLException;
	public void update(HighwayBean code)throws SQLException;
	public void delete(String code)throws SQLException;
	public HighwayBean findByNumber(String number)throws SQLException;
	public List<HighwayBean>getAll()throws SQLException;
	public void fileInput(String address)throws SQLException, IOException;
	public List<HighwayBean> findByHighwayName(String highwayName)throws SQLException;
}
