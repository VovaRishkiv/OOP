package ua.lpnuai.oop.Vova;
import java.util.ArrayList;

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