package mainSentaBota;
import java.util.Scanner;
import mainSentaBotaClasses.Venda;
import mainSentaBotaClasses.Calcado;
import mainSentaBotaClasses.Funcionario;
import mainSentaBotaClasses.NotaFiscal;

public class mainStore {

	public static void main(String[] args) {
		
		menuPrincipal();
		
		System.out.println("Volte sempre :D");
		
		

	}


    public static Calcado calcados(int x) {
    	Calcado tenis1,tenis2,tenis3,tenis4,tenis5,tenis6;
    	tenis1 = new Calcado(38,28,"amarelo",5);
    	tenis2 = new Calcado(36,49,"azul",2);
    	tenis3 = new Calcado(40,82,"verde",3);
    	tenis4 = new Calcado(42,82,"laranja",10);
    	tenis5 = new Calcado(38,99,"roxo",20);
    	tenis6 = new Calcado(40,150,"amarelo",8);
    	
    	if(x==1) {
    		return tenis1;
    	}else if(x==2) {
    		return tenis2;
    	}else if(x==3) {
        	return tenis3;
    	}else if(x==4) {
        	return tenis4;
    	}else if(x==5) {
        	return tenis5;
    	}else if(x==6) {
        	return tenis6;
    	}else {
    		return tenis1;
    	}
   
    }
  
    public static void estoque() {
    	
    	Scanner sc = new Scanner(System.in);
		
    	System.out.println("bem vindo ao estoque, para averiguar a quantia em estoque de algum "
    			+ "calcado, digite 1, para adicionar itens ao estoque digite 2,"
    			+ " para fechar o estoque digite 3.\n");
    	
    	int estoqueaberto = sc.nextInt();
    	
    	int fecharestoque = 0;
    	int fechar = 0;
    	do {
    		switch(estoqueaberto) {
        	case 1:
        		System.out.println("digite o numero do calcado a ter seu estoque averiguado (de 1 a 6), digite 7 "
        				+ "quando desejar fechar esta funcao\n");
        		
        		do {
        			int estoqueDes = sc.nextInt();
        			switch (estoqueDes) {
        				case 1:
        					System.out.println("numero em estoque: "+calcados(1).getEstoque());
        					break;
        				case 2:
        					System.out.println("numero em estoque: "+calcados(2).getEstoque());
        					break;
        				case 3:
        					System.out.println("numero em estoque: "+calcados(3).getEstoque());
        					break;
        				case 4:
        					System.out.println("numero em estoque: "+calcados(4).getEstoque());
        					break;
        				case 5:
        					System.out.println("numero em estoque: "+calcados(5).getEstoque());
        					break;
        				case 6:
        					System.out.println("numero em estoque: "+calcados(6).getEstoque());
        					break;
        				case 7:
        					fechar = 7;
        					break;
        			}
        			
        		}while(fechar != 7);
        	    break;
        	case 2:
                System.out.println("Digite o numero do calcado cujo estoque sera aumentado (de 1 a 7),"
                		+ "digite 7 para fechar essa funcionalidade");
        		int fecharADD = 0;
    	        do {
    		        int x = 0;
    		        int estoqueDes = sc.nextInt();
    		        
    		        switch (estoqueDes) {
    		        	case 1:
    				        x = sc.nextInt();
    				        calcados(1).addEstoque(x);
    				        break;
    			        case 2:
    				        x = sc.nextInt();
    				        calcados(2).addEstoque(x);
    				        break;
    			        case 3:
    				        x = sc.nextInt();
    				        calcados(3).addEstoque(x);
    				        break;
    			        case 4:
    				        x = sc.nextInt();
    			         	calcados(4).addEstoque(x);
    			        	break;
    			        case 5:
    			        	x = sc.nextInt();
    			        	calcados(5).addEstoque(x);
    			        	break;
    			        case 6:
    			        	x = sc.nextInt();
    			        	calcados(6).addEstoque(x);
    			        	break;
    			        case 7:
    				        fecharADD = 7;
    				        break;
    		          }
    		
    	        }while(fecharADD != 7);
    	        break;
        	case 3:
        		fecharestoque = 3;
        		break;	
            }
    	}while(fecharestoque != 3);
    	sc.close();
    	
    }

