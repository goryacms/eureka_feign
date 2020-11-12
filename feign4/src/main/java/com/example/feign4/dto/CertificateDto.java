package com.example.feign4.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CertificateDto {
    @JsonProperty(value = "serial_number", required = true)
    private String serialNumber;

    @JsonProperty(value = "fingerprint", required = true)
    private String fingerprint;

    @JsonProperty(value = "valid_from", required = true)
    private String validFrom;

    @JsonProperty(value = "valid_to", required = true)
    private String validTo;

    @JsonProperty(value = "subject")
    private String subject;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "surname")
    private String surname;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "inn")
    private String inn;

    @JsonProperty(value = "kpp")
    private String kpp;

    @JsonProperty(value = "ogrn")
    private String ogrn;

    @JsonProperty(value = "ogrnip")
    private String ogrnip;

    @JsonProperty(value = "snils")
    private String snils;

    @JsonProperty(value = "position")
    private String position;

    @JsonProperty(value = "organization")
    private String organization;
}