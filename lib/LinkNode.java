package randomWords;

import java.util.Random;

public class LinkNode {
	private String item;
	private LinkNode next;
	private boolean recent;
	
	public LinkNode(String item, LinkNode next, boolean isRecent) {
		this.item = item;
		this.next = next;
		this.recent = isRecent;
	}
	
	public void displayNode(){
		if (recent) {
			System.out.printf("*" + item + "\t");
			recent = false;
		}
		else{
			System.out.printf(item + "\t");
		}
	}
	
	public String getItem(){
		return item;
	}
	
	public LinkNode getNext(){
		return next;
	}
	
	public void setNext(LinkNode node){
		next = node;
	}
	
}
