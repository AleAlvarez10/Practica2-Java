import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Panel {
    private JPanel panel1;
    private JButton JButSumar;
    private JButton JButRestar;
    private JButton JButDividir;
    private JButton JButMultiplicar;
    private JLabel PrimerNumero;
    private JLabel SegundoNumero;
    private JLabel Resultado;




    public Panel() {
        JButSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                double num1 = Double.parseDouble(PrimerNumero.getText());
                double num2 = Double.parseDouble(SegundoNumero.getText());
                double sum = num1 + num2;
                Resultado.setText(sum);

            }
        });
        JButRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(PrimerNumero.getText());
                double num2 = Double.parseDouble(SegundoNumero.getText());
                double res = num1 - num2;
                resultado.setText(res);
            }
        });
        JButDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(PrimerNumero.getText());
                double num2 = Double.parseDouble(SegundoNumero.getText());
                if (num2 != 0) {
                    double div = num1 / num2;
                    resultado.setText(div);
                } else {
                    resultado.setText("No se puede dividir por 0");
                }
            } catch(
            NumberFormatException ex)

            {
                resultado.setText("Por favor ingresa números válidos");
            }


        });
        JButMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double mult = num1 * num2;
                resultado.setText(mult);
            } catch (NumberFormatException ex) {
                resultado.setText("Por favor ingresa números válidos");
            }
            }
        });

    }


