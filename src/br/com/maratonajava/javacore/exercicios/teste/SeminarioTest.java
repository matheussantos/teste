package br.com.maratonajava.javacore.exercicios.teste;

import br.com.maratonajava.javacore.exercicios.dominio.Aluno;
import br.com.maratonajava.javacore.exercicios.dominio.Local;
import br.com.maratonajava.javacore.exercicios.dominio.Professor;
import br.com.maratonajava.javacore.exercicios.dominio.Seminario;

public class SeminarioTest {

	public static void main(String[] args) {
		Local local = new Local("Rua Bitencourt Sampaio");
		Local local2 = new Local("Frei Caneca");
		
		Aluno aluno = new Aluno("Matheus", 31);
		Aluno aluno2 = new Aluno("Marcela", 32);
		Aluno aluno3 = new Aluno("Sabrina", 36);
		Aluno aluno4 = new Aluno("Luis", 65);
		Aluno[] alunos = {aluno, aluno2, aluno3};
		Aluno[] alunos1 = {aluno, aluno2};
		Aluno[] alunos2 = {aluno3, aluno4};
		
		Seminario seminario = new Seminario("JAVA");
		Seminario seminario2 = new Seminario("Angular");
		Seminario[] seminarios = {seminario,seminario2};
		
		Professor professor = new Professor("Ivan", "Programação");
		
		seminario.setAlunos(alunos1);
		seminario.setLocal(local);
		seminario2.setAlunos(alunos2);
		seminario2.setLocal(local2);
		
		aluno.setSeminario(seminario2);
		aluno2.setSeminario(seminario);
		aluno3.setSeminario(seminario);
		
		professor.setSeminarios(seminarios);
		
//		seminario.imprime();
//		seminario2.imprime();
//		
//		aluno.imprime();
//		aluno2.imprime();
//		aluno3.imprime();
		
		professor.imprime();
		
//		local.imprime();
		
	}

}
