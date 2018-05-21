package ua.lpnuai.oop.Vova;
import java.util.Scanner;
import ua.lpnuai.oop.Vova.TestArrayList;

public class Main {
	
	private static Scanner scan;
	
	public static void showMenu() {
		System.out.println("A - �������� �����");
		System.out.println("B - �������� �����");
		System.out.println("C - ��������� ���������");
		System.out.println("D - ³���������� ����������");
		System.out.println("exit - ���������� ��������");
	}
	public static TestArrayList test = new TestArrayList();
	public static TestArrayList test1 = new TestArrayList();
	public static TestArrayList test2 = new TestArrayList();
	
	public static void main(String[] args) {
		System.out.println("��� ���������� ���� ������ ���� ������ help");

	    scan = new Scanner(System.in);
		String str=" ";
		while(true) {
			String input = scan.nextLine();
			switch(input){
				case "A":
					str = scan.nextLine();
					test.create(str);
					break;
				case "B":
					test.getData();
					break;
				case "C":
					divvy();
					break;
				case "D":
					System.out.println("����� ��������:");
					test1.getData();
					System.out.println("������ ��������:");
					test2.getData();
					break;
				case "exit":
					return;
				case "help":
					showMenu();
			}
		}
	}
	
	public static void divvy() {
		for(int i = 0;i<test.retLen();i++) {
			if(test.returnItem(i).length() < test.amountLength()) {
				test1.create(test.returnItem(i));
			}else {
				test2.create(test.returnItem(i));
			}
		}
	}
}
