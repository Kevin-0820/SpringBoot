package com.entornos.backend.modelo;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDto {

    private Long id;

    private Long idTipoDocumento;

    private String numeroDocumento;

    private String nombre;

    private String direccion;

    private String telefono;

    private String email;


}
