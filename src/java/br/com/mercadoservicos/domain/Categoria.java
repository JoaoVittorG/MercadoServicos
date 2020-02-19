
package br.com.mercadoservicos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

 @Entity
 @Table(name="categoria")
 
public class Categoria {
     
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer id;
     
     @NotNull
     @Size(min=1,max=45)
     @Column(name="descricao")
     private String descricao;
     
     public Categoria(){
         
     }

    public Categoria(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
     
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
     
}
