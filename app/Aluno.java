package app;

import exceptions.DadosAlunoIncompletoException;

public class Aluno {

	private String nome;
	private String prefixoMatricula;
	private String sufixoMatricula;
	private String email;
	private String celular;

	public Aluno(String nome, String prefixoMatricula, String sufixoMatricula, String email, String celular) throws DadosAlunoIncompletoException {
		validaAluno(nome, prefixoMatricula, sufixoMatricula);
		this.nome = nome;
		this.prefixoMatricula = prefixoMatricula; 
		this.sufixoMatricula = sufixoMatricula; 
		this.email = email;
		this.celular = celular;
	}

	public static Aluno obterAluno(String nome, String prefixoMatricula, String sufixoMatricula, String email,
			String celular) throws DadosAlunoIncompletoException {
		Aluno a = new Aluno(nome, prefixoMatricula, sufixoMatricula, email, celular);
		return a;
	}
	
	public void validaAluno(String nome, String prefixoMatricula, String sufixoMatricula) throws DadosAlunoIncompletoException{
		if (nome == null || prefixoMatricula == null || sufixoMatricula == null ||
				nome.equals("") || prefixoMatricula.equals("") || sufixoMatricula.equals("")) {
				StringBuilder builder = new StringBuilder(); 
				builder.append("Dados informados para Aluno estão incompletos:");
				builder.append(nome == null ? "Nome: " + nome : null);
				builder.append(prefixoMatricula == null ? "Prefixo Matricula: " + prefixoMatricula : null);
				builder.append(sufixoMatricula== null ? "Sufixo Matricula: " + sufixoMatricula : null);
				throw new DadosAlunoIncompletoException(builder.toString());
			}
	}

	public String getNome() {
		return nome;
	}

	public String getPrefixoMatricula() {
		return prefixoMatricula;
	}

	public String getSufixoMatricula() {
		return sufixoMatricula;
	}

	public String getEmail() {
		return email;
	}

	public String getCelular() {
		return celular;
	}
	
	@Override
	public String toString() {
		return getPrefixoMatricula();
	}

}
