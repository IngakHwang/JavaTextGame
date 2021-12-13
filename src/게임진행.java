import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class 게임진행 {
    static void 게임스토리(){
        System.out.println();
        System.out.println("2021년 XX월 XX일 도봉구 쌍문동 고길동 선생의 집\n");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t둘리 : 밥 줘 (버억...버억...)");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t고길동 : 저..둘리야. 약속한 시간이 지났는데... 이제 좀 나가주면 안되겠니..");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t둘리 : 아 진짜!! 방이 구해져야 나가든 말든 할거 아냐!! 군소리말고 밥이나 차려!!");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t고길동 : 방을 구할 생각은 있는거야?! 저번달에도 그렇게...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t둘리 : 아잇 진짜!! 초능력 맛 좀 볼래?");
        System.out.println(
                "                         wwjjjjw                  \n" +
                        "                      Z9jjWWWWWjy9E5              \n" +
                        "                   DZwwWwWWWWWWWWwWjEz            \n" +
                        "                  ZjWWWWWWWWWWWWWWWWWWZ           \n" +
                        "                 ZjWWWWWWWWWWWWWWWWWWWWZ          \n" +
                        "                 EwWWwwwWWWWWWWWWWWWWWwWE         \n" +
                        "                 EWWWy9z  ,Ww,,   wWWWWwZ         \n" +
                        "                 wEWwB  5Z   By,Ew wWWWwZ         \n" +
                        "                  ,B,z zZZW895 5ZZ,BWWwZ          \n" +
                        "                  jBwjD8ZZ 5B ZZZjy,WwB5          \n" +
                        "                BEjWWW, B   Wwy   ,WWw8B          \n" +
                        "               ,8wWWWWWWw     BwWWWWWWwWZ         \n" +
                        "  ZD8          ZWwWWWWWW9     BWWWWWWWWWZ         \n" +
                        "  B  Z          ZWwWWWWW585DDzBWWWWWWWWZ          \n" +
                        "  8   Z          Z8yyjjw,wWjWWWWw,wwjBZ           \n" +
                        "   Zj Z588WwZ      yjy5yEww, ,,,yD9jj             \n" +
                        "  B  j w    E          5DWzZzEBz5wjj              \n" +
                        " 89  Z    Zj         DZzW B y,,,wwWWyEEDj         \n" +
                        " E  ZW  DEWz8     ,BEWwwzWjDDwWWWWWWWwWj5Ez5      \n" +
                        "  ZW  D EwwwW9BjDZBWWWWWWWWWWWWWWWWWWWWWWWW5Z     \n" +
                        "   BDyZ8WwWWWWWjWWwWWWWWWWWWWWWWWWWWWWWWWWWWW9W   \n" +
                        "       85WWWWWWWWWWWWWWWWWWWWWWWWWWWWWBwwWWWWW8,  \n" +
                        "        jZDjjWWWjj55WWWWWWWWWWWWWWWWWWwZ,WWWWWWZ  \n" +
                        "          WyzBEzBjyDBBBBBBBBBDDDDDDDDD5D85555D59  \n" +
                        "                                                  ");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\t고길동 : 이렇게는 못살아!!!\n");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("★★★강해져서 둘리와 그 일당들을 무찌르십시오★★★\n");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*Runnable 게임스토리 = new Runnable(){
            @Override
            public void run(){

            }
        };
        Thread 게임스토리쓰레드 = new Thread(게임스토리);
        게임스토리쓰레드.start();*/
    } //쓰레드.sleep
    static void 게임설명(){
        System.out.println("--------------------게임설명--------------------\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("승리 조건 : 둘리 처치");
        System.out.println("패배 조건 : 고길동 사망\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1.방으로 들어가기 -> 체력회복, 주인공의 기억을 찾아 전직하여 특수스킬 사용이 가능합니다.");
        System.out.println("\t\t(1)검성 -> Lv.3 이상, 얼음검 보유 시 전직 가능");
        System.out.println("\t\t(2)조폭 -> Lv.3 이상, 베르사체세트 보유 시 전직 가능\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2.밖으로 나가기 -> 집 밖으로 나가 활동을 하여 노동현장,백화점,헬스장,번화가를 선택할 수 있습니다.");
        System.out.println("\t\t(1)노동현장 -> 편의점,일용직,코딩 일을 선택하면 돈과 스트레스가 증가합니다.");
        System.out.println("\t\t\t\t스트레스 지수 : 일정 수준의 스트레스 지수 도달 시 노동,운동을 하지 못합니다.");
        System.out.println("\t\t\t\t스트레스 100 도달 시 : 일정시간 동안 체력이 1씩 감소합니다.\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t\t(2)백화점 -> 원하는 아이템을 구매하면 능력치(공격,방어,체력)가 증가합니다.");
        System.out.println("\t\t\t\t아이템 : 아이템은 무기,정장,악세사리 각 하나씩만 착용가능하며 아이템교체를 위해선 '착용해제'를 해야 합니다.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t\t(3)헬스장 -> 원하는 운동을 하면 능력치(공격,방어,체력)와 스트레스가 증가합니다.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\t\t(4)번화가 -> 돈을 지불하면 스트레스가 감소합니다.\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3.둘리일당 물리치기 -> 둘리일당인 또치,도우너,둘리와 싸워 게임에서 승리하십시오.\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } // 쓰레드.sleep
    static void 집(){
        System.out.println("--------------------집--------------------\n");
        System.out.println("무엇을 하시겠습니까?");
        System.out.println("1.방으로 들어가기");
        System.out.println("2.밖으로 나가기");
        System.out.println("3.둘리일당 물리치기");
        System.out.println("7.BGM");
        System.out.println("8.게임설명");
        System.out.println("9.게임종료");
    }
    static void 방안(){
        System.out.println("--------------------방안--------------------\n");
        System.out.println("무엇을 하시겠습니까?");
        System.out.println("1.방에서 한숨 쉬기 - 체력,스킬 회복");
        System.out.println("2.서랍장 열어보기 - 검성고길동전직(LV.3 이상, 얼음칼 보유)");
        System.out.println("3.장농 열어보기 - 조폭고길동전직(LV.3 이상, 베르사체세트 보유)");
        System.out.println("0.돌아가기");
    }
    static void 쌍문동(){
        System.out.println("--------------------쌍문동--------------------\n");
        System.out.println("어디로 갈지 선택해주세요");
        System.out.println("1.노동현장");
        System.out.println("2.백화점");
        System.out.println("3.헬스장");
        System.out.println("4.번화가");
        System.out.println("0.집으로 돌아가기");
    }
    static void 노동현장(){
        System.out.println("--------------------노동현장--------------------");
        System.out.println("어떻게 노동할지 선택해주세요.");
        System.out.println("1.편의점");
        System.out.println("2.일용직");
        System.out.println("3.코딩하기");
        System.out.println("9.캐릭터 상태확인");
        System.out.println("0.돌아가기");
    }
    static void 롯데백화점(){
        System.out.println("--------------------롯데백화점--------------------");
        System.out.println("어디로 갈지 선택해주세요");
        System.out.println("1.무기 섹션");
        System.out.println("2.정장 섹션");
        System.out.println("3.악세사리 섹션");
        System.out.println("8.착용아이템보기");
        System.out.println("9.캐릭터 상태확인");
        System.out.println("0.돌아가기");
    }
    static void 무기섹션(){
        System.out.println("--------------------무기섹션---------------------");
        System.out.println("구매 할 아이템을 선택해주세요.");
        System.out.println("1.장난감칼(공격력+1) : 5000원");
        System.out.println("2.과일칼(공격력+3) : 10000원");
        System.out.println("3.장미칼(공격력+5) : 25000원");
        System.out.println("4.얼음칼(공격력+10) : 500000원 -> ★검성전직가능");
        System.out.println("0.돌아가기");
    }
    static void 정장섹션(){
        System.out.println("--------------------정장섹션--------------------");
        System.out.println("구매 할 아이템을 선택해주세요.");
        System.out.println("1.유니클로 세트(방어력+1) : 5000원");
        System.out.println("2.지오다노 세트(방어력+3) : 10000원");
        System.out.println("3.로가디스 세트(방어력+5) : 25000원");
        System.out.println("4.베르사체 세트(방어력+10) : 500000원 -> ★조폭전직가능");
        System.out.println("0.돌아가기");
    }
    static void 악세사리섹션(){
        System.out.println("--------------------악세사리섹션--------------------");
        System.out.println("구매 할 아이템을 선택해주세요.");
        System.out.println("1.샤오미 워치(체력+5) : 50000원");
        System.out.println("2.갤럭시 워치(체력+20) : 350000원");
        System.out.println("3.애플 워치(체력+30) : 500000원");
        System.out.println("0.돌아가기");
    }
    static void 아이템탈부착(){
        System.out.println("1.무기 착용해제");
        System.out.println("2.정장 착용해제");
        System.out.println("3.악세사리 착용해제");
        System.out.println("0.돌아가기");
    }
    static void 헬스장(){
        System.out.println("--------------------헬스장--------------------");
        System.out.println("1.회원등록하기");
        System.out.println("2.운동하러가기");
        System.out.println("0.마을로 돌아가기");
    }
    static void 회원등록(){
        System.out.println("--------------------회원등록--------------------");
        System.out.println("헬스장 회원등록비는 100000원입니다.");
        System.out.println("회원등록 하시겠습니까?");
        System.out.println("1.회원등록");
        System.out.println("0.돌아가기");
    }
    static void 헬스장운동섹션(){
        System.out.println("--------------------운동섹션--------------------");
        System.out.println("1. 상체운동 [공격력] +1 [체력] -1");
        System.out.println("2. 하체운동 [방어력] +1 [체력] -1");
        System.out.println("3. 런닝머신 [최대체력] +1 [체력] -1");
        System.out.println("4. 사이타마식 운동 [공격력 방어력 최대체력] +2 [체력] -2 [스트레스] +10");
        System.out.println("9. 캐릭터 상태확인");
        System.out.println("0. 돌아가기");
    }
    static void 번화가(){
        System.out.println("--------------------번화가--------------------");
        System.out.println("어떤 활동할지 선택해주세요.");
        System.out.println("1.카페-커피마시기 : 5000원(스트레스-5)");
        System.out.println("2.편의점-담배사서 피우기 : 5000원(스트레스-10, 체력-3,최대체력-3)");
        System.out.println("9.캐릭터 상태확인");
        System.out.println("0.돌아가기");
    }
    static void 둘리일당(){
        System.out.println("--------------------둘리일당--------------------\n");
        System.out.println("선택해주세요");
        System.out.println("1.또치");
        System.out.println("2.도우너 (레벨제한 : 2)");
        System.out.println("3.둘리 (레벨제한 : 3, 전직必)");
        System.out.println("9.몬스터 정보");
        System.out.println("0.돌아가기");
    }
    static void 몬스터정보(){
        System.out.println("--------------------몬스터 정보--------------------\n");
        System.out.println("선택해주세요");
        System.out.println("1.또치");
        System.out.println("2.도우너");
        System.out.println("3.둘리");
        System.out.println("0.돌아가기");
    }
    static void 또치스토리(){
        System.out.println("--------------------또치방--------------------\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("또치 : 생명연장의 꿈이란 게 요구르트만 냅다 쳐먹는다고 되는 거 아닙니다.\n");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("고길동 : 네 이놈 [인신매매범] 또치!! 당장 그만두지 못해!!\n");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("또치와 결투를 시작합니다.\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==========================전투시작==========================");
        System.out.println("                      Press Keybored");
    } // 쓰레드.sleep
    static void 도우너스토리(){
        System.out.println("--------------------도우너방--------------------\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("도우너 : 떨(대마초를 지칭하는 은어) 한대 펴야 되겠구만\n");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("고길동 : 네 이놈 [마약중독자] 도우너!! 당장 내 집에서 나가!!\n");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("도우너와 결투를 시작합니다.\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==========================전투시작==========================");
        System.out.println("                      Press Keybored");
    } // 쓰레드.sleep
    static void 둘리스토리(){
        System.out.println("--------------------둘리방--------------------\n");
        System.out.println("                  ★최종보스★\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("고길동 : 호의가 계속되면... 그게 둘리줄 알아요!!\n");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("둘리 : 선 넘네...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("둘리와 결투를 시작합니다.\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==========================전투시작==========================");
        System.out.println("                      Press Keybored");
    } // 쓰레드.sleep
    static void 휴식(){
        Runnable 휴식음악 = new Runnable(){
            @Override
            public void run(){
                Player playMp3;
                try{
                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Rest.mp3");
                    playMp3 = new Player(fls);
                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
        Thread 휴식쓰레드 = new Thread(휴식음악);
        휴식쓰레드.start();
        System.out.println(
                "                        5z                        \n" +
                "                      ,zw8Zy                      \n" +
                "                    ,zWyzDD9ZW                    \n" +
                "                  w8,,8B5555D9Zy                  \n" +
                "                W8 ,8BD555555yD9Zy                \n" +
                "              j9  8zD5555555555y59Z5              \n" +
                "            WE  zzD55555555555555y58Z5            \n" +
                "          WZ  zzD555555555555555555y58Z5          \n" +
                "        y9,,zB5yyyyyyyy5yy55yyyyyyyyyjyzZ5        \n" +
                "      ZZ88ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZW     \n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "            5                         y           \n" +
                "            8 ,,,,,,,,,,,             Z           \n" +
                "           ,z ,,,,,,,,,,, z955ZByjZw  Z           \n" +
                "           w8 ,,,,,,,,,,, jW  jW  Z   Z           \n" +
                "           wz              8wy58, 9   Z           \n" +
                "           wB,E9999999ZW  w9 j5ZjyZW  Z           \n" +
                "           wB WjjjjWWwzw   ,          Z           \n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "           wD jjjjjjjWBy ,,        ,  Z           \n" +
                "           wz yBWjjjjjD5 ,,,,,,,,,,,  Z           \n" +
                "           ,8 DZjjjjjj5D ,,,,,,,,,,,  Z           \n" +
                "            E DwWjjjjjy8 ,,,,,,,,,,,  Z           \n" +
                "            Z zWjjjjjjW9 ,,,,,,,,,,, W9           \n" +
                "            Z ZDBBBBBBDZ   , ,       89           \n" +
                "            WWjwwwwwww,Wj555555D555D5y     ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } // 쓰레드.sleep

}
