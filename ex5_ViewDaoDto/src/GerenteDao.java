import javax.swing.JOptionPane;

public class GerenteDao {
    public void calcularSalarioGerente(GerenteDto objGerenteDto){
        double calcSalario;
        calcSalario = objGerenteDto.getSalarioGerente() + (objGerenteDto.getHorasAdd() * 350);
        JOptionPane.showMessageDialog(null,"Salário de Gerente: " + calcSalario);
    }
}
