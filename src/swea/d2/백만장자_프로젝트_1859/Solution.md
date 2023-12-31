# 백만장자 프로젝트
## 1. 문제

25년 간의 수행 끝에 원재는 미래를 보는 능력을 갖게 되었다. 이 능력으로 원재는 사재기를 하려고 한다.

다만 당국의 감시가 심해 한 번에 많은 양을 사재기 할 수 없다.

다음과 같은 조건 하에서 사재기를 하여 최대한의 이득을 얻도록 도와주자.

    1. 원재는 연속된 N일 동안의 물건의 매매가를 예측하여 알고 있다.
    2. 당국의 감시망에 걸리지 않기 위해 하루에 최대 1만큼 구입할 수 있다.
    3. 판매는 얼마든지 할 수 있다.

예를 들어 3일 동안의 매매가가 1, 2, 3 이라면 처음 두 날에 원료를 구매하여 마지막 날에 팔면 3의 이익을 얻을 수 있다.

## 2. 풀이

- 배열 뒤에서부터 최대값 저장하면서 오기
- 배열 옮길 때마다: 결과값 += 최대값 - 현재값
    - 현재값이 최대값일 경우에는 0
    - 최대값이 아닐 경우에는 현재 최대값에 현재값 뺀 값 = 이득보고 팔았을 때 가격
- long 타입으로 큰 값 출력받기