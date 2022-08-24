package com.ciandt.summit.bootcamp2022.domain.data.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ArtistDTO {

    @Schema(description = "Id do Artista")
    private String id;
    @Schema(description = "Nome do Artista")
    private String name;

}
