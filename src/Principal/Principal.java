package Principal;

import Model.Produto;
import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
        Produto vei = new Produto();
        
        vei.setDistancia(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a distância que o veiculo percorreu:")));
        vei.setConsumo(Double.parseDouble(JOptionPane.
                showInputDialog("Digite o consumo que o veiculo realizou:")));
        JOptionPane.showMessageDialog(null, "O valor para o consumo km/l do veiculo é:" + vei.getkm());
    }
    
}
