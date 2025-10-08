package beans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notificacao {
    private String id;
    private String tipo;
    private String mensagem;
    private LocalDateTime dataHora;


    public Notificacao(String id, String tipo, String mensagem, LocalDateTime dataHora) {
        this.id = id;
        this.tipo = tipo;
        this.mensagem = mensagem;
        this.dataHora = dataHora;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getMensagem() {
        return mensagem;
    }


    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


    public LocalDateTime getDataHora() {
        return dataHora;
    }


    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("Tipo: %s | Datahora: %s\n %s", this.tipo, this.dataHora.format(formatter), this.mensagem);
    }
}
