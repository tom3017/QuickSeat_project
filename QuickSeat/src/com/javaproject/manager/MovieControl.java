package com.javaproject.manager;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javaproject.base.ShareVar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class MovieControl extends JDialog {
	
	/*
	 * Descritipon : 1. DB의 Movie Table로 Insert함
	 * 				 2. DB의 Movie Table에서 select하여 scroll pane의 innerTable에 불러온다.
	 *               3. DB의 Movie Table을 Update함
	 * 
	 * Author : Lcy, Wdh
	 * 
	 * Date : 2024-01-05 , 16:07
	 */


	private static final long serialVersionUID = 1L;
	private JTable innerTable;
	private JTextField tfMovieTitle;
	private JTextField tfDistCompany;
	private JTextField tfGenre;
	private JTextField tfMovieDesc;
	private JTextField tfRelDate;
	private JTextField tfMadeIn;
	private JTextField textField_7;
	private JTextField tfPoster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MovieControl dialog = new MovieControl();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MovieControl() {
		setTitle("영화 등록 및 수정");
		setBounds(ShareVar.managerXlocation,ShareVar.managerYlocation,ShareVar.managerXsize,ShareVar.managerYsize);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(420, 100, 330, 430);
		getContentPane().add(scrollPane);
		
		innerTable = new JTable();
		scrollPane.setViewportView(innerTable);
		
		JLabel lblNewLabel = new JLabel("영화 등록 및 수정");
		lblNewLabel.setFont(new Font("배달의민족 도현", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 25, 760, 50);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("영화 제목 : ");
		lblNewLabel_1.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(12, 101, 76, 22);
		getContentPane().add(lblNewLabel_1);
		
		tfMovieTitle = new JTextField();
		tfMovieTitle.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		tfMovieTitle.setHorizontalAlignment(SwingConstants.CENTER);
		tfMovieTitle.setBounds(86, 100, 159, 21);
		getContentPane().add(tfMovieTitle);
		tfMovieTitle.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("배급사 : ");
		lblNewLabel_1_1.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(12, 133, 76, 22);
		getContentPane().add(lblNewLabel_1_1);
		
		tfDistCompany = new JTextField();
		tfDistCompany.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		tfDistCompany.setHorizontalAlignment(SwingConstants.CENTER);
		tfDistCompany.setColumns(10);
		tfDistCompany.setBounds(86, 132, 93, 21);
		getContentPane().add(tfDistCompany);
		
		JLabel lblNewLabel_1_2 = new JLabel("장르 : ");
		lblNewLabel_1_2.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(12, 165, 76, 22);
		getContentPane().add(lblNewLabel_1_2);
		
		tfGenre = new JTextField();
		tfGenre.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		tfGenre.setHorizontalAlignment(SwingConstants.CENTER);
		tfGenre.setColumns(10);
		tfGenre.setBounds(86, 164, 93, 21);
		getContentPane().add(tfGenre);
		
		JLabel lblNewLabel_1_3 = new JLabel("영화 등급 : ");
		lblNewLabel_1_3.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(12, 197, 76, 22);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("상영 시간 : ");
		lblNewLabel_1_4.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(12, 229, 76, 22);
		getContentPane().add(lblNewLabel_1_4);
		
		tfMovieDesc = new JTextField();
		tfMovieDesc.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		tfMovieDesc.setHorizontalAlignment(SwingConstants.CENTER);
		tfMovieDesc.setColumns(10);
		tfMovieDesc.setBounds(86, 228, 93, 21);
		getContentPane().add(tfMovieDesc);
		
		JLabel lblNewLabel_1_5 = new JLabel("개봉일 : ");
		lblNewLabel_1_5.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(12, 261, 76, 22);
		getContentPane().add(lblNewLabel_1_5);
		
		tfRelDate = new JTextField();
		tfRelDate.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		tfRelDate.setHorizontalAlignment(SwingConstants.CENTER);
		tfRelDate.setColumns(10);
		tfRelDate.setBounds(86, 260, 93, 21);
		getContentPane().add(tfRelDate);
		
		JLabel lblNewLabel_1_6 = new JLabel("제작 국가 : ");
		lblNewLabel_1_6.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1_6.setBounds(12, 293, 76, 22);
		getContentPane().add(lblNewLabel_1_6);
		
		tfMadeIn = new JTextField();
		tfMadeIn.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		tfMadeIn.setHorizontalAlignment(SwingConstants.CENTER);
		tfMadeIn.setColumns(10);
		tfMadeIn.setBounds(86, 292, 93, 21);
		getContentPane().add(tfMadeIn);
		
		JLabel lblNewLabel_1_7 = new JLabel("영화 설명");
		lblNewLabel_1_7.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1_7.setBounds(12, 357, 86, 22);
		getContentPane().add(lblNewLabel_1_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(12, 383, 396, 147);
		getContentPane().add(textField_7);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("영화 포스터 : ");
		lblNewLabel_1_6_1.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1_6_1.setBounds(214, 325, 86, 22);
		getContentPane().add(lblNewLabel_1_6_1);
		
		tfPoster = new JTextField();
		tfPoster.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		tfPoster.setHorizontalAlignment(SwingConstants.CENTER);
		tfPoster.setColumns(10);
		tfPoster.setBounds(303, 325, 105, 21);
		getContentPane().add(tfPoster);
		
		JLabel lblNewLabel_1_6_1_1 = new JLabel("개봉 상태 : ");
		lblNewLabel_1_6_1_1.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		lblNewLabel_1_6_1_1.setBounds(12, 325, 76, 22);
		getContentPane().add(lblNewLabel_1_6_1_1);
		
		JLabel lblPosterImage = new JLabel("New label");
		lblPosterImage.setBounds(257, 100, 151, 215);
		getContentPane().add(lblPosterImage);
		
		JComboBox cbRelState = new JComboBox();
		cbRelState.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		cbRelState.setBounds(86, 325, 116, 23);
		getContentPane().add(cbRelState);
		
		JComboBox cbFilmRating = new JComboBox();
		cbFilmRating.setFont(new Font("배달의민족 도현", Font.PLAIN, 14));
		cbFilmRating.setBounds(86, 195, 93, 23);
		getContentPane().add(cbFilmRating);
		
		JButton btnSelect = new JButton("선택");
		btnSelect.setFont(new Font("배달의민족 도현", Font.PLAIN, 12));
		btnSelect.setBounds(343, 352, 65, 23);
		getContentPane().add(btnSelect);
		
		JLabel lblManagerBackGround = new JLabel("");
		lblManagerBackGround.setIcon(new ImageIcon(MovieControl.class.getResource("/com/javaproject/image/manager_background.png")));
		lblManagerBackGround.setBounds(0, 0, 784, 561);
		getContentPane().add(lblManagerBackGround);
	}
} // End
