import java.awt.FlowLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;    

//Classe "CalculadoraFN" herda a classe JFrame
public class CalculadoraFN extends JFrame{
    // Criação da caixa de texto(JTextField) e especificação do seu tamanho
    private JTextField campoTxt = new JTextField(20);   

    // Criação dos Butões(JButtton)  
    private JButton bt_somar = new JButton(" +");  
    private JButton bt_subtrair = new JButton("-");  
    private JButton bt_multiplicar = new JButton("x");  
    private JButton bt_dividir = new JButton(" /");  
    private JButton bt_cls = new JButton("c");  
    private JButton bt_igual = new JButton("=");  
    private JButton bt_9 = new JButton("9");  
    private JButton bt_8 = new JButton("8");  
    private JButton bt_7 = new JButton("7");  
    private JButton bt_6 = new JButton("6");  
    private JButton bt_5 = new JButton("5");  
    private JButton bt_4 = new JButton("4");  
    private JButton bt_3 = new JButton("3");  
    private JButton bt_2 = new JButton("2");  
    private JButton bt_1 = new JButton("1");  
    private JButton bt_0 = new JButton(" 0 ");

    private JButton bt_raiz = new JButton("Sqrt");
    private JButton bt_potencia = new JButton("Exp");
    private JButton bt_seno = new JButton("Sin");
    private JButton bt_cosseno = new JButton("Cos");
    private JButton bt_tangente = new JButton("Tan");
    private JButton bt_factorial = new JButton("n! ");
    private JButton bt_pi = new JButton(" Pi ");

    // Construtor da classe "CalculadoraFN"
    public CalculadoraFN(){	
        super("FN 2013"); // Título da moldura, chamada na classe JFrame   
        this.setBounds(160, 160, 240, 230); // Dita o tamanho e a localização do JFrame  
        this.setLayout(new FlowLayout()); // Um layout pronto da classe  
        this.setResizable(false); // Não será permitido mudar o tamanho da janela          

        // Adição dos botões no JFrame  
        this.add(campoTxt);  
        this.add(bt_7);  
        this.add(bt_8);          
        this.add(bt_9);  
        this.add(bt_dividir);
        this.add(bt_multiplicar);
        this.add(bt_4);  
        this.add(bt_5);         
        this.add(bt_6);  
        this.add(bt_somar);
        this.add(bt_subtrair);
        this.add(bt_1);  
        this.add(bt_2);  
        this.add(bt_3);  
        this.add(bt_cls);
        this.add(bt_igual);  
        this.add(bt_0);
        this.add(bt_seno);
        this.add(bt_cosseno);
        this.add(bt_tangente);
        this.add(bt_potencia);
        this.add(bt_raiz);
        this.add(bt_factorial);
        this.add(bt_pi);

        Eventos calculos = new Eventos(); // Criação do objeto "calculos" para se criar a classe interna "Eventos"  

        // Adição do "ActionListener" aos botões(JButton)  
        bt_0.addActionListener(calculos);  
        bt_1.addActionListener(calculos);  
        bt_2.addActionListener(calculos);  
        bt_3.addActionListener(calculos);  
        bt_4.addActionListener(calculos);  
        bt_5.addActionListener(calculos);  
        bt_6.addActionListener(calculos);  
        bt_7.addActionListener(calculos);  
        bt_8.addActionListener(calculos);  
        bt_9.addActionListener(calculos);  
        bt_cls.addActionListener(calculos);  
        bt_somar.addActionListener(calculos);  
        bt_subtrair.addActionListener(calculos);  
        bt_multiplicar.addActionListener(calculos);  
        bt_dividir.addActionListener(calculos);  
        bt_igual.addActionListener(calculos);

        bt_seno.addActionListener(calculos);
        bt_cosseno.addActionListener(calculos);
        bt_tangente.addActionListener(calculos);
        bt_potencia.addActionListener(calculos);
        bt_raiz.addActionListener(calculos);
        bt_factorial.addActionListener(calculos);
        bt_pi.addActionListener(calculos);

    } // fim do construtor    

    // Classe interna, com implementação "ActionListener" para tratamento de eventos
    private class Eventos implements ActionListener{  
       double rs, numero1 , numero2;  
       char operador; // Operador para cada sinal  

