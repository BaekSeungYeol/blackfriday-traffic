요구사항

```
- 판매자는 상품을 등록할 수 있다.
- 판매자는 상품의 설명, 수량 등 정보를 관리할 수 있다.
- 구매자는 상품을 구매할 수 있다.
- 구매자는 상품을 검색할 수 있다.
- 구매자는 결제수단을 등록하고 주문시 사용할 수 있다.
- 구매자는 배송지를 등록하고 주문시 사용할 수 있다.
- 구매자는 완료된 주문의 상태를 조회할 수 있다.
- 구매자는 완료된 주문의 배송 상태를 조회할 수 있다.
- 구매자는 주문 내역 리스트를 볼 수 있다.
- 구매자는 회원으로 등록할 수 있다.
- 회원은 로그인을 할 수 있다.
```

Catalog
역할: 상품 정보 관리
기능:
- 상품 등록 POST /catalog/products
- 상품 수정 PUT /catalog/products/{productId}
- 상품 수량 관리 POST /catalog/change-inventory-count
- 상품 조회 GET /catalog/products/{productId}
- 상품 검색 POST /catalog/search

Payment
역할: 결제 처리와 관련된 작업
기능:
- 결제 수단 등록 POST /payment/methods
- 결제 수단 변경 PUT /payment/methods/{methodId}
- 결제 POST /payment/process-payment
- 결제 결과 조회 GET /payment/payments/{paymentId} 

Order
역할: 주문 처리를 수행하고 상태를 관리
기능: 
- 상품 주문 POST  /order/process-order
- 주문 상태 조회 GET /order/orders/{orderId}
- 주문 내역 보기 GET /order/orders

Delivery
역할: 주문 완료된 제품 배송, 상태 관리
기능:
- 배송지 등록 POST /delivery/addresses
- 배송 처리 POST /delivery/process-delivery
- 배송 상태 조회 GET /delivery/deliveries/{deliveryId}

Member
역할: 회원 등록 관리와 인증
기능:
- 회원 등록 POST /member/registration
- 회원 정보 관리 PUT /member/members/{userId}
- 로그인 POST /member/login

<img width="951" alt="image" src="https://github.com/BaekSeungYeol/blackfriday-traffic/assets/47316511/d61f831b-cc48-4cf3-b648-4216dd4a63a9">

