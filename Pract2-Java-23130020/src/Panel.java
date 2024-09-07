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
                Resultado.setText(String.valueOf(sum));

            }
        });
        JButRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(PrimerNumero.getText());
                double num2 = Double.parseDouble(SegundoNumero.getText());
                double res = num1 - num2;
                Resultado.setText(String.valueOf(res));
            }
        });
        JButDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(PrimerNumero.getText());
                double num2 = Double.parseDouble(SegundoNumero.getText());
                if (num2 != 0) {
                    double div = num1 / num2;
                    Resultado.setText(String.valueOf(div));
                } else {
                    Resultado.setText("No se puede dividir por 0");

                    {
                        Resultado.setText("Por favor ingresa números válidos");
                    }


                }
                JButMultiplicar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double num1 = Double.parseDouble(PrimerNumero.getText());
                        double num2 = Double.parseDouble(SegundoNumero.getText());
                        double mult = num1 * num2;
                        Resultado.setText(String.valueOf(mult));
                    }
//ALEJANDRO
                });
            }
        }
    }





;