package twoTree;

import java.util.Stack;

public class Tree {
	private Node root ;
	public Tree(){
		root = null;
	}
	public void insert(int id,double dd){
		Node current = null;
		Node parent = null;
		Node newNode = new Node();
		newNode.id = id;
		newNode.dd = dd;
		if(root == null){
			root = newNode;
			return;
		}
		current = root;
		while(true){
			parent = current;
			if(id < current.id){ //�����Ƚڵ�С���������
				current = current.leftNode;
				if(current == null){
					parent.leftNode = newNode;
					return;
				}
			}
			else {//�����Ƚڵ�����ұ���
				current = current.rightNode;
				if(current == null){
					parent.rightNode = newNode;
					return;
				}
			}
		}
	}
	
	public boolean delete(int id){
		Node current = root;
		boolean left = true;
		Node parent = null;
		if(root == null){
			return false;
		}
		while(true){
			while(id != current.id){	
				parent = current;
				if(id<current.id){ //ס�����
					current = current.leftNode;	
					left = true;
				}else {//ס�ұ���
					current = current.rightNode;
					left = false;
				}
				if(current == null){ //û�ҵ�
					return false;
				}
			}
		if(current.leftNode == null&&current.rightNode==null){ //��ǰ�ڵ���Ҷ�ӽڵ�
			if(current == root){
				root = null;
			}
			if(left){ // �Ǹ��ڵ�����ӽڵ�
			parent.leftNode = null;
			}else{
				parent.rightNode = null;
			}
		}else if(current.leftNode == null){//ֻ���ҽڵ�
			if(current == root){
				root = current.rightNode;
			}else if(left){
				parent.leftNode = current.rightNode;
			}
			else {
				parent.rightNode = current.rightNode;
			}
		}else if(current.rightNode == null){//ֻ����ڵ�
			if(current == root){
				root = current.leftNode;
			}else if(left){
				parent.leftNode = current.leftNode;
			}
			else {
				parent.rightNode = current.leftNode;
			}
		}
		else{ //�������ڵ�
			Node successor = getSuccessor(current);
			if(root == current){
				root = successor;
			}else if(left){
				parent.leftNode = successor;
			}else{
				parent.rightNode = successor;
			}
			successor.leftNode = current.leftNode;//����ɾ���ڵ����ڵ㣬��successor
		}
		return true;
		}
		
	}
	public Node getSuccessor(Node del){//Ѱ�Ҽ̳нڵ�(ɾ���ڵ��һ���ҽڵ�������ӽڵ�)
		Node successorParent = del;
		Node successor = del;
		Node current = del.rightNode;
		//successor = del.rightNode;//
		while(current!=null){
			successorParent = successor;
			successor = current;
			current = current.leftNode;
		}
		if(successor != del.rightNode){ //�������ɾ�������ҽڵ�
			successorParent.leftNode = successor.rightNode; //���successor�����ӽڵ㣬�ŵ�successorParent���ӽڵ���
			successor.rightNode = del.rightNode; //��ɾ���ҽڵ�ŵ��̳нڵ��ҽڵ���
		}
		return successor;
	}
	public Node find(int id){ //�ҽڵ�
		Node current = root;
		if(root == null){
			return null;
		}
		while(true){
			while(id != current.id){		
				if(id<current.id){ //ס�����
					current = current.leftNode;				
				}else {//ס�ұ���
					current = current.rightNode;
				}
				if(current == null){ //û�ҵ�
					return null;
				}
			}
			return current;
		}
	}
	public void display(){
		
	}
	public void traverse(int num){ //����
		switch(num){
		case 1://�������£�������
			preOder(root);
			break;
		case 2://�������ϣ�������
			inOrder(root);
			break;
		case 3://�������ϣ����ҵ���
			postOrder(root);
			break;
		}
	}
	private void preOder(Node node){
		if(node != null){
			System.out.print(node.id+" ");
			preOder(node.leftNode);
			preOder(node.rightNode);
		}
	}
private void inOrder(Node node){
	if(node != null){
		inOrder(node.leftNode);
		System.out.print(node.id+" ");		
		inOrder(node.rightNode);
	}
	}
private void postOrder(Node node){
	if(node != null){
		postOrder(node.leftNode);
		postOrder(node.rightNode);
		System.out.print(node.id+" ");		
		
	}
}
/*public void displayTree(){
	Stack golbal = new Stack();
	golbal.push(root);
	int n = 32;
	boolean isRowEmpty = false;
	while(isRowEmpty==false){
		Stack local = new Stack();
		isRowEmpty = true;
		for(int i=0;i<n;i++){
			System.out.print(" ");
			while(golbal.isEmpty()==false){
				Node temp =(Node)golbal.pop();
				if(temp!=null){
					System.out.print(temp.id);
					local.push(temp.leftNode);
					local.push(temp.rightNode);
					if(temp.leftNode!=null||temp.rightNode!=null){
						isRowEmpty=false;
					}else{
						System.out.print("--");
						local.push(null);
						local.push(null);
					}
					for(int j= 0;j<n*2-2;j++){
						System.out.print(" ");
					}
				}
				System.out.println();
				n/=2;
				while(local.isEmpty()==false){
					golbal.push(local.pop());
				}
			}
		}
	}
	
}*/

}
