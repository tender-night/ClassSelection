import java.util.Scanner;

public class testCS {
	public static void main(String[] args) {
		School school = new School();
		String temp;
		Scanner input = new Scanner(System.in);

		Student s1 = new Student("201636001", "Сa");
		school.addStu(s1);
		Student s2 = new Student("201636002", "Сb");
		school.addStu(s2);
		Student s3 = new Student("201636003", "Сc");
		school.addStu(s3);
		Student s4 = new Student("201636004", "Сd");
		school.addStu(s4);
		Student s5 = new Student("201636005", "Сe");
		school.addStu(s5);

		Course c1 = new Course("MAT108", "�ߵ���ѧ��һ��", "4");
		school.addCourse(c1);
		Course c2 = new Course("CMP104", "���Դ���", "4");
		school.addCourse(c2);
		Course c3 = new Course("CMP330", "������ƻ���", "4");
		school.addCourse(c3);
		Course c4 = new Course("EBU306", "���ӽ���", "2");
		school.addCourse(c4);
		Course c5 = new Course("EBU308", "����Ӫ��", "3");
		school.addCourse(c5);
		Course c6 = new Course("CMP301", "���ݿ�ϵͳ", "4");
		school.addCourse(c6);
		Course c7 = new Course("EBU322", "���������ڷ��չ���", "2");
		school.addCourse(c7);
		Course c8 = new Course("CMP204", "���ݽṹ", "3");
		school.addCourse(c8);
		Course c9 = new Course("CMP406", "�������������", "3");
		school.addCourse(c9);
		Course c10 = new Course("CMP302", "���������", "3");
		school.addCourse(c10);
		Course c11 = new Course("EBU321", "���������ڴ����ݷ���", "3");
		school.addCourse(c11);
		Course c12 = new Course("EBU309", "��Ӧ��������ERP", "3");
		school.addCourse(c12);
		Course c13 = new Course("EBU312", "��������ϵͳ������ʵʩ", "3");
		school.addCourse(c13);

		school.Choose();

		for (int i = 0;; i++) {
			System.out.println("�������鿴ĳλѧ��ѡ��ʲô�Σ������롮�鿴��ѡ�γ̡��������鿴ĳ�ſ�����Щѧ��ѡ�������롮�鿴ѡ��ѧ���������������鿴���Ѳ鿴��ϣ������롮��ϡ�");
			temp = input.nextLine();
			if (temp.equals("�鿴��ѡ�γ�")) {
				school.printStu();
			} else if (temp.equals("�鿴ѡ��ѧ��")) {
				school.printCourse();
			} else if (temp.equals("���")) {
				System.out.println("ѡ�ν���");
				break;
			}
		}
	}
}
