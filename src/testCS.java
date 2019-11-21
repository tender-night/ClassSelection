import java.util.Scanner;

public class testCS {
	public static void main(String[] args) {
		School school = new School();
		String temp;
		Scanner input = new Scanner(System.in);

		Student s1 = new Student("201636001", "小a");
		school.addStu(s1);
		Student s2 = new Student("201636002", "小b");
		school.addStu(s2);
		Student s3 = new Student("201636003", "小c");
		school.addStu(s3);
		Student s4 = new Student("201636004", "小d");
		school.addStu(s4);
		Student s5 = new Student("201636005", "小e");
		school.addStu(s5);

		Course c1 = new Course("MAT108", "高等数学（一）", "4");
		school.addCourse(c1);
		Course c2 = new Course("CMP104", "线性代数", "4");
		school.addCourse(c2);
		Course c3 = new Course("CMP330", "程序设计基础", "4");
		school.addCourse(c3);
		Course c4 = new Course("EBU306", "电子金融", "2");
		school.addCourse(c4);
		Course c5 = new Course("EBU308", "网络营销", "3");
		school.addCourse(c5);
		Course c6 = new Course("CMP301", "数据库系统", "4");
		school.addCourse(c6);
		Course c7 = new Course("EBU322", "互联网金融风险管理", "2");
		school.addCourse(c7);
		Course c8 = new Course("CMP204", "数据结构", "3");
		school.addCourse(c8);
		Course c9 = new Course("CMP406", "面向对象程序设计", "3");
		school.addCourse(c9);
		Course c10 = new Course("CMP302", "计算机网络", "3");
		school.addCourse(c10);
		Course c11 = new Course("EBU321", "互联网金融大数据分析", "3");
		school.addCourse(c11);
		Course c12 = new Course("EBU309", "供应链管理与ERP", "3");
		school.addCourse(c12);
		Course c13 = new Course("EBU312", "电子商务系统建设与实施", "3");
		school.addCourse(c13);

		school.Choose();

		for (int i = 0;; i++) {
			System.out.println("如果您想查看某位学生选了什么课，请输入‘查看所选课程’，如果想查看某门课有哪些学生选，请输入‘查看选课学生’，如果都不想查看或已查看完毕，请输入‘完毕’");
			temp = input.nextLine();
			if (temp.equals("查看所选课程")) {
				school.printStu();
			} else if (temp.equals("查看选课学生")) {
				school.printCourse();
			} else if (temp.equals("完毕")) {
				System.out.println("选课结束");
				break;
			}
		}
	}
}
