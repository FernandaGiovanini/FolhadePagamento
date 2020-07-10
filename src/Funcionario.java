
public class Funcionario {
		private int numReg;
		private String nome;
		private String funcao;
		private double salarioBruto; 
		
		public Funcionario(int numReg, String nome, String funcao, double salarioBruto) {
			super();
			this.numReg = numReg;
			this.nome = nome;
			this.funcao = funcao;
			this.salarioBruto = salarioBruto;
		}
		public int getNumReg() {
			return numReg;
		}
		public void setNumReg(int numReg) {
			this.numReg = numReg;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getFuncao() {
			return funcao;
		}
		public void setFuncao(String funcao) {
			this.funcao = funcao;
		}
		public double getSalarioBruto() {
			return salarioBruto;
		}
		public void setSalarioBruto(double salarioBruto) {
			this.salarioBruto = salarioBruto;
		}
		public double calcularImposto() {
			double imposto = 0;
			
			if(salarioBruto <=1000){
				imposto = 0;
			}
			else if(salarioBruto <=2000){
				imposto = salarioBruto * 0.05;
				}
				else if(salarioBruto <=4500) {
					imposto = salarioBruto * 0.10;
				}
				else {
					imposto = salarioBruto * 0.15;
				}

			return imposto;
		}
		
	
		
		
		
}
