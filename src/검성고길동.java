import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class 검성고길동 extends 고길동{
    String 칭호 = "★검성★";
    int 공격력증가 = 30;
    int 방어력증가 = 30;
    boolean 검성고길동=true;
    boolean 각성=true;

    public 검성고길동(String 이름,int 공격력, int 방어력, boolean 생명) {
        super(이름, 공격력, 방어력, 생명);
    }

    void 검성고길동정보(){
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
        System.out.println("\t2.평스킬 - 각성 : 공격력, 방어력 [+30]");
        System.out.println("\t3.필살기 - ★[검성] 고길동★ : 몬스터 즉사");
        System.out.println("└──────────────────────────────────────────────────┘");
    }
    void 각성(){
        if(각성){
            System.out.println("\t\t★[고길동] : 무 사 고 길 동!!★");
            System.out.printf("\t공격력이 [%d] 증가\n",공격력증가);
            System.out.printf("\t방어력이 [%d] 증가\n",방어력증가);
            공격력=공격력+공격력증가;
            방어력=방어력+방어력증가;
            각성=false;
        }
        else if(각성==false){
            System.out.println("이미 스킬을 사용했기에 사용 할 수 없습니다.");
        }

    }
    void 검성고길동스킬(캐릭터 상대){
        if(검성고길동){
            Runnable 스킬음악 = new Runnable(){
                @Override
                public void run(){
                    Player playMp3;
                    try{
                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Skill.mp3");
                        playMp3 = new Player(fls);
                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
            Thread 스킬쓰레드 = new Thread(스킬음악);
            스킬쓰레드.start();
            System.out.println("                                                           \n" +
                    "                                    ZZZZZZ5  ,                        \n" +
                    "  w                               ZZ9888EZZZZZZ                      \n" +
                    "  wZZ                             ZZ888889ZZZ9EZ                      \n" +
                    "     ZZ                          WZ9888EZZ9yEZZZ w                    \n" +
                    "       ZZj                       ZZ889ZZz      Z D D5yB8              \n" +
                    "        wBZj,                    Z88EZD    ZD  y Z5yj   Z             \n" +
                    "          jEZDj                  Z9ZZ 9wZ  5   59W      9             \n" +
                    "             EEjyy               ZZZ  5  ZEZ8 wWy       9             \n" +
                    "               99 ,z5            jZ  Z z,y W8 BW yD     Z             \n" +
                    "                 y5Z wyB5            WW    Z8 5WEwD     8             \n" +
                    "                    5D, ,585          E    Z 9Ew,Z8    E              \n" +
                    "                      wBBw  D585       E, w     ,Zy   Z5              \n" +
                    "                          zBy   DD85    5 z    yyw   WZ               \n" +
                    "                             zDBj   yB5BjEW8  5y    Dy 9              \n" +
                    "                                 zDB5   y Z,wZ     Zjj,E   ZZ         \n" +
                    "                                     y5ZZ D , D   EBy  E   9 Z        \n" +
                    "                                       ,DZ8Z8WZBEDy    E   y D,       \n" +
                    "                                             5z,       zjDEj  Z       \n" +
                    "                                              Z       Z B jz  Z       \n" +
                    "                                             Z       9,Z   Zw  z      \n" +
                    "                                            E       z     Z Z  Z      \n" +
                    "                                           DW      BW    9  Wj 9      \n" +
                    "                                          jB      jZ    Dj   ZWZ      \n" +
                    "                                          E      j5yj  8y             \n" +
                    "                                         Z      wz  95E               \n" +
                    "                                        8      Wz                     \n" +
                    "                                        B     Wz                      \n" +
                    "                               8Dzw    Z     ,8                       \n" +
                    "                               8  j8z B     yB                        \n" +
                    "                               Z     jZ    jB                         \n" +
                    "                                Ey    jEy8yD                          \n" +
                    "                                 ,8D     Bw                           \n" +
                    "                                    89                                \n" +
                    "                                      wDD                       ");
            System.out.println("서늘하고도 묵직한 감각...");
            System.out.println("★검성 고길동★");
            System.out.printf("[%s] 즉사했습니다. \n",상대.이름);
            상대.현재체력=0;
            검성고길동=false;
        }
        else if(검성고길동==false){
            System.out.println("이미 스킬을 사용했기에 사용 할 수 없습니다.");
        }

    }
    void 스킬목록(){
        System.out.println("스킬을 선택해주세요.");
        System.out.println("1.도주기 - 폭력 멈춰!! : 집으로 귀한 (무제한 사용가능)");
        System.out.println("2.평스킬 - 각성 : 공격력, 방어력 [+100] (매 전투 중 1회만 사용가능)");
        System.out.println("3.필살기 - ★[검성] 고길동★ : 몬스터 즉사 (게임 플레이 중 1회만 사용가능)");
    }

}
