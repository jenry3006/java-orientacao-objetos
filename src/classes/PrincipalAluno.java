package classes;

import javax.swing.*;

public class PrincipalAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual o rg?");
		String cpf = JOptionPane.showInputDialog("Qual o cpf?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String matricula = JOptionPane.showInputDialog("Qual a data de matrícula?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");

		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setNomeEscola(escola);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));*/

		/*System.out.println("Aluno: " + aluno1.nome);
		System.out.println("Idade: " + aluno1.idade);
		System.out.println("Data de nascimento: " + aluno1.dataNascimento);
		System.out.println("RG: " + aluno1.getRegistroGeral());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Nome da mãe: " + aluno1.getNomeMae());
		System.out.println("Nome do pai: " + aluno1.getNomePai());
		System.out.println("Nome da escola pertencente: " + aluno1.getNomeEscola());
		System.out.println("Data da matrícula: " + aluno1.getDataMatricula());
		System.out.println("Serié matriculada: " + aluno1.getSerieMatriculado());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));*/

		/*System.out.println(aluno1.toString());
		System.out.println("Média do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());*/


		System.out.println("=================================");

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jenry");

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Jenry");

		if (aluno1.equals(aluno2)){
			System.out.println("Alunos são iguais.");
		} else{
			System.out.println("Alunos são diferentes.");
		}


	}

}
