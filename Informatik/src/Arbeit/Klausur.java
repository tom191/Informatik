package Arbeit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

public class Klausur extends JFrame {

	private JPanel contentPane;

	public Klausur() {
		super("Tom");
		createGUI();
	}

	// Willkommen (Beispiel)
	void willkommen() {
		String name = JOptionPane.showInputDialog(this, "Wie heißt du?");
		JOptionPane.showMessageDialog(this, "Hallo " + name + "!");
		JOptionPane.showMessageDialog(this, "Viel Erfolg bei der Klausur!");
	}

	void aufg1() {
		// Aufgabe 1

		String eingabe = JOptionPane.showInputDialog(this, "Wie alt bist du?");

// My: Die nächsten zwei Zeilen ist unnötig (ohne Wirkung) aber auch unschädlich.
// ==> kein Punktabzug
		String eingeben;
		int gib;
// My: Nächste Zeile von mir ersetzt
// ==> 2 Punkte Abzug (1)
//		double alter = 14.21;
		double alter = Integer.parseInt(eingabe);
		if (alter > 14 && alter < 22) {

			JOptionPane.showMessageDialog(this, "In Ordnung!");
		} else {

			JOptionPane.showMessageDialog(this, "Das glaube ich dir nicht!");
		}
	}

	long fakultaet(int n) {
		long ergebnis = 1;
		for (int i = 1; i <= n; i++) {
			ergebnis = ergebnis * i;
		}
		return ergebnis;
	}

	void aufg2() {
		// Aufgabe 2
// My: Aufgabe 2 nicht bearbeitet
	}

	// hier einfügen: Methode fakultaet2()

	void aufg3() {
		// Aufgabe 3
// My: Aufgabe 3 nicht bearbeitet
	}

	// hier einfügen: Methode schaltjahr()

	void aufg4() {
		// Aufgabe 4
// My: Aufgabe 4 nicht bearbeitet
	}

	void createGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnWillkommen = new JButton("Willkommen");
		btnWillkommen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				willkommen();
			}
		});
		btnWillkommen.setBounds(12, 12, 228, 25);
		contentPane.add(btnWillkommen);

		JButton btnAufgabe1 = new JButton("Aufgabe 1: Alter");
		btnAufgabe1.setHorizontalAlignment(SwingConstants.LEFT);
		btnAufgabe1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				aufg1();
			}
		});
		btnAufgabe1.setBounds(12, 49, 228, 25);
		contentPane.add(btnAufgabe1);

		JButton btnAufgabe2 = new JButton("Aufgabe 2: Fakultät (for)");
		btnAufgabe2.setHorizontalAlignment(SwingConstants.LEFT);
		btnAufgabe2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				aufg2();
			}
		});
		btnAufgabe2.setBounds(12, 86, 228, 25);
		contentPane.add(btnAufgabe2);

		JButton btnAufgabe3 = new JButton("Aufgabe 3: Fakultät (while)");
		btnAufgabe3.setHorizontalAlignment(SwingConstants.LEFT);
		btnAufgabe3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				aufg3();
			}
		});
		btnAufgabe3.setBounds(12, 123, 228, 25);
		contentPane.add(btnAufgabe3);

		JButton btnAufgabe4 = new JButton("Aufgabe 4: Schaltjahr");
		btnAufgabe4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				aufg4();
			}
		});
		btnAufgabe4.setHorizontalAlignment(SwingConstants.LEFT);
		btnAufgabe4.setBounds(12, 160, 228, 25);
		contentPane.add(btnAufgabe4);

		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Klausur frame = new Klausur();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
