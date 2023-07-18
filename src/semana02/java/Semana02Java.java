
package semana02.java;

import java.util.Scanner;
import javax.swing.JOptionPane;
import folder.PrimeiraInterface;

public class Semana02Java {

   
    public static void main(String[] args) {
        //metodoScanner();
        //metodoJoption();
        new PrimeiraInterface();
        
}
    public static void metodoJoption(){
        String nome = JOptionPane.showInputDialog("Informe seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a sua idade?", "Idade", JOptionPane.INFORMATION_MESSAGE));
    
        int compartilhar = JOptionPane.showConfirmDialog(null,"Deseja Compartilhar suas Informações");
        if(compartilhar == JOptionPane.YES_OPTION){
            System.out.println("Você vai compartilhar suas informações");
        }else if(compartilhar == JOptionPane.CANCEL_OPTION){
            System.out.println("Você não autorizou compartilhamento, finalizamos por aqui!");
            System.exit(0);
        }
        
        int confirmar = JOptionPane.showConfirmDialog(null,"Deseja confirmar cadastro","Cadastro", JOptionPane.YES_NO_OPTION);
        if(confirmar == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null,"Seu cadastro deu certo" + nome);
        }else if(confirmar == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"deu B.O" + JOptionPane.ERROR_MESSAGE);
        }
        
            
            JOptionPane.showMessageDialog(null,"Deu certo");
        JOptionPane.showMessageDialog(null,"Mensagem Teste","teste",JOptionPane.ERROR_MESSAGE);
    
    }
    
    public static void metodoScanner(){
                //banco de dados...fake
//        String nomeAlunos[]= new String [2];
//        boolean situacaoAlunos[] = new boolean [2];
//        double alturaAlunos[] = new double[2];
//        int idadeAlunos[] = new int [2];
//        
//        for(int i =0; i< nomeAlunos.length; i++){
            Scanner leitor = new Scanner (System.in);
//            System.out.println("Informe seu nome: ");
//            nomeAlunos[i] = leitor.nextLine();
//            System.out.println("Você estuda?");
//            situacaoAlunos[i] = leitor.nextBoolean();
//            System.out.println("Qual é a sua altura?");
//            alturaAlunos[i] = leitor.nextDouble();
//            System.out.println("Qual é a sua idade?");
//            idadeAlunos[i] = leitor.nextInt();
//        }
//        
//        for(int i = 0 ; i < nomeAlunos.length; i++){
//            System.out.println("Nome: " + nomeAlunos[i]+ " Estuda: " + situacaoAlunos[i]);
//        }
            leitor.useDelimiter(",");
            
            while(leitor.hasNextInt()){
                int numero = leitor.nextInt();
                System.out.println("Numero: " +numero);
                leitor.skip(",");
            
            }





    }
    
    }
 