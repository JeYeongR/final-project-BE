package com.travel.order.dto.response;

import com.travel.order.entity.OrderStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class OrderAdminResponseDTO {

    private Long orderId;

    private Long productId;

    private Long memberId;

    private String memberName;

    private String memberEmail;

    private String productName;

    private String productThumbnail;

    private Integer productPrice;

    private LocalDateTime orderDate;

    private String optionName;

    private Integer productProductQuantity;

    private String orderStatus;

    @Builder
    public OrderAdminResponseDTO(Long orderId, Long productId, Long memberId, String memberName, String memberEmail, String productName, String productThumbnail, Integer productPrice, LocalDateTime orderDate, String optionName, Integer productProductQuantity, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.productId = productId;
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.productName = productName;
        this.productThumbnail = productThumbnail;
        this.productPrice = productPrice;
        this.orderDate = orderDate;
        this.optionName = optionName;
        this.productProductQuantity = productProductQuantity;
        this.orderStatus = orderStatus.getKorean();
    }
}
