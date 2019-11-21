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

	public void print() {//��ӡѡ��ĳ�ŵ�����ѧ��
		int size;
		size = sList.size();
		String temp;
		System.out.println("ѡ�� " + this.Cname + "(�γ̺ţ�" + this.Cno + ")" + "��ѧ���У�");
		for (int i = 0; i < size; i++) {
			Student s1 = (Student) sList.get(i);
			temp = s1.Sno + " " + s1.Sname;
			System.out.println(temp);
		}
	}
}
