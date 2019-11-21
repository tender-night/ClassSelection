import java.util.*;

public class Student {
	String Sno;
	String Sname;
	Vector<Course> cList;
	int totalCre = 0;

	public Student(String Sno, String Sname) {
		this.Sno = Sno;
		this.Sname = Sname;
		cList = new Vector<Course>();
	}

	void Selection(Course c1) {
		if (totalCre < 26) {
			cList.add(c1);
			c1.Selection(this);
			totalCre += Integer.parseInt(c1.Credit);
			if (totalCre > 26) {//学分上限为26分，判断是否超过，若超过则不能继续选课
				System.out.println("您所选学分已超上限");
				totalCre -= Integer.parseInt(c1.Credit);
				cList.remove(cList.size() - 1);
				c1.sList.remove(c1.sList.size() - 1);
				totalCre -= Integer.parseInt(c1.Credit);
			}
		} else if (totalCre == 26) {
			System.out.println("您所选学分已超上限");
		}
	}

	public void print() {//打印一个学生所选的所有课程
		int size;
		size = cList.size();
		String temp;
		System.out.println(this.Sname + "(学号:" + this.Sno + ")" + "所选的课程有：");
		for (int i = 0; i < size; i++) {
			Course c1 = (Course) cList.get(i);
			temp = c1.Cno + " " + c1.Cname + " 学分:" + c1.Credit;
			System.out.println(temp);
		}
		System.out.println("所选总学分为：" + totalCre);
	}
}
