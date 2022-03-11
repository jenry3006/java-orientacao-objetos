package classes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrincipalAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Aluno> alunos = new ArrayList<Aluno>();




		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual o rg?");
		String cpf = JOptionPane.showInputDialog("Qual o cpf?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String matricula = JOptionPane.showInputDialog("Qual a data de matrícula?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");


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

		/*Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		aluno1.getDisciplinas().add(disciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Desenvolvimento web");
		disciplina2.setNota(69);
		aluno1.getDisciplinas().add(disciplina2 );

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Java");
		disciplina3.setNota(80);
		aluno1.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Matematica");
		disciplina4.setNota(70);
		aluno1.getDisciplinas().add(disciplina4);*/


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

			//Adicionando 4 disciplinas de forma dinâmica
			for (int posicao = 1; posicao <= 4; posicao++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + posicao + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + posicao + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma disciplina?");

			if (escolha == 0) { //opcao 0 = a SIM
				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}


			}

			alunos.add(aluno1);


		for (Aluno aluno : alunos){
			System.out.println(aluno.toString());
			System.out.println("Média do aluno: " + aluno.getMediaNota());
			System.out.println("Resultado: " + aluno.getAlunoAprovado2());
		}





		System.out.println("=================================");


		Aluno aluno2 = new Aluno();
		aluno2.setNome("Jenry");

		if (aluno1.equals(aluno2)){
			System.out.println("Alunos são iguais.");
		} else{
			System.out.println("Alunos são diferentes.");
		}


	}

}
