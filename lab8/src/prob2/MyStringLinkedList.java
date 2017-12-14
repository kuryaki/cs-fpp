package prob2;


public class MyStringLinkedList {
	Node header;
	
	MyStringLinkedList(){
		header = new Node(null,null, null);
	}
	
	public void add(String item){
		Node n = new Node(header.next, header, item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
	}
	
	public int size() {
		int size = 0;
		
		Node index = header;
		while(index.next != null) {
			size++;
			index = index.next;
		}
		
		return size;
	}
	
	public void insert(String value, int pos) {
		this.add(value);
		this.swap(header.next, this.elemenAt(pos));	
	}
	
	private Node elemenAt(int pos) {
		int count = 0;
		Node index = header.next;
		while(index.next != null) {
			if(count == pos) break;
			index = index.next;
			count++;
		}
		return index;
	}

	public void swap(Node n1, Node n2) {
		
		String tmp = n1.value;
		n1.value = n2.value;
		n2.value = tmp;
	}
	
	public boolean isEmpty() {
		if (header.next == null) return true; 
		return false;
	}
	
	public String toString() {
		if(this.isEmpty()) return "[]";
		
		Node index = header.next;
		String print = "[" + index.value;
		
		while(index.next != null) {
			print += ", " + index.next.value ;
			index = index.next;
		}
		
		return print + "]";
	}
	
	public boolean remove(String data) {
		boolean removed = false;
		
		Node index = header;
		
		while(index.next != null) {
			if(index.value == data) {
				this.swap(index, this.elemenAt(this.size()-1));
				Node temp = this.elemenAt(this.size()-1);
				temp.previous.next = null;
				temp = null;
			}
			index = index.next;
		}
		
		return removed;
	}

	private void minSort() {
		int size = this.size();
		if(header.next == null || size <=1) return;
		for(int i = 0; i < size; ++i){
			Node n = this.elemenAt(i);
			Node min = this.minNode(n);
			swap(n, min); 
		}
	}

	private Node minNode(Node n) {
		Node min = n;
		Node current = n.next;
		while(current != null) {
			if(current.value.compareTo(min.value) < 0) {
				min = current;
			}
			current = current.next;
		}
		return min;
	}
	
	boolean search(String val) {
		boolean b = recurse(0,this.size()-1, val);
		return b;
	}


	boolean recurse(int a, int b, String val) {
		int mid = (a+b)/2;
		if(this.elemenAt(mid).value.equals(val)) return true;
		if(a > b) return false;
		if(val.compareTo(this.elemenAt(mid).value) > 0) return recurse(mid+1, b, val);
		return recurse(a,mid-1,val);
	}
	
	class Node {
		String value;
		Node next;
		Node previous;
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
		public String toString() {
			return value;
		}
	}
	
	public static void main(String[] args) {
		
		String arr[] = { "big", "small", "tall", "short", "round", "square", "enormous", "tiny","gargantuan", "lilliputian", "numberless", "none", "vast", "miniscule" }; 
		MyStringLinkedList ll = new MyStringLinkedList();
		
		for(String s: arr) {
			ll.add(s);
		}
		
		System.out.println(ll.size());	
		
		ll.insert("david", 4);
		System.out.println(ll);
		System.out.println(ll.size());	
		
		ll.remove("david");
		System.out.println(ll);
		System.out.println(ll.size());
		
		ll.minSort();
		System.out.println(ll);
		
		System.out.println(ll.search("vast"));
		System.out.println(ll.search("david"));
	}

}

