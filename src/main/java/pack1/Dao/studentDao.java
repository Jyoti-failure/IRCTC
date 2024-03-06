package pack1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pack1.model.Student;

public interface studentDao extends JpaRepository<Student,Long> {

}