    public static void vitrine() {

    	Scanner sc = new Scanner(System.in);
    	Venda carrinhof;
		carrinhof = new Venda();
    	
			System.out.println("Bem vindo a vitrine, sinta-se a vontade para olhar,"
        			+ "\npara olhar melhor um tenis, digite seu numero correspondente (de 1 a 7),"
        			+ "\npara adicionar o tenis ao carrinho, digite 2, para sair da vitrine"
        			+ " digite 7");
			int valorCarrinho = 0;
			int fechaVitrine = 0;
			do {
        		int opcaoVitrine = sc.nextInt();
        		int carrinhoOuOlhadinha = 0;
        		switch(opcaoVitrine) {
        		case 1:
        			System.out.println("\n" + calcados(1).toString() + "\n");
        			System.out.println("caso desejar adicionar este tenis ao carrinho digite 2,"
        					+ " ou qualquer tecla para voltar a vitrine \n");
        			carrinhoOuOlhadinha = sc.nextInt();
        			if(carrinhoOuOlhadinha==2) {
        				if(calcados(1).getEstoque()>0) {
        					calcados(1).subEstoque(1);
        					valorCarrinho += calcados(1).getPrice();   
        					System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        					break;
        				}else{
        					System.out.println("Calçado indisponivel no momento, tente outra opcao");
        					break;
        				}
        			}else {
        				System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        				break;
        			}
        			
        		case 2:
        			System.out.println("\n" + calcados(2).toString() + "\n");
        			System.out.println("caso desejar adicionar este tenis ao carrinho digite 2, "
        					+ " ou qualquer tecla para voltar a vitrine \n");
        			carrinhoOuOlhadinha = sc.nextInt();
        			if(carrinhoOuOlhadinha==2) {
        				if(calcados(2).getEstoque()>0) {
        					calcados(2).subEstoque(1);
        					valorCarrinho += calcados(2).getPrice();   
        					System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        					break;
        				}else{
        					System.out.println("Calçado indisponivel no momento, tente outra opcao");
        					break;
        				}
        			}else {
        				System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        				break;
        			}
        		case 3:
        			System.out.println("\n" + calcados(3).toString() + "\n");
        			System.out.println("caso desejar adicionar este tenis ao carrinho digite 2,"
        					+ " ou qualquer tecla para voltar a vitrine\n");
        			carrinhoOuOlhadinha = sc.nextInt();
        			if(carrinhoOuOlhadinha==2) {
        				if(calcados(3).getEstoque()>0) {
        					calcados(3).subEstoque(1);
        					valorCarrinho += calcados(3).getPrice();   
        					System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        					break;
        				}else{
        					System.out.println("Calçado indisponivel no momento, tente outra opcao");
        					break;
        				}
        			}else {
        				System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        				break;
        			}
        		case 4:
        			System.out.println("\n" + calcados(4).toString() + "\n");
        			System.out.println("caso desejar adicionar este tenis ao carrinho digite 2, "
        					+ " ou qualquer tecla para voltar a vitrine\n");
        			carrinhoOuOlhadinha = sc.nextInt();
        			if(carrinhoOuOlhadinha==2) {
        				if(calcados(4).getEstoque()>0) {
        					calcados(4).subEstoque(1);
        					valorCarrinho += calcados(4).getPrice();   
        					System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        					break;
        				}else{
        					System.out.println("Calçado indisponivel no momento, tente outra opcao");
        					break;
        				}
        			}else {
        				System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        				break;
        			}
        		case 5:
        			System.out.println("\n" + calcados(5).toString() + "\n");
        			System.out.println("caso desejar adicionar este tenis ao carrinho digite 2,  "
        					+ " ou qualquer tecla para voltar a vitrine\n");
        			carrinhoOuOlhadinha = sc.nextInt();
        			if(carrinhoOuOlhadinha==2) {
        				if(calcados(5).getEstoque()>0) {
        					calcados(5).subEstoque(1);
        					valorCarrinho += calcados(5).getPrice();   
        					System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        					break;
        				}else{
        					System.out.println("Calçado indisponivel no momento, tente outra opcao");
        					break;
        				}
        			}else {
        				System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        				break;
        			}
        		case 6:
        			System.out.println("\n" + calcados(6).toString() + "\n");
        			System.out.println("caso desejar adicionar este tenis ao carrinho digite 2,  "
        					+ "ou qualquer tecla para voltar a vitrine\n");
        			carrinhoOuOlhadinha = sc.nextInt();
        			if(carrinhoOuOlhadinha==2) {
        				if(calcados(6).getEstoque()>0) {
        					calcados(6).subEstoque(1);
        					valorCarrinho += calcados(6).getPrice();   
        					System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        					break;
        				}else{
        					System.out.println("Calçado indisponivel no momento, tente outra opcao");
        					break;
        				}
        			}else {
        				System.out.println("Para olhar outro tenis, digite novamente o numero correspondente ao produto"
        						+ "\n para sair da vitrine digite 7");
        				break;
        			}
        		case 7:
        			fechaVitrine = 7;
        			break;
        		
        		}
        	}while(fechaVitrine!=7);
			System.out.println("\nO valor total em seu carrinho e de: " + valorCarrinho);
			carrinhof.adicionaCarrinho(valorCarrinho);
			System.out.println("\nPara finalizar a compra, antes vamos realizar o cadastro, por favor ");
	    	String nome, pais, cidade, cartao, cpf;
	    	
	    	System.out.println("\nDigite aqui seu nome: ");
	    	nome = sc.next();    	
	    	System.out.println("\nDigite aqui seu pais: ");    	
	    	pais = sc.next();  
	    	System.out.println("\nDigite aqui sua cidade: ");
	    	cidade = sc.next();  
	    	System.out.println("\nDigite aqui o numero de seu cartao: ");
	    	cartao = sc.next();  
	    	System.out.println("\nDigite aqui o numero de seu cpf: ");
	    	cpf = sc.next(); 
	    	
	    	
	    	NotaFiscal cliente1;
	    	cliente1 = new NotaFiscal(pais, cidade, nome, cartao, cpf);
	    	
	    	System.out.println("\nCadastro realizado, valor da compra:  " + carrinhof.getCarValue());
	    	
	    	System.out.println("\nCompra efetuada, comprovante a baixo\n");
	    	System.out.println(cliente1.toString());
	    	System.out.println("\nvalor pago: " + carrinhof.getCarValue());
	    	
        	
   
    	sc.close();
    	
	}
		
    public static void menuPrincipal(){
    	Scanner sc = new Scanner(System.in);
    	int var = 0;
    	Funcionario admin;
    	admin = new Funcionario();
    	int id;
    	
    	System.out.println("Bem vindo a Senta Bota Store"
    			+ " digite 1 se voce for cliente e 2 se for funcionario");
    	var = sc.nextInt();
    	if(var == 1) {
    		vitrine();
  
    	}else if(var == 2) {
    		System.out.println("Porfavor digite seu ID (digita 112233, mas finge que eu nao contei)");
    		id = sc.nextInt();
    		admin.setId(id);
    		if(admin.getId()==autenticacaoAdmin()) {
    			estoque();
    		}else {
    			System.out.println("opcao invalida");
    		}
    	}else {
    		System.out.println("opcao invalida");
    	}
    	
    	
    	
    	
    	
    	sc.close();
    }
    
    public static int autenticacaoAdmin() {
    	int admnistradorid = 112233;
    	return admnistradorid;
    }
}
