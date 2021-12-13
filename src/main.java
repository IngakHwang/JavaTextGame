import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.util.Scanner;

public class main {
    static boolean 배경음악=true;
    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);


        게임진행.게임스토리();
        System.out.println("==========================게임시작==========================");
        System.out.println("                      Press Keybored");
        String start = sc.next();


        고길동 고길동 = new 고길동("고길동",50,10,true);
        또치 또치 = new 또치("또치",50,1,true);
        도우너 도우너 = new 도우너("도우너",70,10,true);
        둘리 둘리 = new 둘리("둘리",100,20,true);
        검성고길동 검성고길동=new 검성고길동("고길동",70,10,false);
        조폭고길동 조폭고길동=new 조폭고길동("고길동",100,20,false);

        Runnable 스트레스 = new Runnable(){
            @Override
            public void run(){
                boolean 스트레스무한=true;
                while(스트레스무한){
                    if(고길동.스트레스<100 && 고길동.running==true){
                        고길동.스트레스=고길동.스트레스+1;
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t집 안의 둘리 생각으로 인하여 스트레스 +1  [현재스트레스 : "+고길동.스트레스+"]");
                    }
                    else if(고길동.스트레스>=100 && 고길동.running==true){
                        고길동.현재체력=고길동.현재체력-1;
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t스트레스가 너무 받아 체력 -1 [현재체력 : "+고길동.현재체력+"]");
                    }
                    else if(고길동.현재체력==0){
                        break;
                    }
                    else if(고길동.running==false){
                        break;
                    }
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }; //주인공 스트레스 쓰레드 (30초)
        Thread 스트레스쓰레드 = new Thread(스트레스);
        스트레스쓰레드.start();

        고길동.running=true;
        while(고길동.running){
            if(고길동.현재체력<=0){
                System.out.println("고길동의 혈압이 올라 사망했습니다.");
                System.out.println("■■■■■■고길동이 죽어 게임에서 패배■■■■■■");
                고길동.생명=false;
                검성고길동.생명=false;
                조폭고길동.생명=false;
                고길동.running=false;
            }
            else if(고길동.생명==true){
                고길동.고길동정보();
                고길동.고길동아이템();
                게임진행.집();
            }
            else if(검성고길동.생명==true){
                검성고길동.검성고길동정보();
                고길동.고길동아이템();
                게임진행.집();
            }
            else if(조폭고길동.생명==true){
                조폭고길동.조폭고길동정보();
                고길동.고길동아이템();
                게임진행.집();
            }

            int home=sc.nextInt();
            if(home==1){
                boolean 방안=true;
                while(방안){
                    게임진행.방안();
                    int 선택방안=sc.nextInt();
                    if(선택방안==0){
                        방안=false;
                        Runnable 뒤로가기음악 = new Runnable(){
                            @Override
                            public void run(){
                            Player playMp3;
                            try{
                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                playMp3 = new Player(fls);
                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                        뒤로가기쓰레드.start();
                    }
                    else if(선택방안==1){
                        게임진행.휴식();
                        고길동.현재체력=고길동.최대체력;
                        System.out.println("체력과 스킬이 회복되었습니다.\n");
                        고길동.물뿌리기=true;
                        고길동.멈춰=true;
                        방안=false;

                    } //체력 회복
                    else if(선택방안==2){
                        if(고길동.레벨>=3 && 고길동.무기명=="얼음칼(공격력+10)"){
                            System.out.println("\t\t★망각하였던 검사 고길동의 기억이 돌아왔습니다★");
                            Runnable 전직음악 = new Runnable(){
                                @Override
                                public void run(){
                                    Player playMp3;
                                    try{
                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\GetJob.mp3");
                                        playMp3 = new Player(fls);
                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                            Thread 전직쓰레드 = new Thread(전직음악);
                            전직쓰레드.start();
                            고길동.생명=false;
                            검성고길동.생명=true;
                            방안=false;
                        }
                        else if(고길동.레벨<3){
                            System.out.println("레벨이 부족하여 기억을 되찾을 수 없습니다.");
                        }
                        else if(고길동.무기명!="얼음칼(공격력+10)"){
                            System.out.println("얼음칼을 착용하지 않았습니다.");
                        }
                    } //검성 전직
                    else if(선택방안==3){
                        if(고길동.레벨>=3 && 고길동.정장명=="베르사체 세트(방어력+10)"){
                            System.out.println("\t\t★망각하였던 조폭 고길동의 기억이 돌아왔습니다★");
                            Runnable 전직음악 = new Runnable(){
                                @Override
                                public void run(){
                                    Player playMp3;
                                    try{
                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\GetJob.mp3");
                                        playMp3 = new Player(fls);
                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                            Thread 전직쓰레드 = new Thread(전직음악);
                            전직쓰레드.start();
                            고길동.생명=false;
                            조폭고길동.생명=true;
                            방안=false;
                        }
                        else if(고길동.레벨<3){
                            System.out.println("레벨이 부족하여 기억을 되찾을 수 없습니다.");
                        }
                        else if(고길동.정장명!="베르사체 세트(방어력+10)"){
                            System.out.println("베르사체 세트를 착용하지 않았습니다.");
                        }
                    } //조폭 전직
                    else{
                        System.out.println("올바른 숫자를 기입해주세요.");
                    }
                }

            } //방 안
            else if(home==2){
                boolean 밖으로=true;
                while(밖으로){
                    게임진행.쌍문동();
                    int 선택쌍문동=sc.nextInt();
                    if(선택쌍문동==0){
                        밖으로=false;
                        Runnable 뒤로가기음악 = new Runnable(){
                            @Override
                            public void run(){
                                Player playMp3;
                                try{
                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                    playMp3 = new Player(fls);
                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                        뒤로가기쓰레드.start();
                    }
                    else if(선택쌍문동==1){
                        boolean 노동현장=true;
                        while(노동현장){
                            게임진행.노동현장();
                            int 선택노동현장=sc.nextInt();
                            if(선택노동현장==0){
                                노동현장=false;
                                Runnable 뒤로가기음악 = new Runnable(){
                                    @Override
                                    public void run(){
                                        Player playMp3;
                                        try{
                                            FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                            playMp3 = new Player(fls);
                                            playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                뒤로가기쓰레드.start();
                            }
                            else if(선택노동현장==1){
                                if(고길동.스트레스>=90){
                                    System.out.println("스트레스가 너무 높아 노동을 할 수 없습니다.");
                                    System.out.printf("현재 스트레스 [%d]\n",고길동.스트레스);
                                }
                                else{
                                    고길동.편의점();
                                    Runnable 노동음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\GetMoney.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 노동쓰레드 = new Thread(노동음악);
                                    노동쓰레드.start();
                                }
                            }
                            else if(선택노동현장==2){
                                if(고길동.스트레스>=90){
                                    System.out.println("스트레스가 너무 높아 노동을 할 수 없습니다.");
                                    System.out.printf("현재 스트레스 [%d]\n",고길동.스트레스);
                                }
                                else{
                                    고길동.일용직();
                                    Runnable 노동음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\GetMoney.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 노동쓰레드 = new Thread(노동음악);
                                    노동쓰레드.start();
                                }
                            }
                            else if(선택노동현장==3){
                                if(고길동.스트레스>=90){
                                    System.out.println("스트레스가 너무 높아 노동을 할 수 없습니다.");
                                    System.out.printf("현재 스트레스 [%d]\n",고길동.스트레스);
                                }
                                else{
                                    고길동.코딩();
                                    Runnable 노동음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\GetMoney.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 노동쓰레드 = new Thread(노동음악);
                                    노동쓰레드.start();
                                }
                             }
                            else if(선택노동현장==9){
                                고길동.고길동정보();
                            }
                            else{
                                System.out.println("정확한 숫자를 기입해주세요.");
                            }
                        }
                    } // 노동현장
                    else if(선택쌍문동==2){
                        boolean 백화점=true;
                        while(백화점){
                            게임진행.롯데백화점();
                            int 선택백화점=sc.nextInt();
                            if(선택백화점==0){
                                백화점=false;
                                Runnable 뒤로가기음악 = new Runnable(){
                                    @Override
                                    public void run(){
                                        Player playMp3;
                                        try{
                                            FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                            playMp3 = new Player(fls);
                                            playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                뒤로가기쓰레드.start();
                            }
                            else if(선택백화점==1){
                                boolean 무기섹션=true;
                                while(무기섹션){
                                    게임진행.무기섹션();
                                    int 선택무기섹션=sc.nextInt();
                                    if(선택무기섹션==0){
                                        무기섹션=false;
                                        Runnable 뒤로가기음악 = new Runnable(){
                                            @Override
                                            public void run(){
                                                Player playMp3;
                                                try{
                                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                                    playMp3 = new Player(fls);
                                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                        뒤로가기쓰레드.start();
                                    }
                                    else if(선택무기섹션==1){
                                        if(캐릭터.돈>=5000 && 고길동.무기명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-5000원]");
                                            System.out.println("공격력 [+1]");
                                            캐릭터.돈=캐릭터.돈-5000;
                                            고길동.무기명="장난감칼(공격력+1)";
                                            고길동.무기=1;
                                        }
                                        else if(캐릭터.돈<5000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.무기명 !=""){
                                            System.out.println("무기 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 장난감칼 구입
                                    else if(선택무기섹션==2){
                                        if(캐릭터.돈>=10000 && 고길동.무기명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-10000원]");
                                            System.out.println("공격력 [+3]");
                                            캐릭터.돈=캐릭터.돈-10000;
                                            고길동.무기명="과일칼(공격력+3)";
                                            고길동.무기=3;
                                        }
                                        else if(캐릭터.돈<10000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.무기명 !=""){
                                            System.out.println("무기 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 과일칼 구입
                                    else if(선택무기섹션==3){
                                        if(캐릭터.돈>=25000 && 고길동.무기명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-25000원]");
                                            System.out.println("공격력 [+5]");
                                            캐릭터.돈=캐릭터.돈-25000;
                                            고길동.무기명="장미칼(공격력+5)";
                                            고길동.무기=5;
                                        }
                                        else if(캐릭터.돈<25000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.무기명 !=""){
                                            System.out.println("무기 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 장미칼 구입
                                    else if(선택무기섹션==4){
                                        if(캐릭터.돈>=500000 && 고길동.무기명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-500000원]");
                                            System.out.println("공격력 [+10]");
                                            Runnable 아이템음악 = new Runnable(){
                                                @Override
                                                public void run(){
                                                    Player playMp3;
                                                    try{
                                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\GetItem.mp3");
                                                        playMp3 = new Player(fls);
                                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                            Thread 아이템쓰레드 = new Thread(아이템음악);
                                            아이템쓰레드.start();
                                            캐릭터.돈=캐릭터.돈-500000;
                                            고길동.무기명="얼음칼(공격력+10)";
                                            고길동.무기=10;
                                        }
                                        else if(캐릭터.돈<500000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.무기명 !=""){
                                            System.out.println("무기 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 얼음칼 구입
                                }
                            } //무기 구매
                            else if(선택백화점==2){
                                boolean 정장섹션=true;
                                while(정장섹션){
                                    게임진행.정장섹션();
                                    int 선택정장섹션=sc.nextInt();
                                    if(선택정장섹션==0){
                                        정장섹션=false;
                                        Runnable 뒤로가기음악 = new Runnable(){
                                            @Override
                                            public void run(){
                                                Player playMp3;
                                                try{
                                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                                    playMp3 = new Player(fls);
                                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                        뒤로가기쓰레드.start();
                                    }
                                    else if(선택정장섹션==1){
                                        if(캐릭터.돈>=5000 && 고길동.정장명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-5000원]");
                                            System.out.println("방어력 [+1]");
                                            캐릭터.돈=캐릭터.돈-5000;
                                            고길동.정장명="유니클로 세트(방어력+1)";
                                            고길동.정장=1;
                                        }
                                        else if(캐릭터.돈<5000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.정장명 !=""){
                                            System.out.println("정장 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 유니클로세트 구입
                                    else if(선택정장섹션==2){
                                        if(캐릭터.돈>=10000 && 고길동.정장명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-10000원]");
                                            System.out.println("방어력 [+3]");
                                            캐릭터.돈=캐릭터.돈-10000;
                                            고길동.정장명="지오다노 세트(방어력+3)";
                                            고길동.정장=3;
                                        }
                                        else if(캐릭터.돈<10000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.정장명 !=""){
                                            System.out.println("정장 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 지오다노세트 구입
                                    else if(선택정장섹션==3){
                                        if(캐릭터.돈>=25000 && 고길동.정장명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-25000원]");
                                            System.out.println("방어력 [+5]");
                                            캐릭터.돈=캐릭터.돈-25000;
                                            고길동.정장명="로가디스 세트(방어력+5)";
                                            고길동.정장=5;
                                        }
                                        else if(캐릭터.돈<25000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.정장명 !=""){
                                            System.out.println("정장 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 로가디스세트 구입
                                    else if(선택정장섹션==4){
                                        if(캐릭터.돈>=500000 && 고길동.정장명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-500000원]");
                                            System.out.println("방어력 [+10]");
                                            Runnable 아이템음악 = new Runnable(){
                                                @Override
                                                public void run(){
                                                    Player playMp3;
                                                    try{
                                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\GetItem.mp3");
                                                        playMp3 = new Player(fls);
                                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                            Thread 아이템쓰레드 = new Thread(아이템음악);
                                            아이템쓰레드.start();
                                            캐릭터.돈=캐릭터.돈-500000;
                                            고길동.정장명="베르사체 세트(방어력+10)";
                                            고길동.정장=10;
                                        }
                                        else if(캐릭터.돈<500000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.정장명 !=""){
                                            System.out.println("정장 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 베르사체세트 구입
                                }
                            } //정장 구매
                            else if(선택백화점==3){
                                boolean 악세사리섹션=true;
                                while(악세사리섹션){
                                    게임진행.악세사리섹션();
                                    int 선택악세사리섹션=sc.nextInt();
                                    if(선택악세사리섹션==0){
                                        악세사리섹션=false;
                                        Runnable 뒤로가기음악 = new Runnable(){
                                            @Override
                                            public void run(){
                                                Player playMp3;
                                                try{
                                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                                    playMp3 = new Player(fls);
                                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                        뒤로가기쓰레드.start();
                                    }
                                    else if(선택악세사리섹션==1){
                                        if(캐릭터.돈>=50000 && 고길동.악세사리명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-50000원]");
                                            System.out.println("체력 [+5]");
                                            캐릭터.돈=캐릭터.돈-50000;
                                            고길동.악세사리명="샤오미 워치(체력+5)";
                                            고길동.악세사리=5;
                                        }
                                        else if(캐릭터.돈<50000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.악세사리명 !=""){
                                            System.out.println("악세사리 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 샤오미워치 구입
                                    else if(선택악세사리섹션==2){
                                        if(캐릭터.돈>=350000 && 고길동.악세사리명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-350000원]");
                                            System.out.println("체력 [+20]");
                                            캐릭터.돈=캐릭터.돈-350000;
                                            고길동.악세사리명="갤럭시 워치(체력+20)";
                                            고길동.악세사리=20;
                                        }
                                        else if(캐릭터.돈<350000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.악세사리명 !=""){
                                            System.out.println("악세사리 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 갤럭시워치 구입
                                    else if(선택악세사리섹션==3){
                                        if(캐릭터.돈>=500000 && 고길동.악세사리명==""){
                                            System.out.println("아이템을 구매하여 장착했습니다.");
                                            System.out.println("돈 [-500000원]");
                                            System.out.println("체력 [+30]");
                                            캐릭터.돈=캐릭터.돈-500000;
                                            고길동.악세사리명="애플워치(체력+30)";
                                            고길동.악세사리=30;
                                        }
                                        else if(캐릭터.돈<500000){
                                            System.out.println("돈이 부족하여 구매할 수 없습니다.");
                                        }
                                        else if(고길동.악세사리명 !=""){
                                            System.out.println("악세사리 아이템을 장착 중입니다.");
                                            System.out.println("착용장비를 확인해주세요.");
                                        }
                                    } // 애플워치 구입
                                }
                            } //악세사리 구매
                            else if(선택백화점==8){
                                boolean 아이템탈부착=true;
                                고길동.고길동아이템();
                                게임진행.아이템탈부착();
                                int 이템탈부착=sc.nextInt();
                                if(이템탈부착==0){
                                    Runnable 뒤로가기음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                    뒤로가기쓰레드.start();
                                    아이템탈부착=false;
                                }
                                else if(이템탈부착==1){
                                    if(고길동.무기명!=""){
                                        System.out.println("정말 버리시겠습니까?");
                                        System.out.println("1.Yes");
                                        System.out.println("2.No");
                                        int 무기버리기=sc.nextInt();
                                        if(무기버리기==1){
                                            System.out.println("착용했던 무기아이템을 버립니다!");
                                            Runnable 아이템음악 = new Runnable(){
                                                @Override
                                                public void run(){
                                                    Player playMp3;
                                                    try{
                                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Trash.mp3");
                                                        playMp3 = new Player(fls);
                                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                            Thread 아이템쓰레드 = new Thread(아이템음악);
                                            아이템쓰레드.start();
                                            고길동.무기명="";
                                            고길동.무기=0;

                                        }
                                        else{
                                            System.out.println("");
                                        }
                                    }
                                    else if(고길동.무기명==""){
                                        System.out.println("착용 중인 무기아이템이 없습니다.");
                                    }
                            } // 무기 버리기
                                else if(이템탈부착==2){
                                    if(고길동.정장명!=""){
                                        System.out.println("정말 버리시겠습니까?");
                                        System.out.println("1.Yes");
                                        System.out.println("2.No");
                                        int 정장버리기=sc.nextInt();
                                        if(정장버리기==1){
                                            System.out.println("착용했던 정장아이템을 버립니다!");
                                            Runnable 아이템음악 = new Runnable(){
                                                @Override
                                                public void run(){
                                                    Player playMp3;
                                                    try{
                                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Trash.mp3");
                                                        playMp3 = new Player(fls);
                                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                            Thread 아이템쓰레드 = new Thread(아이템음악);
                                            아이템쓰레드.start();
                                            고길동.정장명="";
                                            고길동.정장=0;
                                        }
                                        else{
                                            System.out.println("");
                                        }
                                    }
                                    else if(고길동.정장명==""){
                                        System.out.println("착용 중인 정장아이템이 없습니다.");
                                    }
                                } // 정장 버리기
                                else if(이템탈부착==3){
                                    if(고길동.악세사리명!=""){
                                        System.out.println("정말 버리시겠습니까?");
                                        System.out.println("1.Yes");
                                        System.out.println("2.No");
                                        int 악세사리버리기=sc.nextInt();
                                        if(악세사리버리기==1){
                                            Runnable 아이템음악 = new Runnable(){
                                                @Override
                                                public void run(){
                                                    Player playMp3;
                                                    try{
                                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Trash.mp3");
                                                        playMp3 = new Player(fls);
                                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                            Thread 아이템쓰레드 = new Thread(아이템음악);
                                            아이템쓰레드.start();
                                            System.out.println("착용했던 악세라리아이템을 버립니다!");
                                            고길동.악세사리명="";
                                            고길동.악세사리=0;
                                        }
                                        else{
                                            System.out.println("");
                                        }
                                    }
                                    else if(고길동.악세사리명==""){
                                        System.out.println("착용 중인 악세사리아이템이 없습니다.");
                                    }
                                } // 악세사리 버리기
                            } //아이템 착용해제
                            else if(선택백화점==9){
                                if(고길동.생명==true){
                                    고길동.고길동정보();
                                }
                                else if(검성고길동.생명==true){
                                    검성고길동.검성고길동정보();
                                }
                                else if(조폭고길동.생명==true){
                                    조폭고길동.조폭고길동정보();
                                }
                            }
                            else{
                                System.out.println("정확한 숫자를 기입해주세요.");
                            }
                        }
                    } // 백화점
                    else if(선택쌍문동==3){
                        boolean 이용헬스장=true;
                        while(이용헬스장){
                            게임진행.헬스장();
                            int 선택헬스장=sc.nextInt();
                            if(선택헬스장==0){
                                이용헬스장=false;
                                Runnable 뒤로가기음악 = new Runnable(){
                                    @Override
                                    public void run(){
                                        Player playMp3;
                                        try{
                                            FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                            playMp3 = new Player(fls);
                                            playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                뒤로가기쓰레드.start();
                            }
                            else if(선택헬스장==1){
                                if(고길동.헬스장회원==false){
                                    boolean 헬스장등록=true;
                                    while(헬스장등록){
                                        게임진행.회원등록();
                                        int 회원등록=sc.nextInt();
                                        if(회원등록==1){
                                            if(캐릭터.돈>=100000){
                                                System.out.println("헬스장 회원등록되었습니다.");
                                                캐릭터.돈=캐릭터.돈-100000;
                                                고길동.헬스장회원=true;
                                                헬스장등록=false;
                                            }
                                            else{
                                                System.out.println("돈이 부족하여 회원등록 할 수 없습니다.");
                                            }
                                        }
                                        else if(회원등록==0){
                                            헬스장등록=false;
                                            Runnable 뒤로가기음악 = new Runnable(){
                                                @Override
                                                public void run(){
                                                    Player playMp3;
                                                    try{
                                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                                        playMp3 = new Player(fls);
                                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                            Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                            뒤로가기쓰레드.start();
                                        }
                                        else{
                                            System.out.println("정확한 숫자를 기입해주세요.");
                                        }
                                    }
                                }
                                else{
                                    System.out.println("이미 회원등록이 완료된 상태입니다.");
                                }
                            } // 회원등록하기
                            else if(선택헬스장==2){
                                if(고길동.헬스장회원==true){
                                    boolean 운동하기=true;
                                    while(운동하기){
                                        게임진행.헬스장운동섹션();
                                        int 헬스장운동섹션=sc.nextInt();
                                        if(헬스장운동섹션==0){
                                            운동하기=false;
                                            Runnable 뒤로가기음악 = new Runnable(){
                                                @Override
                                                public void run(){
                                                    Player playMp3;
                                                    try{
                                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                                        playMp3 = new Player(fls);
                                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                            Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                            뒤로가기쓰레드.start();
                                        }
                                        else if(헬스장운동섹션==1){
                                            if(고길동.현재체력<=10){
                                                System.out.println("체력이 너무 낮아 진행 할 수 없습니다.");
                                            }
                                            else{
                                                if(고길동.생명==true){
                                                    고길동.상체운동();
                                                }
                                                else if(검성고길동.생명==true){
                                                    검성고길동.상체운동();
                                                }
                                                else if(조폭고길동.생명==true){
                                                    조폭고길동.상체운동();
                                                }
                                            }
                                        } //상체
                                        else if(헬스장운동섹션==2){
                                            if(고길동.현재체력<=10){
                                                System.out.println("체력이 너무 낮아 진행 할 수 없습니다.");
                                            }
                                            else{
                                                if(고길동.생명==true){
                                                    고길동.하체운동();
                                                }
                                                else if(검성고길동.생명==true){
                                                    검성고길동.하체운동();
                                                }
                                                else if(조폭고길동.생명==true){
                                                    조폭고길동.하체운동();
                                                }
                                            }
                                        } //하체
                                        else if(헬스장운동섹션==3){
                                            if(고길동.현재체력<=10){
                                                System.out.println("체력이 너무 낮아 진행 할 수 없습니다.");
                                            }
                                            else{
                                                if(고길동.생명==true){
                                                    고길동.런닝머신();
                                                }
                                                else if(검성고길동.생명==true){
                                                    검성고길동.런닝머신();
                                                }
                                                else if(조폭고길동.생명==true){
                                                    조폭고길동.런닝머신();
                                                }
                                            }
                                        } //런닝
                                        else if(헬스장운동섹션==4){
                                            if(고길동.스트레스>=89){
                                                System.out.println("스트레스가 너무 높아 진행 할 수 없습니다.");
                                            }
                                            else if(고길동.현재체력<=10){
                                                System.out.println("체력이 너무 낮아 진행 할 수 없습니다.");
                                            }
                                            else{
                                                if(고길동.생명==true){
                                                    고길동.사이타마();
                                                }
                                                else if(검성고길동.생명==true){
                                                    검성고길동.사이타마();
                                                }
                                                else if(조폭고길동.생명==true){
                                                    조폭고길동.사이타마();
                                                }
                                            }
                                        } //사이타마
                                        else if(헬스장운동섹션==9){
                                            if(고길동.생명==true){
                                                고길동.고길동정보();
                                            }
                                            else if(검성고길동.생명==true){
                                                검성고길동.검성고길동정보();
                                            }
                                            else if(조폭고길동.생명==true){
                                                조폭고길동.조폭고길동정보();
                                            }
                                        } //캐릭터정보
                                        else {
                                            System.out.println("정확한 숫자를 기입해주세요.");
                                        }

                                    }
                                }
                                else{
                                    System.out.println("헬스장 회원등록이 필요합니다.");
                                }
                        }

                        } // 운동하기
                    } // 헬스장
                    else if(선택쌍문동==4){
                        boolean 번화가=true;
                        while(번화가){
                            게임진행.번화가();
                            int 선택번화가=sc.nextInt();
                            if(선택번화가==0){
                                번화가=false;
                                Runnable 뒤로가기음악 = new Runnable(){
                                    @Override
                                    public void run(){
                                        Player playMp3;
                                        try{
                                            FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                            playMp3 = new Player(fls);
                                            playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                뒤로가기쓰레드.start();
                            }
                            else if(선택번화가==1){
                                if(캐릭터.돈<5000){
                                    System.out.println("돈이 부족하여 구입할 수 없습니다.");
                                }
                                else if(고길동.스트레스<=0){
                                    System.out.println("스트레스가 없기에 구입할 수 없습니다. ");
                                }
                                else{
                                    Runnable 아이템음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Rest.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 아이템쓰레드 = new Thread(아이템음악);
                                    아이템쓰레드.start();
                                    고길동.커피마시기();
                                }
                            }
                            else if(선택번화가==2){
                                if(캐릭터.돈<5000){
                                    System.out.println("돈이 부족하여 구입할 수 없습니다.");
                                }
                                else if(고길동.최대체력<2){
                                    System.out.println("체력이 부족하여 구입할 수 없습니다.");
                                }
                                else if(고길동.스트레스<=0){
                                    System.out.println("스트레스가 없기에 구입할 수 없습니다. ");
                                }
                                else{
                                    Runnable 아이템음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Rest.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 아이템쓰레드 = new Thread(아이템음악);
                                    아이템쓰레드.start();
                                    고길동.담배피우기();
                                }

                            }
                            else if(선택번화가==9){
                                if(고길동.생명==true){
                                    고길동.고길동정보();
                                }
                                else if(검성고길동.생명==true){
                                    검성고길동.검성고길동정보();
                                }
                                else if(조폭고길동.생명==true){
                                    조폭고길동.조폭고길동정보();
                                }
                            }
                            else{
                                System.out.println("정확한 숫자를 기입해주세요.");
                            }
                        }
                    } //번화가
                    else{
                        System.out.println("정확한 숫자를 기입해주세요.");
                    }
                    }
                } //밖으로
            else if(home==3){
                boolean 둘리일당=true;
                while(둘리일당){
                    게임진행.둘리일당();
                    int 일당선택=sc.nextInt();
                    if(일당선택==0){
                        둘리일당=false;
                        Runnable 뒤로가기음악 = new Runnable(){
                            @Override
                            public void run(){
                                Player playMp3;
                                try{
                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                    playMp3 = new Player(fls);
                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                        뒤로가기쓰레드.start();
                    }
                    else if(일당선택==9){
                        boolean 몬스터정보=true;
                        while(몬스터정보){
                            게임진행.몬스터정보();
                            int 몬스터정보선택=sc.nextInt();
                            if(몬스터정보선택==0){
                                몬스터정보=false;
                                Runnable 뒤로가기음악 = new Runnable(){
                                    @Override
                                    public void run(){
                                        Player playMp3;
                                        try{
                                            FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                            playMp3 = new Player(fls);
                                            playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                                뒤로가기쓰레드.start();
                            }
                            else if(몬스터정보선택==1){
                                또치.몬스터정보();
                            }
                            else if(몬스터정보선택==2){
                                도우너.몬스터정보();
                            }
                            else if(몬스터정보선택==3){
                                둘리.몬스터정보();
                                System.out.println("\t\t\t★둘리처치 시 게임승리★\n");
                            }
                            else{
                                System.out.println("정확한 숫자를 기입해주세요.");
                            }
                        }

                    } //몬스터 설명
                    else if(일당선택==1){
                        if(고길동.레벨==1){
                            게임진행.또치스토리();
                            String 또치전투시작=sc.next();
                            boolean 또치전투=true;
                            Runnable 몬스터또치=new Runnable() {
                                @Override
                                public void run() {
                                    while(true){
                                        if(또치.현재체력<=0){
                                            break;
                                        }
                                        else if(고길동.현재체력<0){
                                            break;
                                        }
                                        else if(고길동.멈춰==false){
                                            break;
                                        }
                                        else if(또치.현재체력>0 && 고길동.현재체력>0 && 고길동.멈춰==true){
                                            int 또치공격=또치.공격하기();
                                            int 고길동방어=고길동.방어하기();
                                            고길동.현재체력=고길동.현재체력-(또치공격-고길동방어);
                                            System.out.println("                                        [적군공격] 데미지:"+(또치공격-고길동방어));
                                            System.out.println("                                        [아군체력]:"+고길동.현재체력+"/"+고길동.최대체력);
                                            try {
                                                Thread.sleep(10000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                }
                            }; //또치쓰레드
                            Thread 또치쓰레드 = new Thread(몬스터또치);
                            또치쓰레드.start();
                            고길동.영웅싸움정보();
                            System.out.println("\t\t\t\t V S");
                            또치.몬스터싸움정보();
                            while(또치전투){
                                if(또치.현재체력<0){
                                    System.out.println();
                                    System.out.println("★또치가 죽었습니다★");
                                    또치.돈주기();
                                    고길동.레벨업();
                                    또치.죽음();
                                    또치전투=false;
                                    Runnable 승리음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 승리쓰레드 = new Thread(승리음악);
                                    승리쓰레드.start();
                                }
                                else if(고길동.현재체력<0){
                                    System.out.println();
                                    고길동.죽음();
                                    System.out.println("■■■■■■고길동이 죽어 게임에서 패배했습니다■■■■■■");
                                    또치전투=false;
                                    둘리일당=false;
                                    고길동.running=false;
                                }
                                System.out.println("");
                                System.out.println("");
                                System.out.println("무엇을 하시겠습니까");
                                System.out.println("1.공격하기");
                                System.out.println("2.스킬사용하기");
                                int 또치전투선택=sc.nextInt();
                                if(또치전투선택==1){

                                    int 고길동공격=고길동.공격하기();
                                    int 또치방어=또치.방어하기();
                                    또치.현재체력=또치.현재체력-(고길동공격-또치방어);
                                    System.out.println("[아군공격] 데미지:"+(고길동공격-또치방어));
                                    System.out.println("[적군체력]:"+또치.현재체력+"/"+또치.최대체력);
                                    if(또치.현재체력<0){
                                        System.out.println();
                                        System.out.println("★또치가 죽었습니다★");
                                        또치.돈주기();
                                        고길동.레벨업();
                                        또치.죽음();
                                        또치전투=false;
                                        Runnable 승리음악 = new Runnable(){
                                            @Override
                                            public void run(){
                                                Player playMp3;
                                                try{
                                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                    playMp3 = new Player(fls);
                                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                        Thread 승리쓰레드 = new Thread(승리음악);
                                        승리쓰레드.start();
                                    }
                                    else if(고길동.현재체력<0){
                                        System.out.println();
                                        고길동.죽음();
                                        System.out.println("■■■■■■고길동이 죽어 게임에서 패배했습니다■■■■■■");
                                        또치전투=false;
                                        둘리일당=false;
                                        고길동.running=false;
                                    }
                                }
                                else if(또치전투선택==2){
                                    고길동.스킬목록();
                                    int 고길동스킬선택=sc.nextInt();
                                    if(고길동스킬선택==1){
                                        고길동.폭력멈춰(또치);
                                        또치전투=false;
                                        둘리일당=false;
                                    }
                                    else if(고길동스킬선택==2){
                                        고길동.물뿌리기(또치);
                                    }
                                }
                            }
                        }
                        else if(또치.생명==false){
                            System.out.println("이미 처치한 적입니다.");
                        }
                    } //또치 선택
                    else if(일당선택==2){
                        if(고길동.레벨>=2){
                            게임진행.도우너스토리();
                            Runnable 몬스터도우너=new Runnable() {
                                @Override
                                public void run() {
                                    while(true){
                                        if(도우너.현재체력<=0){
                                            break;
                                        }
                                        else if(고길동.현재체력<0){
                                            break;
                                        }
                                        else if(고길동.멈춰==false){
                                            break;
                                        }
                                        else if(110>도우너.현재체력&&도우너.현재체력>90){
                                            도우너.깐따삐야();
                                        }
                                        else if(50>도우너.현재체력&&도우너.현재체력>1){
                                            도우너.떨피기();
                                        }
                                        else if(도우너.현재체력>0 && 고길동.현재체력>0 && 고길동.멈춰==true){
                                            int 도우너공격=도우너.공격하기();
                                            int 고길동방어=고길동.방어하기();
                                            고길동.현재체력=고길동.현재체력-(도우너공격-고길동방어);
                                            System.out.println("                                        [적군공격] 데미지:"+(도우너공격-고길동방어));
                                            System.out.println("                                        [아군체력]:"+고길동.현재체력+"/"+고길동.최대체력);

                                            try {
                                                Thread.sleep(10000);
                                            } catch (InterruptedException e) {
                                                System.out.println("");
                                            }
                                        }
                                    }
                                }
                            }; //도우너 쓰레드
                            Thread 도우너쓰레드 = new Thread(몬스터도우너);
                            String 도우너전투시작=sc.next();
                            boolean 도우너전투=true;
                            고길동.영웅싸움정보();
                            System.out.println("\t\t\t\t V S\n");
                            도우너.몬스터싸움정보();
                            도우너쓰레드.start();
                            while(도우너전투){
                                System.out.println("");
                                System.out.println("");
                                System.out.println("무엇을 하시겠습니까");
                                System.out.println("1.공격하기");
                                System.out.println("2.스킬사용하기");
                                if(도우너.현재체력<0){
                                    System.out.println();
                                    System.out.println("★도우너가 죽었습니다★");
                                    도우너.돈주기();
                                    고길동.레벨업();
                                    도우너.죽음();
                                    도우너전투=false;
                                    Runnable 승리음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 승리쓰레드 = new Thread(승리음악);
                                    승리쓰레드.start();
                                }
                                else if(고길동.현재체력<0){
                                    System.out.println();
                                    고길동.죽음();
                                    System.out.println("■■■■■■고길동이 죽어 게임에서 패배했습니다■■■■■■");
                                    도우너전투=false;
                                    둘리일당=false;
                                    고길동.running=false;
                                }
                                int 도우너전투선택=sc.nextInt();
                                if(도우너전투선택==1){
                                    int 고길동공격=고길동.공격하기();
                                    int 도우너방어=도우너.방어하기();
                                    도우너.현재체력=도우너.현재체력-(고길동공격-도우너방어);
                                    System.out.println("[아군공격] 데미지:"+(고길동공격-도우너방어));
                                    System.out.println("[적군체력]:"+도우너.현재체력+"/"+도우너.최대체력);
                                    if(도우너.현재체력<0){
                                        System.out.println();
                                        System.out.println("★도우너가 죽었습니다★");
                                        도우너.돈주기();
                                        고길동.레벨업();
                                        도우너.죽음();
                                        도우너전투=false;
                                        Runnable 승리음악 = new Runnable(){
                                            @Override
                                            public void run(){
                                                Player playMp3;
                                                try{
                                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                    playMp3 = new Player(fls);
                                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                        Thread 승리쓰레드 = new Thread(승리음악);
                                        승리쓰레드.start();
                                    }
                                    else if(고길동.현재체력<0){
                                        System.out.println();
                                        고길동.죽음();
                                        System.out.println("■■■■■■고길동이 죽어 게임에서 패배했습니다■■■■■■");
                                        도우너전투=false;
                                        둘리일당=false;
                                        고길동.running=false;
                                    }
                                }
                                else if(도우너전투선택==2){
                                    고길동.스킬목록();
                                    int 고길동스킬선택=sc.nextInt();
                                    if(고길동스킬선택==1){
                                        고길동.폭력멈춰(도우너);
                                        도우너전투=false;
                                        둘리일당=false;
                                    }
                                    else if(고길동스킬선택==2){
                                        고길동.물뿌리기(도우너);
                                    }
                                }
                            }
                        }
                        else if(고길동.레벨<2){
                            System.out.println("레벨이 낮아 입장 할 수 없습니다.");
                        }
                        else if(도우너.생명==false){
                            System.out.println("이미 처치한 적입니다.");
                        }

                    } //도우너선택
                    else if(일당선택==3){
                        if(검성고길동.생명==true) {
                            게임진행.둘리스토리();
                            Runnable 몬스터둘리=new Runnable() {
                                @Override
                                public void run() {
                                    while(true){
                                        if(둘리.현재체력<=0){
                                            break;
                                        }
                                        else if((고길동.현재체력+고길동.악세사리)<0){
                                            break;
                                        }
                                        else if(고길동.멈춰==false){
                                            break;
                                        }
                                        else if(120>=둘리.현재체력&&둘리.현재체력>=70){
                                            둘리.호잇();
                                        }
                                        else if(50>=둘리.현재체력&&도우너.현재체력>=2){
                                            둘리.떨피기();
                                        }
                                        else if(둘리.현재체력==1){
                                            둘리.초능력맛();
                                            break;
                                        }
                                        else if(둘리.현재체력>0 && (고길동.현재체력+고길동.악세사리)>0 && 검성고길동.멈춰==true){
                                            int 둘리공격=둘리.공격하기();
                                            int 고길동방어=고길동.방어하기();
                                            고길동.현재체력=고길동.현재체력-(둘리공격-고길동방어);
                                            System.out.println("                                        [적군공격] 데미지:"+(둘리공격-고길동방어));
                                            System.out.println("                                        [아군체력]:"+(고길동.현재체력+고길동.악세사리)+"/"+(고길동.최대체력+고길동.악세사리));
                                            try {
                                                Thread.sleep(10000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                }
                            }; //검성vs둘리쓰레드
                            Thread 둘리쓰레드 = new Thread(몬스터둘리);
                            String 검성둘리전투시작 = sc.next();
                            검성고길동.영웅싸움정보();
                            System.out.println("\t\t\t\t V S\n");
                            둘리.몬스터싸움정보();
                            boolean 검성둘리전투 = true;
                            둘리쓰레드.start();
                            while (검성둘리전투) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("무엇을 하시겠습니까");
                                System.out.println("1.공격하기");
                                System.out.println("2.스킬사용하기");
                                if(둘리.현재체력<=0){
                                    System.out.println();
                                    System.out.println("★둘리가 죽었습니다★");
                                    System.out.println("★★★둘리가 죽어 게임에서 승리했습니다.★★★");
                                    Runnable 승리음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 승리쓰레드 = new Thread(승리음악);
                                    승리쓰레드.start();
                                    둘리.죽음();
                                    검성둘리전투=false;
                                    둘리일당=false;
                                    고길동.running=false;
                                }
                                else if(고길동.현재체력+고길동.악세사리<=0){
                                    System.out.println();
                                    고길동.죽음();
                                    System.out.println("■■■■■■고길동이 죽어 게임에서 패배했습니다■■■■■■");
                                    검성둘리전투=false;
                                    둘리일당=false;
                                    고길동.running=false;
                                }
                                int 둘리전투선택=sc.nextInt();
                                if(둘리전투선택==1){
                                    int 검성고길동공격=검성고길동.공격하기();
                                    int 둘리방어=둘리.방어하기();
                                    둘리.현재체력=둘리.현재체력-(검성고길동공격-둘리방어);
                                    System.out.println("[아군공격] 데미지:"+(검성고길동공격-둘리방어));
                                    System.out.println("[적군체력]:"+둘리.현재체력+"/"+둘리.최대체력);
                                    if(둘리.현재체력<=0){
                                        System.out.println();
                                        System.out.println("★둘리가 죽었습니다★");
                                        System.out.println("★★★둘리가 죽어 게임에서 승리했습니다.★★★");
                                        Runnable 승리음악 = new Runnable(){
                                            @Override
                                            public void run(){
                                                Player playMp3;
                                                try{
                                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                    playMp3 = new Player(fls);
                                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                        Thread 승리쓰레드 = new Thread(승리음악);
                                        승리쓰레드.start();
                                        둘리.죽음();
                                        검성둘리전투=false;
                                        둘리일당=false;
                                        고길동.running=false;
                                    }
                                    else if(고길동.현재체력+고길동.악세사리<=0){
                                        System.out.println();
                                        고길동.죽음();
                                        System.out.println("■■■■■■고길동이 죽어 게임에서 패배했습니다■■■■■■");
                                        검성둘리전투=false;
                                        둘리일당=false;
                                        고길동.running=false;
                                    }
                                }
                                else if(둘리전투선택==2){
                                    검성고길동.스킬목록();
                                    int 고길동스킬선택=sc.nextInt();
                                    if(고길동스킬선택==1){
                                        고길동.폭력멈춰(둘리);
                                        검성둘리전투=false;
                                        둘리일당=false;
                                    }
                                    else if(고길동스킬선택==2){
                                        검성고길동.각성();
                                    }
                                    else if(고길동스킬선택==3){
                                        검성고길동.검성고길동스킬(둘리);
                                        System.out.println();
                                        System.out.println("★둘리가 죽었습니다★");
                                        System.out.println("★★★둘리가 죽어 게임에서 승리했습니다.★★★");
                                        Runnable 승리음악 = new Runnable(){
                                            @Override
                                            public void run(){
                                                Player playMp3;
                                                try{
                                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                    playMp3 = new Player(fls);
                                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                        Thread 승리쓰레드 = new Thread(승리음악);
                                        승리쓰레드.start();
                                        둘리.현재체력=0;
                                        둘리.죽음();
                                        검성둘리전투=false;
                                        둘리일당=false;
                                        고길동.running=false;
                                    }
                                }
                            }
                        } //검성 싸움
                        else if(조폭고길동.생명==true){
                            게임진행.둘리스토리();
                            Runnable 몬스터둘리=new Runnable() {
                                @Override
                                public void run() {
                                    while(true){
                                        if(둘리.현재체력<=0){
                                            break;
                                        }
                                        else if((고길동.현재체력+고길동.악세사리)<0){
                                            break;
                                        }
                                        else if(고길동.멈춰==false){
                                            break;
                                        }
                                        else if(130>=둘리.현재체력&&둘리.현재체력>=70){
                                            둘리.호잇();
                                        }
                                        else if(50>=둘리.현재체력&&도우너.현재체력>=2){
                                            둘리.떨피기();
                                        }
                                        else if(둘리.현재체력==1){
                                            둘리.초능력맛();
                                            break;
                                        }
                                        else if(둘리.현재체력>0 && (고길동.현재체력+고길동.악세사리)>0 && 조폭고길동.멈춰==true){
                                            int 둘리공격=둘리.공격하기();
                                            int 고길동방어=고길동.방어하기();
                                            고길동.현재체력=고길동.현재체력-(둘리공격-고길동방어);
                                            System.out.println("                                        [적군공격] 데미지:"+(둘리공격-고길동방어));
                                            System.out.println("                                        [아군체력]:"+(고길동.현재체력+고길동.악세사리)+"/"+(고길동.최대체력+고길동.악세사리));
                                            try {
                                                Thread.sleep(10000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                }
                            }; //조폭vs둘리
                            Thread 둘리쓰레드 = new Thread(몬스터둘리);
                            String 조폭둘리전투시작 = sc.next();
                            조폭고길동.영웅싸움정보();
                            System.out.println("\t\t\t\t V S\n");
                            둘리.몬스터싸움정보();
                            boolean 조폭둘리전투 = true;
                            둘리쓰레드.start();
                            while (조폭둘리전투) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("무엇을 하시겠습니까");
                                System.out.println("1.공격하기");
                                System.out.println("2.스킬사용하기");
                                if(둘리.현재체력<=0){
                                    System.out.println();
                                    System.out.println("★둘리가 죽었습니다★");
                                    System.out.println("★★★둘리가 죽어 게임에서 승리했습니다.★★★");
                                    Runnable 승리음악 = new Runnable(){
                                        @Override
                                        public void run(){
                                            Player playMp3;
                                            try{
                                                FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                playMp3 = new Player(fls);
                                                playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                    Thread 승리쓰레드 = new Thread(승리음악);
                                    승리쓰레드.start();
                                    둘리.죽음();
                                    조폭둘리전투=false;
                                    둘리일당=false;
                                    고길동.running=false;
                                }
                                else if(고길동.현재체력+고길동.악세사리<=0){
                                    System.out.println();
                                    고길동.죽음();
                                    System.out.println("■■■■■■고길동이 죽어 게임에서 패배했습니다■■■■■■");
                                    조폭둘리전투=false;
                                    둘리일당=false;
                                    고길동.running=false;
                                }
                                int 조폭전투선택=sc.nextInt();
                                if(조폭전투선택==1){
                                    int 조폭고길동공격=조폭고길동.공격하기();
                                    int 둘리방어=둘리.방어하기();
                                    둘리.현재체력=둘리.현재체력-(조폭고길동공격-둘리방어);
                                    System.out.println("[아군공격] 데미지:"+(조폭고길동공격-둘리방어));
                                    System.out.println("[적군체력]:"+둘리.현재체력+"/"+둘리.최대체력);
                                    if(둘리.현재체력<=0){
                                        System.out.println();
                                        System.out.println("★둘리가 죽었습니다★");
                                        System.out.println("★★★둘리가 죽어 게임에서 승리했습니다.★★★");
                                        Runnable 승리음악 = new Runnable(){
                                            @Override
                                            public void run(){
                                                Player playMp3;
                                                try{
                                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                    playMp3 = new Player(fls);
                                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                        Thread 승리쓰레드 = new Thread(승리음악);
                                        승리쓰레드.start();
                                        둘리.죽음();
                                        조폭둘리전투=false;
                                        둘리일당=false;
                                        고길동.running=false;
                                    }
                                    else if(고길동.현재체력+고길동.악세사리<=0){
                                        System.out.println();
                                        고길동.죽음();
                                        System.out.println("■■■■■■고길동이 죽어 게임에서 패배했습니다■■■■■■");
                                        조폭둘리전투=false;
                                        둘리일당=false;
                                        고길동.running=false;
                                    }
                                }
                                else if(조폭전투선택==2){
                                    조폭고길동.스킬목록();
                                    int 고길동스킬선택=sc.nextInt();
                                    if(고길동스킬선택==1){
                                        고길동.폭력멈춰(둘리);
                                        조폭둘리전투=false;
                                        둘리일당=false;
                                    }
                                    else if(고길동스킬선택==2){
                                        조폭고길동.분노(둘리);
                                    }
                                    else if(고길동스킬선택==3){
                                        조폭고길동.담배후();
                                    }
                                    else if(고길동스킬선택==4){
                                        조폭고길동.원투펀치(둘리);
                                        둘리.현재체력=둘리.현재체력-100;
                                        if(둘리.현재체력<=0){
                                            System.out.println();
                                            System.out.println("★둘리가 죽었습니다★");
                                            System.out.println("★★★둘리가 죽어 게임에서 승리했습니다.★★★");
                                            Runnable 승리음악 = new Runnable(){
                                                @Override
                                                public void run(){
                                                    Player playMp3;
                                                    try{
                                                        FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Victory.mp3");
                                                        playMp3 = new Player(fls);
                                                        playMp3.play();} catch (Exception e){System.out.println(e);}}};
                                            Thread 승리쓰레드 = new Thread(승리음악);
                                            승리쓰레드.start();
                                            둘리.죽음();
                                            조폭둘리전투=false;
                                            둘리일당=false;
                                            고길동.running=false;
                                        }
                                    }
                                }
                            }
                        } //조폭 싸움
                        else if(고길동.생명==true){
                            System.out.println("고길동의 옛 기억을 찾고 다시 도전해주세요.");
                        }

                    } //둘리선택
                }
            } //싸움
            else if(home==7){
                System.out.println("--------------------BGM--------------------");
                System.out.println("1.BGM On");
                System.out.println("2.BGM Off");
                int 음악=sc.nextInt();
                if(음악==1){
                    Runnable BGM2 = new Runnable(){
                        @Override
                        public void run(){
                            Player playMp3;
                            try{
                                while(배경음악){
                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\BGM.mp3");
                                    playMp3 = new Player(fls);
                                    playMp3.play();
                                }
                            } catch (Exception e){
                                System.out.println("");
                            }
                        }
                    }; //BGM 쓰레드
                    Thread BGM쓰레드2 = new Thread(BGM2);
                    배경음악=true;
                    BGM쓰레드2.start();
                }
                else if(음악==2){
                    System.out.println("음악파일이 모두 재생 후 종료됩니다.(15초)");
                    배경음악=false;
                }
            } //BGM
            else if(home==8){
                boolean 게임설명=true;
                while(게임설명){
                    게임진행.게임설명();
                    System.out.println("0. 돌아가기");
                    int 선택게임설명 = sc.nextInt();
                    if(선택게임설명==0){
                        게임설명=false;
                        Runnable 뒤로가기음악 = new Runnable(){
                            @Override
                            public void run(){
                                Player playMp3;
                                try{
                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                    playMp3 = new Player(fls);
                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                        뒤로가기쓰레드.start();
                    }
                    else{
                        게임설명=false;
                        Runnable 뒤로가기음악 = new Runnable(){
                            @Override
                            public void run(){
                                Player playMp3;
                                try{
                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                    playMp3 = new Player(fls);
                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                        뒤로가기쓰레드.start();
                    }
                }
            } //게임설명
            else if(home==9){
                boolean 게임종료=true;
                while(게임종료){
                    System.out.println("1.게임종료하기");
                    System.out.println("0.돌아가기");
                    int 선택=sc.nextInt();
                    if(선택==1){
                        System.out.println("게임을 종료합니다.");
                        게임종료=false;
                        Runnable 뒤로가기음악 = new Runnable(){
                            @Override
                            public void run(){
                                Player playMp3;
                                try{
                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                    playMp3 = new Player(fls);
                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                        뒤로가기쓰레드.start();
                        고길동.running=false;

                    }
                    else{
                        게임종료=false;
                        Runnable 뒤로가기음악 = new Runnable(){
                            @Override
                            public void run(){
                                Player playMp3;
                                try{
                                    FileInputStream fls=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\JAVA1\\src\\music\\Back.mp3");
                                    playMp3 = new Player(fls);
                                    playMp3.play();} catch (Exception e){System.out.println(e);}}};
                        Thread 뒤로가기쓰레드 = new Thread(뒤로가기음악);
                        뒤로가기쓰레드.start();
                    }
                }
            } //게임종료
            else{
                System.out.println("올바른 숫자를 입력해주세요.");
            }
            }
        }
    }
