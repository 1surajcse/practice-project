import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InternalBugAutomation {

	private JFrame frmSuraj;
	private JTextField txtAgName;
	private JTextField txtSummary;
	public  String username;
	public   String password;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private JTextArea textArea;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalBugAutomation window = new InternalBugAutomation();
					window.frmSuraj.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InternalBugAutomation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSuraj = new JFrame();
		frmSuraj.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Auto\\InternalBugAutomation\\Register\\Suraj1.jpg"));
		frmSuraj.setBackground(new Color(51, 102, 0));
		frmSuraj.setTitle("Internal Bug Automation");
		frmSuraj.getContentPane().setBackground(new Color(204, 255, 204));
		frmSuraj.setBounds(100, 100, 450, 300);
		frmSuraj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSuraj.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings({ "static-access", "deprecation" })
			public void actionPerformed(ActionEvent arg0) {

				BaseJarV1 baseJar1=new BaseJarV1();

				username=txtUsername.getText().trim();
				password=passwordField.getText().trim();
				String url="D:/Auto/InternalBugAutomation/Register/chromedriver.exe";

				System.out.println("u::"+username);

				String agentname=txtAgName.getText().trim();
				System.out.println("ag::"+agentname);
				String summary=txtSummary.getText().trim();
				String desc=textArea.getText().trim();
				try {
					baseJar1.execute(agentname,summary,desc,username,password,url);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				JOptionPane.showMessageDialog(null, "New Internal bug is created");
			}
		});
		btnNewButton.setBounds(172, 215, 89, 23);
		frmSuraj.getContentPane().add(btnNewButton);

		txtAgName = new JTextField();
		txtAgName.setBounds(187, 105, 148, 20);
		frmSuraj.getContentPane().add(txtAgName);
		txtAgName.setColumns(10);

		txtSummary = new JTextField();
		txtSummary.setBounds(187, 136, 148, 20);
		frmSuraj.getContentPane().add(txtSummary);
		txtSummary.setColumns(10);

		JLabel lblNewLabel = new JLabel("Agent Name:");
		lblNewLabel.setBounds(18, 108, 89, 14);
		frmSuraj.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Summary:");
		lblNewLabel_1.setBounds(18, 139, 89, 14);
		frmSuraj.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Description:");
		lblNewLabel_2.setBounds(18, 164, 89, 14);
		frmSuraj.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Internal Bug");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(18, 11, 107, 34);
		frmSuraj.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("@Suraj Tiwari");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(327, 237, 97, 14);
		frmSuraj.getContentPane().add(lblNewLabel_4);

		txtUsername = new JTextField();
		txtUsername.setToolTipText("");
		txtUsername.setBounds(189, 42, 86, 20);
		frmSuraj.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("UserName:");
		lblNewLabel_5.setBounds(18, 45, 73, 14);
		frmSuraj.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Password:");
		lblNewLabel_6.setBounds(18, 74, 73, 14);
		frmSuraj.getContentPane().add(lblNewLabel_6);

		passwordField = new JPasswordField();
		passwordField.setBounds(187, 74, 117, 20);
		frmSuraj.getContentPane().add(passwordField);

		JCheckBox chckbxRem = new JCheckBox("Remember Password");
		chckbxRem.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxRem.isSelected())
				{
					final String u=txtUsername.getText().trim();
					password=passwordField.getText().trim();

					System.out.println("user name::"+u);
					txtUsername.setText(u);
					passwordField.setText(password);
				}
			}
		});
		chckbxRem.setBounds(327, 72, 97, 23);
		frmSuraj.getContentPane().add(chckbxRem);
	
		JTextArea textArea = new JTextArea();
		textArea.setBounds(187, 159, 196, 45);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		frmSuraj.getContentPane().add(textArea);
	}
}
