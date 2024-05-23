## 1단계

- JPA를 활용하여 데이터베이스에 접근
    - [x] gradle 의존성 추가
    - [x] 엔티티 매핑
    - [x] 연관관계 매핑

## 2단계

- [x] `GET /reservation-mine` 호출 시 내 예약 목록 페이지 응답
- 내 예약 목록을 조회하는 API 구현
    - [x] `GET /reservations/me` 호출 시 내 예약 목록 응답  

## 3단계

- [x] 클라이언트 코드에 예약 대기 버튼 추가
- [ ] TODO: [3단계] 주석을 찾아 수정
- [x] 예약 대기 요청 기능 구현
  - 지난 날짜 예약 대기 불가능
  - 해당 예약이 있어야 대기 가능
  - 예약과 예약 대기 중에 같은 멤버 존재하면 불가능
- [x] 내 예약 목록 조회 시 예약 대기 목록도 함께 포함하여 응답
  - ~~심화 요구사항 - 내 예약 목록의 예약 대기 상태에 몇 번째 대기인지도 함께 표시~~
- [ ] 예약 대기 취소 기능 구현 
  - 사용자는 본인의 예약 대기만 취소 가능
  - 어드민은 모든 예약 대기 취소 가능
- [ ] 중복 예약이 불가능 하도록 구현
