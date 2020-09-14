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
	
	@Override
	public boolean equals(Object other) {
		 if(other instanceof Trio<?>) {
			 Trio<?> otherTrio = (Trio<?>) other;
			 
			 if(otherTrio.item1 instanceof String && this.item1 instanceof String) {
				 String o1 = (String) this.item1;
				 String o2 = (String) this.item2;
				 String o3 = (String) this.item3;
				 String c1 = (String) otherTrio.item1;
				 String c2 = (String) otherTrio.item2;
				 String c3 = (String) otherTrio.item3;
				 ArrayList<String> original = new ArrayList<>();
				 ArrayList<String> compare = new ArrayList<>();
				 original.add(o1);
				 original.add(o2);
				 original.add(o3);
				 compare.add(c1);
				 compare.add(c2);
				 compare.add(c3);
				 Collections.sort(original);
				 Collections.sort(compare);
				 return original.equals(compare);
			 }
			 if (otherTrio.item1 instanceof Integer && this.item1 instanceof Integer) {
				 Integer o1 = (Integer) this.item1;
				 Integer o2 = (Integer) this.item2;
				 Integer o3 = (Integer) this.item3;
				 Integer c1 = (Integer) otherTrio.item1;
				 Integer c2 = (Integer) otherTrio.item2;
				 Integer c3 = (Integer) otherTrio.item3;
				 ArrayList<Integer> original = new ArrayList<>();
				 ArrayList<Integer> compare = new ArrayList<>();
				 original.add(o1);
				 original.add(o2);
				 original.add(o3);
				 compare.add(c1);
				 compare.add(c2);
				 compare.add(c3);
				 Collections.sort(original);
				 Collections.sort(compare);
				 return original.equals(compare);
			 }
			 if (otherTrio.item1 instanceof Character && this.item1 instanceof Character) {
				 Character o1 = (Character) this.item1;
				 Character o2 = (Character) this.item2;
				 Character o3 = (Character) this.item3;
				 Character c1 = (Character) otherTrio.item1;
				 Character c2 = (Character) otherTrio.item2;
				 Character c3 = (Character) otherTrio.item3;
				 ArrayList<Character> original = new ArrayList<>();
				 ArrayList<Character> compare = new ArrayList<>();
				 original.add(o1);
				 original.add(o2);
				 original.add(o3);
				 compare.add(c1);
				 compare.add(c2);
				 compare.add(c3);
				 Collections.sort(original);
				 Collections.sort(compare);
				 return original.equals(compare);
			 }
			else {
				 return false;
			 }
		 } else {
			 return false;
		 }
	 }
	
	 //public void equalsHelper(Trio help) {
	//	 
	//	 
	// }
	
	@Override 
	public String toString() {
		return item1.toString() + " " + item2.toString() + " " + item3.toString();
	}
}
