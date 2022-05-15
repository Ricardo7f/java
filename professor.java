package Ricardo;

public class professor {

String nome;
public String titulacao;
String area;
String instituicao;
int matricula;


static int contador=0;
static int total_mestre;
static int total_doutor;







public professor(String nome, String titulacao, String area, String instituicao) {
	this.nome = nome;
	this.titulacao = titulacao;
	this.area = area;
	this.instituicao = instituicao;
	contador++;
	this.matricula= contador;
	
	if (titulacao.equalsIgnoreCase("Mestre")) {
		total_mestre++;
	} else if (titulacao.equalsIgnoreCase("Doutor")) {
		total_doutor++;
	}
}



public professor(int contador) {
	this.contador = contador;
}



public static int getTotal_mestre() {
	return total_mestre;
}



public static void setTotal_mestre(int total_mestre) {
	professor.total_mestre = total_mestre;
}



public static int getTotal_doutor() {
	return total_doutor;
}



public static void setTotal_doutor(int total_doutor) {
	professor.total_doutor = total_doutor;
}



public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTitulacao() {
	return titulacao;
}

public void setTitulacao(String titulacao) {
	this.titulacao = titulacao;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public String getInstituicao() {
	return instituicao;
}

public void setInstituicao(String instituicao) {
	this.instituicao = instituicao;
}

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}


	
	
	
}
