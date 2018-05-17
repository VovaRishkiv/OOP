import java.util.Scanner;

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

public class TestArrayList {

    private ArrayList<String> a1 = new ArrayList<String>();

    
    public void create(String str) {
        a1.add(str);
      
    }
    public void getData() {
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i) + " - "+ a1.get(i).length());
        }
    }
    public double amountLength() {	
    	double res = 0;
    	for(int i = 0; i<a1.size(); i++) {
    		res += a1.get(i).length();
    	}
    	res = res/a1.size();
    	return res;
    }
    public String returnItem(int index) {
    	return a1.get(index);
    }
    public int retLen() {
    	return a1.size();
    }
}

