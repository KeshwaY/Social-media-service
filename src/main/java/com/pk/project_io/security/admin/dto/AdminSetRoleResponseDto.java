package com.pk.project_io.security.admin.dto;

import javax.validation.constraints.NotBlank;

public class AdminSetRoleResponseDto {

    @NotBlank
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
