package pack1.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack1.Dao.studentDao;
import pack1.model.Student;
import pack1.response.BasicResponseMsg;
import pack1.response.StudentRequestVo;
import pack1.service.studentService;
@Service
public class studentServiceImpl implements studentService {

	@Autowired
	private studentDao sDao;
	@Override
	public BasicResponseMsg saveStudent(StudentRequestVo studentRequestVo) {
		
		BasicResponseMsg response=new BasicResponseMsg(); 
		try {
			
			Student s=new Student();
		   
		      s.setAddress(studentRequestVo.getAddress());
		      s.setAge(studentRequestVo.getAge());		    
		      s.setMobilenumber(studentRequestVo.getMobilenumber());
		      s.setName(studentRequestVo.getName());
		      s.setRollNo(studentRequestVo.getRollNO());
		      
		      
		      Student save=sDao.save(s);
		      response.setData(save.getId());
		      
		      response.setMessage("student saved");
		      response.setStatus(200);
			
		   }
		catch(Exception e)
		{
			e.printStackTrace();
		} 
		
		return response;
	}

}
