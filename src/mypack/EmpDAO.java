package mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmpDAO 
{
	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void saveEmployee(Emp e)
	{
		template.save(e);
	}
	
	public void updateEmployee(Emp e)
	{
		template.update(e);
	}
	
	public void deleteEmployee(Emp e)
	{
		template.delete(e);
	}
	
	public Emp getById(int id)
	{
		Emp e = (Emp)template.get(Emp.class, id);
		return e;
	}
	
	public List<Emp> getEmp()
	{
		List<Emp> list=new ArrayList<Emp>();
		list=template.loadAll(Emp.class);
		return list;
	}
}
