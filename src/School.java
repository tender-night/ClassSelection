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

		for (int i = 0;; i++) {//ʹ������ѭ������һ��ѧ��ѡ���ſΣ����ѧ������ѡ��Ҫ��
			System.out.println("��������Ҫѡ��ѧ����ѧ�ţ�������ѧ��ѡ����������롮��ϡ�");
			tempSno = input.nextLine();
			if (tempSno.equals("���")) {
				break;
			} else {
				s1 = sMap.get(tempSno);
				for (int j = 0;; j++) {
					System.out.println("�������ѧ����ѡ�γ̵Ŀγ̺ţ���Ը�ѧ��ѡ�ν��������롮end��");
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
		System.out.println("������ѧ��ѧ�ţ��鿴����ѡ�γ�");
		temp = input.nextLine();
		s1 = sMap.get(temp);
		s1.print();
	}

	void printCourse() {
		String temp;
		Course c1;
		System.out.println("������γ̱�ţ��鿴ѡ���ſε�ѧ��");
		temp = input.nextLine();
		c1 = cMap.get(temp);
		c1.print();
	}
}
