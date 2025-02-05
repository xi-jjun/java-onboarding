## 기능 정리

- [x] 입력으로 들어온 돈에서 `X원`단위의 화폐가 최대 몇개 생기는지 개수를 반환하는 기능
- [x] 입력으로 들어온 돈에서 `X원`단위의 화폐가 생길 수 있는 최대 금액을 빼고 남은 돈을 반환하는 기능
- [ ] ~~돈이 모두 소진되었는지 확인해주는 기능~~
  - 필요하지 않은 기능이라 제거
- [x] 입력으로 들어온 돈에서 화폐의 모든 종류에 대해 만들어질 수 있는 각각의 개수를 `List`에 담아서 반환하는 기능 - `solution`

<br>

## 생각해봐야할 것들

1. 알고리즘의 시간 복잡도를 고려한 효율적인 코드

   - `Greedy`하게 '가장 큰 단위'부터 몇개 생기는지 확인해줄 것이다.

     → 목적은 **'돈 담을 지갑이 최대한 가볍도록 큰 금액의 화폐 위주로 받는다'** 라는 말이 있기 때문이다.

<br>

## 느낀점 정리 : [My Github Blog](https://xi-jjun.github.io/2022-10-26/wootecoBackendFirstWeek)

<br>

# 아래는 원본 문서입니다

<br>

## 🚀 기능 요구 사항

계좌에 들어있는 돈 일부를 은행에서 출금하고자 한다. 돈 담을 지갑이 최대한 가볍도록 큰 금액의 화폐 위주로 받는다.

돈의 액수 money가 매개변수로 주어질 때, 오만 원권, 만 원권, 오천 원권, 천 원권, 오백원 동전, 백원 동전, 오십원 동전, 십원 동전, 일원 동전 각 몇 개로 변환되는지 금액이 큰 순서대로 리스트/배열에 담아 return 하도록 solution 메서드를 완성하라.

### 제한사항

- money는 1 이상 1,000,000 이하인 자연수이다.

### 실행 결과 예시

| money | result |
| --- | --- |
| 50237	| [1, 0, 0, 0, 0, 2, 0, 3, 7] |
| 15000	| [0, 1, 1, 0, 0, 0, 0, 0, 0] |