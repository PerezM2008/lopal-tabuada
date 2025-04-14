package br.com.perez.tabuada.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.com.perez.tabuada.model.Tabuada;

public class TelaTabuada {
	
	private JLabel labelMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel labelMenorMultiplicador;
	private JTextField txtMenorMultiplicador;
	private JLabel labelMaiorMultiplicador;
	private JTextField txtMaiorMultiplicador;
	private JButton btnCalcular;
	private JButton btnLimpar;
	private JLabel labelResultado;
	private JScrollPane scrollTabuada;
	private JList listaTabuada;
	
	private Font labels = new Font("Arial", Font.BOLD, 20);
	private Color labelsColor = new Color(0, 0, 0);

	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		//Definir o tamanho da tela
		//através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(400, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(tamanho);
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		
		//label Multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do multiplicando:");
		labelMultiplicando.setForeground(labelsColor);
		labelMultiplicando.setFont(labels);
		
		labelMultiplicando.setBounds(50, 40, 150, 30);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
		txtMultiplicando.setBounds(210, 40, 60, 30);
		
		
		//label menorMultiplicador
		labelMenorMultiplicador = new JLabel();
		labelMenorMultiplicador.setText("Mín. Multiplicador:");
		labelMenorMultiplicador.setForeground(labelsColor);
		labelMenorMultiplicador.setFont(labels);
		labelMenorMultiplicador.setBounds(50, 80, 150, 30);
		
		txtMenorMultiplicador = new JTextField();
		txtMenorMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		txtMenorMultiplicador.setBounds(210, 80, 60, 30);
		
		//label maiorMultiplcador
		labelMaiorMultiplicador = new JLabel();
		labelMaiorMultiplicador.setText("Máx. Multiplicador:");
		labelMaiorMultiplicador.setForeground(labelsColor);
		labelMaiorMultiplicador.setFont(labels);
		labelMaiorMultiplicador.setBounds(50, 120, 150, 30);

		txtMaiorMultiplicador = new JTextField();
		txtMaiorMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		txtMaiorMultiplicador.setBounds(210, 120, 60, 30);
		
		// Botão Calcular
				btnCalcular = new JButton();
				btnCalcular.setText("Calcular");
				btnCalcular.setBounds(50, 160, 105, 30);
				
		// Botão Limpar
				btnLimpar = new JButton();
				btnLimpar.setText("Limpar");
				btnLimpar.setBounds(165, 160, 105, 30);

		// Resultado
				labelResultado = new JLabel();
				labelResultado.setText("Resultado:");
				labelResultado.setBounds(50, 200, 150, 30);
				
		// Lista Tabuada
				listaTabuada = new JList();

		// Painel Tabuada
				scrollTabuada = new JScrollPane(listaTabuada);
				scrollTabuada.setBounds(50, 240, 220, 280);
				
				
		
		// Criar um JTextField
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(202, 40, 60, 30);
		
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(labelMenorMultiplicador);
		tela.getContentPane().add(txtMenorMultiplicador);
		tela.getContentPane().add(labelMaiorMultiplicador);
		tela.getContentPane().add(txtMaiorMultiplicador);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(scrollTabuada);
		
		//Adicionar um ouvinte de ação (Listener) ao botão calcular
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Tabuada tabuada = new Tabuada();
				
				double multiplicando = Double.parseDouble(txtMultiplicando.getText());
				double menorMultiplicador = Double.parseDouble(txtMenorMultiplicador.getText());
				double maiorMultiplicador = Double.parseDouble(txtMaiorMultiplicador.getText());
				
				tabuada.setMultiplicando(multiplicando);
				tabuada.setMenorMultiplicador(menorMultiplicador);
				tabuada.setMaiorMultiplicador(maiorMultiplicador);
				
				String[] resultado = tabuada.mostrarTabuada();
				
				listaTabuada.setListData(resultado);
				
						
				
			}
		});
		
		//Adicionar o Limpar Tela
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtMultiplicando.setText("");
				txtMaiorMultiplicador.setText(null);
				txtMenorMultiplicador.setText(null);
				txtMultiplicando.requestFocus();
				listaTabuada.setListData(new String[0]);
				
				
			}
		});
		
	// Tornar a tela visível deve ser a última linha deste método.
		
		tela.setVisible(true);
		
		
	}

}
