
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "produto")
public class Produto implements Serializable { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer id_produto;

    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "datavalidade")
    private Date datavalidade;

    @Column(name = "datacadastro")
    private Date datacadastro;
    
    @Column(name = "preco")
    private double preco;

    @Column(name = "ativo")
    private String ativo;
    
    public Produto() {
    }

    public Produto(Integer id_produto, String descricao, Date datavalidade,Date datacadastro,
            double preco,String ativo) {
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.datavalidade = datavalidade;
        this.datacadastro = datacadastro;
        this.preco = preco;
        this.ativo = ativo;
    }
     public Integer getid_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getdatavalidade() {
        return datavalidade;
    }

    public void setdatavalidade(Date datavalidade) {
        this.datavalidade = datavalidade;
    }

    public Date getdatacadastro() {
        return datacadastro;
    }

    public void setdatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public double getpreco() {
        return preco;
    }
        
    public void setpreco(float preco) {
        this.preco = preco;
    }
    public String getativo() {
        return ativo;
    }
        
    public void setativo(String ativo) {
        this.ativo = ativo;
    }
    @Override
    public String toString() {
        return "Produto{" + "id_produto=" + id_produto + ", descricao=" + descricao + ", datavalidade =" + datavalidade + ", datacadastro =" + datacadastro +
                ",preco =" + preco +",ativo =" + ativo + '}';
    }
    
    
    
   
}
