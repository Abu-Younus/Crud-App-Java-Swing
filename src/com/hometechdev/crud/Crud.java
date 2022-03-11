package com.hometechdev.crud;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Crud extends JFrame{
	
	JPanel mainPanel = new JPanel();
	JPanel panelNorth = new JPanel();
	JPanel panelCenter = new JPanel();
	JPanel panelCenterCenter = new JPanel();
	JPanel panelCenterEast = new JPanel();
	JPanel panelSouth = new JPanel();
	JPanel panelSouthCenter = new JPanel();
	JPanel panelSouthSouth = new JPanel();
	
	JLabel lblTitle = new JLabel("Crud Application");
	JLabel lblFirstName = new JLabel("First Name");
	JLabel lblLastName = new JLabel("Last Name");
	JLabel lblUserName = new JLabel("User Name");
	JLabel lblEmailAddress = new JLabel("Email Address");
	JLabel lblMobileNumber = new JLabel("Mobile Number");
	JLabel lblPassword = new JLabel("Password");
	JLabel lblConfirmPassword = new JLabel("Confirm Password");
	JLabel lblUserImage = new JLabel("");
	
	JTextField txtFirstName = new JTextField(18);
	JTextField txtLastName = new JTextField(18);
	JTextField txtUserName = new JTextField(18);
	JTextField txtEmailAddress = new JTextField(18);
	JTextField txtMobileNumber = new JTextField(18);
	JPasswordField txtPassword = new JPasswordField(18);
	JPasswordField txtConfirmPassword = new JPasswordField(18);
	
	JButton btnUpload = new JButton("Upload", new ImageIcon("icon/upload.png"));
	JButton btnAdd = new JButton("Add", new ImageIcon("icon/add.png"));
	JButton btnEdit = new JButton("Edit", new ImageIcon("icon/edit.png"));
	JButton btnRefresh = new JButton("Refresh", new ImageIcon("icon/refresh.png"));
	JButton btnDelete = new JButton("Delete", new ImageIcon("icon/delete.png"));
	
	String column[] = {"ID","FName","LName","UName","Email","Mobile","Date"};
	Object row[][] = {};
	DefaultTableModel modelUser = new DefaultTableModel(row,column);
	JTable tblUser = new JTable(modelUser);
	JScrollPane scrollUser = new JScrollPane(tblUser,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
	public Crud() {
		initialize();
		component();
	}

	private void component() {
		add(mainPanel);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(panelNorth,BorderLayout.NORTH);
		panelNorthWork();
		mainPanel.add(panelCenter, BorderLayout.CENTER);
		panelCenterWork();
		mainPanel.add(panelSouth,BorderLayout.SOUTH);
		panelSouthWork();
	}

	private void panelNorthWork() {
		//panelNorth.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		panelNorth.setPreferredSize(new Dimension(0,70));
		
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		panelNorth.setLayout(grid);
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelNorth.add(lblTitle, c);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
		lblTitle.setForeground(Color.DARK_GRAY);
	}

	private void panelCenterWork() {
		panelCenter.setLayout(new BorderLayout());
		panelCenter.add(panelCenterCenter,BorderLayout.CENTER);
		panelCenterCenterWork();
		panelCenter.add(panelCenterEast,BorderLayout.EAST);
		panelCenterEastWork();
	}

	private void panelCenterCenterWork() {
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		panelCenterCenter.setLayout(grid);
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(lblFirstName,c);
		
		c.gridx = 1;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(txtFirstName,c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(lblLastName,c);
		
		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(txtLastName,c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(lblUserName,c);
		
		c.gridx = 1;
		c.gridy = 2;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(txtUserName,c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(lblEmailAddress,c);
		
		c.gridx = 1;
		c.gridy = 3;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(txtEmailAddress,c);
		
		c.gridx = 0;
		c.gridy = 4;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(lblMobileNumber,c);
		
		c.gridx = 1;
		c.gridy = 4;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(txtMobileNumber,c);
		
		c.gridx = 0;
		c.gridy = 5;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(lblPassword,c);
		
		c.gridx = 1;
		c.gridy = 5;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(txtPassword,c);
		
		c.gridx = 0;
		c.gridy = 6;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(lblConfirmPassword,c);
		
		c.gridx = 1;
		c.gridy = 6;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterCenter.add(txtConfirmPassword,c);
	}

	private void panelCenterEastWork() {
		//panelCenterEast.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		panelCenterEast.setPreferredSize(new Dimension(120,0));
		
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		panelCenterEast.setLayout(grid);
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterEast.add(lblUserImage,c);
		lblUserImage.setBorder(BorderFactory.createLineBorder(Color.gray));
		lblUserImage.setPreferredSize(new Dimension(80,120));
		
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		panelCenterEast.add(btnUpload,c);
	}

	private void panelSouthWork() {
		//panelSouth.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		panelSouth.setPreferredSize(new Dimension(0,350));
		panelSouth.setLayout(new BorderLayout());
		panelSouth.add(panelSouthCenter,BorderLayout.CENTER);
		panelSouthCenterWork();
		panelSouth.add(panelSouthSouth,BorderLayout.SOUTH);
		panelSouthSouthWork();
	}

	private void panelSouthCenterWork() {
		panelSouthCenter.add(btnAdd);
		panelSouthCenter.add(btnEdit);
		panelSouthCenter.add(btnRefresh);
		panelSouthCenter.add(btnDelete);
	}

	private void panelSouthSouthWork() {
		//panelSouthSouth.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		panelSouthSouth.setPreferredSize(new Dimension(0,280));
		
		panelSouthSouth.add(scrollUser);
		scrollUser.setPreferredSize(new Dimension(470,265));
	}

	private void initialize() {
		setSize(500,700);
		setTitle("Crud Application");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}

}
