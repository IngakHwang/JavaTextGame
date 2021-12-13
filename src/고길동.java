import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.util.Scanner;

public class 고길동 extends 캐릭터{
    Scanner sc = new Scanner(System.in);
    static int 현재체력=200;
    static int 최대체력=200;
    static int 레벨=1;
    static int 스트레스=99;
    static int 최대스트레스=100;
    static boolean 헬스장회원 = false;
    static String 무기명="",정장명="",악세사리명="";
    static int 무기=0,정장=0,악세사리=0;
    static boolean running = false;

    String 칭호="";

    boolean 물뿌리기=true;
    boolean 멈춰=true;

    public 고길동(String 이름, int 공격력, int 방어력, boolean 생명) {
        super(이름, 공격력, 방어력, 생명);
    }

    void 고길동정보(){
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("\t\t정 보 창\n");
        System.out.printf("\t칭호 : %s\n",칭호);
        System.out.printf("\t이름 : %s\n",이름);
        System.out.printf("\t레벨 : %d\n",레벨);
        System.out.printf("\t체력 : %d / %d\n",현재체력+악세사리,최대체력+악세사리);
        System.out.printf("\t공격력 : %d\n",공격력+(5*레벨)+무기);
        System.out.printf("\t방어력 : %d\n",방어력+정장);
        System.out.printf("\t스트레스 지수: %d / %d\n",스트레스,최대스트레스);
        System.out.printf("\t보유 돈 : %d 원\n\n",돈);
        System.out.println("\t\t보유 스킬");
        System.out.println("\t1.도주기 - 폭력 멈춰!! : 집으로 귀한");
        System.out.println("\t2.평스킬 - 물뿌리기 : 몬스터공격력 [1] 감소");
        System.out.println("\t3.필살기 - X");
        System.out.println("└──────────────────────────────────────────────────┘");
    }
    void 영웅싸움정보(){
        System.out.println("===============================");
        System.out.printf("\t[%s]\n",이름);
        System.out.printf("\t칭호 : %s\n",칭호);
        System.out.printf("\t레벨 : %d\n",레벨);
        System.out.printf("\t체력 : %d / %d\n",현재체력+악세사리,최대체력+악세사리);
        System.out.printf("\t공격력 : %d\n",공격력+(5*레벨)+무기);
        System.out.printf("\t방어력 : %d\n",방어력+정장);
        System.out.printf("\t무기 : %s\n",무기명);
        System.out.printf("\t정장 : %s\n",정장명);
        System.out.printf("\t악세사리 : %s\n\n",악세사리명);
    }
    void 고길동아이템(){
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("\t착 용 장 비\n");
        System.out.printf("\t무기 : %s\n",무기명);
        System.out.printf("\t정장 : %s\n",정장명);
        System.out.printf("\t악세사리 : %s\n",악세사리명);
        System.out.println("└──────────────────────────────────────────────────┘\n");
    }
    void 커피마시기(){
        System.out.println(
                "                   ZZZEZZZZZZZZZZj                \n" +
                "                88ZEzzDBBBBBBBBBzE88w             \n" +
                "                8z5yy555555555555Dz95             \n" +
                "                 w                                \n" +
                "                 W ,                              \n" +
                "                ,yWjwwwwwwwwwwwwwwWW              \n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "                Z8BzDDDD5yy5DDDDDDBZ              \n" +
                "                5By5yjjwj5BDwWjyyyyE              \n" +
                "                jzy5yWWzzzE88yWyyyyE              \n" +
                "                 8y55W58D95DB8wyyy5B              \n" +
                "                 9yy5Wy8B8yDzzWyyyD5              \n" +
                "                 Zyy5Ww58Z88zWjyyyBj              \n" +
                "                 Z5y5jjW,jjwwjyyyyz,              \n" +
                "                 ZE88BBBBBDBBBBBBzZ,              \n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "                                 ,                \n" +
                "                  ,Ww,           W                \n" +
                "                  ,jWw,,,,,,,,,,wW                \n" +
                "                   5jjwwwwwwwwwwWW                \n" +
                "                   WwW,wwwwww,,,w                 \n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t커피를 구입하여 [-5000]원");
        System.out.println("\t커피를 마셔 스트레스 [-20]");
        캐릭터.돈=캐릭터.돈-5000;
        스트레스=스트레스-20;
    }
    void 담배피우기(){
        System.out.println("                          jZZZZD                  \n");
        System.out.println("                        ZZZZZZZZZZj               \n");
        System.out.println("                       ZZ        ZZZ              \n");
        System.out.println("                      ZZ          yZ8             \n");
        System.out.println("                      ZZ           ZZ             \n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("                      wZZ          ZZZZ           \n");
        System.out.println("                       9ZZB          wZZ          \n");
        System.out.println("                         ZZZZZy        ZZ         \n");
        System.out.println("                             ZZ        ZZ         \n");
        System.out.println("                             ZZZ       zZ         \n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("                              wZZZZZZZ WZ         \n");
        System.out.println("                                     ZZZZ         \n");
        System.out.println("                                       ZZ         \n");
        System.out.println("                                                  \n");
        System.out.println("        wZZZZZZZZZZZZZZZZZZZZZZZZZZ ZZ ZZ8        \n");

        System.out.println(
                           "         Z,                      ZZ ZZ ZZj        \n" +
                           "         ZW                      ZZ ZZ ZZj        \n" +
                           "        ,ZZy8888888888888888888BDZZ ZZ ZZD        \n" +
                           "         ZZZZZZZZZZZZZZZZZZZZZZZZZZ ZZ ZZw        \n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t담배와 라이터를 구입 [-5000]원");
        System.out.println("\t담배를 태워 스트레스 [-10]");
        System.out.println("\t담배를 태워 현재체력,최대체력 [-3] ");
        캐릭터.돈=캐릭터.돈-5000;
        현재체력=현재체력-3;
        최대체력=최대체력-3;
        스트레스=스트레스-10;
    }
    void 상체운동(){
        System.out.println("상체운동 - 팔굽혀펴기 10회 실시");
        System.out.print("[팔굽혀펴기 중]");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("1회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("2회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("3회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("4회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("5회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("6회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("7회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("8회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("9회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("10회...\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t*상체운동 - 팔굽혀펴기 10회 완료*");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t공격력 [+1]");
        System.out.println("\t현재체력 [-1]");
        공격력=공격력+1;
        현재체력=현재체력-1;
    }
    void 하체운동(){
        System.out.println("하체운동 - 스쿼트 10회 실시");
        System.out.print("[스쿼트 중]");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("1회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("2회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("3회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("4회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("5회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("6회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("7회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("8회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("9회...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("10회...\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t*하체운동 - 스쿼트 10회 완료*");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t방어력 [+1]");
        System.out.println("\t현재체력 [-1]");
        방어력=방어력+1;
        현재체력=현재체력-1;
    }
    void 런닝머신(){
        System.out.println("유산소 - 런닝머신 1km 실시");
        System.out.print("[런닝머신 중]");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("100m...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("200m...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("300m...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("400m...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("500m...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("600m...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("700m...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("800m...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("900m...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("1km...!\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t*유산소 - 런닝머신 1km 완료*");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t최대체력 [+1]");
        System.out.println("\t현재체력 [-1]");
        최대체력=최대체력+1;
        현재체력=현재체력-1;
    }
    void 사이타마(){
        System.out.println("팔굽혀펴기 100회 실시 (키보드를 눌러 운동 시작)");
        for (int i = 1; i < 3; i++){
            System.out.println("팔굽혀펴기 "+50*i+" 회");
            int stop = sc.nextInt();
        }

        System.out.println("스쿼트 100회 실시 (키보드를 눌러 운동 시작)");
        for (int i = 1; i < 3; i++){
            System.out.println("스쿼트 "+50*i+" 회");
            int stop = sc.nextInt();
        }

        System.out.println("10km 런닝 실시 (키보드를 눌러 운동 시작)");
        for (int i = 1; i < 3; i++){
            System.out.println(i*5+" km");
            int stop = sc.nextInt();
        }

        System.out.println("\t★사이타마식 운동 완료★");
        System.out.println("\t공격력, 방어력, 최대체력 [+2]");
        System.out.println("\t스트레스 [+10]");
        System.out.println("\t현재체력 [-2]");
        공격력=공격력+2;
        방어력=방어력+2;
        최대체력=최대체력+2;
        스트레스=스트레스+10;
        현재체력=현재체력-2;
    }
    void 편의점(){
        System.out.println("--------------------편의점--------------------");
        System.out.println("목표 : 편의점 아르바이트 4시간");
        for (int i = 0; i < 4; i++){
            System.out.println("편의점 "+i+" 시간 완료");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\t*편의점 일 완료*");
        System.out.println("\t[+40000]원");
        System.out.println("\t스트레스 [+1]");
        캐릭터.돈=캐릭터.돈+40000;
        스트레스=스트레스+1;
    }
    void 일용직(){
        System.out.println("--------------------일용직--------------------");
        System.out.println("목표 : 벽돌 100개 나르기");
        for (int i = 0; i < 6; i++){
            System.out.println("벽돌 "+i*20+" 개 나르기 완료");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\t*벽돌 나르기 완료*");
        System.out.println("\t[+100000]원");
        System.out.println("\t스트레스 [+3]");
        캐릭터.돈=캐릭터.돈+100000;
        스트레스=스트레스+3;
    }
    void 코딩(){
        System.out.println("--------------------코드작성--------------------");
        System.out.println("목표 : 코드 10000줄");
        for (int i = 0; i < 6; i++){
            System.out.println("코드 "+i*2000+" 줄 작성 완료");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\t★코드 작성 완료★");
        System.out.println("\t[+300000]원");
        System.out.println("\t스트레스 [+5]");
        캐릭터.돈=캐릭터.돈+300000;
        스트레스=스트레스+5;
    }
    void 폭력멈춰(캐릭터 상대){
        System.out.println("폭 력 멈 춰 !!!");
        System.out.printf("[%s] : 멈 춰!!!\n",상대.이름);
        System.out.println("적이 공격을 멈춥니다.");
        System.out.println("적으로부터 도망칩니다.");
        멈춰=false;
        Runnable 멈춰음악 = new Runnable(){
            @Override
            public void run(){
                Player playMp3;
                try{
                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Stop.mp3");
                    playMp3 = new Player(fls);
                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
        Thread 멈춰쓰레드 = new Thread(멈춰음악);
        멈춰쓰레드.start();
    }
    void 물뿌리기(캐릭터 상대){

        if(물뿌리기){
            System.out.println("*적 공격력 [-1]*");
            System.out.printf("%s : 선 넘네...\n",상대.이름);
            상대.공격력=상대.공격력-1;
            물뿌리기=false;
        }
        else if(물뿌리기==false){
            System.out.println("스킬을 사용 할 수 없습니다.");
        }
    }
    int 레벨업(){
        System.out.println("고길동의 레벨이 [1] 상승했습니다.");
        return 레벨=레벨+1;
    }
    void 스킬목록(){
        System.out.println("스킬을 선택해주세요.");
        System.out.println("1.도주기 - 폭력 멈춰!! : 집으로 귀한");
        System.out.println("2.평스킬 - 물뿌리기 : 몬스터공격력 [1] 감소 (매 전투 중 1회만 사용가능)");
    }

    int 공격하기(){
        Runnable 공격음악 = new Runnable(){
            @Override
            public void run(){
                Player playMp3;
                try{
                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Attack.mp3");
                    playMp3 = new Player(fls);
                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
        Thread 공격쓰레드 = new Thread(공격음악);
        공격쓰레드.start();
        return 공격력+(5*레벨)+무기;
    }
    int 방어하기(){
        return((방어력+정장)/10);
    }

}
