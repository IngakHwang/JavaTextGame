

import java.util.Scanner;

public class java_banbok1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("마름모의 숫자 입력해주세요");
        int d = sc.nextInt();

        // ind d = 입력값
        // int v = 공백
        // int s = *

        // 마름모 상체 만들기 (다이아몬드 형태 마름모를 반으로 갈랐을 때 상체 만들기)
        for(int i=0; i<d; i=i+1){
            for(int v=i; v<d-1; v=v+1){
                System.out.print(" ");
            }
            for(int s=0; s<(i*2)+1;s=s+1){
                System.out.print("*");
            }
            System.out.println("");
        }

        // 마름모 하체 만들기
        for (int i=d-1; i>0 ;i=i-1){
            for(int v=d-i; v>0; v=v-1){
                System.out.print(" ");
            }
            for(int s=i*2-1;s>0;s=s-1){
                System.out.print("*");
            }
            System.out.println("");
        }
        }
    }