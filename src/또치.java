public class 또치 extends 캐릭터{
    String 종족="[인신매매범]";
    String 이름="또치";
    int 현재체력=100;
    int 최대체력=100;
    int 보유돈=500000;

    public 또치(String 이름, int 공격력, int 방어력, boolean 생명) {
        super(이름, 공격력, 방어력, 생명);
    }

    public int 돈주기(){
        System.out.printf("돈 [%d 원] 획득했습니다.\n",보유돈);
        return 캐릭터.돈=캐릭터.돈+보유돈;
    }
    void 몬스터정보(){
        System.out.println("┌──────────────────────────────────────────────┐");
        System.out.println("\t\t몬 스 터 정 보 창\n");
        System.out.printf("\t종족 : %s\n",종족);
        System.out.printf("\t이름 : %s\n",이름);
        System.out.printf("\t체력 : %d / %d\n",현재체력,최대체력);
        System.out.printf("\t공격력 : %d\n",공격력);
        System.out.printf("\t방어력 : %d\n",방어력);
        System.out.printf("\t보유 돈 : %d 원\n\n",보유돈);
        System.out.println("\t\t보유 스킬");
        System.out.println("└──────────────────────────────────────────────┘\n");
    }
    void 몬스터싸움정보(){
        System.out.printf("\t[%s]\n",이름);
        System.out.printf("\t체력 : %d / %d\n",현재체력,최대체력);
        System.out.printf("\t공격력 : %d\n",공격력);
        System.out.printf("\t방어력 : %d\n",방어력);
        System.out.println("===============================\n");
    }
}
