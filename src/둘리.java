public class 둘리 extends 캐릭터{
    String 종족="[초능력공룡]";
    String 이름="둘리";
    int 현재체력=300;
    int 최대체력=300;
    int 보유돈=1000000;
    int 회복량=100;
    int 공격력증가=50;
    int 방어력증가=10;;

    public 둘리(String 이름,int 공격력, int 방어력,boolean 생명) {
        super(이름,공격력, 방어력, 생명);
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
        System.out.println("\t호잇 : 고정피해 3연타");
        System.out.println("\t초능력맛 : 고길동 [사망]");
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
    void 초능력맛(){
        System.out.println(
                        "                                                                 wwjjjjw                  \n" +
                        "                                                              Z9jjWWWWWjy9E5              \n" +
                        "                                                           DZwwWwWWWWWWWWwWjEz            \n" +
                        "                                                          ZjWWWWWWWWWWWWWWWWWWZ           \n" +
                        "                                                         ZjWWWWWWWWWWWWWWWWWWWWZ          \n" +
                        "                                                         EwWWwwwWWWWWWWWWWWWWWwWE         \n" +
                        "                                                         EWWWy9z  ,Ww,,   wWWWWwZ         \n" +
                        "                                                         wEWwB  5Z   By,Ew wWWWwZ         \n" +
                        "                                                          ,B,z zZZW895 5ZZ,BWWwZ          \n" +
                        "                                                          jBwjD8ZZ 5B ZZZjy,WwB5          \n" +
                        "                                                        BEjWWW, B   Wwy   ,WWw8B          \n" +
                        "                                                       ,8wWWWWWWw     BwWWWWWWwWZ         \n" +
                        "                                          ZD8          ZWwWWWWWW9     BWWWWWWWWWZ         \n" +
                        "                                          B  Z          ZWwWWWWW585DDzBWWWWWWWWZ          \n" +
                        "                                          8   Z          Z8yyjjw,wWjWWWWw,wwjBZ           \n" +
                        "                                           Zj Z588WwZ      yjy5yEww, ,,,yD9jj             \n" +
                        "                                          B  j w    E          5DWzZzEBz5wjj              \n" +
                        "                                         89  Z    Zj         DZzW B y,,,wwWWyEEDj         \n" +
                        "                                         E  ZW  DEWz8     ,BEWwwzWjDDwWWWWWWWwWj5Ez5      \n" +
                        "                                          ZW  D EwwwW9BjDZBWWWWWWWWWWWWWWWWWWWWWWWW5Z     \n" +
                        "                                           BDyZ8WwWWWWWjWWwWWWWWWWWWWWWWWWWWWWWWWWWWW9W   \n" +
                        "                                               85WWWWWWWWWWWWWWWWWWWWWWWWWWWWWBwwWWWWW8,  \n" +
                        "                                                jZDjjWWWjj55WWWWWWWWWWWWWWWWWWwZ,WWWWWWZ  \n" +
                        "                                                  WyzBEzBjyDBBBBBBBBBDDDDDDDDD5D85555D59  \n" +
                        "                                                                                          ");
        System.out.println("                                        ★[둘리] : 초능력 맛 좀 볼래★\n");
        System.out.println("                                        고길동이 즉사합니다.");
        고길동.현재체력=0;
    }
    void 호잇() {
        System.out.println("                                                                                                   \n" +
                "                                                WWw,,,,wyZD                                                   \n" +
                "                                               y,WWWWWWWwwDZ                                                  \n" +
                "                                              8 wWw    W,  Bw                                                 \n" +
                "                                              Z WW zZZ   ZZ Z                                                 \n" +
                "                                              Z,wW EZZDzDZZBw                                                 \n" +
                "                                               Z,ww    B    WZ                                                \n" +
                "                                                Z, ,,wwj8Bww Z                                                \n" +
                "                                                 ZZBzw    ,DZ5                                                \n" +
                "                                                  8  yZD9E                                                    \n" +
                "                                                  Z jE 9 ZZ W        ,Z                                       \n" +
                "                                                   WZ   wZ,,jz8ZZ85  Ez                                       \n" +
                "                                                  ,Z      Z,,,    ,Z8 Z  B                                    \n" +
                "                                                 ,,9      Bzz88ZZZ8Z   Z5E  ,,,ww,                            \n" +
                "                                                 zBy       Z        ZZZE    ,     ,wwwww,                     \n" +
                "                                                 Z z       wZ                            ,wwwww,              \n" +
                "                                                 ZwD         Z                                  ,wwwwww,      \n" +
                "                                        y        Z8          Z                                          ,,ww, \n" +
                "                                        ZZE       9          Z                                                \n" +
                "                                        W  Z9j   ,wZZ,DWjWZBE                                                 \n" +
                "                                           Z jZZ8,, Z Zy5,Z                                                   \n" +
                "                                               Zz W Z 8,wwZ                                                   \n" +
                "                                                5 WwE Zw,9                                                    \n" +
                "                                                  wB  Ew Z                                                    \n" +
                "                                                   B9Wz, DZ9                                                  \n" +
                "                                                    D  DD5y                                                   \n");
        System.out.println("                                        ★[둘리] : 호잇★");
        System.out.println("                                        고길동의 체력이 [10] 감소했습니다.");
        System.out.println("                                        고길동의 체력이 [20] 감소했습니다.");
        System.out.println("                                        고길동의 체력이 [30] 감소했습니다.");
        고길동.현재체력 = 고길동.현재체력 - 60;
    }

}
