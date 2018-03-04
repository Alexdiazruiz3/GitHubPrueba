package es.studium.GitHubPrueba;

public class GitHubPrueba{
//Prueba de modificacion onlined
	String matricula ;
	int cilindrada ;
	public GitHubPrueba() {
		matricula = "";
		cilindrada = 0;
	}
	public GitHubPrueba(String m , int c ) {
		matricula = m ;
		cilindrada = c ;
	}
	public String getMatricula () {
		return matricula ;
	}
	public int getCilindrada () {
		return cilindrada ;
	}
	public void setMatricula (String m ) {
		matricula = m ;
	}
	public void setCilindrada ( int c ) {
		cilindrada = c ;
	}
}

