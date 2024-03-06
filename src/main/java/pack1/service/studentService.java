package pack1.service;

import pack1.response.BasicResponseMsg;
import pack1.response.StudentRequestVo;

public interface studentService {

	BasicResponseMsg saveStudent(StudentRequestVo studentRequestVo);

}
