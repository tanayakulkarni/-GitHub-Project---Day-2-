import java.util.ArrayList;
public class Day2{
	public static ArrayList<Integer>  convertToArrayList(int num){
	ArrayList<Integer> list2 = new ArrayList<>();
	int count=0;
	int c= num;
	while (c>1){
		c/=10;
		count++;
	}
	for(int i=0; i<count; i++){
		list2.add(0);
	}
	while(num>1){
		list2.set(count-1,num%10);
		count--;
		num/=10;
	}

	return list2;
	}
	public static ArrayList<Integer> convertToInt(ArrayList<Integer> list1){
	return list1;
	}

	public static void main(String args[]){
	int num= 8950;
	ArrayList<Integer> list = new ArrayList<>();
	System.out.println(convertToArrayList(num));
}
}