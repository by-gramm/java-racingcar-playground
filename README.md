# 자동차 경주 게임

### 2번째 구현의 추가 목표

- 도메인 객체 사이에서는 getter 메소드를 사용하지 않는다. View단과 데이터를 주고받을 때만 사용한다.
- 도메인 객체를 불변 객체로 만든다. (setter 메소드를 사용하지 않는다.)
- AssertJ 라이브러리를 활용하여 테스트 코드를 작성한다.
- 클래스, 메서드명은 한두 단어로 유지한다.

### TODO

- [ ] 쉼표로 구분된 자동차 이름을 입력받는다.
    - [x] 자동차 이름은 5자를 초과할 수 없다.
    - [x] 자동차 이름은 빈 문자열일 수 없다.
    - [x] 자동차 이름은 중복될 수 없다.
- [x] 입력받은 이름을 가진 자동차 객체를 생성한다.
- [ ] 시도 횟수를 입력받는다.
- [ ] 시도 횟수만큼 라운드를 진행한다.
    - [ ] 라운드별로 각 자동차의 전진 여부를 구한다.
        - [x] 0 ~ 9 사이의 random 값이 4 이상인 경우 전진한다.
    - [x] 전진 여부에 따라 각 자동차의 위치를 업데이트한다.
    - [ ] 모든 자동차의 위치를 출력한다.
- [ ] 게임 완료 후 가장 멀리 나간 자동차를 우승자로 선정한다. 단, 우승자는 여럿일 수 있다.
- [ ] 게임 결과를 출력한다.

### 프로그래밍 요구사항

- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - 기본적으로 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)을 원칙으로 한다.
    - 단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- **모든 원시 값과 문자열을 포장한다.**
- **일급 컬렉션을 쓴다.**