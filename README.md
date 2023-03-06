# java-blackjack

블랙잭 미션 저장소!

### 1단계 요구 사항

### 입력

- [x] Player 이름
    - [x] 중복 확인
    - [x] Blank 검증
    - [x] Player 수 1~7 명
- [x] 카드 더 받을지 여부
    - [x] y, n 이 아닐 경우

### 출력

- [x] 처음 할당받은 카드들 정보
    - [x] 딜러는 1장만
- [x] 매 턴마다 현재 가지고 있는 카드 출력
- [x] 게임 종료 후 최종 결과 출력
- [x] 최종 승패 출력

### 기능 목록

- [x] 52장의 카드를 담은 리스트를 생성한다 (Trump)
- [x] 카드를 뽑는다 (random 생성된 Index 번호)
- [x] 카드를 나눠준다(1장씩)
- [x] 모든 참가자들에게 2개씩 카드를 나눠준다
- [x] 카드를 더 받을지 여부에 따라서 카드를 추가로 받는다
- [x] 숫자 계산
    - [x] 카드 숫자를 기본
    - [x] King, Queen, Jack : 10
    - [x] Ace
        - [x] 기본 11점
        - [x] 총합이 21 초과가 되면 1로 계산한다 (21이 안넘을 때까지 하나씩 1로 계산)
- [x] 승패 계산
- [x] Player
    - [x] 1 개 받는다
    - 반복 (n 이 들어오거나 점수 합이 22 이상이 될때까지)
        - [x] 현재 가지고 있는 카드의 점수를 계산해서 더 받을 수 있는지 여부를 확인
        - [x] 점수의 합이 22 미만이면 더 받을지의 여부를 입력받는다
        - [x] y 면 카드를 새로 한장 받는다
    - [x] n 이면 차례가 끝난다
- [x] Dealer
    - [x] 딜러가 16 이하면 카드를 계속 받을 수 있는지 여부를 확인
- [x] Player 와 Dealer 중복되는 코드 제거
  - [x] Participant 클래스 상속



## 1단계 리팩토링
- [x] BlackJackGame 생성
- [ ] 카드 shuffle 방식으로 변경
- [x] validator 분리
- [ ] EnumMap 적용
- [ ] 메소드 이름 통일
- [ ] 불필요한 생성자 제거
- [ ] 변경에 따른 관련 코드 수정
- [ ] 플레이어 이름으로 딜러 제한