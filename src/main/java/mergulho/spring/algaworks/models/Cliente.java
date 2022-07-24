package mergulho.spring.algaworks.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {

    private Long id;
    private String nome;
}
