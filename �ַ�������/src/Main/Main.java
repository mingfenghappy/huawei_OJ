package Main;
/**
 * �ַ���������ĸ���ִ�Сд������ǰ�Ŀ�ǰ��ֻ����ĸ�������ַ�������
 * A Famous Saying: Much Ado About Nothing(2012/8)
   A aaAAbc dFgghh: iiMm Nnn ooooS sttuuuy(2012/8)
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		char temp;
		Scanner sc = new  Scanner(System.in);
        String str = sc.nextLine();
        char arry[] = str.toCharArray();
        for(int i = 0;i < str.length();i++){
        	for(int j = i+1;j < str.length();j++){
        		if(arry[i]>='a' && arry[i] <= 'z'){  //�ж�ǰ������Ƿ���Сд��ĸ
        			if( arry[j] >='a'&& arry[j] <= 'z'){  //������֮�Ƚϵ͵��Ƿ���Сд��ĸ
        			if((arry[i]-32)>(arry[j]-32)){   //Сд��ĸ�Ƚ�ʱҪ��ȥ32������������д��ĸ���бȽ�
        				temp = arry[i];
        				arry[i] = arry[j];
        				arry[j] = temp;
        			}
        			}
        			else if(arry[j]>='A' && arry[j] <= 'Z'){  //������ĸΪ��д��ĸ���
        				if((arry[i]-32)>(arry[j])){
            				temp = arry[i];
            				arry[i] = arry[j];
            				arry[j] = temp;
        			}
        			}
        		}
        			if(arry[i]>='A' && arry[i] <= 'Z'){  //ǰ����ĸС��д��ĸ���
        				if( arry[j] >='a'&& arry[j] <= 'z'){    //��֮�Ƚϵ���ĸΪС�����
                			if((arry[i])>(arry[j]-32)){
                				temp = arry[i];
                				arry[i] = arry[j];
                				arry[j] = temp;
                				}
        				}
        				else if(arry[j]>='A' && arry[j] <= 'Z'){ //��֮�Ƚϵ���ĸΪ�����
            				if((arry[i])>(arry[j])){
                				temp = arry[i];
                				arry[i] = arry[j];
                				arry[j] = temp;
            			}
            			}
        			}
        		}
        	}
        System.out.print(String.valueOf(arry));
        sc.close();
	}
	}

       

