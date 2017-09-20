import java.io.*;
import java.nio.file.*;

class CriaArquivo {
	public static void main(String[] args) throws IOException {
		criarArquivos(
			300,
			343,
			"page",
			"C:\\workspace\\Edney\\project\\source\\exercises-java-certified\\bigDump\\answers\\300-399\\",
			".txt",
			"RIGHT ANSWER: \n(  ) \n\nWHAT HAS BEEN TESTED: \n\nEXPLANATION:\n"
			);
	}

	public static void criarArquivos(int numInicial, 
									 int numFinal, 
									 String nomeBase, 
									 String caminho, 
									 String extensao, 
									 String texto) throws IOException {
		
		for(int i = numInicial; i <= numFinal; i++) {
			Path path = Paths.get(caminho + nomeBase + i + extensao);
			
			if(Files.notExists(path)) {
				Files.createFile(path);
				Files.write(path, texto.getBytes());
			}
		}
		
		System.out.println("Arquivos criados com sucesso");
	}


}