package br.com.maratonajava.introducao;

public class Aula07 {

	public static void main(String[] args) {
		String[] nomes= {"Matheus", "Marcela", "Sabrina"};
		
		for (String i : nomes) {
			System.out.println(i);
		}
		
		String[][] trimestre = new String[4][3];
		
		trimestre[0][0]= "Janeiro";
		trimestre[0][1]= "Fevereiro";
		trimestre[0][2]= "Marco";
		trimestre[1][0]= "Abril";
		trimestre[1][1]= "Maio";
		trimestre[1][2]= "Junho";
		trimestre[2][0]= "Julho";
		trimestre[2][1]= "Agosto";
		trimestre[2][2]= "Setembro";
		trimestre[3][0]= "Outubro";
		trimestre[3][1]= "Novembro";
		trimestre[3][2]= "Dezembro";
		
		for (String[] arrBase : trimestre) {
			for (String strings : arrBase) {
				System.out.println(strings);
			}
		}

	}

}
