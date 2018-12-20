package com.example.demo.lesson7;

import java.io.InputStream;

import javax.xml.bind.JAXB;

public class JaxbStaticTest {

	public static void javaToxml(Student stu) throws Exception {
		JAXB.marshal(stu, System.out);
	}
	
	public static void xmlTojava() throws Exception {
		// 加载需要转换的XML数据 -> 这里使用InputStream，还可以使用File，Reader等
		InputStream stream = JaxbStaticTest.class.getClassLoader().getResourceAsStream("lesson1.xml");
		Student stu = JAXB.unmarshal(stream, Student.class);
		System.out.println(stu);
	}
	
	public static void main(String[] args) throws Exception {
		Student stu = new Student("001", "Tom", 22);
//		javaToxml(stu);
		xmlTojava();
	}
}
