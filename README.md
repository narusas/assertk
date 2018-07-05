# 개요
단위 테스트작성시 BDD방식으로 하려고 해도 영어가 모국어가 아닌 한국사람들에게 와닫지 않는 문제를 극복해보고자, 한국어 기반 BDD 스크립트 작성을 지원할수 있는 라이브러리를 만들었다 

# 사용법 

import 

```
import static net.narusas.test.assertk.AssertK.*;
```



다음과 같은 junit 단위 테스트가 있을때 
```
assertFalse("쿠키가 없으면 덮어쓰기 대상이 아님", overwrite.isOverwrite("FEATURE_001").isOverwrite());
```

다음 처럼 기술할수 있다 

```
그렇다면("쿠키가 없으면 덮어쓰기 대상이 아님").이기_때문에().다음_(
    overwrite.isOverwrite("FEATURE_001").isOverwrite()
).의_결과는().거짓().이여야한다();
```


# 문법
DDD방식이기 때문에 어휘 형태로 기술한다 


## 시작어구
* 그렇다면
* 또한
* 반면
* 하지만
* 그러나
* 따라서
* 그에따라

## 연결 어구 
* 이기_때문에
* 기_때문에
* _때문에
* 때문에
* 이므로
* 되었으므로
* 으로_


## 테스트 대상 지정  어구 
* 다음_
* 으로_
* 다음_변수
* 다음_명제
* 다음_구문
 
## 결과 판정 어구
* 의_결과는
* 의_결과도

## 결과 어구 
* 참
* 거짓
* TRUE
* FALSE
* 일치 


## 단정 어구 
* 이여야한다
* 이_아니여야한다
