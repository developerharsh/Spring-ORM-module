package mypack;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyClient 
{

	public static void main(String[] args) 
	{
        ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
		
		EmpDAO dao=(EmpDAO) ac.getBean("d");
		
		Emp e = new Emp();
		e.setEname("aaaa");
		e.setEno(104);
		e.setEsal(11111F);
		
		dao.saveEmployee(e);
		//dao.deleteEmployee(e);
		//dao.updateEmployee(e);
		
/*		Emp e1 = dao.getById(104);
		System.out.println(e1.getEno()+e1.getEname()+e1.getEsal());
		
		List<E> l= dao.getEmp();
		Iterator it = l.iterator();
		
		while(it.hasNext())
		{
			Emp e2=(Emp) it.next();
			System.out.println(e2.getEname()+e1.getEno());
		}*/

	}

}
