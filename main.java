package Ricardo;


public class main {

	public static void main(String[] args) {
		
		professor mestre_1  = new professor("Ricardo","mestre","informatica", "ifSP");	
		professor mestre_2  = new professor("Maike","mestre","INFRA", "ifBA");	
		professor mestre_3  = new professor("Carlos","mestre","devOPS", "ifSE");	
		professor doutor  = new professor("José","doutor","devOPS", "ifs");	
		
		departamento d1 = new departamento ("CBSI", "Cordenação","Lagarto");
		d1.coordenador = new professor("catuxe","mestre","devOPS","ifsq");
		
		
		departamento d2 = new departamento("IRC","Coordenação do Integrado em RC", "Lagarto");
	       d2.coordenador = mestre_3;
		
	    System.out.println("Total de professores cadastrados: " + professor.contador);
	    System.out.println("\n");
	    System.out.printf("Total de Mestres: %d\nTotal de Doutores: %d\n", professor.getTotal_mestre(),professor.getTotal_doutor());
	    System.out.println("\n");    
		System.out.format("Nome: %s\nTitulação: %s\nÁrea de atuação: %s\nInstituição da sua titulação: %s\nMatrícula: %d\n ", mestre_1.getNome(),mestre_1.getTitulacao(),mestre_1.getArea(),mestre_1.getInstituicao(),mestre_1.getMatricula());
		System.out.println("\n");
		System.out.format("Nome: %s\nTitulação: %s\nÁrea de atuação: %s\nInstituição da sua titulação: %s\nMatrícula: %d\n ", mestre_2.getNome(),mestre_2.getTitulacao(),mestre_2.getArea(),mestre_2.getInstituicao(),mestre_2.getMatricula());
		System.out.println("\n");
		System.out.format("Nome: %s\nTitulação: %s\nÁrea de atuação: %s\nInstituição da sua titulação: %s\nMatrícula: %d\n ", mestre_3.getNome(),mestre_3.getTitulacao(),mestre_3.getArea(),mestre_3.getInstituicao(),mestre_3.getMatricula());
		System.out.println("\n");
		System.out.format("Nome: %s\nTitulação: %s\nÁrea de atuação: %s\nInstituição da sua titulação: %s\nMatrícula: %d\n ", doutor.getNome(),doutor.getTitulacao(),doutor.getArea(),doutor.getInstituicao(),doutor.getMatricula());
		System.out.println("\n");
		System.out.format("Nome: %s\nTitulação: %s\nÁrea de atuação: %s\nInstituição da sua titulação: %s\nMatrícula: %d\n ",d1.coordenador.nome,d1.coordenador.titulacao,d1.coordenador.area,d1.coordenador.instituicao,d1.coordenador.matricula);
		System.out.println("\n"); 
		d1.coordenador = mestre_2;
		System.out.format("Coordenador: %s\n",d1.coordenador.nome);
		System.out.println("\n");
		System.out.format("Coordenador: %s\n",d2.coordenador.nome);

	}

}