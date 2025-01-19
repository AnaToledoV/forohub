package com.aluracursos.forohubalurac.topico;

import jakarta.validation.constraints.NotBlank;

public record TopicoRequestDTO(
        @NotBlank(message = "El título es obligatorio")
        String titulo,
        @NotBlank(message = "El mensaje es obligatorio")
        String mensaje,
        @NotBlank(message = "El autor es obligatorio")
        String autor,
        @NotBlank(message = "El curso es obligatorio")
        String curso
) {}
