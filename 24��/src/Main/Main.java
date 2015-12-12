package Main;

import java.util.Scanner;

public class Main {
    static boolean isDone;
    static int[] cards = new int[4];//�洢�����������
    static boolean[] flag = new boolean[4];//dfsʱ�����Щ���ù�
    static int number(String card)  //���ַ���ת��double����
    {
        if(card.equals("A"))
            return 1;
        else if(card.equals("J"))
            return 11;
        else if(card.equals("Q"))
            return 12;
        else if(card.equals("K"))
            return 13;
        else if(card.equals("joker"))
            return 0;
        else if(card.equals("JOKER"))
            return 0;
        else
            return Integer.parseInt(card);
    }
    static String str(double card)  //��double����ת���ַ���
    {
        if(card == 1)
            return "A";
        else if(card == 11)
            return "J";
        else if(card == 12)
            return "Q";
        else if(card == 13)
            return "K";
        else if(card == 2) return "2";
        else if(card == 3) return "3";
        else if(card == 4) return "4";
        else if(card == 5) return "5";
        else if(card == 6) return "6";
        else if(card == 7) return "7";
        else if(card == 8) return "8";
        else if(card == 9) return "9";
        else if(card == 10) return "10";
        return "";
    }
    static boolean check(int cards[])   //����Ƿ���ڴ�С��
    {
        for(int i = 0;i < 4;i ++)
        {
            if(cards[i]==0)
                return false;
        }
        return true;
    }
    static void dfs(int path1[],String path2[],double count,int num)
    {
        if(isDone) return ;
        if(count == 24 && num == 4)   //��������24��������4���ƣ�֤���ҵ�
        {
            for(int index = 0;index<3;index ++)
            {
                System.out.print(str(path1[index])+path2[index+1]);
            }
            System.out.println(str(path1[3]));
            isDone = true;  //��Ϊһ������Ƿ����ҵ����Թ���24���
            return;
        }
        for(int i = 0; i < 4 ; i++)
        {
            if(!flag[i])
            {
                flag[i]=true;    //�������������
                path1[num] = cards[i];
              
                path2[num] = "+";
                dfs(path1, path2, count + cards[i], num+1);   //dfs����cards[i]�����
                if(num > 0)
                {
                    path2[num] = "-";
                    dfs(path1, path2, count - cards[i], num+1);  //dfs��ȥcards[i]�����
                  
                    path2[num] = "*";
                    dfs(path1, path2, count * cards[i], num+1);  //dfs����cards[i]�����
                  
                    path2[num] = "/";
                    dfs(path1, path2, count / cards[i], num+1); //dfs����cards[i]�����
                }
                flag[i]=false;   //ȡ����ǣ���ʾ�ŵ�������
            }
            if(isDone)
                return ;
        }
    }

    public static void main(String[] args) {
        double count;
        int[] path1 = new int[4];
        int num;
        String[] path2 = new String[4];
        String firstCard,secondCard,thirdCard,fourthCard;
        Scanner cin = new Scanner(System.in);
       
        while (cin.hasNext()) {
            firstCard = cin.next();
            secondCard = cin.next();
            thirdCard = cin.next();
            fourthCard = cin.next();
            count = 0.0;
            num = 0;
            isDone = false;
            cards[0] = number(firstCard);
            cards[1] = number(secondCard);
            cards[2] = number(thirdCard);
            cards[3] = number(fourthCard);
            if(!check(cards))
            {
                System.out.println("ERROR");
                continue;
            }
            dfs(path1,path2,count,num);
            if(!isDone)  //�������false��֤��û�б�ǹ������Ҳ���
                System.out.println("NONE");
           
        }
    }
}