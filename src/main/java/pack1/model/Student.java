package pack1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="stu_tab")
@Data

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(name="stu_name")
	private String name;
	@Column(name="stu_age")
	private String age;
	@Column(name="mobile_number")
	private String mobilenumber;
	@Column(name="address")
	private String address;
	@Column(name="roll_no")
	private String rollNo;
	
	
	

	

	
	
	
}
