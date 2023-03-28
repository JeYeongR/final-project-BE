package com.travel.order.entity;

public enum OrderStatus {

    WAITING_FOR_PAYMENT("결제 대기"),
    COMPLETE_PAYMENT("결제 완료"),
    WITHDRAW_ORDER("주문 취소");

    private String korean;

    public String getKorean() {
        return korean;
    }

    OrderStatus(String korean) {
        this.korean = korean;
    }
}
