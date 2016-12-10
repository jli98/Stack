
public class myStack {
	private int size = 16;
	private int used = 0;
	private int []data;
	
	public  myStack(){
		data = new int[size];
	}
	
	public void push(int v){
		data[used] = v;
		used++;
	}
	
	public int pop(){
		int p = data[used];
		used--;
		return p;
	}
	
	public int size(){
		return used;
	}
	
	public int peek(){
		return data[used];
	}
	
	public static void main(String[] a){
		myStack i = new myStack();
		i.push(105);
		System.out.println(i.pop());
	}
}
