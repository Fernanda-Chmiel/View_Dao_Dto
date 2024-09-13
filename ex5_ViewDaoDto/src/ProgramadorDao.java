import javax.swing.JOptionPane;

public class ProgramadorDao {
    public void calcularSalario(ProgramadorDto objProgamadorDto){
    double calcSalario;
    calcSalario = objProgamadorDto.getSalario() + (objProgamadorDto.getHorasAdd() * 100 );
    JOptionPane.showMessageDialog(null ,"Salário de Programador: " + calcSalario);
    }
}
