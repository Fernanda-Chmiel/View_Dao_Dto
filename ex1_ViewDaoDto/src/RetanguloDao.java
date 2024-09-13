
import javax.swing.JOptionPane;

public class RetanguloDao {
    public void calcularRet(RetanguloDto objRetanguloDto ){
    double calc;
    calc = objRetanguloDto.getAltura() * objRetanguloDto.getBase();
    JOptionPane.showMessageDialog(null, "área retângulo: " + calc);
}
}
