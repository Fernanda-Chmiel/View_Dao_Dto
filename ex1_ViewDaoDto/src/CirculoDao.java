
import javax.swing.JOptionPane;

public class CirculoDao {
    public void calcular(CirculoDto objCirculoDto){
    double calc;
    calc = objCirculoDto.getRaio() * 3.14;
      JOptionPane.showMessageDialog(null, "área circulo: " + calc);
    }
}
