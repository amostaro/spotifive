package com.ciandt.summit.bootcamp2022.domain.data.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@EqualsAndHashCode
public class DataDTO {

    @Schema(description = "Lista de dados")
    Set<MusicDTO> data;
}
