package folder;

//import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraInterface {
    
    public PrimeiraInterface(){
    JFrame janela = new JFrame("Primeira Janela");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setLocationRelativeTo(null);
    janela.setSize(400,300);
    
    janela.setLayout(null); //decide onde colocar os botoes
    
    JButton botao = new JButton("Clique Aqui");
    botao.setBounds(100,100,150,25);
    
    JLabel texto = new JLabel("Texto Padrão");
    texto.setBounds(200, 200, 150, 50);
    
    JTextField input = new JTextField();
    input.setBounds(200, 300, 150, 50);
    
    
    
    
    botao.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String mensagem = input.getText();
            texto.setText(mensagem);
        }
    });
    
    janela.add(input);
    janela.add(texto);
    janela.add(botao);
    janela.setVisible(true);
    
    }
    
}
