package heap;

public class Heap {
	public Node[] ArrayItem;
	private int mSize;
	private int current;
	public Heap(int size){
		this.mSize = size;
		ArrayItem = new Node[this.mSize];
		current = 0;
	}
	public boolean insert(long dd){
		if(current == mSize){
			return false;
		}
		Node newNode = new Node(dd);
		ArrayItem[current]= newNode;
		trickUp(current);
		current++;
		return true;
	}
	public void trickUp(int c){//�½ڵ���бȽ����ϵ���
		int position = c;
		Node temp = ArrayItem[position];
		int index = (position-1)/2;
		//Node parent = ArrayItem[position/2-1];
		while(position>0&&ArrayItem[index].getData()<temp.getData()){//���ڵ���ӽڵ�С������
			ArrayItem[position] = ArrayItem[index];
			position = index;
			index = (index-1)/2;
		}
		ArrayItem[position] = temp;
	}
	public boolean delete(int index){
		if(index>current||index<0){
			return false;
		}
		ArrayItem[index] = ArrayItem[--current];
		change(index,ArrayItem[--current].getData());
		//trickDown(index);
		//current--;
		return true;
	}
	public void trickDown(int c){//���µĸ�λ�õ���������бȽ����µ���
		int position = c;
		Node lager;
		int lagerChild;
		Node temp = ArrayItem[position];
		int child = position*2+1;
		lagerChild = child;
		while(position<current/2){ //�������һ��
			if(ArrayItem[child].getData()<ArrayItem[child+1].getData()){
				lager = ArrayItem[position+1];
				lagerChild = child+1;
			}else{
				lager = ArrayItem[position];
				lagerChild = child;
			}
			if(ArrayItem[position].getData()>lager.getData())break;
			ArrayItem[position] = lager;
			position = lagerChild;
			child = lagerChild*2+1;
		}
		ArrayItem[position] = temp;
	}
	public boolean change(int index,long dd){//�ı����ȼ�
		if(index<0 || index>=current) //��Ч��λ��
			return false;
		Node newNode = new Node(dd);
		ArrayItem[index] = newNode;
		if(ArrayItem[(index-1)/2].getData()<dd){
			trickUp(index);
		}else{
			trickDown(index);
		}
		return true;
	}
	public void displayHeap(){
		System.out.print("HeapArray:");
		for(int m=0; m<current; m++){
			if(ArrayItem[m]!=null)
				System.out.print(ArrayItem[m].getData() + " ");
			else System.out.print("-- ");
		}
		System.out.println();
		
		//����״��ʽ��ʾ
		int nBlanks=32;//�ÿո�
		int itemPerRow=1;//ÿһ�����ݵĸ���
		int column=0;
		int j=0;
		String dots="...............................";
		System.out.println(dots+dots);
		while(current>0){
			if(column==0){
				for(int k=0; k<nBlanks;k++)
					System.out.print(' ');
			}
			System.out.print(ArrayItem[j].getData());
			if(++j==current) break;//ȫ����ӡ���
			if(++column==itemPerRow){//����������ӡ��
				nBlanks/=2;
				itemPerRow*=2;
				column=0;
				System.out.println();
			}else{
				for(int k=0;k<nBlanks*2-2;k++)
					System.out.print(' ');
			}
		}
		System.out.println("\n"+dots+dots);
	}
}
