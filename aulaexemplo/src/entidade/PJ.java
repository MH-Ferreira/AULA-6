package entidade;

public class PJ extends FuncionarioPJ {

	public PJ(String nome, double salario, entidade.cargo cargo, double adicional) {
		super(nome, salario, cargo, adicional);
		// TODO Auto-generated constructor stub
		this.adicional = adicional;
	}

	@Override
	public double calcularsalario() {
		// TODO Auto-generated method stub
		return salario ;
	}
	
	

	

	
	}

	


