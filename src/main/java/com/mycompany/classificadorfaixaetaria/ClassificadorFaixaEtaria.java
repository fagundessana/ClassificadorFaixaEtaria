/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificadorfaixaetaria;
import java.util.Scanner;
/**
 *
 * @author sidne
 */

public class ClassificadorFaixaEtaria {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Neste bloco serão perguntados a idade do usuário
        try {
            System.out.println("=== CLASSIFICADOR DE FAIXA ETÁRIA ===");
            System.out.print("Digite sua idade: ");//mensagem ao usuário
            
            int idade = scanner.nextInt();
            
            if (idade <= 0) {// se a idade for menor ou igual a zero, será exibido uma mensagem de erro
                System.out.println("ERRO: Idade não pode ser negativa ou igual a zero! Coloque sua idade em anos");
                return;
            }
            
            if (idade >= 150) { // se a idade for maior ou igual a 150, será exibido uma mensagem de erro
                System.out.println("ERRO: Voce nao e um vampiro!! Digite uma idade realista.");
                return;
            }
            
            // Neste bloco são definidos os código para cada faixa etária
            int codigoFaixa;
            if (idade >= 1 && idade <= 12) {
                codigoFaixa = 1; // Código 1 = Criança
            } else if (idade >= 13 && idade <= 17) {
                codigoFaixa = 2; // Código 2 = Adolescente
            } else if (idade >= 18 && idade <= 59) {
                codigoFaixa = 3; // Código 3 = Adulto
            } else {
                codigoFaixa = 4; // Código 4 = Idoso (60+)
            }
            
            // Aqui o programa irá reunir os dados informados e classificar o usuário em uma das classificações
            System.out.println("\n=== RESULTADO DA CLASSIFICAÇÃO ===");
            System.out.println("Idade informada: " + idade + " anos");
            
            // A partir desse bloco inicia-se o switch case
            switch (codigoFaixa) {
                case 1: // código 1 - criança
                    System.out.println("Classificação: CRIANÇA (1-12 anos)");
                    System.out.println("Características: Fase de desenvolvimento físico e cognitivo.");
                    System.out.println("Atividades recomendadas: Brincadeiras, educação básica, esportes leves.");
                    break;
                    
                case 2: // código 2 - adolescente
                    System.out.println("Classificação: ADOLESCENTE (13-17 anos)");
                    System.out.println("Características: Fase de transição para a vida adulta.");
                    System.out.println("Atividades recomendadas: Estudos, esportes, desenvolvimento de habilidades.");
                    break;
                    
                case 3: // código 3 - adulto
                    System.out.println("Classificação: ADULTO (18-59 anos)");
                    System.out.println("Características: Fase de maior produtividade e responsabilidades.");
                    System.out.println("Atividades recomendadas: Trabalho, família, exercícios regulares.");
                    break;
                    
                case 4: // código 4 - idoso (+60)
                    System.out.println("Classificação: IDOSO (60+ anos)");
                    System.out.println("Características: Fase de sabedoria e experiência de vida.");
                    System.out.println("Atividades recomendadas: Atividades leves, convívio social, hobbies.");
                    break;
                    
                default: 
                    System.out.println("ERRO: Código de faixa etária inválido!"); // mensagem de erro
                    break;
            }
            
            // Informações adicionais baseadas na idade
            System.out.println("\n=== INFORMAÇÕES ADICIONAIS ===");
            switch (codigoFaixa) {
                case 1: // criança
                    if (idade <= 2) {
                        System.out.println("Subfaixa: Primeira infância - Desenvolvimento motor básico");
                    } else if (idade <= 5) {
                        System.out.println("Subfaixa: Pré-escolar - Desenvolvimento da linguagem");
                    } else {
                        System.out.println("Subfaixa: Escolar - Alfabetização e socialização");
                    }
                    break;
                    
                case 2:
                    if (idade <= 15) { // se a idade for menor ou igual a 15, será exibido as seguintes mensagens:
                        System.out.println("Subfaixa: Adolescência inicial - Mudanças físicas intensas");
                    } else { 
                        System.out.println("Subfaixa: Adolescência tardia - Preparação para vida adulta");
                    }
                    break;
                    
                case 3:
                    if (idade <= 30) {// se a idade for menor ou igual a 30, será exibido a seguinte mensagem:
                        System.out.println("Subfaixa: Jovem adulto - Estabelecimento de carreira");
                    } else if (idade <= 45) { // então se a idade for menor ou igual a 45, será exibido as seguintes mensagens:
                        System.out.println("Subfaixa: Meia-idade inicial - Estabilidade profissional");
                    } else {
                        System.out.println("Subfaixa: Meia-idade tardia - Preparação para aposentadoria");
                    }
                    break;
                    
                case 4:
                    if (idade <= 75) { // se a idade for menor ou igual a 75, será exibido as seguintes mensagens:
                        System.out.println("Subfaixa: Terceira idade ativa - Manutenção da independência");
                    } else {
                        System.out.println("Subfaixa: Terceira idade avançada - Cuidados especiais");
                    }
                    break;
            }
            
        } catch (Exception e) { //nesse caso, o catch funcionará para tratar algum erro
            System.out.println("\nERRO: Por favor, digite apenas números inteiros!");// mensagem de erro
            System.out.println("Exemplo: 25 (para 25 anos)"); // exibe um exemplo do padrão correspondente
            
        } finally { 
            // e por fim exibe uma mensagem final
            System.out.println("\nObrigado por usar o Classificador de Faixa Etária!");
            scanner.close(); // fecha o scanner
        }
    }
}