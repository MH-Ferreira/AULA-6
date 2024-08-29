package entidade;

public class CLT extends FuncionarioCLT {

	public CLT(String nome, double salario, entidade.cargo cargo) {
		super(nome, salario, cargo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularsalario() {
		// TODO Auto-generated method stub
		return salario = salario + (salario * 0.10);
	}

}
