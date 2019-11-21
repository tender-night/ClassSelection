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
			if (totalCre > 26) {//ѧ������Ϊ26�֣��ж��Ƿ񳬹������������ܼ���ѡ��
				System.out.println("����ѡѧ���ѳ�����");
				totalCre -= Integer.parseInt(c1.Credit);
				cList.remove(cList.size() - 1);
				c1.sList.remove(c1.sList.size() - 1);
				totalCre -= Integer.parseInt(c1.Credit);
			}
		} else if (totalCre == 26) {
			System.out.println("����ѡѧ���ѳ�����");
		}
	}

	public void print() {//��ӡһ��ѧ����ѡ�����пγ�
		int size;
		size = cList.size();
		String temp;
		System.out.println(this.Sname + "(ѧ��:" + this.Sno + ")" + "��ѡ�Ŀγ��У�");
		for (int i = 0; i < size; i++) {
			Course c1 = (Course) cList.get(i);
			temp = c1.Cno + " " + c1.Cname + " ѧ��:" + c1.Credit;
			System.out.println(temp);
		}
		System.out.println("��ѡ��ѧ��Ϊ��" + totalCre);
	}
}
