package com.yedam.Map;

public class Student {
	public int sno;
	public String sname;
	
	public Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + sname.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			return (sno == std.sno) && (sname.equals(std.sname));
		}
		return false;
	}
	
	
	
	
}
