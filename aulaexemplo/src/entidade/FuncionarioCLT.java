package entidade;

public abstract class FuncionarioCLT {
 private String nome;
 private entidade.cargo cargo;
 protected double salario;
 
 
public FuncionarioCLT(String nome, double salario2, entidade.cargo cargo2 ) {
	super();
	this.nome = nome;
	this.cargo = cargo2;
	this.salario = salario2;
	
}
public double calcularsalario() {
	return 0;
}



@Override
public String toString() {
	return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
}


}
 



