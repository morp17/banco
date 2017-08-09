package main;

import java.util.Arrays;

import entity.Dependente;
import entity.Funcionario;

public class Principal {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Luis");
		f.setMatricula(12345);
		f.setSalario(100000.0);
		
		
		Dependente d = new Dependente();
		d.setNome("Sonia");
		d.setIdade(67);
		
		f.setDependentes(Arrays.asList(d));
		d.setFuncionario(f);
		
		System.out.println(f);
	}
}
