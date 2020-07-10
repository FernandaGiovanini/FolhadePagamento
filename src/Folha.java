
	public class Folha {
		public static void main(String args[]) {
			Funcionario lista[];
			lista = new Funcionario[5];
			
			lista[0] = new Funcionario(1, "Joao","Junior", 1000);
			lista[1] = new Funcionario(2, "Maria","Pleno", 2000);
			lista[2] = new Funcionario(3, "Pedro","Senior", 3000);
			lista[3] = new Funcionario(4, "Paty","Cordenador", 5000);
			lista[4] = new Funcionario(5, "Sandra","Gerente", 9000);
		
			
		for (int pos=0; pos <5; pos++) {
			double salarioLiquido = lista[pos].getSalarioBruto() - lista[pos].calcularImposto();
			System.out.printf("%d %-20s R$ %7.2f  R$ 7.2f  R$ %7.2f \n",
					lista[pos].getNumReg(),
					lista[pos].getNome(),
					lista[pos].getSalarioBruto(),
					lista[pos].calcularImposto(),
					salarioLiquido);
		}
		}
}
