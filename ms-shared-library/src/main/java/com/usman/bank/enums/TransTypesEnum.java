package com.usman.bank.enums;

/**
 * Created by Veneesh on 8/17/14.
 */
public enum TransTypesEnum {

    WALLET_TO_WALLET(1),
    PARTNER_TO_WALLET(2),
    WALLET_TO_PARTNER(3),
    WALLET_TO_PARTNER_CARDLESS(4),
    REQUEST_FROM_WALLET_TO_WALLET(5),
    WALLET_FEES(6),
    WALLET_TO_SANDOOQ(7),
    KNET_TO_WALLET(8),
    PAY_MOBILE(9),
    XBOX (10),
    PLAYSTATION_STORE (11),
    XBOX_LIVE (12),
    PLAYSTATION_LIVE (13),
    GCC_TELECOM (14),
    NINTENDO (15),
    BEIN_SPORTS_RENEWAL (16),
    GOOGLE_PLAY (17),
    ITUNES_CARD (18);

    private final int transTypeId;

    public int getValue() {
        return this.transTypeId;
    }
    TransTypesEnum(int transTypeId) {
        this.transTypeId = transTypeId;
    }
}
