package view;

import javax.swing.JOptionPane;

import model.ApartamentoController;

public class main {

	public static void main(String[] args) {
		ApartamentoController ap = new ApartamentoController();
		int opc=0;
		while(opc!=9) {
			opc=Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar Morador\n2-Consultar Morador\n3-Excluir Morador\n4-Listar Moradores por Andar\n9-Finalizar Sistema"));
			switch(opc) {
				case 1: ap.CadastraMorador();
						break;
				case 2: ap.ConsultaMorador();;
						break;
				case 3: ap.ExcluirMorador();;
						break;
				case 4: ap.ListaMorador();
						break;
				case 9: JOptionPane.showMessageDialog(null, "Sistema Finalizado");
						break;
				default: JOptionPane.showMessageDialog(null, "Opção Invalida");
						break;
			}
		}
	}

}
