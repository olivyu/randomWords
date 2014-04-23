package randomWords;

public class LinkList {
	public LinkNode head;
	
	public LinkList(){
		head = null;
	}
	
	public void insert(String word, boolean isRecent){
		if (head == null){
			head = new LinkNode(word,null,isRecent);
		}
		else {
			LinkNode current = head;
			if (compare(word,current.getItem())){
				head = new LinkNode(word,current,isRecent);
			}
			else{
				LinkNode previous = null;
				while (current != null && compare(current.getItem(),word)){ 
					//current != MUST COME FIRST or else you nullpointerexception an empty current
					//the word is NOT alphabetically in front AND the list is NOT empty
					previous = current;
					current = current.getNext();
				}
				if (current == null) {
					previous.setNext(new LinkNode(word,null,isRecent));
				}
				else {
					previous.setNext(new LinkNode(word,current,isRecent));
				}
			}
		}
	}

	public void delete(String word) {
		LinkNode current = head;
		if (word.equals(current.getItem())) {
			head = current.getNext();
		}
		else {
			LinkNode previous = null;
			while (!word.equals(current.getItem())) {
				previous = current;
				current = current.getNext();
			}
			if (word.equals(current.getItem())) {
				previous.setNext(current.getNext()); 
			}
		}
	}

	public void display() {
		LinkNode temp = head;
		int count = 0;
		System.out.println();
		while (temp != null) {
			if (count == 12) {
				System.out.println();
				count = 0;
			}
			temp.displayNode();
			count++;
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	private boolean compare(String one, String two) {
		return one.compareTo(two) < 0; //one comes BEFORE two
	}
	
}
