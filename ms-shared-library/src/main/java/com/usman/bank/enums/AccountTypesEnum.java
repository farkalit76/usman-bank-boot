package com.usman.bank.enums;

/**
 * Created by Veneesh on 8/17/14.
 */
public enum AccountTypesEnum {

    BOOQ(1),
    SANDOOQ(2),
    PARTNER_BANK_ACCOUNT(3),
    PARTNER_TELECOM_ACCOUNT(4),
    CARDLESS(5),
    KNET(6),
    WALLET_POOL(7),
    ENET_POOL(8);


    private final int accountTypeId;

    public int getValue() {
        return this.accountTypeId;
    }
    AccountTypesEnum(int accountStatusId) {
        this.accountTypeId = accountStatusId;
    }
}
