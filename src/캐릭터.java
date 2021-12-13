import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class 캐릭터 {
    String 이름;
    int 현재체력,최대체력,공격력,방어력;
    boolean 생명;

    static int 돈=50000;

    public 캐릭터(String 이름, int 공격력, int 방어력, boolean 생명){
        this.이름 = 이름;
        this.공격력 = 공격력;
        this.방어력 = 방어력;
        this.생명 = 생명;
    }

    boolean 죽음(){
        return 생명=false;
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
        return 공격력;
    }
    int 방어하기(){
        return(방어력/10);
    }
}
