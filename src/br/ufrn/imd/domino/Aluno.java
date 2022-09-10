package br.ufrn.imd.domino;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {

	private String matricula;
	private Curso curso;
	private double ira;
	private List<Disciplina> disciplinas;
	
	public Aluno() {
		disciplinas = new ArrayList<Disciplina>();
	}
	
	/**
	 * Criação de um aluno com inicialização do nome e matrícula
	 */
	public void criarAluno() {
		Scanner sc = new Scanner(System.in);
		try {
			System.err.println("Digite o nome do aluno");
			setNome(sc.nextLine());
			System.err.println("Digite a matrícula do aluno");
			setMatricula(sc.nextLine());
		} finally {
			sc.close();
		}
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
		System.err.println("Aluno matriculado no curso: " + getCurso());
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		this.ira = ira;
	}
	
	@Override
	public String toString() {
		return getNome() + " matrícula: " +matricula;
	}
	
	/**
	 * Incialição do curso do aluno
	 */
	public void escolheCurso() {
		if(getCurso() == null) {
			
			Scanner sc = new Scanner(System.in);
			try {
				System.err.println("Digite o curso para matrícula");
				Curso course = new Curso();
				course.setDescricao(sc.nextLine());
				setCurso(course);
			} finally {
				sc.close();
			}
				
		}
		else {
			System.out.println("o aluno já está matriculada no curso: " + getCurso());
		}
	}
	
	/**
	 * Maticula do Aluno em uma disciplina
	 * @param disciplina
	 */
	public void solicitarMatricula() {
		Disciplina subject = new Disciplina();
		Scanner sc = new Scanner(System.in);
		System.err.println("Para se matricular indique o id  ");
		subject.setId(Integer.parseInt(sc.nextLine()));
		System.err.println("Para se matricular indique a descrição  ");
		subject.setDescricao(sc.nextLine());
		System.err.println("");
		
		sc.close();
		//verificar se a disciplina já existe na coleção
		if(!disciplinas.contains(subject))
			disciplinas.add(subject);
	}

	
	public void trancarMatricula() {
		System.out.println("As disciplinas matriculadas são: ");
		for(Disciplina d : listarDisciplinas()) {			
			System.out.println(d);
		}
		Scanner sc = new Scanner(System.in);
		
		try {
			System.err.println("Digite a disciplina que deseja trancar: ");
			int number = Integer.parseInt(sc.nextLine());
			for(Disciplina d: listarDisciplinas()) {
				if(d.getId() == number) {
					disciplinas.remove(d);
				}
			}
		} finally {
			// TODO: handle finally clause
			sc.close();
		}
		/*
		System.out.println("Selecione a disciplina que você quer trancar e indique o respectivo ID: ");
		
		for (Disciplina d : listarDisciplinas()) {
			System.out.println(d);
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int number = sc.nextInt();
			for(Disciplina d: listarDisciplinas()) {
				if(d.getId() == number){
					disciplinas.remove(d);
				}
			}
		} finally {
			sc.close();
		}
		*/	 
			
		}
			
	
	
	
	public List<Disciplina> listarDisciplinas() {
		List<Disciplina> disciplinasRetornadas = new ArrayList<Disciplina>();
		disciplinasRetornadas.addAll(disciplinas);
		return disciplinasRetornadas;
	}
	
	public int qtdDisciplinas( ) {
		return disciplinas.size();
	}
	
	public void inciaDataNascimento() {
		Scanner sc = new Scanner(System.in);
		
		try {
			Calendar dataNascimento = Calendar.getInstance();
			System.err.println("Digite o Dia de seu nascimento");
			int number = sc.nextInt();
			dataNascimento.set(Calendar.DATE, number);
			System.err.println("Digite o número do Mês de seu nascimento");		
			number = sc.nextInt();
			dataNascimento.set(Calendar.MONTH, number -1);
			number = sc.nextInt();
			System.err.println("Digite o Ano de seu nascimento");			
			dataNascimento.set(Calendar.YEAR, sc.nextInt());
			setDataNascimento(dataNascimento.getTime());
			System.out.println(getDataNascimento());
		
		} finally {
			sc.close();
		}
		
	}
	
}
