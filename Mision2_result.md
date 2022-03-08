# Spring_Boot_Mission

### 2차 미션 스크린샷
### basic

* 사진

![image](https://user-images.githubusercontent.com/73453283/155122048-27ed7584-c881-44e4-9c77-f96f1fb4d412.png)
![image](https://user-images.githubusercontent.com/73453283/155122402-3a7940e4-1545-434c-afb4-bd3faea2188e.png)


***********
<br>
<br>

# 반성할점 & 수정해나가야 할 점

### 1. 작은 문제점에 매달리지 말고 전체를 보자

미션이 게시판안에 포스트를 생성하는 것이기에 boards배열을 생성하고 posts 배열을 안에 넣는 형태를 고민했다. 리스트안에 리스트를 넣는 법을 모르겠어서 여기에만 매달렸고, 결과적으로 모든 방법을 제대로 다루지 못했다. 이방법 적용하고 안되면 다른 방법을 찾고 끝까지 매달리지 않는 부분에서 시간을 허비함. 문제는 내 코드가 저것만 문제가 아니었던 것. 매달리고 있는 문제가 정말 문제가 맞는지 확인하기. 혹은 다른 문제점은 더 없는지 찾아보기. 
 
#### 방식 1. BoardDto에 PostDto 객체를 List로 넣는다
#### 방식 2. List안에 List를 넣기 List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
#### 방식 3. JSON Array 안에 boardList, postList를 둘다 넣고 호출하기
<br>

* 구현하고자 했던 json 형식


![image](https://user-images.githubusercontent.com/73453283/155123670-e5c23016-d798-4342-8065-82dbe132eeea.png)

<br>
<br>

### 2. API를 생성하기 전에 명세서를 작성하고 확인후 생성하자
중간에 내가 어떤 API를 만드는지 헷갈려서 시간을 한참 보냈다. 새로 만드는 것 보다 수정하는게 더 어렵다는 말을 들었는데 이번 미션이 그런 꼴인 셈.
미션 내용 그대로 board api 만들고 post api를 만드니까 나중에가서야 뭐가 잘못되었는데...? 이상함을 직감했다. 제출 3시간 전에서야 생각했던 URI와 제작한 URI가 다르다는걸 알고 충격먹음. ㅋㅎㅎㅎ. 앞으로 API 명세서를 제작 후 꼼꼼하게 확인 후에 생성하도록 하자. 

* 구현하고자 했던 API 명세서


![image](https://user-images.githubusercontent.com/73453283/155114429-5abb8fc8-f5e2-4521-a805-4d12fa49b4a0.png)



<br>
<br>

# 앞으로 해야하는 것

* API 명세서대로 다시 제작하기
* 미션의 세부 기능 만족시키기
* 리스트안에 리스트를 넣는 방법 찾아보기




