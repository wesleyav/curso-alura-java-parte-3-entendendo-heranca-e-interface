
public class Gerente extends FuncionarioAutenticavel {

	

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
		return super.getSalario();
	}
}
