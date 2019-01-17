package com.dao; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.Dbconn;
import com.entity.Employee;

public class DaoImpl implements Dao  {
	Dbconn obj=new Dbconn();
	Connection con=obj.getConnection();
	Statement stmnt=null;
	ResultSet rs;

	public boolean createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try{
			PreparedStatement ps=con.prepareStatement("INSERT INTO employee VALUES "
					+ "(?,?,?,?,?)");
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setString(4, employee.getEmail());
			ps.setString(5, employee.getContact());
			ps.execute();
			/**/
		    PreparedStatement pse=con.prepareStatement("INSERT INTO salary "
		 		+ "VALUES (?,?)");
		    pse.setInt(1, employee.getId());
		    pse.setInt(2,employee.getSalary());
		    pse.execute();
		    } catch(SQLException ex){
		    	System.out.println(ex);
		    	}
		return false;
		}
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement psu=con.prepareStatement("UPDATE employee SET id=?,"
					+ "name=?,addresss=?,email=?,contact=? WHERE id=?");
		    psu.setInt(1,employee.getId()); 
	       	psu.setString(2,employee.getName()); 
		    psu.setString(3,employee.getAddress()); 
		    psu.setString(4,employee.getEmail());
		    psu.setString(5,employee.getContact());
		    psu.setInt(6,employee.getId());
		    psu.execute(); 
		    } catch(Exception ex){  	
			System.out.println(ex);
			}
		return false;
		}	
	@Override
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pv=con.prepareStatement("DELETE  FROM salary WHERE eid=?");
			pv.setInt(1, employee.getId());
			pv.execute();
			PreparedStatement ps2=con.prepareStatement("DELETE  FROM empproject WHERE eid=?");
			ps2.setInt(1, employee.getId());
			ps2.execute();
			PreparedStatement ps1=con.prepareStatement("DELETE  FROM employee WHERE id=?");
			ps1.setInt(1, employee.getId());
			ps1.execute();
			} catch(Exception ex){
			System.out.println(ex);
			}
		return false;
	}


	@Override
	public Employee AddProject(Employee employee) {
		// TODO Auto-generated method stub
		PreparedStatement ps3;
		try {
			ps3 = con.prepareStatement("INSERT INTO project VALUES (?,?)");
			ps3.setInt(1, employee.getPid());
		    ps3.setString(2,employee.getDes() );
		    ps3.execute();
		    } catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public Employee updateProject(Employee employee) {
		try {
			PreparedStatement pd=con.prepareStatement
					("Update project set pdes=? where pid=?");
			pd.setInt(2,employee.getPid());
			pd.setString(1,employee.getDes());
			pd.execute();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Employee assignProject(Employee employee) {
          try {
			PreparedStatement as=con.prepareStatement
					("insert into empproject values (?,?)");
			as.setInt(1, employee.getPid());
			as.setInt(2, employee.getId());
			as.execute();
			} catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
		return null;
	}
	@Override
	public List<Employee> showDetails(Employee e) {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<Employee>();
		
			PreparedStatement as;
			try {
				as = con.prepareStatement("select * from employee where id=?");
				as.setInt(1, e.getId());
				ResultSet rs=as.executeQuery();
				while(rs.next())
				{
					e.setId(rs.getInt("id"));
					e.setName(rs.getString("name"));
					e.setAddress(rs.getString("addresss"));
					e.setEmail(rs.getString("email"));
					e.setContact(rs.getString("contact"));
					
					list.add(e);
				}
				} catch (SQLException e1){
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return list;
	}
	@Override
	public List<Employee> sortRecord() {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<Employee>();
		try{  
			
			PreparedStatement ps5=con.prepareStatement("SELECT employee.contact,employee.name,employee.addresss,employee.email, salary.salary FROM employee INNER JOIN salary ON employee.id=salary.eid ORDER BY salary ASC");
			ResultSet rs=ps5.executeQuery();
			while(rs.next()){
				Employee u=new Employee();
				u.setContact(rs.getString("contact"));
				u.setName(rs.getString("name"));
				u.setAddress(rs.getString("addresss"));
				u.setEmail(rs.getString("email"));
				u.setSalary(rs.getInt("salary"));
				list.add(u);
			}
			}catch(Exception e){
				System.out.println(e);
				}
		return list;
	}
	
}
