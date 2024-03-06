package pack1.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pack1.response.BasicResponseMsg;
import pack1.response.StudentRequestVo;
import pack1.service.studentService;

@RestController
public class StudentController {
    @Autowired
	private studentService studentService;
	
	@PostMapping("/saveStudent")
	public ResponseEntity <BasicResponseMsg> saveStudent(@RequestBody StudentRequestVo studentRequestVo)
	{
		
		BasicResponseMsg response=new BasicResponseMsg();
		try {
			
			
			response=studentService.saveStudent(studentRequestVo);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
