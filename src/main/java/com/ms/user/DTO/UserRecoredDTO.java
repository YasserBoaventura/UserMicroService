package com.ms.user.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecoredDTO(@NotBlank String nome, @NotBlank @Email String email) {

}
  