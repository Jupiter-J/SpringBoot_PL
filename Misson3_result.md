# 3차 미션 제출

## 미션 수행 과정

User Entity와 PostEntity를 Many-to-Many 어노테이션으로 엮었다.

실행 결과 유저와 포스트 부분은 500에러가 뜨게됨

에러 내용: IndexOutOfBoundsException

Many-to-Many로 엮기 위하여 Post와 User에 ListArray를 생성하였는데 여기서 indexOf를 어떻게 지정해야하는지 제대로 대처하지 못해서 에러가 난것으로 생각된다. 


![image](https://user-images.githubusercontent.com/73453283/157256498-017df060-cdcc-4f78-98c8-2bcf6d1940d2.png)

<br>

## 미션 결과 

<img width="800" alt="image" src="https://user-images.githubusercontent.com/73453283/157255866-b72969a2-faff-4252-9da9-1bef23a8d3ea.png">


<img width="800" alt="image" src="https://user-images.githubusercontent.com/73453283/157257238-541e7670-2a52-4a09-8b69-8500c4ddb954.png">

<img width="800" alt="image" src="https://user-images.githubusercontent.com/73453283/157257366-ed778561-300d-4069-b506-4741a0b79618.png">


## 아쉬운 점 & 배운 점
* Entity끼리의 관계를 매핑하는 공부가 필요하다
* 다대다의 방식에서 어떻게 제작해야하는지 공부하여 수정할 예정이다
* JPA를 다뤄본적이 없었는데 이번 과제를 하면서 각각의 dto, dao, repository, controller, service의 특성을 알게 되었다.
* mybatis 부분도 더 공부가 필요하다! 
