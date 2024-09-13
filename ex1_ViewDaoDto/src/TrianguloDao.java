
import javax.swing.JOptionPane;

public class TrianguloDao {
    
    public void calcularTri( TrianguloDto objTrianguloDto){
        double calc;
        calc = objTrianguloDto.getAltura() * objTrianguloDto.getBase() /2;
        JOptionPane.showMessageDialog(null, "área do triângulo: " + calc);
    }
}
