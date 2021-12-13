package Java_First;

import java.util.Scanner;

public class java_banbok3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 숫자 입력해주세요");
        int d = sc.nextInt();

        // int d = 입력값
        // int v = 공백
        // int s = *

        // 원 상단 1단계
        for(int i=0; i<1; i=i+1){
            for(int v=0; v<10; v=v+1){
                System.out.print("  ");
            }
            for(int s=0; s<(d*2)+1; s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 상단 2단계
        for(int i=1; i<3; i=i+1){
            for(int v=0; v<10-(i*2);v=v+1){
                System.out.print("  ");
            }
            for(int s=0; s<((d*2)+1)+(i*4);s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 상단 3단계
        for(int i=1; i<4; i=i+1){
            for(int v=0; v<6-i; v=v+1){
                System.out.print("  ");
            }
            for(int s=0; s<((d*2)+1)+(4*2)+(i*2);s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 상단 4단계
        for(int i=1; i<3; i=i+1){
            for(int v=0; v<2; v=v+1){
                System.out.print("  ");
            }
            for(int s=0; s<((d*2)+1)+(4*2)+(2*2)+4;s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 상단 5단계
        for(int i=1; i<3; i=i+1) {
            for (int v = 0; v < 1; v = v + 1) {
                System.out.print("  ");
            }
            for (int s=0; s<((d*2)+1)+(4*2)+(2*2)+6;s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 중간
        for(int i=1; i<6; i=i+1){
            for(int s= 0; s<((d*2)+1)+(4*2)+(2*2)+8;s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 하단 1단계
        for(int i=1; i<3; i=i+1) {
            for (int v = 0; v < 1; v = v + 1) {
                System.out.print("  ");
            }
            for (int s=0; s<((d*2)+1)+(4*2)+(2*2)+6;s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 하단 2단계
        for(int i=1; i<3; i=i+1){
            for(int v=0; v<2; v=v+1){
                System.out.print("  ");
            }
            for(int s=0; s<((d*2)+1)+(4*2)+(2*2)+4;s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 하단 3단계
        for(int i=1; i<4; i=i+1){
            for(int v=0; v<i+2; v=v+1){
                System.out.print("  ");
            }
            for(int s=0; s<((d*2)+1)+(4*2)+(2*2)+4-(2*i);s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 하단 4단계
        for(int i=1; i<3; i=i+1){
            for(int v=0; v<4+(i*2);v=v+1){
                System.out.print("  ");
            }
            for(int s=0; s<((d*2)+1+8+4-(i*4));s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 원 하단 5단계
        for(int i=0; i<1; i=i+1){
            for(int v=0; v<10; v=v+1){
                System.out.print("  ");
            }
            for(int s=0; s<(d*2)+1; s=s+1){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
