package entidade;

public abstract class FuncionarioPJ {
 private String nome;
 private entidade.cargo cargo;
 protected double salario;
 protected double adicional;


 public FuncionarioPJ(String nome, double salario2, entidade.cargo cargo2, double adicional) {
	super();
	this.nome = nome;
	this.cargo = cargo2;
	this.salario = salario2;
	this.adicional = adicional;
}


public  double calcularsalario() {
	return 0;
}


@Override
public String toString() {
	return "FuncionarioPJ [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", adicional=" + adicional
			+ "]";
}



}
 
 
 
 

