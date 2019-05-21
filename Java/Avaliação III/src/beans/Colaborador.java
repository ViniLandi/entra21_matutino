package beans;

public class Colaborador {

	private String nomeColaborador;
	private String cargo;
	private Double salarioBruto;
	private Double impostoRenda;
	private Double salarioLiquido;
	private boolean valeTransporte;
	private boolean clubeFidelidade;
	private boolean planoSaude;
	private int faltasMes;
	
	
	public String getNomeColaborador() {
		return nomeColaborador;
	}
	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public Double getImpostoRenda() {
		return impostoRenda;
	}
	public void setImpostoRenda(Double impostoRenda) {
		this.impostoRenda = impostoRenda;
	}
	public Double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(Double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	public boolean isValeTransporte() {
		return valeTransporte;
	}
	public void setValeTransporte(boolean valeTransporte) {
		this.valeTransporte = valeTransporte;
	}
	public boolean isClubeFidelidade() {
		return clubeFidelidade;
	}
	public void setClubeFidelidade(boolean clubeFidelidade) {
		this.clubeFidelidade = clubeFidelidade;
	}
	public boolean isPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}
	public int getFaltasMes() {
		return faltasMes;
	}
	public void setFaltasMes(int faltasMes) {
		this.faltasMes = faltasMes;
	}
	
	
}
