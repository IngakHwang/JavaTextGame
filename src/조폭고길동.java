import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class 조폭고길동 extends 고길동{
    String 칭호 = "★조폭★";
    int 공격력감소 = 50;
    int 방어력감소 = 10;
    int 체력회복 = 50;
    boolean 원투펀치=true;

    public 조폭고길동(String 이름, int 공격력, int 방어력, boolean 생명) {
        super(이름, 공격력, 방어력, 생명);
    }

    void 조폭고길동정보(){
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
        System.out.println("\t2.평스킬 - 분노 : 몬스터 공격력,방어력 [-10]");
        System.out.println("\t3.회복기 - 담배 : 체력 [+50]");
        System.out.println("\t4.필살기 - ★왕년 완 투 펀치★ : 몬스터 5연타격");
        System.out.println("└──────────────────────────────────────────────────┘");
    }

    void 원투펀치(캐릭터 상대){
        if(원투펀치){
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
            System.out.println("\t\t[다시는 주먹을 쓰지 않기로 다짐 했지만...]");
            System.out.println("\t\t★왕년 완 투 펀치★");
            System.out.printf("\t\t[%s] 체력 [-20]\n",상대.이름);
            System.out.printf("\t\t[%s] 체력 [-20]\n",상대.이름);
            System.out.printf("\t\t[%s] 체력 [-20]\n",상대.이름);
            System.out.printf("\t\t[%s] 체력 [-20]\n",상대.이름);
            System.out.printf("\t\t[%s] 체력 [-20]\n",상대.이름);
            상대.현재체력=상대.현재체력-100; //1521
            원투펀치=false;
        }
        else if(원투펀치==false){
            System.out.println("이미 스킬을 사용했기에 사용 할 수 없습니다.");
        }

    }
    void 분노(캐릭터 상대){
            System.out.println("\t\t★[고길동] : 그만 하랬제~~~★");
            System.out.printf("\t[%s]의 공격력 [-%d]\n",상대.이름,공격력감소);
            System.out.printf("\t[%s]의 방어력 [-%d]\n",상대.이름,방어력감소);
            상대.공격력=상대.공격력-공격력감소;
            상대.방어력=상대.방어력-방어력감소;
            System.out.println("\t[둘리공격력]:"+상대.공격력);
            System.out.println("\t[둘리공격력]:"+상대.방어력);
            System.out.println();
    }
    void 담배후(){
            System.out.println("\t\t[후...너넨 이런거 피지 마라]");
            System.out.println("\t*담배*");
            System.out.printf("[%s]의 체력 [+%d]\n\n",이름,체력회복);
            현재체력=현재체력+체력회복;
    }

    void 스킬목록(){
        System.out.println("스킬을 선택해주세요.");
        System.out.println("1.도주기 - 폭력 멈춰!! : 집으로 귀한 (무제한 사용가능)");
        System.out.println("2.평스킬 - 분노 : 몬스터 공격력, 방어력 [-10]");
        System.out.println("3.회복기 - 담배 : 체력 [+50]");
        System.out.println("4.필살기 - ★왕년 완 투 펀치★ : 몬스터 5연타격");
    }

}
