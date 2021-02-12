package com.usman.bank.enums;

/**
 * Created by Veneesh on 8/25/14.
 */
public enum LanguageEnum {
    EN("en","L","ENG","ltr","E"),
    AR("ar","U","ARA","rtl","A");

    private String iso;
    private String smsLanguage;
    private String knetLanguage;
    private String htmlLang;
    private String integrationLanguage;
    LanguageEnum(String iso,String smsLanguage,String knetLang,String htmlLang,String integrationLanguage) {
        this.iso = iso;
        this.smsLanguage = smsLanguage;
        this.knetLanguage = knetLang;
        this.htmlLang = htmlLang;
        this.integrationLanguage = integrationLanguage;

    }

    public String getSmsLanguage() {
        return this.smsLanguage;
    }

    public String getISO() {
        return this.iso;
    }

    public String getKnetLanguage() {
        return knetLanguage;
    }

    public String getHtmlLang() {
        return htmlLang;
    }

    public String getIntegrationLanguage() {
        return integrationLanguage;
    }

    public void setIntegrationLanguage(String integrationLanguage) {
        this.integrationLanguage = integrationLanguage;
    }

}
