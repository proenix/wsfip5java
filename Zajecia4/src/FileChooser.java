import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import com.sun.istack.internal.logging.Logger;


public class FileChooser extends JFrame implements ActionListener {
	
	JMenuBar menuBar;
	JMenu menuPlik;
	JMenuItem mOtworz, mZapisz, mWyjscie;
	JTextArea notatnik;
	
	public FileChooser() {
		
		setTitle("File Chooser");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		menuBar = new JMenuBar();
		menuPlik = new JMenu("Plik");
		
		mOtworz = new JMenuItem("Otwórz", 'O');
		mOtworz.addActionListener(this);
		mZapisz = new JMenuItem("Zapisz");
		mZapisz.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		mZapisz.addActionListener(this);
		mZapisz.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
		mWyjscie = new JMenuItem("Wyjście");
		
		menuPlik.add(mOtworz);
		menuPlik.add(mZapisz);
		menuPlik.addSeparator();
		menuPlik.add(mWyjscie);
		
		mWyjscie.addActionListener(this);
		mWyjscie.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		
		setJMenuBar(menuBar);
		menuBar.add(menuPlik);
		
		notatnik = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(notatnik);
		scrollPane.setBounds(50,50,400,400);
		add(scrollPane);
		
	}
	
	public static void main(String[] args) {
		FileChooser appMenu = new FileChooser();
		appMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appMenu.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		if (src == mOtworz) {
			JFileChooser fc = new JFileChooser();
			if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				File plik = fc.getSelectedFile();
				try {
					Scanner skaner = new Scanner(plik);
					while(skaner.hasNext()) {
						notatnik.append(skaner.nextLine() + "\n");
					} 
				} catch(FileNotFoundException ex) {
					Logger.getLogger(FileChooser.class.getName(), null).log(Level.SEVERE, null, ex);
				}
			}	
		}
		if (src == mZapisz) {
			JFileChooser fc = new JFileChooser();
			if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
				File plik = fc.getSelectedFile();
				try {
					PrintWriter pw = new PrintWriter(plik);
					Scanner skaner = new Scanner(notatnik.getText());
					while(skaner.hasNext()) {
						pw.println(skaner.nextLine() + "\n");
					}
					pw.close();
				} catch(FileNotFoundException ex) {
					Logger.getLogger(FileChooser.class.getName(), null).log(Level.SEVERE, null, ex);
				}
			}
		}
		if (src == mWyjscie) {
			
		}
		
		
	}

}
