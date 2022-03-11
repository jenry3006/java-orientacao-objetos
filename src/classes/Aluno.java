package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	public String nome;
	public int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Aluno() {
	}
	
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getMediaNota(){

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas){
			somaNotas += disciplina.getNota();
		}

		return somaNotas / disciplinas.size();
	}

	@Override
	public String toString() {
		return "Aluno{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", dataNascimento='" + dataNascimento + '\'' +
				", registroGeral='" + registroGeral + '\'' +
				", numeroCpf='" + numeroCpf + '\'' +
				", nomeMae='" + nomeMae + '\'' +
				", nomePai='" + nomePai + '\'' +
				", dataMatricula='" + dataMatricula + '\'' +
				", nomeEscola='" + nomeEscola + '\'' +
				", serieMatriculado='" + serieMatriculado + '\''+
				'}';
	}




	public boolean getAlunoAprovado(){
		double media = this.getMediaNota();

		if (media >= 60){
			return true;
		} else {
			return false;

		}
	}

	public String getAlunoAprovado2(){
		double media = this.getMediaNota();



			if (media>=50){
				if (media>=70){
					return "Aluno está aprovado";
				} else {
					return "Aluno est[a em recuperação";
				}
			}

			else {
			return "Aluno Reprovado";

		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Aluno aluno = (Aluno) o;
		return Objects.equals(nome, aluno.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
}
