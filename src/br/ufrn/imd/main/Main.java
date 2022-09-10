package br.ufrn.imd.main;

//import java.util.Calendar;
//import java.util.Scanner;

import br.ufrn.imd.domino.Aluno;
//import br.ufrn.imd.domino.Curso;
import br.ufrn.imd.domino.Disciplina;

public class Main {

	public static void main(String[] args) {
		

		
		/**
		 * Criação de aluno e inicialização de suas variáveis
		 */
		Aluno student = new Aluno();
		student.criarAluno();
		
		
		/**
		 * Ajuste da data de nascimento do aluno
		 */
		//student.inciaDataNascimento();
		
		
		/**
		 * Cadastramento de um aluno do curso
		 */
		
		student.escolheCurso();
		/**
		 * Inserção de disciplinas na grade do aluno
		 */
		
		
		
		/**
		 * chamada para a matrícula na disciplina do aluno
		 */
		
		student.solicitarMatricula();		
		student.solicitarMatricula();
		
		
		System.out.println(student);
		
		
		
		
		/**
		 * Chamada da função para trancamento de matrícula e verificação
		 */

		student.trancarMatricula();
		
		System.out.println("Matrículas após o trancamento da disciplinas");
		
		for (Disciplina d : student.listarDisciplinas()) {
			System.err.print(d);
		}
		
		//inserção interativa desses itens 
		//regras de negócio - implementação dos métodos de solicitar matrícula
		
	}

}
