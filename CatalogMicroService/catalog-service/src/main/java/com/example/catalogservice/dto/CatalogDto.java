package com.example.catalogservice.dto;

import java.io.Serializable;
import lombok.Data;

/**
 자바에서 직렬화는 자바 메모리에 있는 객체를 영속화하거나
 네트워크를 통해 다른 쪽으로 전송하는 경우에 바이트 형식으로 데이터를 변환하기 위해 사용합니다.
  예를 들어, 네트워크 통신에서 PC난 애플리케이션, 서비스 간에 서로 사용하는 메모리 공간 주소가
  다를 수 있습니다.

 특히, 참조형 데이터의 경우에 이를 Value Type으로 변환하기 위해 사용한다고 보시면 좋을 것 같습니다.
 자바에서 말하는 기본 데이터 타입이 아니라, 클래스 타입은 직렬화를 통해 저장되거나 다른 네트워크로 전송된다고 보시면 될 것 같습니다.
 * */
@Data
public class CatalogDto implements Serializable {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}
