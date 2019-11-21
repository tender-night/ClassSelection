import java.util.*;

public class School {
	Map<String, Course> cMap = new HashMap<String, Course>();
	Map<String, Student> sMap = new HashMap<String, Student>();
	Scanner input = new Scanner(System.in);

	void addStu(Student s1) {
		sMap.put(s1.Sno, s1);
	}

	void addCourse(Course c1) {
		cMap.put(c1.Cno, c1);
	}

	void Choose() {
		String tempSno;
		String tempCno;

		Student s1;
		Course c1;

		for (int i = 0;; i++) {//使用两层循环满足一个学生选多门课，多个学生依次选的要求
			System.out.println("请输入需要选课学生的学号，若所有学生选课完毕请输入‘完毕’");
			tempSno = input.nextLine();
			if (tempSno.equals("完毕")) {
				break;
			} else {
				s1 = sMap.get(tempSno);
				for (int j = 0;; j++) {
					System.out.println("请输入该学生所选课程的课程号，如对该学生选课结束请输入‘end’");
					tempCno = input.nextLine();
					if (tempCno.equals("end")) {
						break;
					} else {
						c1 = cMap.get(tempCno);
						s1.Selection(c1);
					}
				}
			}
		}
	}

	void printStu() {
		String temp;
		Student s1;
		System.out.println("请输入学生学号，查看其所选课程");
		temp = input.nextLine();
		s1 = sMap.get(temp);
		s1.print();
	}

	void printCourse() {
		String temp;
		Course c1;
		System.out.println("请输入课程编号，查看选该门课的学生");
		temp = input.nextLine();
		c1 = cMap.get(temp);
		c1.print();
	}
}
