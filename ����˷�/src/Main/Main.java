package Main;
/**
 * ��������������˺����ɵ��¾���
 */
import java.util.Scanner;
public class Main {
public void matrix_multiply(int[][] str1,int[][] str2, int x, int y, int z){
	int[][] str3 = new int[x][z];
	String s = "";
	for(int i = 0;i < x;i++){ //������
		for(int j = 0;j < z;j++){  //������
			for(int k = 0;k < y;k++){  //��Ӧ�����
				str3[i][j] += str1[i][k]*str2[k][j];
			}
		}
	}
	for(int i = 0;i < x;i++){
		for(int j = 0;j < z;j++){
			if(j != z-1){
				s =s+str3[i][j]+" ";
			}
			if(j == z-1){    //Ϊ�������ĩû�ж�һ���ո�
				s = s+str3[i][z-1];
			}
		}
		System.out.print(s);
		s = "";
		System.out.print("\n");
	}
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = Integer.valueOf(sc.nextLine());
	int y = Integer.valueOf(sc.nextLine());
	int z = Integer.valueOf(sc.nextLine());
	String[] str = new String[y];
	String[] str1 = new String[y];
	String[] temp = new String[y];
	String[] temp1 = new String[z];
	int[][] arry1 = new int[x][y];
	int[][] arry2 = new int[y][z];
	for(int i = 0;i < x;i++){   //��һ���������룬�������룬ÿ�������ÿո�ֿ�
	str[i] = sc.nextLine();
	temp = str[i].split(" ");
	for(int j = 0;j < y;j++){
	arry1[i][j] =Integer.valueOf(temp[j]);
	}
	}
	for(int i = 0;i < y;i++){  //�ڶ�����������
	str1[i] = sc.nextLine();
	temp1 = str1[i].split(" ");
	for(int j = 0;j < z;j++){
	arry2[i][j] =Integer.valueOf(temp1[j]);
	}
	}
	Main m1 = new Main();
	m1.matrix_multiply(arry1,arry2,x,y,z);
	sc.close();
}
}
