package com.usman.bank.enums;

/**
 * Created by Veneesh on 8/17/14.
 */
public enum KnetTransStatusEnum {

    SUCCESS(1),
    SUCCESS_IN_KNET_FAILED_IN_BOOQ(2),
    FAILED(3),
    CANCELLED(4),
    PENDING(5);

    private final int accountTypeId;

    public int getValue() {
        return this.accountTypeId;
    }
    KnetTransStatusEnum(int accountStatusId) {
        this.accountTypeId = accountStatusId;
    }
}
