# Java Text Game : 검성고길동



## 스스로 성장하기 위하여 만든 앱입니다.

둘리와 그 일당(또치, 도우너)들이 평범한 가장인 고길동 집에서 무단 기생하며 살고 있습니다.

주인공인 고길동이 둘리와 일당을 처치하는 게임입니다.

[(![동영상 미리보기 이미지: 검성고길동](https://i9.ytimg.com/vi_webp/-Bhen1V-krs/mqdefault.webp?sqp=CNCW1Y4G&rs=AOn4CLA_kOJm878AtJd40ArCxQe-b9ywkA))](https://youtu.be/-Bhen1V-krs)

​				*- 클릭 시 동영상 재생됩니다.*

### 만드는 데 사용했던 기능

- 클래스 
- 상속
- static
- 쓰레드 - 아군과 적이 싸울 시 적이 자동 공격
- 쓰레드 - BGM
- 조건문
- 반복문
- 변수



## 게임 내 기능

1. 방으로 들어가기

​		1-1 방에서 한숨 쉬기 - 주인공의 체력과 스킬 회복

​		1-2 검성고길동전직 - 주인공레벨3이상, 얼음칼 보유

​		1-3 조폭고길동전직 - 주인공레벨3이상, 베르사체세트 보유



2. 밖으로 나가기

​		2-1 노동현장 - 편의점,일용직, 코딩 중 일을 선택하여 돈을 벌 수 있지만 스트레스가 증가

​		2-2 백화점 - 무기,정장,액세서리 중 돈을 소비하여 아이템을 구매하여 능력치 증가 시킬 수 있음

​		2-3 헬스장 - 헬스장이용권을 구매하여 운동할 수 있으며 운동 시 능력치가 증가하지만 현재체력이 감소

​		2-4 번화가 - 돈을 소비하여 스트레스를 감소



3.둘리일당 물리치기

​		3-1 또치 - 또치와 싸움

​		3-2 도우너 - 도우너와 싸움 (레벨 2이상)

​		3-3 둘리 - 둘리와 싸움 (레벨 3이상, 전직 필수)

​		3-9 몬스터 정보 - 각 일당들의 능력치와 스킬을 볼 수 있음



7.BGM

​		7-1 BGM ON

​		7-2 BGM OFF



8.게임설명



9.게임종료



## 사용 쓰레드

**1. 지연출력쓰레드**

게임스토리의 가독성을 위함

게임스토리(인트로, 또치,도우너,둘리 스토리,게임설명), 돈벌기, 운동, 스트레스 해소 시 사용 



**2.몬스터 자동공격 쓰레드**

또치,도우너,둘리와 싸움에서 일정간격으로 일반공격, 특정상황에서 스킬 사용



**3.음악 쓰레드**

\- 게임 BGM 

\- 특정상황 효과음

(휴식,전직, 아이템획득, 전투승리, 뒤로가기, 스트레스해소, 돈벌기, 공격 등)



**4.스트레스 쓰레드**

주인공이 일정시간 마다 스트레스가 증가하고 

스트레스100 에 도달 시 주인공 체력-1씩 감소됩니다.
