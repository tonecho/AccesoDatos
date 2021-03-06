package TarefaUD01_03;

import java.io.Serializable;
public class Vehiculo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String matricula;
    private String marca;
    private transient Double deposito;
    private String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "DatosBasicosVehiculos{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", deposito=" + deposito +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
