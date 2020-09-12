import java.util.*;

public class Trio<T> {
	private T item1;
	private T item2;
	private T item3;
	
	
	public Trio(T t1, T t2, T t3) {
		this.item1 = t1;
		this.item2 = t2;
		this.item3 = t3;
	}
	
	public Trio(T t1) {
		this.item1 = t1;
		this.item2 = t1;
		this.item3 = t1;
	}
	
	public T getItem1() {
		return item1;
	}
	
	public T getItem2() {
		return item2;
	}
	
	public T getItem3() {
		return item3;
	}
	
	public void setItem1(T item) {
		this.item1 = item;
	}
	
	public void setItem2(T item) {
		this.item2 = item;
	}
	
	public void setItem3(T item) {
		this.item3 = item;
	}
	
	public void replaceAll(T item) {
		this.item1 = item;
		this.item2 = item;
		this.item3 = item;
	}
	
	public boolean hasDuplicates() {
		int count = 0;
		if(item1.equals(item2)) {
			count++;
		}
		 if(item2.equals(item3)) {
			count++;
		}
		 if(item3.equals(item1)) {
			count++;
		}
		 if(count < 1) {
			System.out.println("count: " + count);
			return false;
		}
		else {
			System.out.println("count: " + count);
			return true;
			
		}
	}
	
	public int count(T item) {
		int count = 0;
		if (item.equals(item1)) {
			count++;
		}
		if (item.equals(item2)) {
			count++;
		}
		if (item.equals(item3)) {
			count++;
		}
		return count;
	}
	
	 public boolean equals(Trio other) {
		 ArrayList<T> original = new ArrayList<>();
		// ArrayList<T> compare  = new ArrayList<>();
		 original.add(item1);
		 original.add(item2);
		 original.add(item3);
		
		
		 System.out.print(original);
		 System.out.println(other);
		 return original.equals(other);
	 }
	
	
	@Override 
	public String toString() {
		return item1.toString() + " " + item2.toString() + " " + item3.toString();
	}
}
