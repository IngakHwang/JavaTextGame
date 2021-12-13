package Java_First;

import java.util.Scanner;

public class java_banbok3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 숫자 입력해주세요");
        int d = sc.nextInt();

        //원 상단 지붕 만들기
        for(int i=0; i<3; i=i+1){
            for(int v=d+(5-(i*2)); v>0; v=v-1){
                System.out.print("  ");
            }
            for(int s=d+(i*4); s>0; s=s-1){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // 원 상단 2단계
        for(int i=1; i<d+1; i=i+1){
            for(int v=d-i+1; v>0; v=v-1){
                System.out.print("  ");
            }
            for(int s=(d+8)+(i*2); s>0; s=s-1){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // 원 허리 진입 전
        for(int i=0; i<1; i=i+1){
            for(int v=1; v>0; v=v-1){
                System.out.print("  ");
            }
            for(int s=(d+8)+(d*2); s>0; s=s-1){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // 원 허리 만들기
        for(int i=d; i>0; i=i-1){
            for(int s=(d+8)+(d*2)+2; s>0; s=s-1){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // 원 허리 진입 후
        for(int i=0; i<1; i=i+1){
            for(int v=1; v>0; v=v-1){
                System.out.print("  ");
            }
            for(int s=(d+8)+(d*2); s>0; s=s-1){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // 원 하단 1단계
        for(int i=1; i<d+1; i=i+1){
            for(int v=0; v<i; v=v+1){
                System.out.print("  ");
            }
            for(int s=d+(2*(d+5))-(i*2); s>0; s=s-1){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // 원 바닥 만들기
        for(int i=0; i<3; i=i+1){
            for(int v=d+1+(i*2); v>0; v=v-1){
                System.out.print("  ");
            }
            for(int s=d+8-(i*4); s>0; s=s-1){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
