package com.example.demo;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private UserRepository UserRepository;

	@Test
	void testCRUD() {
		/*
		// create
		UserModel User = new UserModel();
		User.setUserName("Marry");
		User.setEmail("marry@gmail.com");
		UserRepository.save(User);

		User
		User.setName("Vincent");
		User.setAge(27);
		studentRepository.save(student);

		// read
		StudentPO result = studentRepository.findById(student.getId()).orElseThrow();
		assertEquals(student.getName(), result.getName());
		assertEquals(student.getAge(), result.getAge());

		// update
		student.setAge(26);
		studentRepository.save(student);

		result = studentRepository.findByAge(student.getAge()).get(0);
		assertEquals(student.getAge(), result.getAge());

		// delete
		studentRepository.deleteById(student.getId());
		assertFalse(studentRepository.existsById(student.getId()));*/
	}

}