       // Método que detecta os eventos
       public void actionPerformed(ActionEvent e){         
           // Condição das ações de clique nos botões(JButton)  
           if(e.getSource() == bt_0){                          
               campoTxt.setText(campoTxt.getText() + bt_0.getText());              
           }  

           if(e.getSource() == bt_1){  
               campoTxt.setText(campoTxt.getText() + bt_1.getText());  
           }

           if(e.getSource() == bt_2){  
               campoTxt.setText(campoTxt.getText() + bt_2.getText());  
           }

           if(e.getSource() == bt_3){  
               campoTxt.setText(campoTxt.getText() + bt_3.getText());  
           }  

           if(e.getSource() == bt_4){  
               campoTxt.setText(campoTxt.getText() + bt_4.getText());  
           }

           if(e.getSource() == bt_5){  
               campoTxt.setText(campoTxt.getText() + bt_5.getText());  
           }  

           if(e.getSource() == bt_6){  
               campoTxt.setText(campoTxt.getText() + bt_6.getText());  
           }  

           if(e.getSource() == bt_7){  
               campoTxt.setText(campoTxt.getText() + bt_7.getText());  
           }  

           if(e.getSource() == bt_8){  
               campoTxt.setText(campoTxt.getText() + bt_8.getText());  
           }  

           if(e.getSource() == bt_9){  
               campoTxt.setText(campoTxt.getText() + bt_9.getText());  
           }  

           if(e.getSource() == bt_cls){  
               campoTxt.setText(""); // "Esvazia" o JTextField  
           }         

           if (e.getSource()== bt_subtrair){  
               numero1 = Double.parseDouble(campoTxt.getText());                          
               campoTxt.setText("");  
               operador = '-';  
           }         

           if (e.getSource()== bt_multiplicar){  
               numero1 = Double.parseDouble(campoTxt.getText());                          
               campoTxt.setText("");  
               operador = '*';          
           }  

           if (e.getSource()== bt_dividir){  
               numero1 = Double.parseDouble(campoTxt.getText());                          
               campoTxt.setText("");  
               operador = '/';          
           }         

           if(e.getSource() == bt_somar){  
               numero1 = Double.parseDouble(campoTxt.getText());                          
               campoTxt.setText("");         
               operador = '+';  
           }  

           if(e.getSource() == bt_potencia){  
               numero1 = Double.parseDouble(campoTxt.getText());                          
               campoTxt.setText("");         
               operador = 'e';  
           }

           if(e.getSource() == bt_seno){  
               numero1 = Double.parseDouble(campoTxt.getText());                          
               campoTxt.setText("");         
               campoTxt.setText("" + Math.sin(numero1));
           }

           if(e.getSource() == bt_cosseno){  
               numero1 = Double.parseDouble(campoTxt.getText());                          
               campoTxt.setText("");         
               campoTxt.setText("" + Math.cos(numero1));  
           }

           if(e.getSource() == bt_tangente){  
               numero1 = Double.parseDouble(campoTxt.getText());                          
               campoTxt.setText("");         
               campoTxt.setText("" + Math.tan(numero1));  
           }

           if(e.getSource() == bt_raiz){  
               numero1 = Double.parseDouble(campoTxt.getText());                          
               campoTxt.setText("");         
               campoTxt.setText("" + Math.sqrt(numero1));  
           }

           if(e.getSource() == bt_factorial){  
               numero1 = Integer.parseInt(campoTxt.getText());                          
               campoTxt.setText("");
               int fact = 1;

               if(numero1==0 || numero1==1)
                   campoTxt.setText("" + fact);

               if(numero1>1){
                   for(int i=1;i<=numero1;i++){
                           fact*=i;
                   }
                   campoTxt.setText("" + fact);
               }  
           }

           if(e.getSource() == bt_pi){                           
               campoTxt.setText("");         
               campoTxt.setText("" + Math.PI);  
           }

           if(e.getSource() == bt_igual){
                   numero2 = Double.parseDouble(campoTxt.getText());             

               switch(operador){  
                  case '+': rs = (numero1 + numero2);break;  
                  case '-': rs = (numero1 - numero2);break;
                  case '*': rs = (numero1 * numero2);break;
                  case '/': rs = (numero1 / numero2);break;
                  case 'e': rs = Math.pow(numero1, numero2);break;
              }  
              campoTxt.setText("" + rs);   
           }               
       }     
   }
   
   public static void main (String[] args){
        // Criação do objeto do tipo calculadora
	CalculadoraFN calculadora = new CalculadoraFN();                   
        // Permite que seja visível o objeto
        calculadora.setVisible(true);   
        // O que será feito quando o fechar o JFrame, no caso: fechando e terminando a execução
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }        
} 
