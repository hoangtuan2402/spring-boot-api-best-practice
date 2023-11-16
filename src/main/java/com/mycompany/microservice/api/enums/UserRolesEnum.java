package com.mycompany.microservice.api.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum UserRolesEnum {
  PLATFORM_USER("platform_user"),
  PLATFORM_ADMIN("platform_admin"),

  BACK_OFFICE_USER("back_office_user"),
  BACK_OFFICE_ADMIN("back_office_admin"),

  INTERNAL_USER("internal_user"),

  MANAGEMENT_USER("management_user"),
  MANAGEMENT_ADMIN("management_admin");

  private final String name;
}
