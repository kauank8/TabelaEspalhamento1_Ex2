package model;

import javax.swing.JOptionPane;

import br.com.KauanPaulino.ListaObject.Lista_Object;

public class ApartamentoController {
	Lista_Object[] vtlista = new Lista_Object[10];
	//Construtor
	public ApartamentoController() {
		for(int i=0;i<10;i++) {
			vtlista[i]=new Lista_Object();
		}
	}
	
	//Metodos
	//Cadastrar Morador
	public void CadastraMorador() {
		Morador m = new Morador();
		m.setNome(JOptionPane.showInputDialog("Digite o nome do morador"));
		
		int numeroap=(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Apartamento")));;
		while(numeroap < 100 || numeroap >1002) {
			JOptionPane.showMessageDialog(null, "Numero invalido O Ap contem 10 andares, digite um numero valido");
			numeroap=(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Apartamento")));
		}
		
		m.setNumeroAp(numeroap);
		m.setModeloCarro(JOptionPane.showInputDialog("Digite o modelo do carro"));
		m.setPlacaCarro(JOptionPane.showInputDialog("Digite a placa do carro"));
		m.setCor(JOptionPane.showInputDialog("Digite a cor do carro"));
		TabelaEspalhamento(m);
	}
	
	//Tabela Espalhamento
	private void TabelaEspalhamento(Morador m) {
		int hash=HashCode(m.getNumeroAp());
		if(vtlista[hash].isEmpty()) {
			vtlista[hash].addFirst(m);
		}
		else {
			try {
				vtlista[hash].addLast(m);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//HashCode
	private int HashCode(int numeroAp) {
		String n = Integer.toString(numeroAp);
		int tamanho=n.length();
		int pos=0;
		if(tamanho<4) {
			String primeiro=n.substring(0,1);
			int numero=Integer.parseInt(primeiro);
			pos=(numero-1);
		}
		else {
			String primeiros = n.substring(0,2);
			int doisP=Integer.parseInt(primeiros);
			pos=doisP-1;
		}
		
		return pos;
		
	}
	
	//Excluir Morador
	public void ExcluirMorador() {
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do apartamento do morador"));
		int hash=HashCode(numero);
		int tamanho=vtlista[hash].size();
		Boolean status=false;
		for(int i=0;i<tamanho;i++) {
			try {
				Morador m=(Morador) vtlista[hash].get(i);
				if(m.getNumeroAp()==numero) {
					vtlista[hash].remove(i);
					status=true;
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		if(!status) {
			JOptionPane.showMessageDialog(null, "Numero de ap não existe ou não possui morador");
		}
	}
	
	//ConsultaMorador
	public void ConsultaMorador() {
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do apartamento do morador"));
		int hash=HashCode(numero);
		int tamanho=vtlista[hash].size();
		Boolean status=false;
		for(int i=0;i<tamanho;i++) {
			try {
				Morador m=(Morador) vtlista[hash].get(i);
				if(m.getNumeroAp()==numero) {
					System.out.println(m);
					status=true;
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!status) {
			JOptionPane.showMessageDialog(null, "Numero de ap não existe ou não possui morador");
		}
	}
	
	//ListaMorador
	public void ListaMorador() {
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o andar dos apartamentos"));
		while(numero<1 || numero>10) {
			JOptionPane.showMessageDialog(null, "Andar invalido");
			numero=Integer.parseInt("Digite o andar dos apartamentos");
		}
		int tamanho=vtlista[numero-1].size();
		for(int i=0;i<tamanho;i++) {
			Morador m = new Morador();
			try {
				m=(Morador) vtlista[numero-1].get(i);
				System.out.println(m);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
