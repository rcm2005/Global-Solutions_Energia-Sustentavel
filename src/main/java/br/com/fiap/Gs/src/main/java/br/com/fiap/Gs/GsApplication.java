package br.com.fiap.Gs;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.fiap.Gs.repository")  // Certifique-se de que o pacote do repositório está correto
@EntityScan(basePackages = "br.com.fiap.Gs.model")  // Escaneia as entidades JPA no pacote correto
public class GsApplication {
	public static void main(String[] args) {
		SpringApplication.run(GsApplication.class, args);
	}
}
