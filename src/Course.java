import java.util.*;
public class Course {
	String Cno;
	String Cname;
	String Credit;
	Vector<Student> sList;
	public Course(String Cno, String Cname, String Credit) {
		this.Cno = Cno;
		this.Cname = Cname;
		this.Credit = Credit;
		sList = new Vector<Student>();
	}
	void Selection(Student s) {
		sList.add(s);
	}

	public void print() {//打印选修某门的所有学生
		int size;
		size = sList.size();
		String temp;
		System.out.println("选择 " + this.Cname + "(课程号：" + this.Cno + ")" + "的学生有：");
		for (int i = 0; i < size; i++) {
			Student s1 = (Student) sList.get(i);
			temp = s1.Sno + " " + s1.Sname;
			System.out.println(temp);
		}
	}
}
