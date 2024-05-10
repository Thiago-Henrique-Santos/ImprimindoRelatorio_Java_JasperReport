/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thiago
 */
public class OrdemDeProducao {
    private Integer numeroOP;
    private String cliente;
    private Date dataGeradaOP;
    private Date dataEntregaOP;
    private Produto produto;
    private final String descricaoProduto;
    private final String descricaoMedida;
    private final String observacao;
    private final String amostra;
    private final Date dataInicioFluxo;
    private final Date horaInicioFluxo;
    private final String tempoAcerto;
    private final Float metrosAcerto;
    private final Integer unidadeRodar;
    
    public OrdemDeProducao (Integer numeroOP, String cliente, String dataGeradaOP, String dataEntregaOP, String produto, String descricaoProduto, String descricaoMedida, String observacao, String amostra, String dataInicioFluxo, String horaInicioFluxo, String tempoAcerto, Float metrosAcerto, Integer unidadeRodar) throws ParseException {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm");
        
        this.numeroOP = numeroOP;
        this.cliente = cliente;
        this.dataGeradaOP = formatoData.parse(dataGeradaOP);
        this.dataEntregaOP = formatoData.parse(dataEntregaOP);
        switch (produto) {
            case "etiqueta":
                this.produto = Produto.ETIQUETA;
                break;
            case "ribbons":
                this.produto = Produto.RIBBONS;
                break;
            default:
                this.produto = Produto.AMBOS;
                break;
        }
        this.descricaoProduto = descricaoProduto;
        this.descricaoMedida = descricaoMedida;
        this.observacao = observacao;
        this.amostra = amostra;
        this.dataInicioFluxo = formatoData.parse(dataInicioFluxo);
        this.horaInicioFluxo = formatoHora.parse(horaInicioFluxo);
        this.tempoAcerto = tempoAcerto;
        this.metrosAcerto = metrosAcerto;
        this.unidadeRodar = unidadeRodar;
    }
    
    public Integer getNumeroOP() {
        return numeroOP;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public String getDataGeradaOP() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        return formatoData.format(dataGeradaOP.toString());
    }
    
    public String getDataEntregaOP() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        return formatoData.format(dataEntregaOP.toString());
    }
    
    public String getProduto() {
        return switch (produto) {
            case ETIQUETA -> "Etiqueta";
            case RIBBONS -> "Ribbons";
            default -> "Etiqueta e ribbons";
        };
    }
    
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    
    public String getDescricaoMedida() {
        return descricaoMedida;
    }
    
    public String getObservacao() {
        return observacao;
    }
    
    public String getAmostra() {
        return amostra;
    }
    public String getDataInicioFluxo() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        return formatoData.format(dataInicioFluxo.toString());
    }
    
    public String getHoraInicioFluxo() {
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm");
        return formatoHora.format(horaInicioFluxo.toString());
    }
    
    public String getTempoAcerto() {
        return tempoAcerto;
    }
    
    public Float getMetrosAcerto() {
        return metrosAcerto;
    }
    
    public Integer getUnidadeRodar() {
        return unidadeRodar;
    }
}
