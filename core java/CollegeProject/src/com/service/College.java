package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Batch;
import com.model.Course;
import com.model.Faculty;
import com.model.Student;

public class College implements University {
	List<Course> clist=new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void addCourse() {
		Course c = new Course(0, null);
		System.out.println("Enter Course Id : ");
		c.setCid(sc.nextInt());
		System.out.println("Enter Course Name : ");
		c.setCname(sc.next());
		
		clist.add(c);
		System.out.println("Course Added Successfully....");
	}

	@Override
	public void viewCourse() {
		
		if(clist.isEmpty()) {
			System.out.println("Course Not Set Yet.");
		}
		else {
		
		// System.out.println("All Courses Available are.......");
		for(Course crs:clist) {
			System.out.println(crs);
		}
		}
	}

	@Override
	public void addFaculty() {
		
		
		
		Faculty f = new Faculty(0, null, null);
		System.out.println("Enter Faculty ID Number : ");
		f.setFid(sc.nextInt());
		System.out.println("Enter Faculty Name : ");
		String s = sc.next();
		s+=sc.nextLine();
		f.setFname(s);
		//f.setCrs(clist.get(0));
		for(Course cr:clist) {
			f.setCrs(cr);
		}
		flist.add(f);
		
		System.out.println("Faculty Added Successfully....");
		
		
	}

	@Override
	public void viewFaculty() {
		// System.out.println(flist.get(0));   // For Single Object 
		
		if(flist.isEmpty()) {
			System.out.println("Faculty Not Set Yet.");
		}
		else {
		
		for(Faculty f : flist) {
			System.out.println(f);
		}
		}
		 
	}

	@Override
	public void addBatch() {
		Batch b = new Batch(0, null, null);
		System.out.println("Enter Batch Id : ");
		b.setBid(sc.nextInt());
		System.out.println("Enter Batch Name : ");
		String s = sc.next();
		s += sc.nextLine();
		b.setBname(s);
		
		//b.setFclt(flist.get(0));
		for(Faculty fc:flist) {
			b.setFclt(fc);
		}
		
		blist.add(b);
		
		
		
	}

	@Override
	public void viewBatch() {
		if(blist.isEmpty()) {
			System.out.println("Batch Not set Yet..");
		}
		else {
		for(Batch b:blist) {
			System.out.println(b);
		}
		}
	}

	@Override
	public void addStudent() {
		Student s = new Student(0, null, null);
		System.out.println("Enter Student ID : ");
		s.setSid(sc.nextInt());
		System.out.println("Enter Student Name  : ");
		String ss = sc.next();
		ss+=sc.nextLine();
		s.setSname(ss);
		
		for(Batch b:blist) {
			s.setBtc(b);
		}
		
		
		
		slist.add(s);
		
		//s.setBtc(blist.get(0));
		
	}
	public void m1() {
		
		for(Student s:slist) {
			System.out.println(s);
		}
		
	}


	@Override
	public void viewStudent() {
		
		//System.out.println(slist.get(0));
		
		if(slist.isEmpty()) {
			System.out.println("Student Not Set Yet.");
		}
		else {
			for(Student s:slist) {
				System.out.println(s);
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		College clg = new College();
		clg.m1();
//		int i=0;
//		//while(i<3) {
//		clg.addCourse();
//		
//		clg.viewCourse();
//		i++;
//		//}
//		clg.addFaculty();
//		clg.viewFaculty();
//		
//		clg.addBatch();
//		clg.viewBatch();
//		
//		clg.addStudent();
//		clg.viewStudent();
	}

}
