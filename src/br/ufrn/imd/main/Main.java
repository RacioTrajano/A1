package br.ufrn.imd.main;

//import java.util.Calendar;
//import java.util.Scanner;

import br.ufrn.imd.domino.Aluno;
//import br.ufrn.imd.domino.Curso;
import br.ufrn.imd.domino.Disciplina;

public class Main {

	public static void main(String[] args) {
		

		
		/**
		 * Cria��o de aluno e inicializa��o de suas vari�veis
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
		 * Inser��o de disciplinas na grade do aluno
		 */
		
		
		
		/**
		 * chamada para a matr�cula na disciplina do aluno
		 */
		
		student.solicitarMatricula();		
		student.solicitarMatricula();
		
		
		System.out.println(student);
		
		
		
		
		/**
		 * Chamada da fun��o para trancamento de matr�cula e verifica��o
		 */

		student.trancarMatricula();
		
		System.out.println("Matr�culas ap�s o trancamento da disciplinas");
		
		for (Disciplina d : student.listarDisciplinas()) {
			System.err.print(d);
		}
		
		//inser��o interativa desses itens 
		//regras de neg�cio - implementa��o dos m�todos de solicitar matr�cula
		
	}

}
