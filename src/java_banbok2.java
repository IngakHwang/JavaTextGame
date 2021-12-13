

import java.util.Scanner;

public class java_banbok2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("별의 숫자 입력해주세요");
        int d = sc.nextInt();

        // int d = 입력값
        // int v = 공백
        // int s = *

        // 별 상체 만들기
        for(int i=0; i<d; i=i+1){
            for(int v=1; v <d*2-i; v=v+1){
                System.out.print(" ");
            }
            for(int s=0; s<i*2+1;s=s+1){
                System.out.print("*");
            }
            System.out.println("");
        }

        // 별 중간 만들기
        for(int i=d;i>0; i=i-1){
            for(int v=d+i;v<(d*2);v=v+1){
                System.out.print(" ");
            }
            for(int s=(d*2-1)+(d*2)+((d-i)*-2);s>0;s=s-1){
                System.out.print("*");
            }
            System.out.println("");
        }

        // 별 다리 만들기
        for(int i=d;i>0; i=i-1){
            // 왼쪽 다리 만들기
            for(int v1=1;v1<i;v1=v1+1){
                System.out.print(" ");
            }
            for(int s1=0;s1<i;s1=s1+1){
                System.out.print("*");
            }
            // 오른쪽 다리 만들기
            for(int v2=0;v2<((d-i)*4+1);v2=v2+1){
                System.out.print(" ");
            }
            for(int s2=0;s2<i;s2=s2+1){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
