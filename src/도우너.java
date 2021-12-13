public class 도우너 extends 캐릭터{
    String 종족="[마약중독자]";
    String 이름="도우너";
    int 현재체력=200;
    int 최대체력=200;
    int 보유돈=500000;
    int 회복량=100;
    int 공격력증가=30;
    int 방어력증가=10;

    public 도우너(String 이름,int 공격력, int 방어력,boolean 생명) {
        super(이름,공격력, 방어력, 생명);
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
        System.out.println("\t떨피기 : 체력,공격력,방어력 증가");
        System.out.println("\t깐따삐야 : 고정피해 [-30]");
        System.out.println("└──────────────────────────────────────────────┘\n");
    }
    void 몬스터싸움정보(){
        System.out.printf("\t[%s]\n",이름);
        System.out.printf("\t체력 : %d / %d\n",현재체력,최대체력);
        System.out.printf("\t공격력 : %d\n",공격력);
        System.out.printf("\t방어력 : %d\n",방어력);
        System.out.println("===============================\n");
    }
    void 떨피기(){
        System.out.println(
                        "                                                                                          \n" +
                        "                                                                     58zWZ                \n" +
                        "                                                                     Z wE E               \n" +
                        "                                                                     DZ9zjE               \n" +
                        "                                                                      z    Z5             \n" +
                        "                                                                       ZD   55            \n" +
                        "                                                                        Zy  wZZE          \n" +
                        "                                                                         ZZZ    Z         \n" +
                        "                                                                        BB      ZB5W      \n" +
                        "                                                                      ZZ       8 8  98Z   \n" +
                        "                                                               B9B8ZEB      jZZ   Z    Z  \n" +
                        "                                                            9Zz,          5j  DZ   ZW  Z  \n" +
                        "                                                          8Z              ZZWWwZZ   ZZjj  \n" +
                        "                                                         Z,             wZ  95  zZ   5y   \n" +
                        "                                                        Z,             ZZ     Z  WZ   8D  \n" +
                        "                                                       Z             E9E      yW   Z8  Wz \n" +
                        "                                                      Z    D      ZZy 9       Z     8D wZ,\n" +
                        "                                                     DE     Z8         9zDzD99zz     ZZB  \n" +
                        "                                                    8E                 E       Z          \n" +
                        "                                                   wZ                  Z5     85          \n" +
                        "                                                 8Zjw              DZ9   zEE9jZ           \n" +
                        "                                           8Z9zZz                 E           Z           \n" +
                        "                                                                  DZ59,     wzZ           \n" +
                        "                                                          zB    599   Dz999zD             \n" +
                        "                                                          , E99E,                         \n" +
                        "                                                        WZ                                \n" +
                        "                                                       ZD                                 \n" +
                        "                                                     Z8                                   \n" +
                        "                                                   Z8                                     \n" +
                        "                                                 ZE                                       \n" +
                        "                                               Z9                                         \n" +
                        "                                           ,9ZD                                           \n");
        System.out.println("                                        ★대마초를 말아 피웁니다★");
        System.out.println("                                        체력 [+"+회복량+"] 회복");
        System.out.println("                                        공격력 [+"+공격력증가+"] 증가");
        System.out.println("                                        방어력 [+"+방어력증가+"] 증가");
        현재체력=현재체력+회복량;
        공격력=공격력+공격력증가;
        방어력=방어력+방어력증가;
    }
    void 깐따삐야(){
        System.out.println("                                        ★[도우너] 타임 코스모스~깐따삐야~★");
        System.out.println("                                        고길동의 체력이 [30] 감소했습니다.");
        고길동.현재체력=고길동.현재체력-30;
    }

}
