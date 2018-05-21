package ua.lpnuai.oop.Vova;
import java.util.Scanner;
import ua.lpnuai.oop.Vova.TestArrayList;

public class Main {
	
	private static Scanner scan;
	
	public static void showMenu() {
		System.out.println("A - Введення даних");
		System.out.println("B - Перегляд даних");
		System.out.println("C - Виконання обчислень");
		System.out.println("D - Відображення результату");
		System.out.println("exit - Завершення програми");
	}
	public static TestArrayList test = new TestArrayList();
	public static TestArrayList test1 = new TestArrayList();
	public static TestArrayList test2 = new TestArrayList();
	
	public static void main(String[] args) {
		System.out.println("Щоб відобразити опис пунктів меню введіть help");

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
					System.out.println("Менше середньої:");
					test1.getData();
					System.out.println("Більше середньої:");
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
